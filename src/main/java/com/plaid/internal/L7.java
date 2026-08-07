package com.plaid.internal;

import kotlinx.coroutines.CoroutineScope;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.workflow.webview.WebviewViewModel$1", f = "WebviewViewModel.kt", i = {}, l = {121, 127}, m = "invokeSuspend", n = {}, s = {})
public final class L7 extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f46430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ P7 f46431b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L7(P7 p11, Continuation<? super L7> continuation) {
        super(2, continuation);
        this.f46431b = p11;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
        return new L7(this.f46431b, continuation);
    }

    @Override // wn0.p
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
        return new L7(this.f46431b, continuation).invokeSuspend(jn0.h0.f84049a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
    
        if (r1.emit(r5, r4) == r0) goto L24;
     */
    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.f46430a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            jn0.t.b(r5)
            goto L4f
        L12:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1a:
            jn0.t.b(r5)
            goto L37
        L1e:
            jn0.t.b(r5)
            com.plaid.internal.P7 r5 = r4.f46431b
            com.plaid.internal.x6 r5 = r5.f46594c
            if (r5 == 0) goto L28
            goto L2e
        L28:
            java.lang.String r5 = "readWebviewFallbackUri"
            p013kotlin.jvm.internal.s.B(r5)
            r5 = 0
        L2e:
            r4.f46430a = r3
            java.lang.Object r5 = r5.a(r4)
            if (r5 != r0) goto L37
            goto L4e
        L37:
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L52
            int r1 = r5.length()
            if (r1 != 0) goto L42
            goto L52
        L42:
            com.plaid.internal.P7 r1 = r4.f46431b
            kotlinx.coroutines.flow.MutableSharedFlow<java.lang.String> r1 = r1.f46604m
            r4.f46430a = r2
            java.lang.Object r5 = r1.emit(r5, r4)
            if (r5 != r0) goto L4f
        L4e:
            return r0
        L4f:
            jn0.h0 r5 = jn0.h0.f84049a
            return r5
        L52:
            jn0.h0 r5 = jn0.h0.f84049a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.L7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
