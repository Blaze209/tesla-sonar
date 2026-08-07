package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public class g implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f42337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f42338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float[] f42339c = new float[2];

    public g(View view, View view2) {
        this.f42337a = view;
        this.f42338b = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        h.a(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f42339c);
        View view = this.f42337a;
        if (view != null) {
            view.setAlpha(this.f42339c[0]);
        }
        View view2 = this.f42338b;
        if (view2 != null) {
            view2.setAlpha(this.f42339c[1]);
        }
    }
}
