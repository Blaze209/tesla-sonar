package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public class q implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f42350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View[] f42351b;

    interface a {
        void a(@NonNull ValueAnimator valueAnimator, @NonNull View view);
    }

    @SuppressLint({"LambdaLast"})
    public q(@NonNull a aVar, @NonNull View... viewArr) {
        this.f42350a = aVar;
        this.f42351b = viewArr;
    }

    @NonNull
    public static q e(@NonNull View... viewArr) {
        return new q(new a() { // from class: com.google.android.material.internal.p
            @Override // com.google.android.material.internal.q.a
            public final void a(ValueAnimator valueAnimator, View view) {
                q.g(valueAnimator, view);
            }
        }, viewArr);
    }

    @NonNull
    public static q f(@NonNull View... viewArr) {
        return new q(new a() { // from class: com.google.android.material.internal.o
            @Override // com.google.android.material.internal.q.a
            public final void a(ValueAnimator valueAnimator, View view) {
                q.h(valueAnimator, view);
            }
        }, viewArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(@NonNull ValueAnimator valueAnimator, @NonNull View view) {
        view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(@NonNull ValueAnimator valueAnimator, @NonNull View view) {
        Float f11 = (Float) valueAnimator.getAnimatedValue();
        view.setScaleX(f11.floatValue());
        view.setScaleY(f11.floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void i(@NonNull ValueAnimator valueAnimator, @NonNull View view) {
        view.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void j(@NonNull ValueAnimator valueAnimator, @NonNull View view) {
        view.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    @NonNull
    public static q k(@NonNull View... viewArr) {
        return new q(new a() { // from class: com.google.android.material.internal.m
            @Override // com.google.android.material.internal.q.a
            public final void a(ValueAnimator valueAnimator, View view) {
                q.i(valueAnimator, view);
            }
        }, viewArr);
    }

    @NonNull
    public static q l(@NonNull View... viewArr) {
        return new q(new a() { // from class: com.google.android.material.internal.n
            @Override // com.google.android.material.internal.q.a
            public final void a(ValueAnimator valueAnimator, View view) {
                q.j(valueAnimator, view);
            }
        }, viewArr);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        for (View view : this.f42351b) {
            this.f42350a.a(valueAnimator, view);
        }
    }
}
