package nt;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.core.view.k;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes5.dex */
public class h extends nt.a<View> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f95467g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f95468h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f95469i;

    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f95470a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f95471b;

        a(boolean z11, int i11) {
            this.f95470a = z11;
            this.f95471b = i11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            h.this.f95443b.setTranslationX(BitmapDescriptorFactory.HUE_RED);
            h.this.k(BitmapDescriptorFactory.HUE_RED, this.f95470a, this.f95471b);
        }
    }

    public h(@NonNull View view) {
        super(view);
        Resources resources = view.getResources();
        this.f95467g = resources.getDimension(zs.e.f128658u);
        this.f95468h = resources.getDimension(zs.e.f128656t);
        this.f95469i = resources.getDimension(zs.e.f128660v);
    }

    private boolean g(int i11, int i12) {
        return (k.b(i11, ViewCompat.A(this.f95443b)) & i12) == i12;
    }

    private int i(boolean z11) {
        ViewGroup.LayoutParams layoutParams = this.f95443b.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return z11 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
    }

    public void f() {
        if (super.b() == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f95443b, (Property<V, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f95443b, (Property<V, Float>) View.SCALE_Y, 1.0f));
        V v11 = this.f95443b;
        if (v11 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v11;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i11), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(this.f95446e);
        animatorSet.start();
    }

    public void h(@NonNull androidx.p002activity.b bVar, int i11, Animator.AnimatorListener animatorListener, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        boolean z11 = bVar.getSwipeEdge() == 0;
        boolean zG = g(i11, 3);
        float width = (this.f95443b.getWidth() * this.f95443b.getScaleX()) + i(zG);
        V v11 = this.f95443b;
        Property property = View.TRANSLATION_X;
        if (zG) {
            width = -width;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(v11, (Property<V, Float>) property, width);
        if (animatorUpdateListener != null) {
            objectAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        }
        objectAnimatorOfFloat.setInterpolator(new i7.b());
        objectAnimatorOfFloat.setDuration(at.b.c(this.f95444c, this.f95445d, bVar.getProgress()));
        objectAnimatorOfFloat.addListener(new a(z11, i11));
        if (animatorListener != null) {
            objectAnimatorOfFloat.addListener(animatorListener);
        }
        objectAnimatorOfFloat.start();
    }

    public void j(@NonNull androidx.p002activity.b bVar) {
        super.d(bVar);
    }

    public void k(float f11, boolean z11, int i11) {
        float fA = a(f11);
        boolean zG = g(i11, 3);
        boolean z12 = z11 == zG;
        int width = this.f95443b.getWidth();
        int height = this.f95443b.getHeight();
        float f12 = width;
        if (f12 > BitmapDescriptorFactory.HUE_RED) {
            float f13 = height;
            if (f13 <= BitmapDescriptorFactory.HUE_RED) {
                return;
            }
            float f14 = this.f95467g / f12;
            float f15 = this.f95468h / f12;
            float f16 = this.f95469i / f13;
            V v11 = this.f95443b;
            if (zG) {
                f12 = 0.0f;
            }
            v11.setPivotX(f12);
            if (!z12) {
                f15 = -f14;
            }
            float fA2 = at.b.a(BitmapDescriptorFactory.HUE_RED, f15, fA);
            float f17 = fA2 + 1.0f;
            this.f95443b.setScaleX(f17);
            float fA3 = 1.0f - at.b.a(BitmapDescriptorFactory.HUE_RED, f16, fA);
            this.f95443b.setScaleY(fA3);
            V v12 = this.f95443b;
            if (v12 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) v12;
                for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                    View childAt = viewGroup.getChildAt(i12);
                    childAt.setPivotX(zG ? (width - childAt.getRight()) + childAt.getWidth() : -childAt.getLeft());
                    childAt.setPivotY(-childAt.getTop());
                    float f18 = z12 ? 1.0f - fA2 : 1.0f;
                    float f19 = fA3 != BitmapDescriptorFactory.HUE_RED ? (f17 / fA3) * f18 : 1.0f;
                    childAt.setScaleX(f18);
                    childAt.setScaleY(f19);
                }
            }
        }
    }

    public void l(@NonNull androidx.p002activity.b bVar, int i11) {
        if (super.e(bVar) == null) {
            return;
        }
        k(bVar.getProgress(), bVar.getSwipeEdge() == 0, i11);
    }
}
