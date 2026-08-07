package com.plaid.internal;

import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.plaid.internal.r4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4522r4 implements t8, InterfaceC4533s6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T3 f48092a;

    public C4522r4(T3 localPaneStateStore) {
        p013kotlin.jvm.internal.s.k(localPaneStateStore, "localPaneStateStore");
        this.f48092a = localPaneStateStore;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.plaid.internal.InterfaceC4533s6
    public final Object a(ContinuationImpl continuationImpl) {
        C4514q4 c4514q4;
        C4522r4 c4522r4;
        if (continuationImpl instanceof C4514q4) {
            c4514q4 = (C4514q4) continuationImpl;
            int i11 = c4514q4.f48069d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c4514q4.f48069d = i11 - Integer.MIN_VALUE;
            } else {
                c4514q4 = new C4514q4(this, continuationImpl);
            }
        } else {
            c4514q4 = new C4514q4(this, continuationImpl);
        }
        Object objA = c4514q4.f48067b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c4514q4.f48069d;
        if (i12 == 0) {
            jn0.t.b(objA);
            T3 t11 = this.f48092a;
            c4514q4.f48066a = this;
            c4514q4.f48069d = 1;
            objA = t11.a("oauth_pane_state", "received_redirect_uri", c4514q4);
            if (objA != coroutine_suspended) {
                c4522r4 = this;
            }
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str = (String) c4514q4.f48066a;
            jn0.t.b(objA);
            return str;
        }
        c4522r4 = (C4522r4) c4514q4.f48066a;
        jn0.t.b(objA);
        String str2 = (String) objA;
        T3 t12 = c4522r4.f48092a;
        c4514q4.f48066a = str2;
        c4514q4.f48069d = 2;
        return t12.a("oauth_pane_state", c4514q4) == coroutine_suspended ? coroutine_suspended : str2;
    }

    @Override // com.plaid.internal.t8
    public final Object a(String str, C4512q2 c4512q2) {
        Object objA = this.f48092a.a("oauth_pane_state", "received_redirect_uri", str, c4512q2);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.h0.f84049a;
    }

    @Override // com.plaid.internal.t8
    public final Object a(X2 x11) {
        Object objA = this.f48092a.a("oauth_pane_state", x11);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.h0.f84049a;
    }
}
