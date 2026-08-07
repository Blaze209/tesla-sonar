package hg;

import android.view.Choreographer;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes3.dex */
public class h extends a implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private tf.i f72722l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f72714d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f72715e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f72716f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f72717g = BitmapDescriptorFactory.HUE_RED;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f72718h = BitmapDescriptorFactory.HUE_RED;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f72719i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f72720j = -2.1474836E9f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f72721k = 2.1474836E9f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected boolean f72723m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f72724n = false;

    private void F() {
        if (this.f72722l == null) {
            return;
        }
        float f11 = this.f72718h;
        if (f11 < this.f72720j || f11 > this.f72721k) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f72720j), Float.valueOf(this.f72721k), Float.valueOf(this.f72718h)));
        }
    }

    private void h(float f11) {
        if (this.f72724n && this.f72717g == f11) {
            return;
        }
        g();
    }

    private float m() {
        tf.i iVar = this.f72722l;
        if (iVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / iVar.i()) / Math.abs(this.f72714d);
    }

    private boolean q() {
        return p() < BitmapDescriptorFactory.HUE_RED;
    }

    public void A(float f11) {
        B(this.f72720j, f11);
    }

    public void B(float f11, float f12) {
        if (f11 > f12) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f11), Float.valueOf(f12)));
        }
        tf.i iVar = this.f72722l;
        float fP = iVar == null ? -3.4028235E38f : iVar.p();
        tf.i iVar2 = this.f72722l;
        float f13 = iVar2 == null ? Float.MAX_VALUE : iVar2.f();
        float fB = j.b(f11, fP, f13);
        float fB2 = j.b(f12, fP, f13);
        if (fB == this.f72720j && fB2 == this.f72721k) {
            return;
        }
        this.f72720j = fB;
        this.f72721k = fB2;
        z((int) j.b(this.f72718h, fB, fB2));
    }

    public void C(int i11) {
        B(i11, (int) this.f72721k);
    }

    public void D(float f11) {
        this.f72714d = f11;
    }

    public void E(boolean z11) {
        this.f72724n = z11;
    }

    @Override // hg.a
    void a() {
        super.a();
        b(q());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        a();
        u();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j11) {
        t();
        if (this.f72722l == null || !isRunning()) {
            return;
        }
        if (tf.e.h()) {
            tf.e.b("LottieValueAnimator#doFrame");
        }
        long j12 = this.f72716f;
        float fM = (j12 != 0 ? j11 - j12 : 0L) / m();
        float f11 = this.f72717g;
        if (q()) {
            fM = -fM;
        }
        float f12 = f11 + fM;
        boolean zD = j.d(f12, o(), n());
        float f13 = this.f72717g;
        float fB = j.b(f12, o(), n());
        this.f72717g = fB;
        if (this.f72724n) {
            fB = (float) Math.floor(fB);
        }
        this.f72718h = fB;
        this.f72716f = j11;
        if (zD) {
            h(f13);
        } else if (getRepeatCount() == -1 || this.f72719i < getRepeatCount()) {
            if (getRepeatMode() == 2) {
                this.f72715e = !this.f72715e;
                x();
            } else {
                float fN = q() ? n() : o();
                this.f72717g = fN;
                this.f72718h = fN;
            }
            this.f72716f = j11;
            h(f13);
            d();
            this.f72719i++;
        } else {
            float fO = this.f72714d < BitmapDescriptorFactory.HUE_RED ? o() : n();
            this.f72717g = fO;
            this.f72718h = fO;
            u();
            h(f13);
            b(q());
        }
        F();
        if (tf.e.h()) {
            tf.e.c("LottieValueAnimator#doFrame");
        }
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float fO;
        float fN;
        float fO2;
        if (this.f72722l == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (q()) {
            fO = n() - this.f72718h;
            fN = n();
            fO2 = o();
        } else {
            fO = this.f72718h - o();
            fN = n();
            fO2 = o();
        }
        return fO / (fN - fO2);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(k());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        tf.i iVar = this.f72722l;
        if (iVar == null) {
            return 0L;
        }
        return (long) iVar.d();
    }

    public void i() {
        this.f72722l = null;
        this.f72720j = -2.1474836E9f;
        this.f72721k = 2.1474836E9f;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.f72723m;
    }

    public void j() {
        u();
        b(q());
    }

    public float k() {
        tf.i iVar = this.f72722l;
        return iVar == null ? BitmapDescriptorFactory.HUE_RED : (this.f72718h - iVar.p()) / (this.f72722l.f() - this.f72722l.p());
    }

    public float l() {
        return this.f72718h;
    }

    public float n() {
        tf.i iVar = this.f72722l;
        if (iVar == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float f11 = this.f72721k;
        return f11 == 2.1474836E9f ? iVar.f() : f11;
    }

    public float o() {
        tf.i iVar = this.f72722l;
        if (iVar == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float f11 = this.f72720j;
        return f11 == -2.1474836E9f ? iVar.p() : f11;
    }

    public float p() {
        return this.f72714d;
    }

    public void r() {
        u();
        c();
    }

    public void s() {
        this.f72723m = true;
        f(q());
        z((int) (q() ? n() : o()));
        this.f72716f = 0L;
        this.f72719i = 0;
        t();
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i11) {
        super.setRepeatMode(i11);
        if (i11 == 2 || !this.f72715e) {
            return;
        }
        this.f72715e = false;
        x();
    }

    protected void t() {
        if (isRunning()) {
            v(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    protected void u() {
        v(true);
    }

    protected void v(boolean z11) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z11) {
            this.f72723m = false;
        }
    }

    public void w() {
        this.f72723m = true;
        t();
        this.f72716f = 0L;
        if (q() && l() == o()) {
            z(n());
        } else if (!q() && l() == n()) {
            z(o());
        }
        e();
    }

    public void x() {
        D(-p());
    }

    public void y(tf.i iVar) {
        boolean z11 = this.f72722l == null;
        this.f72722l = iVar;
        if (z11) {
            B(Math.max(this.f72720j, iVar.p()), Math.min(this.f72721k, iVar.f()));
        } else {
            B((int) iVar.p(), (int) iVar.f());
        }
        float f11 = this.f72718h;
        this.f72718h = BitmapDescriptorFactory.HUE_RED;
        this.f72717g = BitmapDescriptorFactory.HUE_RED;
        z((int) f11);
        g();
    }

    public void z(float f11) {
        if (this.f72717g == f11) {
            return;
        }
        float fB = j.b(f11, o(), n());
        this.f72717g = fB;
        if (this.f72724n) {
            fB = (float) Math.floor(fB);
        }
        this.f72718h = fB;
        this.f72716f = 0L;
        g();
    }
}
