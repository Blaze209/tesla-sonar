package com.google.android.material.floatingactionbutton;

import android.animation.Animator;

/* JADX INFO: loaded from: classes5.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Animator f42138a;

    a() {
    }

    public void a() {
        Animator animator = this.f42138a;
        if (animator != null) {
            animator.cancel();
        }
    }

    public void b() {
        this.f42138a = null;
    }

    public void c(Animator animator) {
        a();
        this.f42138a = animator;
    }
}
