package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes3.dex */
public class e extends p0 {

    private static class a extends AnimatorListenerAdapter implements r.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f14039a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f14040b = false;

        a(View view) {
            this.f14039a = view;
        }

        @Override // androidx.transition.r.h
        public void a(@NonNull r rVar) {
            this.f14039a.setTag(l.f14091e, null);
        }

        @Override // androidx.transition.r.h
        public void e(@NonNull r rVar) {
        }

        @Override // androidx.transition.r.h
        public void f(@NonNull r rVar) {
            this.f14039a.setTag(l.f14091e, Float.valueOf(this.f14039a.getVisibility() == 0 ? j0.b(this.f14039a) : BitmapDescriptorFactory.HUE_RED));
        }

        @Override // androidx.transition.r.h
        public void i(@NonNull r rVar) {
        }

        @Override // androidx.transition.r.h
        public void k(@NonNull r rVar) {
        }

        @Override // androidx.transition.r.h
        public void l(@NonNull r rVar, boolean z11) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            j0.e(this.f14039a, 1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f14039a.hasOverlappingRendering() && this.f14039a.getLayerType() == 0) {
                this.f14040b = true;
                this.f14039a.setLayerType(2, null);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator, boolean z11) {
            if (this.f14040b) {
                this.f14039a.setLayerType(0, null);
            }
            if (z11) {
                return;
            }
            j0.e(this.f14039a, 1.0f);
            j0.a(this.f14039a);
        }
    }

    public e(int i11) {
        B0(i11);
    }

    private Animator C0(View view, float f11, float f12) {
        if (f11 == f12) {
            return null;
        }
        j0.e(view, f11);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, j0.f14082b, f12);
        a aVar = new a(view);
        objectAnimatorOfFloat.addListener(aVar);
        C().c(aVar);
        return objectAnimatorOfFloat;
    }

    private static float D0(e0 e0Var, float f11) {
        Float f12;
        return (e0Var == null || (f12 = (Float) e0Var.f14041a.get("android:fade:transitionAlpha")) == null) ? f11 : f12.floatValue();
    }

    @Override // androidx.transition.r
    public boolean N() {
        return true;
    }

    @Override // androidx.transition.p0, androidx.transition.r
    public void l(@NonNull e0 e0Var) {
        super.l(e0Var);
        Float fValueOf = (Float) e0Var.f14042b.getTag(l.f14091e);
        if (fValueOf == null) {
            fValueOf = e0Var.f14042b.getVisibility() == 0 ? Float.valueOf(j0.b(e0Var.f14042b)) : Float.valueOf(BitmapDescriptorFactory.HUE_RED);
        }
        e0Var.f14041a.put("android:fade:transitionAlpha", fValueOf);
    }

    @Override // androidx.transition.p0
    public Animator x0(@NonNull ViewGroup viewGroup, @NonNull View view, e0 e0Var, e0 e0Var2) {
        j0.c(view);
        return C0(view, D0(e0Var, BitmapDescriptorFactory.HUE_RED), 1.0f);
    }

    @Override // androidx.transition.p0
    public Animator z0(@NonNull ViewGroup viewGroup, @NonNull View view, e0 e0Var, e0 e0Var2) {
        j0.c(view);
        Animator animatorC0 = C0(view, D0(e0Var, 1.0f), BitmapDescriptorFactory.HUE_RED);
        if (animatorC0 == null) {
            j0.e(view, D0(e0Var2, 1.0f));
        }
        return animatorC0;
    }

    public e() {
    }

    public e(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f14130f);
        B0(j5.k.k(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, v0()));
        typedArrayObtainStyledAttributes.recycle();
    }
}
