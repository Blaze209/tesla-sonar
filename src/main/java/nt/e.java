package nt;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes5.dex */
public class e extends nt.a<View> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f95455g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f95456h;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            e.this.f95443b.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            e.this.k(BitmapDescriptorFactory.HUE_RED);
        }
    }

    public e(@NonNull View view) {
        super(view);
        Resources resources = view.getResources();
        this.f95455g = resources.getDimension(zs.e.f128648p);
        this.f95456h = resources.getDimension(zs.e.f128650q);
    }

    private Animator g() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f95443b, (Property<V, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f95443b, (Property<V, Float>) View.SCALE_Y, 1.0f));
        V v11 = this.f95443b;
        if (v11 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v11;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i11), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new i7.b());
        return animatorSet;
    }

    public void f() {
        if (super.b() == null) {
            return;
        }
        Animator animatorG = g();
        animatorG.setDuration(this.f95446e);
        animatorG.start();
    }

    public void h(@NonNull androidx.p002activity.b bVar, Animator.AnimatorListener animatorListener) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f95443b, (Property<V, Float>) View.TRANSLATION_Y, this.f95443b.getHeight() * this.f95443b.getScaleY());
        objectAnimatorOfFloat.setInterpolator(new i7.b());
        objectAnimatorOfFloat.setDuration(at.b.c(this.f95444c, this.f95445d, bVar.getProgress()));
        objectAnimatorOfFloat.addListener(new a());
        if (animatorListener != null) {
            objectAnimatorOfFloat.addListener(animatorListener);
        }
        objectAnimatorOfFloat.start();
    }

    public void i(@NonNull androidx.p002activity.b bVar, Animator.AnimatorListener animatorListener) {
        Animator animatorG = g();
        animatorG.setDuration(at.b.c(this.f95444c, this.f95445d, bVar.getProgress()));
        if (animatorListener != null) {
            animatorG.addListener(animatorListener);
        }
        animatorG.start();
    }

    public void j(@NonNull androidx.p002activity.b bVar) {
        super.d(bVar);
    }

    public void k(float f11) {
        float fA = a(f11);
        float width = this.f95443b.getWidth();
        float height = this.f95443b.getHeight();
        if (width <= BitmapDescriptorFactory.HUE_RED || height <= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        float f12 = this.f95455g / width;
        float f13 = this.f95456h / height;
        float fA2 = 1.0f - at.b.a(BitmapDescriptorFactory.HUE_RED, f12, fA);
        float fA3 = 1.0f - at.b.a(BitmapDescriptorFactory.HUE_RED, f13, fA);
        this.f95443b.setScaleX(fA2);
        this.f95443b.setPivotY(height);
        this.f95443b.setScaleY(fA3);
        V v11 = this.f95443b;
        if (v11 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v11;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                View childAt = viewGroup.getChildAt(i11);
                childAt.setPivotY(-childAt.getTop());
                childAt.setScaleY(fA3 != BitmapDescriptorFactory.HUE_RED ? fA2 / fA3 : 1.0f);
            }
        }
    }

    public void l(@NonNull androidx.p002activity.b bVar) {
        if (super.e(bVar) == null) {
            return;
        }
        k(bVar.getProgress());
    }
}
