package kw;

import android.util.Log;

/* JADX INFO: loaded from: classes5.dex */
class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static c f89436a;

    private c() {
    }

    public static synchronized c c() {
        try {
            if (f89436a == null) {
                f89436a = new c();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f89436a;
    }

    void a(String str) {
        Log.d("FirebasePerformance", str);
    }

    void b(String str) {
        Log.e("FirebasePerformance", str);
    }

    void d(String str) {
        Log.i("FirebasePerformance", str);
    }

    void e(String str) {
        Log.w("FirebasePerformance", str);
    }
}
