package androidx.work;

import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f14790a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile z f14791b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f14792c = 20;

    public static class a extends z {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f14793d;

        public a(int i11) {
            super(i11);
            this.f14793d = i11;
        }

        @Override // androidx.work.z
        public void a(String str, String str2) {
            if (this.f14793d <= 3) {
                Log.d(str, str2);
            }
        }

        @Override // androidx.work.z
        public void b(String str, String str2, Throwable th2) {
            if (this.f14793d <= 3) {
                Log.d(str, str2, th2);
            }
        }

        @Override // androidx.work.z
        public void c(String str, String str2) {
            if (this.f14793d <= 6) {
                Log.e(str, str2);
            }
        }

        @Override // androidx.work.z
        public void d(String str, String str2, Throwable th2) {
            if (this.f14793d <= 6) {
                Log.e(str, str2, th2);
            }
        }

        @Override // androidx.work.z
        public void f(String str, String str2) {
            if (this.f14793d <= 4) {
                Log.i(str, str2);
            }
        }

        @Override // androidx.work.z
        public void g(String str, String str2, Throwable th2) {
            if (this.f14793d <= 4) {
                Log.i(str, str2, th2);
            }
        }

        @Override // androidx.work.z
        public void j(String str, String str2) {
            if (this.f14793d <= 2) {
                Log.v(str, str2);
            }
        }

        @Override // androidx.work.z
        public void k(String str, String str2) {
            if (this.f14793d <= 5) {
                Log.w(str, str2);
            }
        }

        @Override // androidx.work.z
        public void l(String str, String str2, Throwable th2) {
            if (this.f14793d <= 5) {
                Log.w(str, str2, th2);
            }
        }
    }

    public z(int i11) {
    }

    public static z e() {
        z zVar;
        synchronized (f14790a) {
            try {
                if (f14791b == null) {
                    f14791b = new a(3);
                }
                zVar = f14791b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zVar;
    }

    public static void h(z zVar) {
        synchronized (f14790a) {
            try {
                if (f14791b == null) {
                    f14791b = zVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static String i(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        int i11 = f14792c;
        if (length >= i11) {
            sb2.append(str.substring(0, i11));
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }

    public abstract void a(String str, String str2);

    public abstract void b(String str, String str2, Throwable th2);

    public abstract void c(String str, String str2);

    public abstract void d(String str, String str2, Throwable th2);

    public abstract void f(String str, String str2);

    public abstract void g(String str, String str2, Throwable th2);

    public abstract void j(String str, String str2);

    public abstract void k(String str, String str2);

    public abstract void l(String str, String str2, Throwable th2);
}
