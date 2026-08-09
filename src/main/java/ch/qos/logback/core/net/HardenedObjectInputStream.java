package ch.qos.logback.core.net;

import java.io.InputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HardenedObjectInputStream extends ObjectInputStream {
    private static final Set<String> SAFE_JAVA_CLASSES = new HashSet<String>(Arrays.asList(
        "java.lang.String",
        "java.lang.Integer",
        "java.lang.Long",
        "java.lang.Double",
        "java.lang.Float",
        "java.lang.Boolean",
        "java.lang.Character",
        "java.lang.Byte",
        "java.lang.Short",
        "java.lang.Number",
        "java.lang.StackTraceElement",
        "java.lang.Enum",
        "java.lang.Object",
        "[Ljava.lang.StackTraceElement;",
        "[Ljava.lang.String;",
        "[Ljava.lang.Object;",
        "java.util.Date",
        "java.util.HashMap",
        "java.util.Hashtable",
        "java.util.ArrayList",
        "java.util.LinkedList",
        "java.util.HashSet",
        "java.util.LinkedHashMap",
        "java.util.LinkedHashSet",
        "java.util.TreeMap",
        "java.util.TreeSet",
        "java.util.Collections$UnmodifiableMap",
        "java.util.Collections$UnmodifiableList",
        "java.util.Collections$UnmodifiableSet",
        "java.util.Collections$EmptyMap",
        "java.util.Collections$EmptyList",
        "java.util.Collections$EmptySet",
        "java.util.Collections$SingletonMap",
        "java.util.Collections$SingletonList",
        "java.util.Collections$SingletonSet",
        "java.util.Collections$SynchronizedMap",
        "java.util.Collections$SynchronizedList",
        "java.util.Collections$SynchronizedSet",
        "java.util.Collections$UnmodifiableRandomAccessList",
        "java.util.Collections$CopiesList",
        "java.util.Collections$CheckedMap",
        "java.util.Collections$CheckedList",
        "java.util.Collections$CheckedSet",
        "java.util.Vector",
        "java.util.Locale",
        "java.util.TimeZone",
        "java.util.SimpleTimeZone",
        "java.util.UUID",
        "java.util.Arrays$ArrayList"
    ));

    final List<String> whitelistedClassNames;

    public HardenedObjectInputStream(InputStream inputStream, List<String> list) throws IOException {
        super(inputStream);
        ArrayList arrayList = new ArrayList();
        this.whitelistedClassNames = arrayList;
        if (list != null) {
            arrayList.addAll(list);
        }
    }

    private boolean isWhitelisted(String str) {
        if (SAFE_JAVA_CLASSES.contains(str)) {
            return true;
        }
        for (String whitelisted : this.whitelistedClassNames) {
            if (str.equals(whitelisted)) {
                return true;
            }
        }
        return false;
    }

    protected void addToWhitelist(List<String> list) {
        this.whitelistedClassNames.addAll(list);
    }

    @Override
    protected Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
        if (isWhitelisted(objectStreamClass.getName())) {
            return super.resolveClass(objectStreamClass);
        }
        throw new InvalidClassException("Unauthorized deserialization attempt", objectStreamClass.getName());
    }

    public HardenedObjectInputStream(InputStream inputStream, String[] strArr) throws IOException {
        super(inputStream);
        this.whitelistedClassNames = new ArrayList();
        if (strArr != null) {
            for (String str : strArr) {
                this.whitelistedClassNames.add(str);
            }
        }
    }
}
