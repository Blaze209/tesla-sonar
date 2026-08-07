package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
class g0 {
    static Animator a(@NonNull View view, @NonNull e0 e0Var, int i11, int i12, float f11, float f12, float f13, float f14, TimeInterpolator timeInterpolator, @NonNull r rVar) {
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) e0Var.f14042b.getTag(l.f14092f);
        if (iArr != null) {
            f11 = (iArr[0] - i11) + translationX;
            f12 = (iArr[1] - i12) + translationY;
        }
        view.setTranslationX(f11);
        view.setTranslationY(f12);
        if (f11 == f13 && f12 == f14) {
            return null;
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f11, f13), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f12, f14));
        a aVar = new a(view, e0Var.f14042b, translationX, translationY);
        rVar.c(aVar);
        objectAnimatorOfPropertyValuesHolder.addListener(aVar);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(timeInterpolator);
        return objectAnimatorOfPropertyValuesHolder;
    }

    private static class a extends AnimatorListenerAdapter implements r.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f14067a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final View f14068b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int[] f14069c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f14070d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f14071e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f14072f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final float f14073g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f14074h;

        a(View view, View view2, float f11, float f12) {
            this.f14068b = view;
            this.f14067a = view2;
            this.f14072f = f11;
            this.f14073g = f12;
            int[] iArr = (int[]) view2.getTag(l.f14092f);
            this.f14069c = iArr;
            if (iArr != null) {
                view2.setTag(l.f14092f, null);
            }
        }

        private void b() {
            if (this.f14069c == null) {
                this.f14069c = new int[2];
            }
            this.f14068b.getLocationOnScreen(this.f14069c);
            this.f14067a.setTag(l.f14092f, this.f14069c);
        }

        @Override // androidx.transition.r.h
        public void a(@NonNull r rVar) {
            this.f14068b.setTranslationX(this.f14070d);
            this.f14068b.setTranslationY(this.f14071e);
        }

        @Override // androidx.transition.r.h
        public void e(@NonNull r rVar) {
        }

        @Override // androidx.transition.r.h
        public void f(@NonNull r rVar) {
            b();
            this.f14070d = this.f14068b.getTranslationX();
            this.f14071e = this.f14068b.getTranslationY();
            this.f14068b.setTranslationX(this.f14072f);
            this.f14068b.setTranslationY(this.f14073g);
        }

        @Override // androidx.transition.r.h
        public void h(@NonNull r rVar, boolean z11) {
            if (this.f14074h) {
                return;
            }
            this.f14067a.setTag(l.f14092f, null);
        }

        @Override // androidx.transition.r.h
        public void i(@NonNull r rVar) {
            h(rVar, false);
        }

        @Override // androidx.transition.r.h
        public void k(@NonNull r rVar) {
            this.f14074h = true;
            this.f14068b.setTranslationX(this.f14072f);
            this.f14068b.setTranslationY(this.f14073g);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f14074h = true;
            this.f14068b.setTranslationX(this.f14072f);
            this.f14068b.setTranslationY(this.f14073g);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator, boolean z11) {
            if (z11) {
                return;
            }
            this.f14068b.setTranslationX(this.f14072f);
            this.f14068b.setTranslationY(this.f14073g);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator) {
            onAnimationEnd(animator, false);
        }
    }
}
