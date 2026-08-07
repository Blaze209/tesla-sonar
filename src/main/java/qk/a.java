package qk;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static c f105614a = b.i();

    public static void A(Class<?> cls, String str, Object obj, Object obj2, Object obj3) {
        if (w(2)) {
            x(cls, q(str, obj, obj2, obj3));
        }
    }

    public static void B(Class<?> cls, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (f105614a.h(2)) {
            f105614a.v(r(cls), q(str, obj, obj2, obj3, obj4));
        }
    }

    public static void C(Class<?> cls, String str, Object... objArr) {
        if (f105614a.h(2)) {
            f105614a.v(r(cls), q(str, objArr));
        }
    }

    public static void D(String str, String str2, Object... objArr) {
        if (f105614a.h(2)) {
            f105614a.v(str, q(str2, objArr));
        }
    }

    public static void E(Class<?> cls, String str) {
        if (f105614a.h(5)) {
            f105614a.w(r(cls), str);
        }
    }

    public static void F(Class<?> cls, String str, Throwable th2) {
        if (f105614a.h(5)) {
            f105614a.a(r(cls), str, th2);
        }
    }

    public static void G(Class<?> cls, String str, Object... objArr) {
        if (f105614a.h(5)) {
            f105614a.w(r(cls), q(str, objArr));
        }
    }

    public static void H(Class<?> cls, Throwable th2, String str, Object... objArr) {
        if (w(5)) {
            F(cls, q(str, objArr), th2);
        }
    }

    public static void I(String str, String str2) {
        if (f105614a.h(5)) {
            f105614a.w(str, str2);
        }
    }

    public static void J(String str, String str2, Throwable th2) {
        if (f105614a.h(5)) {
            f105614a.a(str, str2, th2);
        }
    }

    public static void K(String str, String str2, Object... objArr) {
        if (f105614a.h(5)) {
            f105614a.w(str, q(str2, objArr));
        }
    }

    public static void L(String str, Throwable th2, String str2, Object... objArr) {
        if (f105614a.h(5)) {
            f105614a.a(str, q(str2, objArr), th2);
        }
    }

    public static void M(Class<?> cls, String str, Throwable th2) {
        if (f105614a.h(6)) {
            f105614a.g(r(cls), str, th2);
        }
    }

    public static void N(String str, String str2, Object... objArr) {
        if (f105614a.h(6)) {
            f105614a.f(str, q(str2, objArr));
        }
    }

    public static void a(Class<?> cls, String str, Object obj) {
        if (f105614a.h(3)) {
            f105614a.d(r(cls), q(str, obj));
        }
    }

    public static void b(String str, String str2) {
        if (f105614a.h(3)) {
            f105614a.d(str, str2);
        }
    }

    public static void c(String str, String str2, Object obj) {
        if (f105614a.h(3)) {
            f105614a.d(str, q(str2, obj));
        }
    }

    public static void d(String str, String str2, Object obj, Object obj2) {
        if (f105614a.h(3)) {
            f105614a.d(str, q(str2, obj, obj2));
        }
    }

    public static void e(String str, String str2, Object obj, Object obj2, Object obj3) {
        if (f105614a.h(3)) {
            f105614a.d(str, q(str2, obj, obj2, obj3));
        }
    }

    public static void f(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4) {
        if (f105614a.h(3)) {
            f105614a.d(str, q(str2, obj, obj2, obj3, obj4));
        }
    }

    public static void g(String str, String str2, Throwable th2) {
        if (f105614a.h(3)) {
            f105614a.b(str, str2, th2);
        }
    }

    public static void h(String str, String str2, Object... objArr) {
        if (f105614a.h(3)) {
            b(str, q(str2, objArr));
        }
    }

    public static void i(Class<?> cls, String str) {
        if (f105614a.h(6)) {
            f105614a.e(r(cls), str);
        }
    }

    public static void j(Class<?> cls, String str, Throwable th2) {
        if (f105614a.h(6)) {
            f105614a.c(r(cls), str, th2);
        }
    }

    public static void k(Class<?> cls, String str, Object... objArr) {
        if (f105614a.h(6)) {
            f105614a.e(r(cls), q(str, objArr));
        }
    }

    public static void l(Class<?> cls, Throwable th2, String str, Object... objArr) {
        if (f105614a.h(6)) {
            f105614a.c(r(cls), q(str, objArr), th2);
        }
    }

    public static void m(String str, String str2) {
        if (f105614a.h(6)) {
            f105614a.e(str, str2);
        }
    }

    public static void n(String str, String str2, Throwable th2) {
        if (f105614a.h(6)) {
            f105614a.c(str, str2, th2);
        }
    }

    public static void o(String str, String str2, Object... objArr) {
        if (f105614a.h(6)) {
            f105614a.e(str, q(str2, objArr));
        }
    }

    public static void p(String str, Throwable th2, String str2, Object... objArr) {
        if (f105614a.h(6)) {
            f105614a.c(str, q(str2, objArr), th2);
        }
    }

    private static String q(String str, Object... objArr) {
        return String.format(null, str, objArr);
    }

    private static String r(Class<?> cls) {
        return cls.getSimpleName();
    }

    public static void s(String str, String str2) {
        if (f105614a.h(4)) {
            f105614a.i(str, str2);
        }
    }

    public static void t(String str, String str2, Object obj, Object obj2) {
        if (f105614a.h(4)) {
            f105614a.i(str, q(str2, obj, obj2));
        }
    }

    public static void u(String str, String str2, Object obj, Object obj2, Object obj3) {
        if (f105614a.h(4)) {
            f105614a.i(str, q(str2, obj, obj2, obj3));
        }
    }

    public static void v(String str, String str2, Object... objArr) {
        if (f105614a.h(4)) {
            f105614a.i(str, q(str2, objArr));
        }
    }

    public static boolean w(int i11) {
        return f105614a.h(i11);
    }

    public static void x(Class<?> cls, String str) {
        if (f105614a.h(2)) {
            f105614a.v(r(cls), str);
        }
    }

    public static void y(Class<?> cls, String str, Object obj) {
        if (f105614a.h(2)) {
            f105614a.v(r(cls), q(str, obj));
        }
    }

    public static void z(Class<?> cls, String str, Object obj, Object obj2) {
        if (f105614a.h(2)) {
            f105614a.v(r(cls), q(str, obj, obj2));
        }
    }
}
