package androidx.core.view;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.CancellationSignal;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import android.view.animation.Interpolator;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes.dex */
public final class WindowInsetsControllerCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f7723a;

    private static class a extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final Window f7724a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final h0 f7725b;

        a(Window window, h0 h0Var) {
            this.f7724a = window;
            this.f7725b = h0Var;
        }

        private void j(int i11) {
            if (i11 == 1) {
                k(4);
            } else if (i11 == 2) {
                k(2);
            } else {
                if (i11 != 8) {
                    return;
                }
                this.f7725b.a();
            }
        }

        private void m(int i11) {
            if (i11 == 1) {
                n(4);
                o(1024);
            } else if (i11 == 2) {
                n(2);
            } else {
                if (i11 != 8) {
                    return;
                }
                this.f7725b.b();
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.g
        void a(int i11, long j11, Interpolator interpolator, CancellationSignal cancellationSignal, e1 e1Var) {
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.g
        int b() {
            Object tag = this.f7724a.getDecorView().getTag(356039078);
            if (tag != null) {
                return ((Integer) tag).intValue();
            }
            return 1;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.g
        void c(int i11) {
            for (int i12 = 1; i12 <= 512; i12 <<= 1) {
                if ((i11 & i12) != 0) {
                    j(i12);
                }
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.g
        void h(int i11) {
            this.f7724a.getDecorView().setTag(356039078, Integer.valueOf(i11));
            if (i11 == 0) {
                n(6144);
                return;
            }
            if (i11 == 1) {
                n(4096);
                k(2048);
            } else {
                if (i11 != 2) {
                    return;
                }
                n(2048);
                k(4096);
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.g
        void i(int i11) {
            for (int i12 = 1; i12 <= 512; i12 <<= 1) {
                if ((i11 & i12) != 0) {
                    m(i12);
                }
            }
        }

        protected void k(int i11) {
            View decorView = this.f7724a.getDecorView();
            decorView.setSystemUiVisibility(i11 | decorView.getSystemUiVisibility());
        }

        protected void l(int i11) {
            this.f7724a.addFlags(i11);
        }

        protected void n(int i11) {
            View decorView = this.f7724a.getDecorView();
            decorView.setSystemUiVisibility((~i11) & decorView.getSystemUiVisibility());
        }

        protected void o(int i11) {
            this.f7724a.clearFlags(i11);
        }
    }

    private static class b extends a {
        b(Window window, h0 h0Var) {
            super(window, h0Var);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.g
        public boolean e() {
            return (this.f7724a.getDecorView().getSystemUiVisibility() & PKIFailureInfo.certRevoked) != 0;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.g
        public void g(boolean z11) {
            if (!z11) {
                n(PKIFailureInfo.certRevoked);
                return;
            }
            o(67108864);
            l(Integer.MIN_VALUE);
            k(PKIFailureInfo.certRevoked);
        }
    }

    private static class c extends b {
        c(Window window, h0 h0Var) {
            super(window, h0Var);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.g
        public boolean d() {
            return (this.f7724a.getDecorView().getSystemUiVisibility() & 16) != 0;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.g
        public void f(boolean z11) {
            if (!z11) {
                n(16);
                return;
            }
            o(134217728);
            l(Integer.MIN_VALUE);
            k(16);
        }
    }

    private static class e extends d {
        e(Window window, WindowInsetsControllerCompat windowInsetsControllerCompat, h0 h0Var) {
            super(window, windowInsetsControllerCompat, h0Var);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.d, androidx.core.view.WindowInsetsControllerCompat.g
        @SuppressLint({"WrongConstant"})
        int b() {
            return this.f7727b.getSystemBarsBehavior();
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.d, androidx.core.view.WindowInsetsControllerCompat.g
        void h(int i11) {
            this.f7727b.setSystemBarsBehavior(i11);
        }

        e(WindowInsetsController windowInsetsController, WindowInsetsControllerCompat windowInsetsControllerCompat, h0 h0Var) {
            super(windowInsetsController, windowInsetsControllerCompat, h0Var);
        }
    }

    private static class f extends e {
        f(Window window, WindowInsetsControllerCompat windowInsetsControllerCompat, h0 h0Var) {
            super(window, windowInsetsControllerCompat, h0Var);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.d, androidx.core.view.WindowInsetsControllerCompat.g
        public boolean d() {
            return (this.f7727b.getSystemBarsAppearance() & 16) != 0;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.d, androidx.core.view.WindowInsetsControllerCompat.g
        public boolean e() {
            return (this.f7727b.getSystemBarsAppearance() & 8) != 0;
        }

        f(WindowInsetsController windowInsetsController, WindowInsetsControllerCompat windowInsetsControllerCompat, h0 h0Var) {
            super(windowInsetsController, windowInsetsControllerCompat, h0Var);
        }
    }

    private static class g {
        g() {
        }

        void a(int i11, long j11, Interpolator interpolator, CancellationSignal cancellationSignal, e1 e1Var) {
            throw null;
        }

        int b() {
            throw null;
        }

        void c(int i11) {
            throw null;
        }

        public boolean d() {
            return false;
        }

        public boolean e() {
            throw null;
        }

        public void f(boolean z11) {
        }

        public void g(boolean z11) {
            throw null;
        }

        void h(int i11) {
            throw null;
        }

        void i(int i11) {
            throw null;
        }
    }

    @Deprecated
    private WindowInsetsControllerCompat(WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f7723a = new f(windowInsetsController, this, new h0(windowInsetsController));
        } else {
            this.f7723a = new d(windowInsetsController, this, new h0(windowInsetsController));
        }
    }

    @Deprecated
    public static WindowInsetsControllerCompat j(WindowInsetsController windowInsetsController) {
        return new WindowInsetsControllerCompat(windowInsetsController);
    }

    public void a(int i11, long j11, Interpolator interpolator, CancellationSignal cancellationSignal, e1 e1Var) {
        this.f7723a.a(i11, j11, interpolator, cancellationSignal, e1Var);
    }

    @SuppressLint({"WrongConstant"})
    public int b() {
        return this.f7723a.b();
    }

    public void c(int i11) {
        this.f7723a.c(i11);
    }

    public boolean d() {
        return this.f7723a.d();
    }

    public boolean e() {
        return this.f7723a.e();
    }

    public void f(boolean z11) {
        this.f7723a.f(z11);
    }

    public void g(boolean z11) {
        this.f7723a.g(z11);
    }

    public void h(int i11) {
        this.f7723a.h(i11);
    }

    public void i(int i11) {
        this.f7723a.i(i11);
    }

    private static class d extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final WindowInsetsControllerCompat f7726a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final WindowInsetsController f7727b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final h0 f7728c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final androidx.collection.x0<Object, WindowInsetsController.OnControllableInsetsChangedListener> f7729d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected Window f7730e;

        class a implements WindowInsetsAnimationControlListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private f1 f7731a = null;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ e1 f7732b;

            a(e1 e1Var) {
                this.f7732b = e1Var;
            }

            public void onCancelled(WindowInsetsAnimationController windowInsetsAnimationController) {
                this.f7732b.a(windowInsetsAnimationController == null ? null : this.f7731a);
            }

            public void onFinished(WindowInsetsAnimationController windowInsetsAnimationController) {
                this.f7732b.c(this.f7731a);
            }

            public void onReady(WindowInsetsAnimationController windowInsetsAnimationController, int i11) {
                f1 f1Var = new f1(windowInsetsAnimationController);
                this.f7731a = f1Var;
                this.f7732b.b(f1Var, i11);
            }
        }

        d(Window window, WindowInsetsControllerCompat windowInsetsControllerCompat, h0 h0Var) {
            this(window.getInsetsController(), windowInsetsControllerCompat, h0Var);
            this.f7730e = window;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.g
        void a(int i11, long j11, Interpolator interpolator, CancellationSignal cancellationSignal, e1 e1Var) {
            this.f7727b.controlWindowInsetsAnimation(i11, j11, interpolator, cancellationSignal, new a(e1Var));
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.g
        @SuppressLint({"WrongConstant"})
        int b() {
            Window window = this.f7730e;
            if (window == null) {
                return this.f7727b.getSystemBarsBehavior();
            }
            Object tag = window.getDecorView().getTag(356039078);
            if (tag != null) {
                return ((Integer) tag).intValue();
            }
            return 1;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.g
        void c(int i11) {
            if ((i11 & 8) != 0) {
                this.f7728c.a();
            }
            this.f7727b.hide(i11 & (-9));
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.g
        public boolean d() {
            this.f7727b.setSystemBarsAppearance(0, 0);
            return (this.f7727b.getSystemBarsAppearance() & 16) != 0;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.g
        public boolean e() {
            this.f7727b.setSystemBarsAppearance(0, 0);
            return (this.f7727b.getSystemBarsAppearance() & 8) != 0;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.g
        public void f(boolean z11) {
            if (z11) {
                if (this.f7730e != null) {
                    j(16);
                }
                this.f7727b.setSystemBarsAppearance(16, 16);
            } else {
                if (this.f7730e != null) {
                    k(16);
                }
                this.f7727b.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.g
        public void g(boolean z11) {
            if (z11) {
                if (this.f7730e != null) {
                    j(PKIFailureInfo.certRevoked);
                }
                this.f7727b.setSystemBarsAppearance(8, 8);
            } else {
                if (this.f7730e != null) {
                    k(PKIFailureInfo.certRevoked);
                }
                this.f7727b.setSystemBarsAppearance(0, 8);
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.g
        void h(int i11) {
            Window window = this.f7730e;
            if (window == null) {
                this.f7727b.setSystemBarsBehavior(i11);
                return;
            }
            window.getDecorView().setTag(356039078, Integer.valueOf(i11));
            if (i11 == 0) {
                k(6144);
                return;
            }
            if (i11 == 1) {
                k(4096);
                j(2048);
            } else {
                if (i11 != 2) {
                    return;
                }
                k(2048);
                j(4096);
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.g
        void i(int i11) {
            if ((i11 & 8) != 0) {
                this.f7728c.b();
            }
            this.f7727b.show(i11 & (-9));
        }

        protected void j(int i11) {
            View decorView = this.f7730e.getDecorView();
            decorView.setSystemUiVisibility(i11 | decorView.getSystemUiVisibility());
        }

        protected void k(int i11) {
            View decorView = this.f7730e.getDecorView();
            decorView.setSystemUiVisibility((~i11) & decorView.getSystemUiVisibility());
        }

        d(WindowInsetsController windowInsetsController, WindowInsetsControllerCompat windowInsetsControllerCompat, h0 h0Var) {
            this.f7729d = new androidx.collection.x0<>();
            this.f7727b = windowInsetsController;
            this.f7726a = windowInsetsControllerCompat;
            this.f7728c = h0Var;
        }
    }

    public WindowInsetsControllerCompat(Window window, View view) {
        h0 h0Var = new h0(view);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 35) {
            this.f7723a = new f(window, this, h0Var);
            return;
        }
        if (i11 >= 30) {
            this.f7723a = new d(window, this, h0Var);
        } else if (i11 >= 26) {
            this.f7723a = new c(window, h0Var);
        } else {
            this.f7723a = new b(window, h0Var);
        }
    }
}
