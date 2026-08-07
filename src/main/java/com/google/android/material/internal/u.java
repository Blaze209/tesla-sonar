package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<b> f42354a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f42355b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    ValueAnimator f42356c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Animator.AnimatorListener f42357d = new a();

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            u uVar = u.this;
            if (uVar.f42356c == animator) {
                uVar.f42356c = null;
            }
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int[] f42359a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ValueAnimator f42360b;

        b(int[] iArr, ValueAnimator valueAnimator) {
            this.f42359a = iArr;
            this.f42360b = valueAnimator;
        }
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f42357d);
        this.f42354a.add(bVar);
    }
}
