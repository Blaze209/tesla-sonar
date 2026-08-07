package com.plaid.internal;

import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes6.dex */
public final class H7 implements InterfaceC4569w6, w8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T3 f46342a;

    public H7(T3 localPaneStateStore) {
        p013kotlin.jvm.internal.s.k(localPaneStateStore, "localPaneStateStore");
        this.f46342a = localPaneStateStore;
    }

    @Override // com.plaid.internal.InterfaceC4569w6
    public final Object a(SuspendLambda suspendLambda) {
        Object objA = this.f46342a.a("webview_fallback_id_state", suspendLambda);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.h0.f84049a;
    }

    @Override // com.plaid.internal.InterfaceC4569w6
    public final Object a(ContinuationImpl continuationImpl) {
        return this.f46342a.a("webview_fallback_id_state", "webview_fallback_id", continuationImpl);
    }

    @Override // com.plaid.internal.w8
    public final Object a(String str, C4529s2 c4529s2) {
        Object objA = this.f46342a.a("webview_fallback_id_state", "webview_fallback_id", str, c4529s2);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.h0.f84049a;
    }
}
