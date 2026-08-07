package com.plaid.internal;

import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes6.dex */
public final class J7 implements x8, InterfaceC4578x6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T3 f46374a;

    public J7(T3 localPaneStateStore) {
        p013kotlin.jvm.internal.s.k(localPaneStateStore, "localPaneStateStore");
        this.f46374a = localPaneStateStore;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.plaid.internal.InterfaceC4578x6
    public final Object a(ContinuationImpl continuationImpl) {
        I7 i11;
        J7 j11;
        if (continuationImpl instanceof I7) {
            i11 = (I7) continuationImpl;
            int i12 = i11.f46364d;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                i11.f46364d = i12 - Integer.MIN_VALUE;
            } else {
                i11 = new I7(this, continuationImpl);
            }
        } else {
            i11 = new I7(this, continuationImpl);
        }
        Object objA = i11.f46362b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = i11.f46364d;
        if (i13 == 0) {
            jn0.t.b(objA);
            T3 t11 = this.f46374a;
            i11.f46361a = this;
            i11.f46364d = 1;
            objA = t11.a("webview_fallback_state", "webview_fallback_initial_uri", i11);
            if (objA != coroutine_suspended) {
                j11 = this;
            }
        }
        if (i13 != 1) {
            if (i13 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str = (String) i11.f46361a;
            jn0.t.b(objA);
            return str;
        }
        j11 = (J7) i11.f46361a;
        jn0.t.b(objA);
        String str2 = (String) objA;
        T3 t12 = j11.f46374a;
        i11.f46361a = str2;
        i11.f46364d = 2;
        return t12.a("webview_fallback_state", i11) == coroutine_suspended ? coroutine_suspended : str2;
    }

    @Override // com.plaid.internal.x8
    public final Object a(String str, C4529s2 c4529s2) {
        Object objA = this.f46374a.a("webview_fallback_state", "webview_fallback_initial_uri", str, c4529s2);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.h0.f84049a;
    }
}
