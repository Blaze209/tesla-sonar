package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import u5.h;

/* JADX INFO: loaded from: classes3.dex */
public class b extends Drawable implements Animatable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Interpolator f13927g = new LinearInterpolator();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Interpolator f13928h = new i7.b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f13929i = {-16777216};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f13930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f13931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Resources f13932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Animator f13933d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    float f13934e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f13935f;

    class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f13936a;

        a(c cVar) {
            this.f13936a = cVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            b.this.n(fFloatValue, this.f13936a);
            b.this.b(fFloatValue, this.f13936a, false);
            b.this.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.b$b, reason: collision with other inner class name */
    class C0235b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f13938a;

        C0235b(c cVar) {
            this.f13938a = cVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            b.this.b(1.0f, this.f13938a, true);
            this.f13938a.A();
            this.f13938a.l();
            b bVar = b.this;
            if (!bVar.f13935f) {
                bVar.f13934e += 1.0f;
                return;
            }
            bVar.f13935f = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            this.f13938a.x(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b.this.f13934e = BitmapDescriptorFactory.HUE_RED;
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final RectF f13940a = new RectF();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Paint f13941b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Paint f13942c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Paint f13943d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f13944e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        float f13945f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        float f13946g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        float f13947h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int[] f13948i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f13949j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float f13950k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        float f13951l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        float f13952m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f13953n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Path f13954o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        float f13955p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        float f13956q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f13957r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f13958s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f13959t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f13960u;

        c() {
            Paint paint = new Paint();
            this.f13941b = paint;
            Paint paint2 = new Paint();
            this.f13942c = paint2;
            Paint paint3 = new Paint();
            this.f13943d = paint3;
            this.f13944e = BitmapDescriptorFactory.HUE_RED;
            this.f13945f = BitmapDescriptorFactory.HUE_RED;
            this.f13946g = BitmapDescriptorFactory.HUE_RED;
            this.f13947h = 5.0f;
            this.f13955p = 1.0f;
            this.f13959t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        void A() {
            this.f13950k = this.f13944e;
            this.f13951l = this.f13945f;
            this.f13952m = this.f13946g;
        }

        void a(Canvas canvas, Rect rect) {
            RectF rectF = this.f13940a;
            float f11 = this.f13956q;
            float fMin = (this.f13947h / 2.0f) + f11;
            if (f11 <= BitmapDescriptorFactory.HUE_RED) {
                fMin = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.f13957r * this.f13955p) / 2.0f, this.f13947h / 2.0f);
            }
            rectF.set(rect.centerX() - fMin, rect.centerY() - fMin, rect.centerX() + fMin, rect.centerY() + fMin);
            float f12 = this.f13944e;
            float f13 = this.f13946g;
            float f14 = (f12 + f13) * 360.0f;
            float f15 = ((this.f13945f + f13) * 360.0f) - f14;
            this.f13941b.setColor(this.f13960u);
            this.f13941b.setAlpha(this.f13959t);
            float f16 = this.f13947h / 2.0f;
            rectF.inset(f16, f16);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f13943d);
            float f17 = -f16;
            rectF.inset(f17, f17);
            canvas.drawArc(rectF, f14, f15, false, this.f13941b);
            b(canvas, f14, f15, rectF);
        }

        void b(Canvas canvas, float f11, float f12, RectF rectF) {
            if (this.f13953n) {
                Path path = this.f13954o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f13954o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float fMin = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f13 = (this.f13957r * this.f13955p) / 2.0f;
                this.f13954o.moveTo(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                this.f13954o.lineTo(this.f13957r * this.f13955p, BitmapDescriptorFactory.HUE_RED);
                Path path3 = this.f13954o;
                float f14 = this.f13957r;
                float f15 = this.f13955p;
                path3.lineTo((f14 * f15) / 2.0f, this.f13958s * f15);
                this.f13954o.offset((fMin + rectF.centerX()) - f13, rectF.centerY() + (this.f13947h / 2.0f));
                this.f13954o.close();
                this.f13942c.setColor(this.f13960u);
                this.f13942c.setAlpha(this.f13959t);
                canvas.save();
                canvas.rotate(f11 + f12, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f13954o, this.f13942c);
                canvas.restore();
            }
        }

        int c() {
            return this.f13959t;
        }

        float d() {
            return this.f13945f;
        }

        int e() {
            return this.f13948i[f()];
        }

        int f() {
            return (this.f13949j + 1) % this.f13948i.length;
        }

        float g() {
            return this.f13944e;
        }

        int h() {
            return this.f13948i[this.f13949j];
        }

        float i() {
            return this.f13951l;
        }

        float j() {
            return this.f13952m;
        }

        float k() {
            return this.f13950k;
        }

        void l() {
            t(f());
        }

        void m() {
            this.f13950k = BitmapDescriptorFactory.HUE_RED;
            this.f13951l = BitmapDescriptorFactory.HUE_RED;
            this.f13952m = BitmapDescriptorFactory.HUE_RED;
            y(BitmapDescriptorFactory.HUE_RED);
            v(BitmapDescriptorFactory.HUE_RED);
            w(BitmapDescriptorFactory.HUE_RED);
        }

        void n(int i11) {
            this.f13959t = i11;
        }

        void o(float f11, float f12) {
            this.f13957r = (int) f11;
            this.f13958s = (int) f12;
        }

        void p(float f11) {
            if (f11 != this.f13955p) {
                this.f13955p = f11;
            }
        }

        void q(float f11) {
            this.f13956q = f11;
        }

        void r(int i11) {
            this.f13960u = i11;
        }

        void s(ColorFilter colorFilter) {
            this.f13941b.setColorFilter(colorFilter);
        }

        void t(int i11) {
            this.f13949j = i11;
            this.f13960u = this.f13948i[i11];
        }

        void u(@NonNull int[] iArr) {
            this.f13948i = iArr;
            t(0);
        }

        void v(float f11) {
            this.f13945f = f11;
        }

        void w(float f11) {
            this.f13946g = f11;
        }

        void x(boolean z11) {
            if (this.f13953n != z11) {
                this.f13953n = z11;
            }
        }

        void y(float f11) {
            this.f13944e = f11;
        }

        void z(float f11) {
            this.f13947h = f11;
            this.f13941b.setStrokeWidth(f11);
        }
    }

    public b(@NonNull Context context) {
        this.f13932c = ((Context) h.g(context)).getResources();
        c cVar = new c();
        this.f13930a = cVar;
        cVar.u(f13929i);
        k(2.5f);
        m();
    }

    private void a(float f11, c cVar) {
        n(f11, cVar);
        float fFloor = (float) (Math.floor(cVar.j() / 0.8f) + 1.0d);
        cVar.y(cVar.k() + (((cVar.i() - 0.01f) - cVar.k()) * f11));
        cVar.v(cVar.i());
        cVar.w(cVar.j() + ((fFloor - cVar.j()) * f11));
    }

    private int c(float f11, int i11, int i12) {
        int i13 = (i11 >> 24) & 255;
        int i14 = (i11 >> 16) & 255;
        int i15 = (i11 >> 8) & 255;
        int i16 = i11 & 255;
        return ((i13 + ((int) ((((i12 >> 24) & 255) - i13) * f11))) << 24) | ((i14 + ((int) ((((i12 >> 16) & 255) - i14) * f11))) << 16) | ((i15 + ((int) ((((i12 >> 8) & 255) - i15) * f11))) << 8) | (i16 + ((int) (f11 * ((i12 & 255) - i16))));
    }

    private void h(float f11) {
        this.f13931b = f11;
    }

    private void i(float f11, float f12, float f13, float f14) {
        c cVar = this.f13930a;
        float f15 = this.f13932c.getDisplayMetrics().density;
        cVar.z(f12 * f15);
        cVar.q(f11 * f15);
        cVar.t(0);
        cVar.o(f13 * f15, f14 * f15);
    }

    private void m() {
        c cVar = this.f13930a;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new a(cVar));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f13927g);
        valueAnimatorOfFloat.addListener(new C0235b(cVar));
        this.f13933d = valueAnimatorOfFloat;
    }

    void b(float f11, c cVar, boolean z11) {
        float interpolation;
        float interpolation2;
        if (this.f13935f) {
            a(f11, cVar);
            return;
        }
        if (f11 != 1.0f || z11) {
            float fJ = cVar.j();
            if (f11 < 0.5f) {
                interpolation = cVar.k();
                interpolation2 = (f13928h.getInterpolation(f11 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float fK = cVar.k() + 0.79f;
                interpolation = fK - (((1.0f - f13928h.getInterpolation((f11 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = fK;
            }
            float f12 = fJ + (0.20999998f * f11);
            float f13 = (f11 + this.f13934e) * 216.0f;
            cVar.y(interpolation);
            cVar.v(interpolation2);
            cVar.w(f12);
            h(f13);
        }
    }

    public void d(boolean z11) {
        this.f13930a.x(z11);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f13931b, bounds.exactCenterX(), bounds.exactCenterY());
        this.f13930a.a(canvas, bounds);
        canvas.restore();
    }

    public void e(float f11) {
        this.f13930a.p(f11);
        invalidateSelf();
    }

    public void f(@NonNull int... iArr) {
        this.f13930a.u(iArr);
        this.f13930a.t(0);
        invalidateSelf();
    }

    public void g(float f11) {
        this.f13930a.w(f11);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f13930a.c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f13933d.isRunning();
    }

    public void j(float f11, float f12) {
        this.f13930a.y(f11);
        this.f13930a.v(f12);
        invalidateSelf();
    }

    public void k(float f11) {
        this.f13930a.z(f11);
        invalidateSelf();
    }

    public void l(int i11) {
        if (i11 == 0) {
            i(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            i(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    void n(float f11, c cVar) {
        if (f11 > 0.75f) {
            cVar.r(c((f11 - 0.75f) / 0.25f, cVar.h(), cVar.e()));
        } else {
            cVar.r(cVar.h());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        this.f13930a.n(i11);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f13930a.s(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f13933d.cancel();
        this.f13930a.A();
        if (this.f13930a.d() != this.f13930a.g()) {
            this.f13935f = true;
            this.f13933d.setDuration(666L);
            this.f13933d.start();
        } else {
            this.f13930a.t(0);
            this.f13930a.m();
            this.f13933d.setDuration(1332L);
            this.f13933d.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f13933d.cancel();
        h(BitmapDescriptorFactory.HUE_RED);
        this.f13930a.x(false);
        this.f13930a.t(0);
        this.f13930a.m();
        invalidateSelf();
    }
}
