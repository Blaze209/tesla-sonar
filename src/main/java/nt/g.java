package nt;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.d0;

/* JADX INFO: loaded from: classes5.dex */
public class g extends nt.a<View> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f95459g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f95460h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f95461i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Rect f95462j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Rect f95463k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Integer f95464l;

    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f95465a;

        a(View view) {
            this.f95465a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            View view = this.f95465a;
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    public g(@NonNull View view) {
        super(view);
        Resources resources = view.getResources();
        this.f95459g = resources.getDimension(zs.e.f128654s);
        this.f95460h = resources.getDimension(zs.e.f128652r);
    }

    @NonNull
    private ValueAnimator h(final ClippableRoundedCornerLayout clippableRoundedCornerLayout) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(clippableRoundedCornerLayout.getCornerRadius(), k());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: nt.f
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                clippableRoundedCornerLayout.e(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        return valueAnimatorOfFloat;
    }

    @NonNull
    private AnimatorSet i(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f95443b, (Property<V, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f95443b, (Property<V, Float>) View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.f95443b, (Property<V, Float>) View.TRANSLATION_X, BitmapDescriptorFactory.HUE_RED), ObjectAnimator.ofFloat(this.f95443b, (Property<V, Float>) View.TRANSLATION_Y, BitmapDescriptorFactory.HUE_RED));
        animatorSet.addListener(new a(view));
        return animatorSet;
    }

    private int n() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT < 31 || (rootWindowInsets = this.f95443b.getRootWindowInsets()) == null) {
            return 0;
        }
        return Math.max(Math.max(o(rootWindowInsets, 0), o(rootWindowInsets, 1)), Math.max(o(rootWindowInsets, 3), o(rootWindowInsets, 2)));
    }

    private int o(WindowInsets windowInsets, int i11) {
        RoundedCorner roundedCorner = windowInsets.getRoundedCorner(i11);
        if (roundedCorner != null) {
            return roundedCorner.getRadius();
        }
        return 0;
    }

    private boolean p() {
        int[] iArr = new int[2];
        this.f95443b.getLocationOnScreen(iArr);
        return iArr[1] == 0;
    }

    private void q() {
        this.f95461i = BitmapDescriptorFactory.HUE_RED;
        this.f95462j = null;
        this.f95463k = null;
    }

    public void g(View view) {
        if (super.b() == null) {
            return;
        }
        AnimatorSet animatorSetI = i(view);
        V v11 = this.f95443b;
        if (v11 instanceof ClippableRoundedCornerLayout) {
            animatorSetI.playTogether(h((ClippableRoundedCornerLayout) v11));
        }
        animatorSetI.setDuration(this.f95446e);
        animatorSetI.start();
        q();
    }

    public void j(long j11, View view) {
        AnimatorSet animatorSetI = i(view);
        animatorSetI.setDuration(j11);
        animatorSetI.start();
        q();
    }

    public int k() {
        if (this.f95464l == null) {
            this.f95464l = Integer.valueOf(p() ? n() : 0);
        }
        return this.f95464l.intValue();
    }

    public Rect l() {
        return this.f95463k;
    }

    public Rect m() {
        return this.f95462j;
    }

    public void r(float f11, View view) {
        this.f95462j = d0.d(this.f95443b);
        if (view != null) {
            this.f95463k = d0.c(this.f95443b, view);
        }
        this.f95461i = f11;
    }

    public void s(@NonNull androidx.p002activity.b bVar, View view) {
        super.d(bVar);
        r(bVar.getTouchY(), view);
    }

    public void t(float f11, boolean z11, float f12, float f13) {
        float fA = a(f11);
        float width = this.f95443b.getWidth();
        float height = this.f95443b.getHeight();
        if (width <= BitmapDescriptorFactory.HUE_RED || height <= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        float fA2 = at.b.a(1.0f, 0.9f, fA);
        float fA3 = at.b.a(BitmapDescriptorFactory.HUE_RED, Math.max(BitmapDescriptorFactory.HUE_RED, ((width - (0.9f * width)) / 2.0f) - this.f95459g), fA) * (z11 ? 1 : -1);
        float fMin = Math.min(Math.max(BitmapDescriptorFactory.HUE_RED, ((height - (fA2 * height)) / 2.0f) - this.f95459g), this.f95460h);
        float f14 = f12 - this.f95461i;
        float fA4 = at.b.a(BitmapDescriptorFactory.HUE_RED, fMin, Math.abs(f14) / height) * Math.signum(f14);
        this.f95443b.setScaleX(fA2);
        this.f95443b.setScaleY(fA2);
        this.f95443b.setTranslationX(fA3);
        this.f95443b.setTranslationY(fA4);
        V v11 = this.f95443b;
        if (v11 instanceof ClippableRoundedCornerLayout) {
            ((ClippableRoundedCornerLayout) v11).e(at.b.a(k(), f13, fA));
        }
    }

    public void u(@NonNull androidx.p002activity.b bVar, View view, float f11) {
        if (super.e(bVar) == null) {
            return;
        }
        if (view != null && view.getVisibility() != 4) {
            view.setVisibility(4);
        }
        t(bVar.getProgress(), bVar.getSwipeEdge() == 0, bVar.getTouchY(), f11);
    }
}
