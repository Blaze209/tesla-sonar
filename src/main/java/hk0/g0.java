package hk0;

import freemarker.core.BugException;
import freemarker.template.utility.UndeclaredThrowableException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Method f73005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Method f73006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static /* synthetic */ Class f73007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static /* synthetic */ Class f73008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static /* synthetic */ Class f73009e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static /* synthetic */ Class f73010f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static /* synthetic */ Class f73011g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static /* synthetic */ Class f73012h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static /* synthetic */ Class f73013i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static /* synthetic */ Class f73014j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static /* synthetic */ Class f73015k;

    static {
        Class clsA = f73007c;
        if (clsA == null) {
            clsA = a("java.lang.reflect.Method");
            f73007c = clsA;
        }
        f73005a = d(clsA);
        Class clsA2 = f73008d;
        if (clsA2 == null) {
            clsA2 = a("java.lang.reflect.Constructor");
            f73008d = clsA2;
        }
        f73006b = d(clsA2);
    }

    static /* synthetic */ Class a(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e11) {
            throw new NoClassDefFoundError().initCause(e11);
        }
    }

    private static void b(Class cls, Class cls2, Set set) {
        if (cls.isAssignableFrom(cls2)) {
            set.add(cls);
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null) {
            b(superclass, cls2, set);
        }
        for (Class<?> cls3 : cls.getInterfaces()) {
            b(cls3, cls2, set);
        }
    }

    public static Set c(Class cls, Class cls2) {
        HashSet hashSet = new HashSet();
        b(cls, cls2, hashSet);
        return hashSet;
    }

    private static Method d(Class cls) {
        try {
            return cls.getMethod("isVarArgs", null);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static int e(Class cls, Class cls2, boolean z11, int i11) throws Throwable {
        if (i11 >= 4) {
            return 0;
        }
        if (cls2.isAssignableFrom(cls)) {
            return cls2 == cls ? 1 : 4;
        }
        boolean zIsPrimitive = cls.isPrimitive();
        boolean zIsPrimitive2 = cls2.isPrimitive();
        if (!zIsPrimitive) {
            if (i11 < 3 && z11 && !zIsPrimitive2) {
                Class clsA = f73009e;
                if (clsA == null) {
                    clsA = a("java.lang.Number");
                    f73009e = clsA;
                }
                if (clsA.isAssignableFrom(cls)) {
                    Class clsA2 = f73009e;
                    if (clsA2 == null) {
                        clsA2 = a("java.lang.Number");
                        f73009e = clsA2;
                    }
                    if (clsA2.isAssignableFrom(cls2) && h(cls, cls2)) {
                        return 3;
                    }
                }
            }
            return 0;
        }
        if (zIsPrimitive2) {
            return (i11 < 3 && i(cls, cls2)) ? 3 : 0;
        }
        if (z11) {
            Class<?> clsG = mk0.a.g(cls);
            if (clsG == cls2) {
                return 2;
            }
            if (cls2.isAssignableFrom(clsG)) {
                return 4;
            }
            if (i11 >= 3) {
                return 0;
            }
            Class clsA3 = f73009e;
            if (clsA3 == null) {
                clsA3 = a("java.lang.Number");
                f73009e = clsA3;
            }
            if (clsA3.isAssignableFrom(clsG)) {
                Class clsA4 = f73009e;
                if (clsA4 == null) {
                    clsA4 = a("java.lang.Number");
                    f73009e = clsA4;
                }
                if (clsA4.isAssignableFrom(cls2) && h(clsG, cls2)) {
                    return 3;
                }
            }
        }
        return 0;
    }

    public static boolean f(Member member) {
        if (member instanceof Method) {
            return g(member, f73005a);
        }
        if (member instanceof Constructor) {
            return g(member, f73006b);
        }
        throw new BugException();
    }

    private static boolean g(Member member, Method method) {
        if (method == null) {
            return false;
        }
        try {
            return ((Boolean) method.invoke(member, null)).booleanValue();
        } catch (Exception e11) {
            throw new UndeclaredThrowableException(e11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
    
        if (r7 == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0075, code lost:
    
        if (r7 == r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b4, code lost:
    
        if (r7 == r0) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean h(java.lang.Class r7, java.lang.Class r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hk0.g0.h(java.lang.Class, java.lang.Class):boolean");
    }

    private static boolean i(Class cls, Class cls2) {
        Class cls3 = Byte.TYPE;
        Class cls4 = Short.TYPE;
        if (cls2 == cls4 && cls == cls3) {
            return true;
        }
        Class cls5 = Integer.TYPE;
        if (cls2 == cls5 && (cls == cls4 || cls == cls3)) {
            return true;
        }
        Class cls6 = Long.TYPE;
        if (cls2 == cls6 && (cls == cls5 || cls == cls4 || cls == cls3)) {
            return true;
        }
        Class cls7 = Float.TYPE;
        if (cls2 == cls7 && (cls == cls6 || cls == cls5 || cls == cls4 || cls == cls3)) {
            return true;
        }
        if (cls2 == Double.TYPE) {
            return cls == cls7 || cls == cls6 || cls == cls5 || cls == cls4 || cls == cls3;
        }
        return false;
    }
}
