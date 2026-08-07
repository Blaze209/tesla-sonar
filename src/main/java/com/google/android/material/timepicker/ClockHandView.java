package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.ViewCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.internal.d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
class ClockHandView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f42994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TimeInterpolator f42995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ValueAnimator f42996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f42997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f42998e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f42999f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f43000g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f43001h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f43002i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List<c> f43003j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f43004k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final float f43005l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Paint f43006m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final RectF f43007n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f43008o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f43009p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f43010q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private b f43011r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private double f43012s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f43013t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f43014u;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    public interface b {
        void a(float f11, boolean z11);
    }

    public interface c {
        void d(float f11, boolean z11);
    }

    public ClockHandView(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void a(ClockHandView clockHandView, ValueAnimator valueAnimator) {
        clockHandView.getClass();
        clockHandView.n(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    private void c(float f11, float f12) {
        this.f43014u = mt.a.a((float) (getWidth() / 2), (float) (getHeight() / 2), f11, f12) > ((float) i(2)) + d0.h(getContext(), 12) ? 1 : 2;
    }

    private void d(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int i11 = i(this.f43014u);
        float f11 = width;
        float f12 = i11;
        float fCos = (((float) Math.cos(this.f43012s)) * f12) + f11;
        float f13 = height;
        float fSin = (f12 * ((float) Math.sin(this.f43012s))) + f13;
        this.f43006m.setStrokeWidth(BitmapDescriptorFactory.HUE_RED);
        canvas.drawCircle(fCos, fSin, this.f43004k, this.f43006m);
        double dSin = Math.sin(this.f43012s);
        double dCos = Math.cos(this.f43012s);
        double d11 = i11 - this.f43004k;
        this.f43006m.setStrokeWidth(this.f43008o);
        canvas.drawLine(f11, f13, width + ((int) (dCos * d11)), height + ((int) (d11 * dSin)), this.f43006m);
        canvas.drawCircle(f11, f13, this.f43005l, this.f43006m);
    }

    private int g(float f11, float f12) {
        int degrees = (int) Math.toDegrees(Math.atan2(f12 - (getHeight() / 2), f11 - (getWidth() / 2)));
        int i11 = degrees + 90;
        return i11 < 0 ? degrees + 450 : i11;
    }

    private int i(int i11) {
        return i11 == 2 ? Math.round(this.f43013t * 0.66f) : this.f43013t;
    }

    private Pair<Float, Float> k(float f11) {
        float fH = h();
        if (Math.abs(fH - f11) > 180.0f) {
            if (fH > 180.0f && f11 < 180.0f) {
                f11 += 360.0f;
            }
            if (fH < 180.0f && f11 > 180.0f) {
                fH += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(fH), Float.valueOf(f11));
    }

    private boolean l(float f11, float f12, boolean z11, boolean z12, boolean z13) {
        float fG = g(f11, f12);
        boolean z14 = false;
        boolean z15 = h() != fG;
        if (z12 && z15) {
            return true;
        }
        if (!z15 && !z11) {
            return false;
        }
        if (z13 && this.f42997d) {
            z14 = true;
        }
        setHandRotation(fG, z14);
        return true;
    }

    private void n(float f11, boolean z11) {
        float f12 = f11 % 360.0f;
        this.f43009p = f12;
        this.f43012s = Math.toRadians(f12 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fI = i(this.f43014u);
        float fCos = width + (((float) Math.cos(this.f43012s)) * fI);
        float fSin = height + (fI * ((float) Math.sin(this.f43012s)));
        RectF rectF = this.f43007n;
        int i11 = this.f43004k;
        rectF.set(fCos - i11, fSin - i11, fCos + i11, fSin + i11);
        Iterator<c> it = this.f43003j.iterator();
        while (it.hasNext()) {
            it.next().d(f12, z11);
        }
        invalidate();
    }

    public void b(c cVar) {
        this.f43003j.add(cVar);
    }

    int e() {
        return this.f43014u;
    }

    public RectF f() {
        return this.f43007n;
    }

    public float h() {
        return this.f43009p;
    }

    public int j() {
        return this.f43004k;
    }

    void m(int i11) {
        this.f43014u = i11;
        invalidate();
    }

    void o(boolean z11) {
        if (this.f43002i && !z11) {
            this.f43014u = 1;
        }
        this.f43002i = z11;
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        if (this.f42996c.isRunning()) {
            return;
        }
        setHandRotation(h());
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z11;
        boolean z12;
        boolean z13;
        b bVar;
        int actionMasked = motionEvent.getActionMasked();
        float x11 = motionEvent.getX();
        float y11 = motionEvent.getY();
        if (actionMasked == 0) {
            this.f42998e = x11;
            this.f42999f = y11;
            this.f43000g = true;
            this.f43010q = false;
            z11 = true;
            z12 = false;
            z13 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i11 = (int) (x11 - this.f42998e);
            int i12 = (int) (y11 - this.f42999f);
            this.f43000g = (i11 * i11) + (i12 * i12) > this.f43001h;
            z12 = this.f43010q;
            boolean z14 = actionMasked == 1;
            if (this.f43002i) {
                c(x11, y11);
            }
            z13 = z14;
            z11 = false;
        } else {
            z12 = false;
            z11 = false;
            z13 = false;
        }
        boolean zL = this.f43010q | l(x11, y11, z12, z11, z13);
        this.f43010q = zL;
        if (zL && z13 && (bVar = this.f43011r) != null) {
            bVar.a(g(x11, y11), this.f43000g);
        }
        return true;
    }

    public void setAnimateOnTouchUp(boolean z11) {
        this.f42997d = z11;
    }

    public void setCircleRadius(int i11) {
        this.f43013t = i11;
        invalidate();
    }

    public void setHandRotation(float f11) {
        setHandRotation(f11, false);
    }

    public void setOnActionUpListener(b bVar) {
        this.f43011r = bVar;
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, zs.c.P);
    }

    public void setHandRotation(float f11, boolean z11) {
        ValueAnimator valueAnimator = this.f42996c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z11) {
            n(f11, false);
            return;
        }
        Pair<Float, Float> pairK = k(f11);
        this.f42996c.setFloatValues(((Float) pairK.first).floatValue(), ((Float) pairK.second).floatValue());
        this.f42996c.setDuration(this.f42994a);
        this.f42996c.setInterpolator(this.f42995b);
        this.f42996c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ClockHandView.a(this.f43022a, valueAnimator2);
            }
        });
        this.f42996c.addListener(new a());
        this.f42996c.start();
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f42996c = new ValueAnimator();
        this.f43003j = new ArrayList();
        Paint paint = new Paint();
        this.f43006m = paint;
        this.f43007n = new RectF();
        this.f43014u = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zs.m.f129061u2, i11, zs.l.L);
        this.f42994a = nt.i.f(context, zs.c.X, 200);
        this.f42995b = nt.i.g(context, zs.c.f128570h0, at.b.f14973b);
        this.f43013t = typedArrayObtainStyledAttributes.getDimensionPixelSize(zs.m.f129085w2, 0);
        this.f43004k = typedArrayObtainStyledAttributes.getDimensionPixelSize(zs.m.f129097x2, 0);
        Resources resources = getResources();
        this.f43008o = resources.getDimensionPixelSize(zs.e.M);
        this.f43005l = resources.getDimensionPixelSize(zs.e.K);
        int color = typedArrayObtainStyledAttributes.getColor(zs.m.f129073v2, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        setHandRotation(BitmapDescriptorFactory.HUE_RED);
        this.f43001h = ViewConfiguration.get(context).getScaledTouchSlop();
        ViewCompat.z0(this, 2);
        typedArrayObtainStyledAttributes.recycle();
    }
}
