package com.github.barteksc.pdfviewer;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.animation.DecelerateInterpolator;
import android.widget.OverScroller;

/* JADX INFO: loaded from: classes4.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f39206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ValueAnimator f39207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private OverScroller f39208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f39209d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f39210e = false;

    /* JADX INFO: renamed from: com.github.barteksc.pdfviewer.a$a, reason: collision with other inner class name */
    class C0645a extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        C0645a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            a.this.f39206a.V();
            a.this.f39210e = false;
            a.this.e();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.f39206a.V();
            a.this.f39210e = false;
            a.this.e();
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            a.this.f39206a.X(((Float) valueAnimator.getAnimatedValue()).floatValue(), a.this.f39206a.getCurrentYOffset());
            a.this.f39206a.U();
        }
    }

    class b extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            a.this.f39206a.V();
            a.this.f39210e = false;
            a.this.e();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.f39206a.V();
            a.this.f39210e = false;
            a.this.e();
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            a.this.f39206a.X(a.this.f39206a.getCurrentXOffset(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
            a.this.f39206a.U();
        }
    }

    class c implements ValueAnimator.AnimatorUpdateListener, Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f39213a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f39214b;

        public c(float f11, float f12) {
            this.f39213a = f11;
            this.f39214b = f12;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            a.this.f39206a.V();
            a.this.e();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.f39206a.V();
            a.this.f39206a.c0();
            a.this.e();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            a.this.f39206a.l0(((Float) valueAnimator.getAnimatedValue()).floatValue(), new PointF(this.f39213a, this.f39214b));
        }
    }

    public a(e eVar) {
        this.f39206a = eVar;
        this.f39208c = new OverScroller(eVar.getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        this.f39206a.getScrollHandle();
    }

    void d() {
        if (this.f39208c.computeScrollOffset()) {
            this.f39206a.X(this.f39208c.getCurrX(), this.f39208c.getCurrY());
            this.f39206a.U();
        } else if (this.f39209d) {
            this.f39209d = false;
            this.f39206a.V();
            e();
            this.f39206a.c0();
        }
    }

    public boolean f() {
        return this.f39209d || this.f39210e;
    }

    public void g(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        l();
        this.f39209d = true;
        this.f39208c.fling(i11, i12, i13, i14, i15, i16, i17, i18);
    }

    public void h(float f11) {
        if (this.f39206a.M()) {
            j(this.f39206a.getCurrentYOffset(), f11);
        } else {
            i(this.f39206a.getCurrentXOffset(), f11);
        }
        this.f39210e = true;
    }

    public void i(float f11, float f12) {
        l();
        this.f39207b = ValueAnimator.ofFloat(f11, f12);
        C0645a c0645a = new C0645a();
        this.f39207b.setInterpolator(new DecelerateInterpolator());
        this.f39207b.addUpdateListener(c0645a);
        this.f39207b.addListener(c0645a);
        this.f39207b.setDuration(400L);
        this.f39207b.start();
    }

    public void j(float f11, float f12) {
        l();
        this.f39207b = ValueAnimator.ofFloat(f11, f12);
        b bVar = new b();
        this.f39207b.setInterpolator(new DecelerateInterpolator());
        this.f39207b.addUpdateListener(bVar);
        this.f39207b.addListener(bVar);
        this.f39207b.setDuration(400L);
        this.f39207b.start();
    }

    public void k(float f11, float f12, float f13, float f14) {
        l();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f13, f14);
        this.f39207b = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        c cVar = new c(f11, f12);
        this.f39207b.addUpdateListener(cVar);
        this.f39207b.addListener(cVar);
        this.f39207b.setDuration(400L);
        this.f39207b.start();
    }

    public void l() {
        ValueAnimator valueAnimator = this.f39207b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f39207b = null;
        }
        m();
    }

    public void m() {
        this.f39209d = false;
        this.f39208c.forceFinished(true);
    }
}
