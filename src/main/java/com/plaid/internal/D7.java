package com.plaid.internal;

import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes6.dex */
public final class D7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4575x3 f46276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC4569w6 f46277b;

    public D7(C4575x3 workflowAnalytics, InterfaceC4569w6 readWebviewFallbackId) {
        p013kotlin.jvm.internal.s.k(workflowAnalytics, "workflowAnalytics");
        p013kotlin.jvm.internal.s.k(readWebviewFallbackId, "readWebviewFallbackId");
        this.f46276a = workflowAnalytics;
        this.f46277b = readWebviewFallbackId;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        A7 a11;
        D7 d11;
        if (continuationImpl instanceof A7) {
            a11 = (A7) continuationImpl;
            int i11 = a11.f46211d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                a11.f46211d = i11 - Integer.MIN_VALUE;
            } else {
                a11 = new A7(this, continuationImpl);
            }
        } else {
            a11 = new A7(this, continuationImpl);
        }
        Object objA = a11.f46209b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = a11.f46211d;
        if (i12 == 0) {
            jn0.t.b(objA);
            InterfaceC4569w6 interfaceC4569w6 = this.f46277b;
            a11.f46208a = this;
            a11.f46211d = 1;
            objA = interfaceC4569w6.a(a11);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
            d11 = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d11 = a11.f46208a;
            jn0.t.b(objA);
        }
        String str = (String) objA;
        if (str == null) {
            X5.a.e(X5.f46812a, "WebviewFallback ID missing from pane store --skipping WebviewFallbackCancelEvent");
        } else {
            d11.f46276a.a(str);
            X5.a.a(X5.f46812a, "WebviewFallbackCancel webviewFallbackId=" + str);
        }
        return jn0.h0.f84049a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(ContinuationImpl continuationImpl) {
        B7 b11;
        D7 d11;
        if (continuationImpl instanceof B7) {
            b11 = (B7) continuationImpl;
            int i11 = b11.f46232d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                b11.f46232d = i11 - Integer.MIN_VALUE;
            } else {
                b11 = new B7(this, continuationImpl);
            }
        } else {
            b11 = new B7(this, continuationImpl);
        }
        Object objA = b11.f46230b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = b11.f46232d;
        if (i12 == 0) {
            jn0.t.b(objA);
            InterfaceC4569w6 interfaceC4569w6 = this.f46277b;
            b11.f46229a = this;
            b11.f46232d = 1;
            objA = interfaceC4569w6.a(b11);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
            d11 = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d11 = b11.f46229a;
            jn0.t.b(objA);
        }
        String str = (String) objA;
        if (str == null) {
            X5.a.e(X5.f46812a, "WebviewFallback ID missing from pane store --skipping WebviewFallbackEmitPreCompletionResultEvent");
        } else {
            d11.f46276a.b(str);
            X5.a.a(X5.f46812a, "WebviewFallbackEmitPreCompletionResult webviewFallbackId=" + str);
        }
        return jn0.h0.f84049a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(ContinuationImpl continuationImpl) {
        C7 c11;
        D7 d11;
        if (continuationImpl instanceof C7) {
            c11 = (C7) continuationImpl;
            int i11 = c11.f46253d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c11.f46253d = i11 - Integer.MIN_VALUE;
            } else {
                c11 = new C7(this, continuationImpl);
            }
        } else {
            c11 = new C7(this, continuationImpl);
        }
        Object objA = c11.f46251b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c11.f46253d;
        if (i12 == 0) {
            jn0.t.b(objA);
            InterfaceC4569w6 interfaceC4569w6 = this.f46277b;
            c11.f46250a = this;
            c11.f46253d = 1;
            objA = interfaceC4569w6.a(c11);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
            d11 = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d11 = c11.f46250a;
            jn0.t.b(objA);
        }
        String str = (String) objA;
        d11.getClass();
        if (str == null) {
            X5.a.e(X5.f46812a, "WebviewFallback ID missing from pane store --skipping WebviewFallbackOpenEvent");
        } else {
            d11.f46276a.c(str);
            X5.a.a(X5.f46812a, "WebviewFallbackOpen webviewFallbackId=" + str);
        }
        return jn0.h0.f84049a;
    }
}
