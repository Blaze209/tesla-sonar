package com.plaid.internal;

import kotlinx.coroutines.CoroutineScope;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.plaid.internal.w4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.workflow.webview.OutOfProcessWebviewViewModel$clearSessionState$1", f = "OutOfProcessWebviewViewModel.kt", i = {}, l = {173, 174, 175}, m = "invokeSuspend", n = {}, s = {})
public final class C4567w4 extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f48203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4594z4 f48204b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4567w4(C4594z4 c4594z4, Continuation<? super C4567w4> continuation) {
        super(2, continuation);
        this.f48204b = c4594z4;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
        return new C4567w4(this.f48204b, continuation);
    }

    @Override // wn0.p
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
        return new C4567w4(this.f48204b, continuation).invokeSuspend(jn0.h0.f84049a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005b  */
    /* JADX WARN: Code duplicated, block: B:29:0x005d  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0068, code lost:
    
        if (r5.b(r6) == r0) goto L32;
     */
    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f48203a
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L26
            if (r1 == r4) goto L22
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            jn0.t.b(r7)
            goto L6b
        L16:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1e:
            jn0.t.b(r7)
            goto L55
        L22:
            jn0.t.b(r7)
            goto L3f
        L26:
            jn0.t.b(r7)
            com.plaid.internal.z4 r7 = r6.f48204b
            com.plaid.internal.r6 r7 = r7.f48267c
            if (r7 == 0) goto L30
            goto L36
        L30:
            java.lang.String r7 = "readChannelInfo"
            p013kotlin.jvm.internal.s.B(r7)
            r7 = r5
        L36:
            r6.f48203a = r4
            java.lang.Object r7 = r7.a(r6)
            if (r7 != r0) goto L3f
            goto L6a
        L3f:
            com.plaid.internal.z4 r7 = r6.f48204b
            com.plaid.internal.w6 r7 = r7.f48268d
            if (r7 == 0) goto L46
            goto L4c
        L46:
            java.lang.String r7 = "readWebviewFallbackId"
            p013kotlin.jvm.internal.s.B(r7)
            r7 = r5
        L4c:
            r6.f48203a = r3
            java.lang.Object r7 = r7.a(r6)
            if (r7 != r0) goto L55
            goto L6a
        L55:
            com.plaid.internal.z4 r7 = r6.f48204b
            com.plaid.internal.u6 r7 = r7.f48269e
            if (r7 == 0) goto L5d
            r5 = r7
            goto L62
        L5d:
            java.lang.String r7 = "readPreCompletionResult"
            p013kotlin.jvm.internal.s.B(r7)
        L62:
            r6.f48203a = r2
            java.lang.Object r7 = r5.b(r6)
            if (r7 != r0) goto L6b
        L6a:
            return r0
        L6b:
            jn0.h0 r7 = jn0.h0.f84049a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.C4567w4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
