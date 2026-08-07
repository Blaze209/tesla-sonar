package bv;

import android.util.Log;

/* JADX INFO: loaded from: classes5.dex */
public class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final g f18122c = new g("FirebaseCrashlytics");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f18123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f18124b = 4;

    public g(String str) {
        this.f18123a = str;
    }

    private boolean a(int i11) {
        return this.f18124b <= i11 || Log.isLoggable(this.f18123a, i11);
    }

    public static g f() {
        return f18122c;
    }

    public void b(String str) {
        c(str, null);
    }

    public void c(String str, Throwable th2) {
        if (a(3)) {
            Log.d(this.f18123a, str, th2);
        }
    }

    public void d(String str) {
        e(str, null);
    }

    public void e(String str, Throwable th2) {
        if (a(6)) {
            Log.e(this.f18123a, str, th2);
        }
    }

    public void g(String str) {
        h(str, null);
    }

    public void h(String str, Throwable th2) {
        if (a(4)) {
            Log.i(this.f18123a, str, th2);
        }
    }

    public void i(String str) {
        j(str, null);
    }

    public void j(String str, Throwable th2) {
        if (a(2)) {
            Log.v(this.f18123a, str, th2);
        }
    }

    public void k(String str) {
        l(str, null);
    }

    public void l(String str, Throwable th2) {
        if (a(5)) {
            Log.w(this.f18123a, str, th2);
        }
    }
}
