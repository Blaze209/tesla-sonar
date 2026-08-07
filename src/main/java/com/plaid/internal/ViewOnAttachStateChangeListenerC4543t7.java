package com.plaid.internal;

import android.view.View;
import com.plaid.link.R;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.SupervisorKt;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: com.plaid.internal.t7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class ViewOnAttachStateChangeListenerC4543t7 implements CoroutineScope, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContext f48145a = SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getIO());

    @Override // kotlinx.coroutines.CoroutineScope
    public final CoroutineContext getCoroutineContext() {
        return this.f48145a;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        p013kotlin.jvm.internal.s.k(view, "view");
        view.setTag(R.string.plaid_view_coroutine_scope, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        p013kotlin.jvm.internal.s.k(view, "view");
        JobKt__JobKt.cancel$default(this.f48145a, (CancellationException) null, 1, (Object) null);
        view.setTag(R.string.plaid_view_coroutine_scope, null);
    }
}
