package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.plaid.internal.EnumC4419g;
import java.util.Iterator;
import java.util.LinkedHashSet;
import nt.i;
import zs.c;

/* JADX INFO: loaded from: classes5.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f41496j = c.X;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f41497k = c.f128556a0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f41498l = c.f128570h0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final LinkedHashSet<b> f41499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f41500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f41501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TimeInterpolator f41502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TimeInterpolator f41503e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f41504f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f41505g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f41506h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ViewPropertyAnimator f41507i;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f41507i = null;
        }
    }

    public interface b {
        void a(@NonNull View view, int i11);
    }

    public HideBottomViewOnScrollBehavior() {
        this.f41499a = new LinkedHashSet<>();
        this.f41504f = 0;
        this.f41505g = 2;
        this.f41506h = 0;
    }

    private void J(@NonNull V v11, int i11, long j11, TimeInterpolator timeInterpolator) {
        this.f41507i = v11.animate().translationY(i11).setInterpolator(timeInterpolator).setDuration(j11).setListener(new a());
    }

    private void R(@NonNull V v11, int i11) {
        this.f41505g = i11;
        Iterator<b> it = this.f41499a.iterator();
        while (it.hasNext()) {
            it.next().a(v11, this.f41505g);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean E(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, @NonNull View view2, int i11, int i12) {
        return i11 == 2;
    }

    public boolean K() {
        return this.f41505g == 1;
    }

    public boolean L() {
        return this.f41505g == 2;
    }

    public void M(@NonNull V v11, int i11) {
        this.f41506h = i11;
        if (this.f41505g == 1) {
            v11.setTranslationY(this.f41504f + i11);
        }
    }

    public void N(@NonNull V v11) {
        O(v11, true);
    }

    public void O(@NonNull V v11, boolean z11) {
        if (K()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f41507i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v11.clearAnimation();
        }
        R(v11, 1);
        int i11 = this.f41504f + this.f41506h;
        if (z11) {
            J(v11, i11, this.f41501c, this.f41503e);
        } else {
            v11.setTranslationY(i11);
        }
    }

    public void P(@NonNull V v11) {
        Q(v11, true);
    }

    public void Q(@NonNull V v11, boolean z11) {
        if (L()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f41507i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v11.clearAnimation();
        }
        R(v11, 2);
        if (z11) {
            J(v11, 0, this.f41500b, this.f41502d);
        } else {
            v11.setTranslationY(0);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, int i11) {
        this.f41504f = v11.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v11.getLayoutParams()).bottomMargin;
        this.f41500b = i.f(v11.getContext(), f41496j, EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_SEARCH_CIRCLE_VALUE);
        this.f41501c = i.f(v11.getContext(), f41497k, 175);
        Context context = v11.getContext();
        int i12 = f41498l;
        this.f41502d = i.g(context, i12, at.b.f14975d);
        this.f41503e = i.g(v11.getContext(), i12, at.b.f14974c);
        return super.p(coordinatorLayout, v11, i11);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void x(CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, int i11, int i12, int i13, int i14, int i15, @NonNull int[] iArr) {
        if (i12 > 0) {
            N(v11);
        } else if (i12 < 0) {
            P(v11);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41499a = new LinkedHashSet<>();
        this.f41504f = 0;
        this.f41505g = 2;
        this.f41506h = 0;
    }
}
