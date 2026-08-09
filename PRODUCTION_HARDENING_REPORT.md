# PRODUCTION HARDENING REPORT

## Executive Summary
This production hardening report documents a critical deserialization of untrusted data vulnerability (CVE-2026-9828 / CVE-2026-10532) in the logback-core and logback-classic components. The flaw is located in `HardenedObjectInputStream`, where a package-prefix `startsWith` match is used to allow any class starting with `java.lang` or `java.util` to be deserialized, completely bypassing the intended class-level whitelist restrictions. An attacker targeting the logback server components (e.g. `SimpleSocketServer` or standard socket listeners) can exploit this bypass to instantiate arbitrary, dangerous Java system classes like `java.lang.ProcessBuilder`, posing high security risks.

---

## Methodology
The entire logback package was analyzed to identify any external input channels, network parsers, file system readers, and object deserializers. We exhaustively evaluated all components using the **INPUT FUZZING MATRIX** criteria.
The discovery identified that:
1. Standard logging properties and Joran configuration components are only loaded locally or from verified configuration documents.
2. The `HardenedObjectInputStream` and `HardenedLoggingEventInputStream` classes designed to deserialize serialized incoming log events are exposed to external, untrusted clients via sockets (e.g. `SocketNode` or `RemoteAppenderStreamClient`).
3. These classes had a critical class-resolution design flaw allowing any type beginning with `"java.lang"` or `"java.util"` (e.g. `java.lang.ProcessBuilder` or other dangerous JDK classes) to bypass the whitelist.

---

## Findings Table

| ID | File Path | Line Number | Vulnerability / Scenario | Severity | Confidence |
| :--- | :--- | :--- | :--- | :--- | :--- |
| **SEC-01** | `src/main/java/ch/qos/logback/core/net/HardenedObjectInputStream.java` | 23 | Deserialization of Untrusted Data / Whitelist Bypass (startsWith prefix validation bypass) | **HIGH** | **PROVEN** |

---

## Per-Finding Details

### SEC-01: Deserialization of Untrusted Data / Whitelist Bypass in `HardenedObjectInputStream`

- **Exact File Path:** `src/main/java/ch/qos/logback/core/net/HardenedObjectInputStream.java`
- **Function Signature:** `private boolean isWhitelisted(String str)`
- **Specific Scenario that Fails:**
  The `isWhitelisted` method relies on a prefix match using `startsWith` on packages `java.lang` and `java.util`. Therefore, any class whose name starts with these prefixes is successfully whitelisted and allowed to be instantiated. This allows an attacker to instantiate highly dangerous classes such as `java.lang.ProcessBuilder` or any serializable/custom class under these packages.
- **Severity:** **HIGH**
- **Confidence:** **PROVEN**

#### Root Cause Analysis
In `HardenedObjectInputStream.java`:
```java
    static final String[] JAVA_PACKAGES = {"java.lang", "java.util"};
    ...
    private boolean isWhitelisted(String str) {
        ...
        if (str.startsWith(strArr[i11])) {
            return true;
        }
        ...
    }
```
Because `str` is the fully-qualified class name, the check `str.startsWith("java.lang")` returns `true` for `"java.lang.ProcessBuilder"` or `"java.lang.reflect.Proxy"`. Thus, they bypass the class-level whitelist mechanism entirely and can be instantiated by the JVM during deserialization.

#### Impact Assessment
An attacker can leverage this bypass to instantiate dangerous system classes. If there are gadgets present on the classpath (e.g. custom classes or common libraries) that are serializable, an attacker can construct a serialized payload to achieve Remote Code Execution (RCE) or other critical privilege escalation outcomes.

#### Minimal Fix Implementation
We replaced the broad `startsWith` package-prefix checks with exact class equality checks against a strict, safe list of allowed JDK classes (`SAFE_JAVA_CLASSES`) that are typically needed for log parameter and MDC map deserialization:
- Primitives/Wrappers: `java.lang.String`, `java.lang.Integer`, `java.lang.Long`, `java.lang.Double`, `java.lang.Float`, `java.lang.Boolean`, `java.lang.Character`, `java.lang.Byte`, `java.lang.Short`, `java.lang.Number`, `java.lang.Enum`, `java.lang.Object`, `[Ljava.lang.StackTraceElement;`, etc.
- Safe Collections & Maps: `java.util.Date`, `java.util.HashMap`, `java.util.ArrayList`, `java.util.LinkedList`, `java.util.HashSet`, Collections wrapper utilities, etc.

Any other class from those packages that is not on the precise whitelist is rejected.

#### Verification
The standalone test script `HardenedObjectInputStream_Deserialization_High_Bypass.java` was written to confirm this.
1. Prior to the fix, attempts to resolve `java.lang.ProcessBuilder` succeeded (vulnerability proven).
2. After implementing our precise exact-match whitelist, `java.lang.ProcessBuilder` is correctly blocked and throws `InvalidClassException`.
3. Standard safe classes like `java.util.Date` continue to deserialize correctly.

---

## False Positives Dropped
- **Potential Issue: Regex DoS (ReDoS) in Log Pattern Converters**
  - *Reason for dropping:* Pattern matching and log formatting parsing are executed using static compiler regex. They are non-backtracking and only handle developer-defined patterns, not untrusted user-supplied input. Thus, no user-exploitable impact was demonstrable.
- **Potential Issue: Joran Configuration XML Injection**
  - *Reason for dropping:* Logback XML configuration files are intended to be authored and modified strictly by system administrators. Modifying configuration is a design choice and privilege escalation is not applicable as this is a secure administrative boundary.

---

## Architectural Gaps
The following recommendations cannot be addressed with a simple local patch and require infrastructure/architectural changes:
1. **Deprecation of Object Deserialization Over Sockets:** Java standard serialization is inherently risky. Standard socket appenders/receivers should be deprecated and replaced by structured, text-based log shippers (e.g., sending logs as JSON via HTTP/TLS or secure syslog).
2. **Missing Network Encryption & Client/Server Mutual Auth:** Log transmission over socket server components does not enforce TLS by default, making it vulnerable to eavesdropping and MITM injection. Sockets should enforce TLS mutual authentication.
3. **Missing Audit Logging for Security Exceptions:** Blocked deserialization attempts throw silent `InvalidClassException` and log simple warn/error messages without structured security alerting. Audit log pipelines should trigger alerts on class unauthorized deserialization failures.

---

## Appendix: Test Script and Run Instructions

### Standalone Test Script
The test script is located at: `hardening_tests/HardenedObjectInputStream_Deserialization_High_Bypass.java`

### Execution Instructions
To run the standalone test script, follow these steps:

1. **Compile the dependent Logback classes and the test script:**
   ```bash
   javac -d target/classes \
     src/main/java/ch/qos/logback/core/net/HardenedObjectInputStream.java \
     src/main/java/ch/qos/logback/classic/net/server/HardenedLoggingEventInputStream.java

   javac -cp target/classes -d target/classes \
     hardening_tests/HardenedObjectInputStream_Deserialization_High_Bypass.java
   ```

2. **Execute the test script:**
   ```bash
   java -cp target/classes hardening_tests.HardenedObjectInputStream_Deserialization_High_Bypass
   ```

3. **Verify the Output:**
   A successful run will show:
   ```
   === Phase 2: Demonstrating HardenedObjectInputStream Bypass ===
   [SUCCESS] Deserialized class starting with java.util: java.util.Date
   [OK] Correctly blocked class outside permitted prefixes: Unauthorized deserialization attempt
   [OK] Correctly blocked ProcessBuilder under fixed code: Unauthorized deserialization attempt; java.lang.ProcessBuilder
   TEST COMPLETED SUCCESSFULLY
   ```
