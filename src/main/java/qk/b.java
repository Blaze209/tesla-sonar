package qk;

import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public class b implements c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f105615c = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f105616a = "unknown";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f105617b = 5;

    private b() {
    }

    public static b i() {
        return f105615c;
    }

    private static String j(String str, Throwable th2) {
        return str + '\n' + k(th2);
    }

    private static String k(Throwable th2) {
        return th2 == null ? "" : Log.getStackTraceString(th2);
    }

    private String l(String str) {
        if (this.f105616a == null) {
            return str;
        }
        return this.f105616a + ":" + str;
    }

    private void m(int i11, String str, String str2) {
        Log.println(i11, l(str), str2);
    }

    private void n(int i11, String str, String str2, Throwable th2) {
        Log.println(i11, l(str), j(str2, th2));
    }

    @Override // qk.c
    public void a(String str, String str2, Throwable th2) {
        n(5, str, str2, th2);
    }

    @Override // qk.c
    public void b(String str, String str2, Throwable th2) {
        n(3, str, str2, th2);
    }

    @Override // qk.c
    public void c(String str, String str2, Throwable th2) {
        n(6, str, str2, th2);
    }

    @Override // qk.c
    public void d(String str, String str2) {
        m(3, str, str2);
    }

    @Override // qk.c
    public void e(String str, String str2) {
        m(6, str, str2);
    }

    @Override // qk.c
    public void f(String str, String str2) {
        m(6, str, str2);
    }

    @Override // qk.c
    public void g(String str, String str2, Throwable th2) {
        n(6, str, str2, th2);
    }

    @Override // qk.c
    public boolean h(int i11) {
        return this.f105617b <= i11;
    }

    @Override // qk.c
    public void v(String str, String str2) {
        m(2, str, str2);
    }

    @Override // qk.c
    public void w(String str, String str2) {
        m(5, str, str2);
    }

    @Override // qk.c
    public void i(String str, String str2) {
        m(4, str, str2);
    }
}
