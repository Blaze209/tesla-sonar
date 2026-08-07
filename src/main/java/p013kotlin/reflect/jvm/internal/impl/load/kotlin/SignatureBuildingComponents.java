package p013kotlin.reflect.jvm.internal.impl.load.kotlin;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
public final class SignatureBuildingComponents {
    public static final SignatureBuildingComponents INSTANCE = new SignatureBuildingComponents();

    private SignatureBuildingComponents() {
    }

    private final String b(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return 'L' + str + ';';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence c(String it) {
        s.k(it, "it");
        return INSTANCE.b(it);
    }

    public final String[] constructors(String... signatures) {
        s.k(signatures, "signatures");
        ArrayList arrayList = new ArrayList(signatures.length);
        for (String str : signatures) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public final Set<String> inClass(String internalName, String... signatures) {
        s.k(internalName, "internalName");
        s.k(signatures, "signatures");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : signatures) {
            linkedHashSet.add(internalName + CoreConstants.DOT + str);
        }
        return linkedHashSet;
    }

    public final Set<String> inJavaLang(String name, String... signatures) {
        s.k(name, "name");
        s.k(signatures, "signatures");
        return inClass(javaLang(name), (String[]) Arrays.copyOf(signatures, signatures.length));
    }

    public final Set<String> inJavaUtil(String name, String... signatures) {
        s.k(name, "name");
        s.k(signatures, "signatures");
        return inClass(javaUtil(name), (String[]) Arrays.copyOf(signatures, signatures.length));
    }

    public final String javaFunction(String name) {
        s.k(name, "name");
        return "java/util/function/" + name;
    }

    public final String javaLang(String name) {
        s.k(name, "name");
        return "java/lang/" + name;
    }

    public final String javaUtil(String name) {
        s.k(name, "name");
        return "java/util/" + name;
    }

    public final String jvmDescriptor(String name, List<String> parameters, String ret) {
        s.k(name, "name");
        s.k(parameters, "parameters");
        s.k(ret, "ret");
        return name + CoreConstants.LEFT_PARENTHESIS_CHAR + v.y0(parameters, "", null, null, 0, null, e.f87612a, 30, null) + CoreConstants.RIGHT_PARENTHESIS_CHAR + b(ret);
    }

    public final String signature(String internalName, String jvmDescriptor) {
        s.k(internalName, "internalName");
        s.k(jvmDescriptor, "jvmDescriptor");
        return internalName + CoreConstants.DOT + jvmDescriptor;
    }
}
