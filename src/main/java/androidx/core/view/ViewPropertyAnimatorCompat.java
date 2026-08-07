package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class ViewPropertyAnimatorCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference<View> f7655a;

    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ w0 f7656a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f7657b;

        a(w0 w0Var, View view) {
            this.f7656a = w0Var;
            this.f7657b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f7656a.a(this.f7657b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f7656a.b(this.f7657b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f7656a.c(this.f7657b);
        }
    }

    ViewPropertyAnimatorCompat(View view) {
        this.f7655a = new WeakReference<>(view);
    }

    private void h(View view, w0 w0Var) {
        if (w0Var != null) {
            view.animate().setListener(new a(w0Var, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public ViewPropertyAnimatorCompat b(float f11) {
        View view = this.f7655a.get();
        if (view != null) {
            view.animate().alpha(f11);
        }
        return this;
    }

    public void c() {
        View view = this.f7655a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long d() {
        View view = this.f7655a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public ViewPropertyAnimatorCompat e(long j11) {
        View view = this.f7655a.get();
        if (view != null) {
            view.animate().setDuration(j11);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat f(Interpolator interpolator) {
        View view = this.f7655a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat g(w0 w0Var) {
        View view = this.f7655a.get();
        if (view != null) {
            h(view, w0Var);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat i(long j11) {
        View view = this.f7655a.get();
        if (view != null) {
            view.animate().setStartDelay(j11);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat j(final y0 y0Var) {
        final View view = this.f7655a.get();
        if (view != null) {
            view.animate().setUpdateListener(y0Var != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.v0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    y0Var.a(view);
                }
            } : null);
        }
        return this;
    }

    public void k() {
        View view = this.f7655a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public ViewPropertyAnimatorCompat l(float f11) {
        View view = this.f7655a.get();
        if (view != null) {
            view.animate().translationY(f11);
        }
        return this;
    }
}
