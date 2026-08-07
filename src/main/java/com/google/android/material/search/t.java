package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes5.dex */
class t extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ u f42658a;

    t(u uVar) {
        this.f42658a = uVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        if (!this.f42658a.f42659a.s()) {
            this.f42658a.f42659a.z();
        }
        this.f42658a.f42659a.setTransitionState(SearchView.d.SHOWN);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f42658a.f42661c.setVisibility(0);
        this.f42658a.f42673o.p();
    }
}
