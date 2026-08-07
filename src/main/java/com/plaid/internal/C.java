package com.plaid.internal;

import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes6.dex */
public final class C implements InterfaceC4524r6, s8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T3 f46233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wo0.b f46234b;

    public C(T3 localPaneStateStore, wo0.b json) {
        p013kotlin.jvm.internal.s.k(localPaneStateStore, "localPaneStateStore");
        p013kotlin.jvm.internal.s.k(json, "json");
        this.f46233a = localPaneStateStore;
        this.f46234b = json;
    }

    @Override // com.plaid.internal.s8
    public final Object a(A a11, C4529s2 c4529s2) {
        Object objA = this.f46233a.a("channel_state", "Channel_info", this.f46234b.b(A.a.f46192a, a11), c4529s2);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.h0.f84049a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.plaid.internal.InterfaceC4524r6
    public final Object b(ContinuationImpl continuationImpl) {
        B b11;
        C c11;
        if (continuationImpl instanceof B) {
            b11 = (B) continuationImpl;
            int i11 = b11.f46215d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                b11.f46215d = i11 - Integer.MIN_VALUE;
            } else {
                b11 = new B(this, continuationImpl);
            }
        } else {
            b11 = new B(this, continuationImpl);
        }
        Object objA = b11.f46213b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = b11.f46215d;
        if (i12 == 0) {
            jn0.t.b(objA);
            T3 t11 = this.f46233a;
            b11.f46212a = this;
            b11.f46215d = 1;
            objA = t11.a("channel_state", "Channel_info", b11);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
            c11 = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c11 = b11.f46212a;
            jn0.t.b(objA);
        }
        String str = (String) objA;
        if (str != null) {
            return (A) c11.f46234b.d(A.a.f46192a, str);
        }
        return null;
    }

    @Override // com.plaid.internal.InterfaceC4524r6
    public final Object a(ContinuationImpl continuationImpl) {
        Object objA = this.f46233a.a("channel_state", continuationImpl);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.h0.f84049a;
    }

    @Override // com.plaid.internal.s8
    public final Object a(C4529s2 c4529s2) {
        Object objA = a((ContinuationImpl) c4529s2);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.h0.f84049a;
    }
}
