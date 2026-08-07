package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes3.dex */
class j extends RecyclerView.p implements RecyclerView.u {
    private static final int[] D = {R.attr.state_pressed};
    private static final int[] E = new int[0];
    int A;
    private final Runnable B;
    private final RecyclerView.v C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f13458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f13459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final StateListDrawable f13460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Drawable f13461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f13462e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f13463f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final StateListDrawable f13464g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Drawable f13465h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f13466i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f13467j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f13468k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f13469l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    float f13470m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f13471n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f13472o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    float f13473p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private RecyclerView f13476s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    final ValueAnimator f13483z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f13474q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f13475r = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f13477t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f13478u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f13479v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f13480w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int[] f13481x = new int[2];

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final int[] f13482y = new int[2];

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.s(500);
        }
    }

    class b extends RecyclerView.v {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.v
        public void onScrolled(RecyclerView recyclerView, int i11, int i12) {
            j.this.D(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    private class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f13486a = false;

        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f13486a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f13486a) {
                this.f13486a = false;
                return;
            }
            if (((Float) j.this.f13483z.getAnimatedValue()).floatValue() == BitmapDescriptorFactory.HUE_RED) {
                j jVar = j.this;
                jVar.A = 0;
                jVar.A(0);
            } else {
                j jVar2 = j.this;
                jVar2.A = 2;
                jVar2.x();
            }
        }
    }

    private class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            j.this.f13460c.setAlpha(iFloatValue);
            j.this.f13461d.setAlpha(iFloatValue);
            j.this.x();
        }
    }

    j(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i11, int i12, int i13) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        this.f13483z = valueAnimatorOfFloat;
        this.A = 0;
        this.B = new a();
        this.C = new b();
        this.f13460c = stateListDrawable;
        this.f13461d = drawable;
        this.f13464g = stateListDrawable2;
        this.f13465h = drawable2;
        this.f13462e = Math.max(i11, stateListDrawable.getIntrinsicWidth());
        this.f13463f = Math.max(i11, drawable.getIntrinsicWidth());
        this.f13466i = Math.max(i11, stateListDrawable2.getIntrinsicWidth());
        this.f13467j = Math.max(i11, drawable2.getIntrinsicWidth());
        this.f13458a = i12;
        this.f13459b = i13;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new c());
        valueAnimatorOfFloat.addUpdateListener(new d());
        l(recyclerView);
    }

    private void B() {
        this.f13476s.j(this);
        this.f13476s.m(this);
        this.f13476s.n(this.C);
    }

    private void E(float f11) {
        int[] iArrR = r();
        float fMax = Math.max(iArrR[0], Math.min(iArrR[1], f11));
        if (Math.abs(this.f13469l - fMax) < 2.0f) {
            return;
        }
        int iZ = z(this.f13470m, fMax, iArrR, this.f13476s.computeVerticalScrollRange(), this.f13476s.computeVerticalScrollOffset(), this.f13475r);
        if (iZ != 0) {
            this.f13476s.scrollBy(0, iZ);
        }
        this.f13470m = fMax;
    }

    private void m() {
        this.f13476s.removeCallbacks(this.B);
    }

    private void n() {
        this.f13476s.j1(this);
        this.f13476s.l1(this);
        this.f13476s.m1(this.C);
        m();
    }

    private void o(Canvas canvas) {
        int i11 = this.f13475r;
        int i12 = this.f13466i;
        int i13 = i11 - i12;
        int i14 = this.f13472o;
        int i15 = this.f13471n;
        int i16 = i14 - (i15 / 2);
        this.f13464g.setBounds(0, 0, i15, i12);
        this.f13465h.setBounds(0, 0, this.f13474q, this.f13467j);
        canvas.translate(BitmapDescriptorFactory.HUE_RED, i13);
        this.f13465h.draw(canvas);
        canvas.translate(i16, BitmapDescriptorFactory.HUE_RED);
        this.f13464g.draw(canvas);
        canvas.translate(-i16, -i13);
    }

    private void p(Canvas canvas) {
        int i11 = this.f13474q;
        int i12 = this.f13462e;
        int i13 = i11 - i12;
        int i14 = this.f13469l;
        int i15 = this.f13468k;
        int i16 = i14 - (i15 / 2);
        this.f13460c.setBounds(0, 0, i12, i15);
        this.f13461d.setBounds(0, 0, this.f13463f, this.f13475r);
        if (!u()) {
            canvas.translate(i13, BitmapDescriptorFactory.HUE_RED);
            this.f13461d.draw(canvas);
            canvas.translate(BitmapDescriptorFactory.HUE_RED, i16);
            this.f13460c.draw(canvas);
            canvas.translate(-i13, -i16);
            return;
        }
        this.f13461d.draw(canvas);
        canvas.translate(this.f13462e, i16);
        canvas.scale(-1.0f, 1.0f);
        this.f13460c.draw(canvas);
        canvas.scale(-1.0f, 1.0f);
        canvas.translate(-this.f13462e, -i16);
    }

    private int[] q() {
        int[] iArr = this.f13482y;
        int i11 = this.f13459b;
        iArr[0] = i11;
        iArr[1] = this.f13474q - i11;
        return iArr;
    }

    private int[] r() {
        int[] iArr = this.f13481x;
        int i11 = this.f13459b;
        iArr[0] = i11;
        iArr[1] = this.f13475r - i11;
        return iArr;
    }

    private void t(float f11) {
        int[] iArrQ = q();
        float fMax = Math.max(iArrQ[0], Math.min(iArrQ[1], f11));
        if (Math.abs(this.f13472o - fMax) < 2.0f) {
            return;
        }
        int iZ = z(this.f13473p, fMax, iArrQ, this.f13476s.computeHorizontalScrollRange(), this.f13476s.computeHorizontalScrollOffset(), this.f13474q);
        if (iZ != 0) {
            this.f13476s.scrollBy(iZ, 0);
        }
        this.f13473p = fMax;
    }

    private boolean u() {
        return this.f13476s.getLayoutDirection() == 1;
    }

    private void y(int i11) {
        m();
        this.f13476s.postDelayed(this.B, i11);
    }

    private int z(float f11, float f12, int[] iArr, int i11, int i12, int i13) {
        int i14 = iArr[1] - iArr[0];
        if (i14 == 0) {
            return 0;
        }
        int i15 = i11 - i13;
        int i16 = (int) (((f12 - f11) / i14) * i15);
        int i17 = i12 + i16;
        if (i17 >= i15 || i17 < 0) {
            return 0;
        }
        return i16;
    }

    void A(int i11) {
        if (i11 == 2 && this.f13479v != 2) {
            this.f13460c.setState(D);
            m();
        }
        if (i11 == 0) {
            x();
        } else {
            C();
        }
        if (this.f13479v == 2 && i11 != 2) {
            this.f13460c.setState(E);
            y(1200);
        } else if (i11 == 1) {
            y(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        }
        this.f13479v = i11;
    }

    public void C() {
        int i11 = this.A;
        if (i11 != 0) {
            if (i11 != 3) {
                return;
            } else {
                this.f13483z.cancel();
            }
        }
        this.A = 1;
        ValueAnimator valueAnimator = this.f13483z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f13483z.setDuration(500L);
        this.f13483z.setStartDelay(0L);
        this.f13483z.start();
    }

    void D(int i11, int i12) {
        int iComputeVerticalScrollRange = this.f13476s.computeVerticalScrollRange();
        int i13 = this.f13475r;
        this.f13477t = iComputeVerticalScrollRange - i13 > 0 && i13 >= this.f13458a;
        int iComputeHorizontalScrollRange = this.f13476s.computeHorizontalScrollRange();
        int i14 = this.f13474q;
        boolean z11 = iComputeHorizontalScrollRange - i14 > 0 && i14 >= this.f13458a;
        this.f13478u = z11;
        boolean z12 = this.f13477t;
        if (!z12 && !z11) {
            if (this.f13479v != 0) {
                A(0);
                return;
            }
            return;
        }
        if (z12) {
            float f11 = i13;
            this.f13469l = (int) ((f11 * (i12 + (f11 / 2.0f))) / iComputeVerticalScrollRange);
            this.f13468k = Math.min(i13, (i13 * i13) / iComputeVerticalScrollRange);
        }
        if (this.f13478u) {
            float f12 = i14;
            this.f13472o = (int) ((f12 * (i11 + (f12 / 2.0f))) / iComputeHorizontalScrollRange);
            this.f13471n = Math.min(i14, (i14 * i14) / iComputeHorizontalScrollRange);
        }
        int i15 = this.f13479v;
        if (i15 == 0 || i15 == 1) {
            A(1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public void a(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        if (this.f13479v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zW = w(motionEvent.getX(), motionEvent.getY());
            boolean zV = v(motionEvent.getX(), motionEvent.getY());
            if (zW || zV) {
                if (zV) {
                    this.f13480w = 1;
                    this.f13473p = (int) motionEvent.getX();
                } else if (zW) {
                    this.f13480w = 2;
                    this.f13470m = (int) motionEvent.getY();
                }
                A(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f13479v == 2) {
            this.f13470m = BitmapDescriptorFactory.HUE_RED;
            this.f13473p = BitmapDescriptorFactory.HUE_RED;
            A(1);
            this.f13480w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f13479v == 2) {
            C();
            if (this.f13480w == 1) {
                t(motionEvent.getX());
            }
            if (this.f13480w == 2) {
                E(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public boolean c(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        int i11 = this.f13479v;
        if (i11 != 1) {
            return i11 == 2;
        }
        boolean zW = w(motionEvent.getX(), motionEvent.getY());
        boolean zV = v(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0 || (!zW && !zV)) {
            return false;
        }
        if (zV) {
            this.f13480w = 1;
            this.f13473p = (int) motionEvent.getX();
        } else if (zW) {
            this.f13480w = 2;
            this.f13470m = (int) motionEvent.getY();
        }
        A(2);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public void e(boolean z11) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void k(Canvas canvas, RecyclerView recyclerView, RecyclerView.c0 c0Var) {
        if (this.f13474q != this.f13476s.getWidth() || this.f13475r != this.f13476s.getHeight()) {
            this.f13474q = this.f13476s.getWidth();
            this.f13475r = this.f13476s.getHeight();
            A(0);
        } else if (this.A != 0) {
            if (this.f13477t) {
                p(canvas);
            }
            if (this.f13478u) {
                o(canvas);
            }
        }
    }

    public void l(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f13476s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            n();
        }
        this.f13476s = recyclerView;
        if (recyclerView != null) {
            B();
        }
    }

    void s(int i11) {
        int i12 = this.A;
        if (i12 == 1) {
            this.f13483z.cancel();
        } else if (i12 != 2) {
            return;
        }
        this.A = 3;
        ValueAnimator valueAnimator = this.f13483z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), BitmapDescriptorFactory.HUE_RED);
        this.f13483z.setDuration(i11);
        this.f13483z.start();
    }

    boolean v(float f11, float f12) {
        if (f12 < this.f13475r - this.f13466i) {
            return false;
        }
        int i11 = this.f13472o;
        int i12 = this.f13471n;
        return f11 >= ((float) (i11 - (i12 / 2))) && f11 <= ((float) (i11 + (i12 / 2)));
    }

    boolean w(float f11, float f12) {
        if (u()) {
            if (f11 > this.f13462e) {
                return false;
            }
        } else if (f11 < this.f13474q - this.f13462e) {
            return false;
        }
        int i11 = this.f13469l;
        int i12 = this.f13468k;
        return f12 >= ((float) (i11 - (i12 / 2))) && f12 <= ((float) (i11 + (i12 / 2)));
    }

    void x() {
        this.f13476s.invalidate();
    }
}
