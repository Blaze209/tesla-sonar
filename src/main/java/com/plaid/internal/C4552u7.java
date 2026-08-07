package com.plaid.internal;

import android.view.View;
import com.plaid.link.R;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.plaid.internal.u7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4552u7 {
    public static final CoroutineScope a(View view) {
        p013kotlin.jvm.internal.s.k(view, "<this>");
        Object tag = view.getTag(R.string.plaid_view_coroutine_scope);
        CoroutineScope coroutineScope = tag instanceof CoroutineScope ? (CoroutineScope) tag : null;
        if (coroutineScope != null) {
            return coroutineScope;
        }
        ViewOnAttachStateChangeListenerC4543t7 viewOnAttachStateChangeListenerC4543t7 = new ViewOnAttachStateChangeListenerC4543t7();
        view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC4543t7);
        return viewOnAttachStateChangeListenerC4543t7;
    }
}
