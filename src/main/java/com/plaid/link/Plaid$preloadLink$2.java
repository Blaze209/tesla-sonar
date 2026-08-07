package com.plaid.link;

import jn0.h0;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import wn0.p;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.plaid.link.Plaid$preloadLink$2", f = "Plaid.kt", i = {0}, l = {118, 119}, m = "invokeSuspend", n = {"preloadLinkController"}, s = {"L$0"})
public final class Plaid$preloadLink$2 extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {
    Object L$0;
    int label;

    public Plaid$preloadLink$2(Continuation<? super Plaid$preloadLink$2> continuation) {
        super(2, continuation);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
        return new Plaid$preloadLink$2(continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        if (r1.b(r4) == r0) goto L15;
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
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            jn0.t.b(r5)
            goto L4d
        L12:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1a:
            java.lang.Object r1 = r4.L$0
            com.plaid.internal.f6 r1 = (com.plaid.internal.C4417f6) r1
            jn0.t.b(r5)
            goto L41
        L22:
            jn0.t.b(r5)
            com.plaid.link.Plaid r5 = com.plaid.link.Plaid.INSTANCE
            com.plaid.internal.a3 r5 = com.plaid.link.Plaid.access$getOrCreateTokenComponent(r5)
            com.plaid.internal.o0 r5 = (com.plaid.internal.C4492o0) r5
            javax.inject.Provider<com.plaid.internal.f6> r5 = r5.f47970q
            java.lang.Object r5 = r5.get()
            r1 = r5
            com.plaid.internal.f6 r1 = (com.plaid.internal.C4417f6) r1
            r4.L$0 = r1
            r4.label = r3
            java.lang.Object r5 = r1.c(r4)
            if (r5 != r0) goto L41
            goto L4c
        L41:
            r5 = 0
            r4.L$0 = r5
            r4.label = r2
            java.lang.Object r5 = r1.b(r4)
            if (r5 != r0) goto L4d
        L4c:
            return r0
        L4d:
            jn0.h0 r5 = jn0.h0.f84049a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.link.Plaid$preloadLink$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // wn0.p
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
        return ((Plaid$preloadLink$2) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
    }
}
