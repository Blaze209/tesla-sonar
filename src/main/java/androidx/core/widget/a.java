package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.ViewCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f7901r = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final View f7904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Runnable f7905d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f7908g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f7909h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f7913l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    boolean f7914m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f7915n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    boolean f7916o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f7917p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f7918q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final C0160a f7902a = new C0160a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Interpolator f7903b = new AccelerateInterpolator();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float[] f7906e = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float[] f7907f = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float[] f7910i = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float[] f7911j = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float[] f7912k = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: androidx.core.widget.a$a, reason: collision with other inner class name */
    private static class C0160a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f7919a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f7920b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f7921c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f7922d;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private float f7928j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f7929k;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f7923e = Long.MIN_VALUE;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f7927i = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f7924f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f7925g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f7926h = 0;

        C0160a() {
        }

        private float e(long j11) {
            long j12 = this.f7923e;
            if (j11 < j12) {
                return BitmapDescriptorFactory.HUE_RED;
            }
            long j13 = this.f7927i;
            if (j13 < 0 || j11 < j13) {
                return a.e((j11 - j12) / this.f7919a, BitmapDescriptorFactory.HUE_RED, 1.0f) * 0.5f;
            }
            float f11 = this.f7928j;
            return (1.0f - f11) + (f11 * a.e((j11 - j13) / this.f7929k, BitmapDescriptorFactory.HUE_RED, 1.0f));
        }

        private float g(float f11) {
            return ((-4.0f) * f11 * f11) + (f11 * 4.0f);
        }

        public void a() {
            if (this.f7924f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fG = g(e(jCurrentAnimationTimeMillis));
            long j11 = jCurrentAnimationTimeMillis - this.f7924f;
            this.f7924f = jCurrentAnimationTimeMillis;
            float f11 = j11 * fG;
            this.f7925g = (int) (this.f7921c * f11);
            this.f7926h = (int) (f11 * this.f7922d);
        }

        public int b() {
            return this.f7925g;
        }

        public int c() {
            return this.f7926h;
        }

        public int d() {
            float f11 = this.f7921c;
            return (int) (f11 / Math.abs(f11));
        }

        public int f() {
            float f11 = this.f7922d;
            return (int) (f11 / Math.abs(f11));
        }

        public boolean h() {
            return this.f7927i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f7927i + ((long) this.f7929k);
        }

        public void i() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f7929k = a.f((int) (jCurrentAnimationTimeMillis - this.f7923e), 0, this.f7920b);
            this.f7928j = e(jCurrentAnimationTimeMillis);
            this.f7927i = jCurrentAnimationTimeMillis;
        }

        public void j(int i11) {
            this.f7920b = i11;
        }

        public void k(int i11) {
            this.f7919a = i11;
        }

        public void l(float f11, float f12) {
            this.f7921c = f11;
            this.f7922d = f12;
        }

        public void m() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f7923e = jCurrentAnimationTimeMillis;
            this.f7927i = -1L;
            this.f7924f = jCurrentAnimationTimeMillis;
            this.f7928j = 0.5f;
            this.f7925g = 0;
            this.f7926h = 0;
        }
    }

    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.f7916o) {
                if (aVar.f7914m) {
                    aVar.f7914m = false;
                    aVar.f7902a.m();
                }
                C0160a c0160a = a.this.f7902a;
                if (c0160a.h() || !a.this.u()) {
                    a.this.f7916o = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.f7915n) {
                    aVar2.f7915n = false;
                    aVar2.c();
                }
                c0160a.a();
                a.this.j(c0160a.b(), c0160a.c());
                ViewCompat.h0(a.this.f7904c, this);
            }
        }
    }

    public a(View view) {
        this.f7904c = view;
        float f11 = Resources.getSystem().getDisplayMetrics().density;
        float f12 = (int) ((1575.0f * f11) + 0.5f);
        o(f12, f12);
        float f13 = (int) ((f11 * 315.0f) + 0.5f);
        p(f13, f13);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(f7901r);
        r(500);
        q(500);
    }

    private float d(int i11, float f11, float f12, float f13) {
        float fH = h(this.f7906e[i11], f12, this.f7907f[i11], f11);
        if (fH == BitmapDescriptorFactory.HUE_RED) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float f14 = this.f7910i[i11];
        float f15 = this.f7911j[i11];
        float f16 = this.f7912k[i11];
        float f17 = f14 * f13;
        return fH > BitmapDescriptorFactory.HUE_RED ? e(fH * f17, f15, f16) : -e((-fH) * f17, f15, f16);
    }

    static float e(float f11, float f12, float f13) {
        if (f11 > f13) {
            return f13;
        }
        return f11 < f12 ? f12 : f11;
    }

    static int f(int i11, int i12, int i13) {
        if (i11 > i13) {
            return i13;
        }
        return i11 < i12 ? i12 : i11;
    }

    private float g(float f11, float f12) {
        if (f12 == BitmapDescriptorFactory.HUE_RED) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        int i11 = this.f7908g;
        if (i11 == 0 || i11 == 1) {
            if (f11 < f12) {
                if (f11 >= BitmapDescriptorFactory.HUE_RED) {
                    return 1.0f - (f11 / f12);
                }
                if (this.f7916o && i11 == 1) {
                    return 1.0f;
                }
            }
        } else if (i11 == 2 && f11 < BitmapDescriptorFactory.HUE_RED) {
            return f11 / (-f12);
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    private float h(float f11, float f12, float f13, float f14) {
        float interpolation;
        float fE = e(f11 * f12, BitmapDescriptorFactory.HUE_RED, f13);
        float fG = g(f12 - f14, fE) - g(f14, fE);
        if (fG < BitmapDescriptorFactory.HUE_RED) {
            interpolation = -this.f7903b.getInterpolation(-fG);
        } else {
            if (fG <= BitmapDescriptorFactory.HUE_RED) {
                return BitmapDescriptorFactory.HUE_RED;
            }
            interpolation = this.f7903b.getInterpolation(fG);
        }
        return e(interpolation, -1.0f, 1.0f);
    }

    private void i() {
        if (this.f7914m) {
            this.f7916o = false;
        } else {
            this.f7902a.i();
        }
    }

    private void v() {
        int i11;
        if (this.f7905d == null) {
            this.f7905d = new b();
        }
        this.f7916o = true;
        this.f7914m = true;
        if (this.f7913l || (i11 = this.f7909h) <= 0) {
            this.f7905d.run();
        } else {
            ViewCompat.i0(this.f7904c, this.f7905d, i11);
        }
        this.f7913l = true;
    }

    public abstract boolean a(int i11);

    public abstract boolean b(int i11);

    void c() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
        this.f7904c.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    public abstract void j(int i11, int i12);

    public a k(int i11) {
        this.f7909h = i11;
        return this;
    }

    public a l(int i11) {
        this.f7908g = i11;
        return this;
    }

    public a m(boolean z11) {
        if (this.f7917p && !z11) {
            i();
        }
        this.f7917p = z11;
        return this;
    }

    public a n(float f11, float f12) {
        float[] fArr = this.f7907f;
        fArr[0] = f11;
        fArr[1] = f12;
        return this;
    }

    public a o(float f11, float f12) {
        float[] fArr = this.f7912k;
        fArr[0] = f11 / 1000.0f;
        fArr[1] = f12 / 1000.0f;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f7917p) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                i();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    i();
                }
            }
            return !this.f7918q && this.f7916o;
        }
        this.f7915n = true;
        this.f7913l = false;
        this.f7902a.l(d(0, motionEvent.getX(), view.getWidth(), this.f7904c.getWidth()), d(1, motionEvent.getY(), view.getHeight(), this.f7904c.getHeight()));
        if (!this.f7916o && u()) {
            v();
        }
        if (this.f7918q) {
        }
    }

    public a p(float f11, float f12) {
        float[] fArr = this.f7911j;
        fArr[0] = f11 / 1000.0f;
        fArr[1] = f12 / 1000.0f;
        return this;
    }

    public a q(int i11) {
        this.f7902a.j(i11);
        return this;
    }

    public a r(int i11) {
        this.f7902a.k(i11);
        return this;
    }

    public a s(float f11, float f12) {
        float[] fArr = this.f7906e;
        fArr[0] = f11;
        fArr[1] = f12;
        return this;
    }

    public a t(float f11, float f12) {
        float[] fArr = this.f7910i;
        fArr[0] = f11 / 1000.0f;
        fArr[1] = f12 / 1000.0f;
        return this;
    }

    boolean u() {
        C0160a c0160a = this.f7902a;
        int iF = c0160a.f();
        int iD = c0160a.d();
        if (iF == 0 || !b(iF)) {
            return iD != 0 && a(iD);
        }
        return true;
    }
}
