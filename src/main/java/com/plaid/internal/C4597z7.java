package com.plaid.internal;

import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.plaid.internal.z7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4597z7 implements InterfaceC4560v6, v8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T3 f48284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4351b1 f48285b;

    public C4597z7(T3 localPaneStateStore, C4351b1 featureManager) {
        p013kotlin.jvm.internal.s.k(localPaneStateStore, "localPaneStateStore");
        p013kotlin.jvm.internal.s.k(featureManager, "featureManager");
        this.f48284a = localPaneStateStore;
        this.f48285b = featureManager;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.plaid.internal.InterfaceC4560v6
    public final Object a(ContinuationImpl continuationImpl) {
        C4588y7 c4588y7;
        if (continuationImpl instanceof C4588y7) {
            c4588y7 = (C4588y7) continuationImpl;
            int i11 = c4588y7.f48250c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c4588y7.f48250c = i11 - Integer.MIN_VALUE;
            } else {
                c4588y7 = new C4588y7(this, continuationImpl);
            }
        } else {
            c4588y7 = new C4588y7(this, continuationImpl);
        }
        Object objA = c4588y7.f48248a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c4588y7.f48250c;
        if (i12 == 0) {
            jn0.t.b(objA);
            this.f48285b.getClass();
            EnumC4360c1 enumC4360c1 = EnumC4360c1.BACKEND_DETERMINES;
            if (enumC4360c1.isSet()) {
                this.f48285b.getClass();
                return Boxing.boxBoolean(enumC4360c1.toBoolean());
            }
            T3 t11 = this.f48284a;
            c4588y7.f48250c = 1;
            objA = t11.a("webview_background_transparency_state", "webview_background_is_transparent", c4588y7);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(objA);
        }
        String str = (String) objA;
        return str == null ? Boxing.boxBoolean(false) : Boxing.boxBoolean(Boolean.parseBoolean(str));
    }

    @Override // com.plaid.internal.v8
    public final Object a(boolean z11, C4529s2 c4529s2) {
        Object objA = this.f48284a.a("webview_background_transparency_state", "webview_background_is_transparent", String.valueOf(z11), c4529s2);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.h0.f84049a;
    }

    @Override // com.plaid.internal.InterfaceC4560v6
    public final Object a(N7 n11) {
        Object objA = this.f48284a.a("webview_background_transparency_state", n11);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.h0.f84049a;
    }
}
