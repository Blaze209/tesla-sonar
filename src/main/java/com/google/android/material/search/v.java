package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes5.dex */
class v extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ u f42678a;

    v(u uVar) {
        this.f42678a = uVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        if (!this.f42678a.f42659a.s()) {
            this.f42678a.f42659a.z();
        }
        this.f42678a.f42659a.setTransitionState(SearchView.d.SHOWN);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f42678a.f42661c.setVisibility(0);
        this.f42678a.f42659a.setTransitionState(SearchView.d.SHOWING);
    }
}
