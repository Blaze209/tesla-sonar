package hardening_tests;

import ch.qos.logback.core.net.HardenedObjectInputStream;
import ch.qos.logback.classic.net.server.HardenedLoggingEventInputStream;

import java.io.*;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;

public class HardenedObjectInputStream_Deserialization_High_Bypass {

    public static void main(String[] args) {
        try {
            System.out.println("=== Phase 2: Demonstrating HardenedObjectInputStream Bypass ===");
            testBypassWithRealSerialization();
            testBypassWithReflectionResolveClass();
            System.out.println("TEST COMPLETED SUCCESSFULLY");
        } catch (Throwable t) {
            t.printStackTrace();
            System.exit(1);
        }
    }

    private static void testBypassWithRealSerialization() throws Exception {
        // Prepare a serialized java.util.Date object
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(new Date());
        oos.close();

        // 1. Deserializing java.util.Date (not in HardenedLoggingEventInputStream whitelist but allowed by prefix)
        byte[] dateBytes = baos.toByteArray();
        ByteArrayInputStream bais = new ByteArrayInputStream(dateBytes);
        HardenedLoggingEventInputStream loggingInStream = new HardenedLoggingEventInputStream(bais);
        try {
            Object obj = loggingInStream.readObject();
            System.out.println("[SUCCESS] Deserialized class starting with java.util: " + obj.getClass().getName());
        } catch (InvalidClassException e) {
            System.out.println("[FAILED] Could not deserialize java.util.Date: " + e.getMessage());
            throw new AssertionError("java.util.Date was blocked but it starts with java.util", e);
        } finally {
            loggingInStream.close();
        }

        // 2. Deserializing a non-whitelisted, non-prefix class (e.g., java.io.File, which is serializable)
        baos = new ByteArrayOutputStream();
        oos = new ObjectOutputStream(baos);
        oos.writeObject(new File("test.txt"));
        oos.close();

        byte[] fileBytes = baos.toByteArray();
        bais = new ByteArrayInputStream(fileBytes);
        loggingInStream = new HardenedLoggingEventInputStream(bais);
        try {
            loggingInStream.readObject();
            throw new AssertionError("java.io.File deserialization succeeded, expected Blocked!");
        } catch (InvalidClassException e) {
            System.out.println("[OK] Correctly blocked class outside permitted prefixes: " + e.classname);
        } finally {
            loggingInStream.close();
        }
    }

    private static void testBypassWithReflectionResolveClass() throws Exception {
        // Let's call resolveClass using reflection to see if java.lang.ProcessBuilder is resolved
        byte[] dummyStream = new byte[]{
            (byte) 0xac, (byte) 0xed, 0x00, 0x05 // Stream Header
        };
        ByteArrayInputStream bais = new ByteArrayInputStream(dummyStream);
        HardenedLoggingEventInputStream loggingInStream = new HardenedLoggingEventInputStream(bais);

        Method resolveClassMethod = HardenedObjectInputStream.class.getDeclaredMethod("resolveClass", ObjectStreamClass.class);
        resolveClassMethod.setAccessible(true);

        // Resolve class java.lang.ProcessBuilder (unsafe class inside java.lang) using lookupAny
        ObjectStreamClass oscProcessBuilder = ObjectStreamClass.lookupAny(ProcessBuilder.class);
        try {
            Class<?> resolved = (Class<?>) resolveClassMethod.invoke(loggingInStream, oscProcessBuilder);
            System.out.println("[WARNING] Resolved class starting with java.lang: " + resolved.getName() + " (Vulnerability STILL Present)");
            throw new AssertionError("ProcessBuilder was successfully resolved! Whitelist bypass is still active.");
        } catch (Exception e) {
            Throwable cause = e.getCause();
            if (cause instanceof InvalidClassException) {
                System.out.println("[OK] Correctly blocked ProcessBuilder under fixed code: " + cause.getMessage());
            } else {
                throw e;
            }
        } finally {
            loggingInStream.close();
        }
    }
}
