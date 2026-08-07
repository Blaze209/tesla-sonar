package freemarker.core;

import freemarker.template.utility.UndeclaredThrowableException;
import java.lang.reflect.Constructor;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Class f66504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f66505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Constructor f66506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f66507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static /* synthetic */ Class f66508e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.reflect.Constructor] */
    static {
        Class clsB;
        Class clsA;
        int i11;
        Constructor constructor;
        Class constructor2 = Float.TYPE;
        Class cls = Integer.TYPE;
        try {
            clsB = mk0.a.b("java.util.concurrent.ConcurrentMap");
        } catch (ClassNotFoundException unused) {
            clsB = null;
        }
        f66504a = clsB;
        try {
            clsA = mk0.a.b("java.util.concurrent.ConcurrentHashMap");
            try {
                constructor2 = clsA.getConstructor(cls, constructor2, cls);
                i11 = 3;
                constructor = constructor2;
            } catch (Exception e11) {
                throw new RuntimeException("Failed to get ConcurrentHashMap constructor", e11);
            }
        } catch (ClassNotFoundException unused2) {
            clsA = f66508e;
            if (clsA == null) {
                clsA = a("java.util.HashMap");
                f66508e = clsA;
            }
            try {
                Constructor constructor3 = clsA.getConstructor(cls, constructor2);
                i11 = 2;
                constructor = constructor3;
            } catch (Exception e12) {
                throw new RuntimeException("Failed to get HashMap constructor", e12);
            }
        }
        f66505b = clsA;
        f66506c = constructor;
        f66507d = i11;
    }

    static /* synthetic */ Class a(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e11) {
            throw new NoClassDefFoundError().initCause(e11);
        }
    }

    public static boolean b(Map map) {
        Class cls = f66504a;
        return cls != null && cls.isInstance(map);
    }

    public static Map c() {
        try {
            return (Map) f66505b.newInstance();
        } catch (Exception e11) {
            throw new UndeclaredThrowableException(e11);
        }
    }

    public static Map d(int i11, float f11, int i12) {
        try {
            int i13 = f66507d;
            if (i13 == 3) {
                return (Map) f66506c.newInstance(new Integer(i11), new Float(f11), new Integer(i12));
            }
            if (i13 == 2) {
                return (Map) f66506c.newInstance(new Integer(i11), new Float(f11));
            }
            throw new BugException();
        } catch (Exception e11) {
            throw new UndeclaredThrowableException(e11);
        }
    }
}
