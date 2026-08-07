package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Animator f42633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Animator f42634e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<Object> f42630a = new LinkedHashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<AnimatorListenerAdapter> f42631b = new LinkedHashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<AnimatorListenerAdapter> f42632c = new LinkedHashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f42635f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Animator f42636g = null;

    b() {
    }

    void a(boolean z11) {
        this.f42635f = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    void b(SearchBar searchBar) {
        Animator animator = this.f42633d;
        if (animator != null) {
            animator.end();
        }
        Animator animator2 = this.f42634e;
        if (animator2 != null) {
            animator2.end();
        }
        View centerView = searchBar.getCenterView();
        if (centerView instanceof at.a) {
            ((at.a) centerView).stopAnimation();
        }
        if (centerView != 0) {
            centerView.setAlpha(BitmapDescriptorFactory.HUE_RED);
        }
    }
}
