package p013kotlin.jvm.internal;

import java.util.Arrays;
import p013kotlin.UninitializedPropertyAccessException;

/* JADX INFO: loaded from: classes9.dex */
public class s {

    public static class a {
        private a() {
        }
    }

    private s() {
    }

    public static void A(String str) {
        throw ((UninitializedPropertyAccessException) r(new UninitializedPropertyAccessException(str)));
    }

    public static void B(String str) {
        A("lateinit property " + str + " has not been initialized");
    }

    public static boolean a(float f11, Float f12) {
        return f12 != null && f11 == f12.floatValue();
    }

    public static boolean b(Double d11, double d12) {
        return d11 != null && d11.doubleValue() == d12;
    }

    public static boolean c(Double d11, Double d12) {
        if (d11 == null) {
            return d12 == null;
        }
        return d12 != null && d11.doubleValue() == d12.doubleValue();
    }

    public static boolean d(Float f11, float f12) {
        return f11 != null && f11.floatValue() == f12;
    }

    public static boolean e(Float f11, Float f12) {
        if (f11 == null) {
            return f12 == null;
        }
        return f12 != null && f11.floatValue() == f12.floatValue();
    }

    public static boolean f(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static void g(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) r(new IllegalStateException(str + " must not be null")));
    }

    public static void h(Object obj) {
        if (obj == null) {
            u();
        }
    }

    public static void i(Object obj, String str) {
        if (obj == null) {
            v(str);
        }
    }

    public static void j(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) r(new NullPointerException(str + " must not be null")));
    }

    public static void k(Object obj, String str) {
        if (obj == null) {
            x(str);
        }
    }

    public static void l(Object obj, String str) {
        if (obj == null) {
            w(str);
        }
    }

    public static int m(int i11, int i12) {
        if (i11 < i12) {
            return -1;
        }
        return i11 == i12 ? 0 : 1;
    }

    public static int n(long j11, long j12) {
        if (j11 < j12) {
            return -1;
        }
        return j11 == j12 ? 0 : 1;
    }

    private static String o(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = s.class.getName();
        int i11 = 0;
        while (!stackTrace[i11].getClassName().equals(name)) {
            i11++;
        }
        while (stackTrace[i11].getClassName().equals(name)) {
            i11++;
        }
        StackTraceElement stackTraceElement = stackTrace[i11];
        return "Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    public static void p() {
        y();
    }

    public static void q(int i11, String str) {
        y();
    }

    private static <T extends Throwable> T r(T t11) {
        return (T) s(t11, s.class.getName());
    }

    static <T extends Throwable> T s(T t11, String str) {
        StackTraceElement[] stackTrace = t11.getStackTrace();
        int length = stackTrace.length;
        int i11 = -1;
        for (int i12 = 0; i12 < length; i12++) {
            if (str.equals(stackTrace[i12].getClassName())) {
                i11 = i12;
            }
        }
        t11.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i11 + 1, length));
        return t11;
    }

    public static String t(String str, Object obj) {
        return str + obj;
    }

    public static void u() {
        throw ((NullPointerException) r(new NullPointerException()));
    }

    public static void v(String str) {
        throw ((NullPointerException) r(new NullPointerException(str)));
    }

    private static void w(String str) {
        throw ((IllegalArgumentException) r(new IllegalArgumentException(o(str))));
    }

    private static void x(String str) {
        throw ((NullPointerException) r(new NullPointerException(o(str))));
    }

    public static void y() {
        z("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void z(String str) {
        throw new UnsupportedOperationException(str);
    }
}
