package p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
public final class ReflectJavaClassFinderKt {
    public static final Class<?> tryLoadClass(ClassLoader classLoader, String fqName) {
        s.k(classLoader, "<this>");
        s.k(fqName, "fqName");
        try {
            return Class.forName(fqName, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
