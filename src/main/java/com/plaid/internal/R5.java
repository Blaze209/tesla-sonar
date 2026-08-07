package com.plaid.internal;

import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public final class R5 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f46664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U5 f46665b;

    public R5(View view, U5 u11) {
        this.f46664a = view;
        this.f46665b = u11;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        p013kotlin.jvm.internal.s.k(view, "view");
        this.f46664a.removeOnAttachStateChangeListener(this);
        U5 u11 = this.f46665b;
        u11.post(new Q5(u11));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        p013kotlin.jvm.internal.s.k(view, "view");
    }
}
