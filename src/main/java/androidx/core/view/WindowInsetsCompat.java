package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class WindowInsetsCompat {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WindowInsetsCompat f7692b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f7693a;

    private static class d extends c {
        d() {
        }

        @Override // androidx.core.view.WindowInsetsCompat.f
        void c(int i11, k5.e eVar) {
            this.f7701c.setInsets(o.a(i11), eVar.g());
        }

        d(WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
        }
    }

    private static class e extends d {
        e() {
        }

        @Override // androidx.core.view.WindowInsetsCompat.d, androidx.core.view.WindowInsetsCompat.f
        void c(int i11, k5.e eVar) {
            this.f7701c.setInsets(p.a(i11), eVar.g());
        }

        e(WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
        }
    }

    private static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WindowInsetsCompat f7702a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        k5.e[] f7703b;

        f() {
            this(new WindowInsetsCompat((WindowInsetsCompat) null));
        }

        protected final void a() {
            k5.e[] eVarArr = this.f7703b;
            if (eVarArr != null) {
                k5.e eVarF = eVarArr[n.d(1)];
                k5.e eVarF2 = this.f7703b[n.d(2)];
                if (eVarF2 == null) {
                    eVarF2 = this.f7702a.f(2);
                }
                if (eVarF == null) {
                    eVarF = this.f7702a.f(1);
                }
                g(k5.e.b(eVarF, eVarF2));
                k5.e eVar = this.f7703b[n.d(16)];
                if (eVar != null) {
                    f(eVar);
                }
                k5.e eVar2 = this.f7703b[n.d(32)];
                if (eVar2 != null) {
                    d(eVar2);
                }
                k5.e eVar3 = this.f7703b[n.d(64)];
                if (eVar3 != null) {
                    h(eVar3);
                }
            }
        }

        WindowInsetsCompat b() {
            throw null;
        }

        void c(int i11, k5.e eVar) {
            if (this.f7703b == null) {
                this.f7703b = new k5.e[10];
            }
            for (int i12 = 1; i12 <= 512; i12 <<= 1) {
                if ((i11 & i12) != 0) {
                    this.f7703b[n.d(i12)] = eVar;
                }
            }
        }

        void e(k5.e eVar) {
            throw null;
        }

        void g(k5.e eVar) {
            throw null;
        }

        f(WindowInsetsCompat windowInsetsCompat) {
            this.f7702a = windowInsetsCompat;
        }

        void d(k5.e eVar) {
        }

        void f(k5.e eVar) {
        }

        void h(k5.e eVar) {
        }
    }

    private static class i extends h {
        i(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.m
        WindowInsetsCompat a() {
            return WindowInsetsCompat.y(this.f7709c.consumeDisplayCutout());
        }

        @Override // androidx.core.view.WindowInsetsCompat.g, androidx.core.view.WindowInsetsCompat.m
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Objects.equals(this.f7709c, iVar.f7709c) && Objects.equals(this.f7713g, iVar.f7713g) && g.C(this.f7714h, iVar.f7714h);
        }

        @Override // androidx.core.view.WindowInsetsCompat.m
        androidx.core.view.j f() {
            return androidx.core.view.j.f(this.f7709c.getDisplayCutout());
        }

        @Override // androidx.core.view.WindowInsetsCompat.m
        public int hashCode() {
            return this.f7709c.hashCode();
        }

        i(WindowInsetsCompat windowInsetsCompat, i iVar) {
            super(windowInsetsCompat, iVar);
        }
    }

    private static class k extends j {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        static final WindowInsetsCompat f7719r = WindowInsetsCompat.y(WindowInsets.CONSUMED);

        k(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.g, androidx.core.view.WindowInsetsCompat.m
        final void d(View view) {
        }

        @Override // androidx.core.view.WindowInsetsCompat.g, androidx.core.view.WindowInsetsCompat.m
        public k5.e g(int i11) {
            return k5.e.f(this.f7709c.getInsets(o.a(i11)));
        }

        @Override // androidx.core.view.WindowInsetsCompat.g, androidx.core.view.WindowInsetsCompat.m
        public k5.e h(int i11) {
            return k5.e.f(this.f7709c.getInsetsIgnoringVisibility(o.a(i11)));
        }

        @Override // androidx.core.view.WindowInsetsCompat.g, androidx.core.view.WindowInsetsCompat.m
        public boolean q(int i11) {
            return this.f7709c.isVisible(o.a(i11));
        }

        k(WindowInsetsCompat windowInsetsCompat, k kVar) {
            super(windowInsetsCompat, kVar);
        }
    }

    private static class l extends k {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        static final WindowInsetsCompat f7720s = WindowInsetsCompat.y(WindowInsets.CONSUMED);

        l(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.k, androidx.core.view.WindowInsetsCompat.g, androidx.core.view.WindowInsetsCompat.m
        public k5.e g(int i11) {
            return k5.e.f(this.f7709c.getInsets(p.a(i11)));
        }

        @Override // androidx.core.view.WindowInsetsCompat.k, androidx.core.view.WindowInsetsCompat.g, androidx.core.view.WindowInsetsCompat.m
        public k5.e h(int i11) {
            return k5.e.f(this.f7709c.getInsetsIgnoringVisibility(p.a(i11)));
        }

        @Override // androidx.core.view.WindowInsetsCompat.k, androidx.core.view.WindowInsetsCompat.g, androidx.core.view.WindowInsetsCompat.m
        public boolean q(int i11) {
            return this.f7709c.isVisible(p.a(i11));
        }

        l(WindowInsetsCompat windowInsetsCompat, l lVar) {
            super(windowInsetsCompat, lVar);
        }
    }

    public static final class n {
        public static int a() {
            return 4;
        }

        public static int b() {
            return 128;
        }

        public static int c() {
            return 8;
        }

        static int d(int i11) {
            if (i11 == 1) {
                return 0;
            }
            if (i11 == 2) {
                return 1;
            }
            if (i11 == 4) {
                return 2;
            }
            if (i11 == 8) {
                return 3;
            }
            if (i11 == 16) {
                return 4;
            }
            if (i11 == 32) {
                return 5;
            }
            if (i11 == 64) {
                return 6;
            }
            if (i11 == 128) {
                return 7;
            }
            if (i11 == 256) {
                return 8;
            }
            if (i11 == 512) {
                return 9;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i11);
        }

        public static int e() {
            return 32;
        }

        public static int f() {
            return 2;
        }

        public static int g() {
            return 1;
        }

        public static int h() {
            return 519;
        }

        public static int i() {
            return 16;
        }

        public static int j() {
            return 64;
        }
    }

    private static final class o {
        static int a(int i11) {
            int iStatusBars;
            int i12 = 0;
            for (int i13 = 1; i13 <= 512; i13 <<= 1) {
                if ((i11 & i13) != 0) {
                    if (i13 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i13 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i13 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i13 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i13 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i13 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i13 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i13 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    }
                    i12 |= iStatusBars;
                }
            }
            return i12;
        }
    }

    private static final class p {
        static int a(int i11) {
            int iStatusBars;
            int i12 = 0;
            for (int i13 = 1; i13 <= 512; i13 <<= 1) {
                if ((i11 & i13) != 0) {
                    if (i13 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i13 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i13 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i13 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i13 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i13 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i13 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i13 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    } else if (i13 == 512) {
                        iStatusBars = WindowInsets.Type.systemOverlays();
                    }
                    i12 |= iStatusBars;
                }
            }
            return i12;
        }
    }

    static {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34) {
            f7692b = l.f7720s;
        } else if (i11 >= 30) {
            f7692b = k.f7719r;
        } else {
            f7692b = m.f7721b;
        }
    }

    private WindowInsetsCompat(WindowInsets windowInsets) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34) {
            this.f7693a = new l(this, windowInsets);
            return;
        }
        if (i11 >= 30) {
            this.f7693a = new k(this, windowInsets);
            return;
        }
        if (i11 >= 29) {
            this.f7693a = new j(this, windowInsets);
        } else if (i11 >= 28) {
            this.f7693a = new i(this, windowInsets);
        } else {
            this.f7693a = new h(this, windowInsets);
        }
    }

    static k5.e o(k5.e eVar, int i11, int i12, int i13, int i14) {
        int iMax = Math.max(0, eVar.f84924a - i11);
        int iMax2 = Math.max(0, eVar.f84925b - i12);
        int iMax3 = Math.max(0, eVar.f84926c - i13);
        int iMax4 = Math.max(0, eVar.f84927d - i14);
        return (iMax == i11 && iMax2 == i12 && iMax3 == i13 && iMax4 == i14) ? eVar : k5.e.c(iMax, iMax2, iMax3, iMax4);
    }

    public static WindowInsetsCompat y(WindowInsets windowInsets) {
        return z(windowInsets, null);
    }

    public static WindowInsetsCompat z(WindowInsets windowInsets, View view) {
        WindowInsetsCompat windowInsetsCompat = new WindowInsetsCompat((WindowInsets) u5.h.g(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            windowInsetsCompat.u(ViewCompat.H(view));
            windowInsetsCompat.d(view.getRootView());
            windowInsetsCompat.w(view.getWindowSystemUiVisibility());
        }
        return windowInsetsCompat;
    }

    @Deprecated
    public WindowInsetsCompat a() {
        return this.f7693a.a();
    }

    @Deprecated
    public WindowInsetsCompat b() {
        return this.f7693a.b();
    }

    @Deprecated
    public WindowInsetsCompat c() {
        return this.f7693a.c();
    }

    void d(View view) {
        this.f7693a.d(view);
    }

    public androidx.core.view.j e() {
        return this.f7693a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WindowInsetsCompat) {
            return u5.c.a(this.f7693a, ((WindowInsetsCompat) obj).f7693a);
        }
        return false;
    }

    public k5.e f(int i11) {
        return this.f7693a.g(i11);
    }

    public k5.e g(int i11) {
        return this.f7693a.h(i11);
    }

    @Deprecated
    public k5.e h() {
        return this.f7693a.j();
    }

    public int hashCode() {
        m mVar = this.f7693a;
        if (mVar == null) {
            return 0;
        }
        return mVar.hashCode();
    }

    @Deprecated
    public k5.e i() {
        return this.f7693a.k();
    }

    @Deprecated
    public int j() {
        return this.f7693a.l().f84927d;
    }

    @Deprecated
    public int k() {
        return this.f7693a.l().f84924a;
    }

    @Deprecated
    public int l() {
        return this.f7693a.l().f84926c;
    }

    @Deprecated
    public int m() {
        return this.f7693a.l().f84925b;
    }

    public WindowInsetsCompat n(int i11, int i12, int i13, int i14) {
        return this.f7693a.n(i11, i12, i13, i14);
    }

    public boolean p() {
        return this.f7693a.o();
    }

    public boolean q(int i11) {
        return this.f7693a.q(i11);
    }

    @Deprecated
    public WindowInsetsCompat r(int i11, int i12, int i13, int i14) {
        return new a(this).d(k5.e.c(i11, i12, i13, i14)).a();
    }

    void s(k5.e[] eVarArr) {
        this.f7693a.r(eVarArr);
    }

    void t(k5.e eVar) {
        this.f7693a.s(eVar);
    }

    void u(WindowInsetsCompat windowInsetsCompat) {
        this.f7693a.t(windowInsetsCompat);
    }

    void v(k5.e eVar) {
        this.f7693a.u(eVar);
    }

    void w(int i11) {
        this.f7693a.v(i11);
    }

    public WindowInsets x() {
        m mVar = this.f7693a;
        if (mVar instanceof g) {
            return ((g) mVar).f7709c;
        }
        return null;
    }

    private static class b extends f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static Field f7695e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static boolean f7696f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static Constructor<WindowInsets> f7697g = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static boolean f7698h = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WindowInsets f7699c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private k5.e f7700d;

        b() {
            this.f7699c = i();
        }

        private static WindowInsets i() {
            if (!f7696f) {
                try {
                    f7695e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e11) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e11);
                }
                f7696f = true;
            }
            Field field = f7695e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e12) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e12);
                }
            }
            if (!f7698h) {
                try {
                    f7697g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e13) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e13);
                }
                f7698h = true;
            }
            Constructor<WindowInsets> constructor = f7697g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e14) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e14);
                }
            }
            return null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.f
        WindowInsetsCompat b() {
            a();
            WindowInsetsCompat windowInsetsCompatY = WindowInsetsCompat.y(this.f7699c);
            windowInsetsCompatY.s(this.f7703b);
            windowInsetsCompatY.v(this.f7700d);
            return windowInsetsCompatY;
        }

        @Override // androidx.core.view.WindowInsetsCompat.f
        void e(k5.e eVar) {
            this.f7700d = eVar;
        }

        @Override // androidx.core.view.WindowInsetsCompat.f
        void g(k5.e eVar) {
            WindowInsets windowInsets = this.f7699c;
            if (windowInsets != null) {
                this.f7699c = windowInsets.replaceSystemWindowInsets(eVar.f84924a, eVar.f84925b, eVar.f84926c, eVar.f84927d);
            }
        }

        b(WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
            this.f7699c = windowInsetsCompat.x();
        }
    }

    private static class c extends f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final WindowInsets.Builder f7701c;

        c() {
            this.f7701c = h1.a();
        }

        @Override // androidx.core.view.WindowInsetsCompat.f
        WindowInsetsCompat b() {
            a();
            WindowInsetsCompat windowInsetsCompatY = WindowInsetsCompat.y(this.f7701c.build());
            windowInsetsCompatY.s(this.f7703b);
            return windowInsetsCompatY;
        }

        @Override // androidx.core.view.WindowInsetsCompat.f
        void d(k5.e eVar) {
            this.f7701c.setMandatorySystemGestureInsets(eVar.g());
        }

        @Override // androidx.core.view.WindowInsetsCompat.f
        void e(k5.e eVar) {
            this.f7701c.setStableInsets(eVar.g());
        }

        @Override // androidx.core.view.WindowInsetsCompat.f
        void f(k5.e eVar) {
            this.f7701c.setSystemGestureInsets(eVar.g());
        }

        @Override // androidx.core.view.WindowInsetsCompat.f
        void g(k5.e eVar) {
            this.f7701c.setSystemWindowInsets(eVar.g());
        }

        @Override // androidx.core.view.WindowInsetsCompat.f
        void h(k5.e eVar) {
            this.f7701c.setTappableElementInsets(eVar.g());
        }

        c(WindowInsetsCompat windowInsetsCompat) {
            WindowInsets.Builder builderA;
            super(windowInsetsCompat);
            WindowInsets windowInsetsX = windowInsetsCompat.x();
            if (windowInsetsX != null) {
                builderA = g1.a(windowInsetsX);
            } else {
                builderA = h1.a();
            }
            this.f7701c = builderA;
        }
    }

    private static class h extends g {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private k5.e f7715n;

        h(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
            this.f7715n = null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.m
        WindowInsetsCompat b() {
            return WindowInsetsCompat.y(this.f7709c.consumeStableInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.m
        WindowInsetsCompat c() {
            return WindowInsetsCompat.y(this.f7709c.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.m
        final k5.e j() {
            if (this.f7715n == null) {
                this.f7715n = k5.e.c(this.f7709c.getStableInsetLeft(), this.f7709c.getStableInsetTop(), this.f7709c.getStableInsetRight(), this.f7709c.getStableInsetBottom());
            }
            return this.f7715n;
        }

        @Override // androidx.core.view.WindowInsetsCompat.m
        boolean o() {
            return this.f7709c.isConsumed();
        }

        @Override // androidx.core.view.WindowInsetsCompat.m
        public void u(k5.e eVar) {
            this.f7715n = eVar;
        }

        h(WindowInsetsCompat windowInsetsCompat, h hVar) {
            super(windowInsetsCompat, hVar);
            this.f7715n = null;
            this.f7715n = hVar.f7715n;
        }
    }

    private static class g extends m {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static boolean f7704i = false;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static Method f7705j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static Class<?> f7706k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static Field f7707l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static Field f7708m;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final WindowInsets f7709c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private k5.e[] f7710d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private k5.e f7711e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private WindowInsetsCompat f7712f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        k5.e f7713g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f7714h;

        g(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat);
            this.f7711e = null;
            this.f7709c = windowInsets;
        }

        @SuppressLint({"PrivateApi"})
        private static void B() {
            try {
                f7705j = View.class.getDeclaredMethod("getViewRootImpl", null);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f7706k = cls;
                f7707l = cls.getDeclaredField("mVisibleInsets");
                f7708m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f7707l.setAccessible(true);
                f7708m.setAccessible(true);
            } catch (ReflectiveOperationException e11) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e11.getMessage(), e11);
            }
            f7704i = true;
        }

        static boolean C(int i11, int i12) {
            return (i11 & 6) == (i12 & 6);
        }

        @SuppressLint({"WrongConstant"})
        private k5.e w(int i11, boolean z11) {
            k5.e eVarB = k5.e.f84923e;
            for (int i12 = 1; i12 <= 512; i12 <<= 1) {
                if ((i11 & i12) != 0) {
                    eVarB = k5.e.b(eVarB, x(i12, z11));
                }
            }
            return eVarB;
        }

        private k5.e y() {
            WindowInsetsCompat windowInsetsCompat = this.f7712f;
            return windowInsetsCompat != null ? windowInsetsCompat.h() : k5.e.f84923e;
        }

        private k5.e z(View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f7704i) {
                B();
            }
            Method method = f7705j;
            if (method != null && f7706k != null && f7707l != null) {
                try {
                    Object objInvoke = method.invoke(view, null);
                    if (objInvoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f7707l.get(f7708m.get(objInvoke));
                    if (rect != null) {
                        return k5.e.d(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e11) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e11.getMessage(), e11);
                }
            }
            return null;
        }

        protected boolean A(int i11) {
            if (i11 != 1 && i11 != 2) {
                if (i11 == 4) {
                    return false;
                }
                if (i11 != 8 && i11 != 128) {
                    return true;
                }
            }
            return !x(i11, false).equals(k5.e.f84923e);
        }

        @Override // androidx.core.view.WindowInsetsCompat.m
        void d(View view) {
            k5.e eVarZ = z(view);
            if (eVarZ == null) {
                eVarZ = k5.e.f84923e;
            }
            s(eVarZ);
        }

        @Override // androidx.core.view.WindowInsetsCompat.m
        void e(WindowInsetsCompat windowInsetsCompat) {
            windowInsetsCompat.u(this.f7712f);
            windowInsetsCompat.t(this.f7713g);
            windowInsetsCompat.w(this.f7714h);
        }

        @Override // androidx.core.view.WindowInsetsCompat.m
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            g gVar = (g) obj;
            return Objects.equals(this.f7713g, gVar.f7713g) && C(this.f7714h, gVar.f7714h);
        }

        @Override // androidx.core.view.WindowInsetsCompat.m
        public k5.e g(int i11) {
            return w(i11, false);
        }

        @Override // androidx.core.view.WindowInsetsCompat.m
        public k5.e h(int i11) {
            return w(i11, true);
        }

        @Override // androidx.core.view.WindowInsetsCompat.m
        final k5.e l() {
            if (this.f7711e == null) {
                this.f7711e = k5.e.c(this.f7709c.getSystemWindowInsetLeft(), this.f7709c.getSystemWindowInsetTop(), this.f7709c.getSystemWindowInsetRight(), this.f7709c.getSystemWindowInsetBottom());
            }
            return this.f7711e;
        }

        @Override // androidx.core.view.WindowInsetsCompat.m
        WindowInsetsCompat n(int i11, int i12, int i13, int i14) {
            a aVar = new a(WindowInsetsCompat.y(this.f7709c));
            aVar.d(WindowInsetsCompat.o(l(), i11, i12, i13, i14));
            aVar.c(WindowInsetsCompat.o(j(), i11, i12, i13, i14));
            return aVar.a();
        }

        @Override // androidx.core.view.WindowInsetsCompat.m
        boolean p() {
            return this.f7709c.isRound();
        }

        @Override // androidx.core.view.WindowInsetsCompat.m
        @SuppressLint({"WrongConstant"})
        boolean q(int i11) {
            for (int i12 = 1; i12 <= 512; i12 <<= 1) {
                if ((i11 & i12) != 0 && !A(i12)) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.core.view.WindowInsetsCompat.m
        public void r(k5.e[] eVarArr) {
            this.f7710d = eVarArr;
        }

        @Override // androidx.core.view.WindowInsetsCompat.m
        void s(k5.e eVar) {
            this.f7713g = eVar;
        }

        @Override // androidx.core.view.WindowInsetsCompat.m
        void t(WindowInsetsCompat windowInsetsCompat) {
            this.f7712f = windowInsetsCompat;
        }

        @Override // androidx.core.view.WindowInsetsCompat.m
        void v(int i11) {
            this.f7714h = i11;
        }

        protected k5.e x(int i11, boolean z11) {
            k5.e eVarH;
            int i12;
            if (i11 == 1) {
                if (z11) {
                    return k5.e.c(0, Math.max(y().f84925b, l().f84925b), 0, 0);
                }
                return (this.f7714h & 4) != 0 ? k5.e.f84923e : k5.e.c(0, l().f84925b, 0, 0);
            }
            if (i11 == 2) {
                if (z11) {
                    k5.e eVarY = y();
                    k5.e eVarJ = j();
                    return k5.e.c(Math.max(eVarY.f84924a, eVarJ.f84924a), 0, Math.max(eVarY.f84926c, eVarJ.f84926c), Math.max(eVarY.f84927d, eVarJ.f84927d));
                }
                if ((this.f7714h & 2) != 0) {
                    return k5.e.f84923e;
                }
                k5.e eVarL = l();
                WindowInsetsCompat windowInsetsCompat = this.f7712f;
                eVarH = windowInsetsCompat != null ? windowInsetsCompat.h() : null;
                int iMin = eVarL.f84927d;
                if (eVarH != null) {
                    iMin = Math.min(iMin, eVarH.f84927d);
                }
                return k5.e.c(eVarL.f84924a, 0, eVarL.f84926c, iMin);
            }
            if (i11 != 8) {
                if (i11 == 16) {
                    return k();
                }
                if (i11 == 32) {
                    return i();
                }
                if (i11 == 64) {
                    return m();
                }
                if (i11 != 128) {
                    return k5.e.f84923e;
                }
                WindowInsetsCompat windowInsetsCompat2 = this.f7712f;
                androidx.core.view.j jVarE = windowInsetsCompat2 != null ? windowInsetsCompat2.e() : f();
                return jVarE != null ? k5.e.c(jVarE.b(), jVarE.d(), jVarE.c(), jVarE.a()) : k5.e.f84923e;
            }
            k5.e[] eVarArr = this.f7710d;
            eVarH = eVarArr != null ? eVarArr[n.d(8)] : null;
            if (eVarH != null) {
                return eVarH;
            }
            k5.e eVarL2 = l();
            k5.e eVarY2 = y();
            int i13 = eVarL2.f84927d;
            if (i13 > eVarY2.f84927d) {
                return k5.e.c(0, 0, 0, i13);
            }
            k5.e eVar = this.f7713g;
            return (eVar == null || eVar.equals(k5.e.f84923e) || (i12 = this.f7713g.f84927d) <= eVarY2.f84927d) ? k5.e.f84923e : k5.e.c(0, 0, 0, i12);
        }

        g(WindowInsetsCompat windowInsetsCompat, g gVar) {
            this(windowInsetsCompat, new WindowInsets(gVar.f7709c));
        }
    }

    private static class j extends i {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private k5.e f7716o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private k5.e f7717p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private k5.e f7718q;

        j(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
            this.f7716o = null;
            this.f7717p = null;
            this.f7718q = null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.m
        k5.e i() {
            if (this.f7717p == null) {
                this.f7717p = k5.e.f(this.f7709c.getMandatorySystemGestureInsets());
            }
            return this.f7717p;
        }

        @Override // androidx.core.view.WindowInsetsCompat.m
        k5.e k() {
            if (this.f7716o == null) {
                this.f7716o = k5.e.f(this.f7709c.getSystemGestureInsets());
            }
            return this.f7716o;
        }

        @Override // androidx.core.view.WindowInsetsCompat.m
        k5.e m() {
            if (this.f7718q == null) {
                this.f7718q = k5.e.f(this.f7709c.getTappableElementInsets());
            }
            return this.f7718q;
        }

        @Override // androidx.core.view.WindowInsetsCompat.g, androidx.core.view.WindowInsetsCompat.m
        WindowInsetsCompat n(int i11, int i12, int i13, int i14) {
            return WindowInsetsCompat.y(this.f7709c.inset(i11, i12, i13, i14));
        }

        j(WindowInsetsCompat windowInsetsCompat, j jVar) {
            super(windowInsetsCompat, jVar);
            this.f7716o = null;
            this.f7717p = null;
            this.f7718q = null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.h, androidx.core.view.WindowInsetsCompat.m
        public void u(k5.e eVar) {
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f f7694a;

        public a() {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 34) {
                this.f7694a = new e();
                return;
            }
            if (i11 >= 30) {
                this.f7694a = new d();
            } else if (i11 >= 29) {
                this.f7694a = new c();
            } else {
                this.f7694a = new b();
            }
        }

        public WindowInsetsCompat a() {
            return this.f7694a.b();
        }

        public a b(int i11, k5.e eVar) {
            this.f7694a.c(i11, eVar);
            return this;
        }

        @Deprecated
        public a c(k5.e eVar) {
            this.f7694a.e(eVar);
            return this;
        }

        @Deprecated
        public a d(k5.e eVar) {
            this.f7694a.g(eVar);
            return this;
        }

        public a(WindowInsetsCompat windowInsetsCompat) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 34) {
                this.f7694a = new e(windowInsetsCompat);
                return;
            }
            if (i11 >= 30) {
                this.f7694a = new d(windowInsetsCompat);
            } else if (i11 >= 29) {
                this.f7694a = new c(windowInsetsCompat);
            } else {
                this.f7694a = new b(windowInsetsCompat);
            }
        }
    }

    public WindowInsetsCompat(WindowInsetsCompat windowInsetsCompat) {
        if (windowInsetsCompat != null) {
            m mVar = windowInsetsCompat.f7693a;
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 34 && (mVar instanceof l)) {
                this.f7693a = new l(this, (l) mVar);
            } else if (i11 >= 30 && (mVar instanceof k)) {
                this.f7693a = new k(this, (k) mVar);
            } else if (i11 >= 29 && (mVar instanceof j)) {
                this.f7693a = new j(this, (j) mVar);
            } else if (i11 >= 28 && (mVar instanceof i)) {
                this.f7693a = new i(this, (i) mVar);
            } else if (mVar instanceof h) {
                this.f7693a = new h(this, (h) mVar);
            } else if (mVar instanceof g) {
                this.f7693a = new g(this, (g) mVar);
            } else {
                this.f7693a = new m(this);
            }
            mVar.e(this);
            return;
        }
        this.f7693a = new m(this);
    }

    private static class m {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final WindowInsetsCompat f7721b = new a().a().a().b().c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final WindowInsetsCompat f7722a;

        m(WindowInsetsCompat windowInsetsCompat) {
            this.f7722a = windowInsetsCompat;
        }

        WindowInsetsCompat a() {
            return this.f7722a;
        }

        WindowInsetsCompat b() {
            return this.f7722a;
        }

        WindowInsetsCompat c() {
            return this.f7722a;
        }

        void d(View view) {
        }

        void e(WindowInsetsCompat windowInsetsCompat) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return p() == mVar.p() && o() == mVar.o() && u5.c.a(l(), mVar.l()) && u5.c.a(j(), mVar.j()) && u5.c.a(f(), mVar.f());
        }

        androidx.core.view.j f() {
            return null;
        }

        k5.e g(int i11) {
            return k5.e.f84923e;
        }

        k5.e h(int i11) {
            if ((i11 & 8) == 0) {
                return k5.e.f84923e;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        public int hashCode() {
            return u5.c.b(Boolean.valueOf(p()), Boolean.valueOf(o()), l(), j(), f());
        }

        k5.e i() {
            return l();
        }

        k5.e j() {
            return k5.e.f84923e;
        }

        k5.e k() {
            return l();
        }

        k5.e l() {
            return k5.e.f84923e;
        }

        k5.e m() {
            return l();
        }

        WindowInsetsCompat n(int i11, int i12, int i13, int i14) {
            return f7721b;
        }

        boolean o() {
            return false;
        }

        boolean p() {
            return false;
        }

        boolean q(int i11) {
            return true;
        }

        void t(WindowInsetsCompat windowInsetsCompat) {
        }

        void v(int i11) {
        }

        public void r(k5.e[] eVarArr) {
        }

        void s(k5.e eVar) {
        }

        public void u(k5.e eVar) {
        }
    }
}
