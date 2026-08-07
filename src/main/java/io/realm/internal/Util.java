package io.realm.internal;

import io.realm.n0;
import io.realm.p0;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public class Util {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Boolean f79064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Boolean f79065b;

    public static void a(String str) {
        if (new an0.a().a()) {
            throw new IllegalStateException(str);
        }
    }

    public static void b(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new IllegalArgumentException("Nonnull '" + str + "' required.");
    }

    public static Class<? extends n0> c(Class<? extends n0> cls) {
        if (cls.equals(n0.class) || cls.equals(p0.class)) {
            throw new IllegalArgumentException("RealmModel or RealmObject was passed as an argument. Only subclasses of these can be used as arguments to methods that accept a Realm model class.");
        }
        Class superclass = cls.getSuperclass();
        return (superclass.equals(Object.class) || superclass.equals(p0.class)) ? cls : superclass;
    }

    public static String d() {
        return nativeGetTablePrefix();
    }

    public static synchronized boolean e() {
        if (f79065b == null) {
            try {
                f79065b = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                f79065b = Boolean.FALSE;
            }
        }
        return f79065b.booleanValue();
    }

    public static boolean f(String str) {
        return str == null || str.length() == 0;
    }

    public static synchronized boolean g() {
        if (f79064a == null) {
            try {
                Class.forName("io.reactivex.Flowable");
                f79064a = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                f79064a = Boolean.FALSE;
            }
        }
        return f79064a.booleanValue();
    }

    public static <T> Set<T> h(T... tArr) {
        if (tArr == null) {
            return Collections.EMPTY_SET;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (T t11 : tArr) {
            if (t11 != null) {
                linkedHashSet.add(t11);
            }
        }
        return linkedHashSet;
    }

    static native String nativeGetTablePrefix();
}
