package com.plaid.internal;

import kotlinx.coroutines.CoroutineScope;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.workflow.network.ExponentialBackoffRetry$doNetworkCallWithRetries$2", f = "ExponentialBackoffRetry.kt", i = {}, l = {32, 33}, m = "invokeSuspend", n = {}, s = {})
public final class Y0 extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p013kotlin.jvm.internal.n0 f46815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f46816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p013kotlin.jvm.internal.l0 f46817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p013kotlin.jvm.internal.n0<AbstractC4442i4<Object, Object>> f46818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wn0.l<Continuation<? super AbstractC4442i4<Object, ? extends Object>>, Object> f46819e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Y0(p013kotlin.jvm.internal.l0 l0Var, p013kotlin.jvm.internal.n0<AbstractC4442i4<Object, Object>> n0Var, wn0.l<? super Continuation<? super AbstractC4442i4<Object, ? extends Object>>, ? extends Object> lVar, Continuation<? super Y0> continuation) {
        super(2, continuation);
        this.f46817c = l0Var;
        this.f46818d = n0Var;
        this.f46819e = lVar;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
        return new Y0(this.f46817c, this.f46818d, this.f46819e, continuation);
    }

    @Override // wn0.p
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
        return ((Y0) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0078  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0084, code lost:
    
        if (r9 == r0) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0084 -> B:26:0x0087). Please report as a decompilation issue!!! */
    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.f46816b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L21
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            kotlin.jvm.internal.n0 r1 = r8.f46815a
            jn0.t.b(r9)
            goto L87
        L15:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1d:
            jn0.t.b(r9)
            goto L78
        L21:
            jn0.t.b(r9)
        L24:
            kotlin.jvm.internal.l0 r9 = r8.f46817c
            int r9 = r9.f86527a
            r1 = 4
            if (r9 >= r1) goto L91
            kotlin.jvm.internal.n0<com.plaid.internal.i4<java.lang.Object, java.lang.Object>> r9 = r8.f46818d
            T r9 = r9.f86529a
            com.plaid.internal.i4 r9 = (com.plaid.internal.AbstractC4442i4) r9
            boolean r9 = r9.a()
            if (r9 == 0) goto L91
            kotlin.jvm.internal.n0<com.plaid.internal.i4<java.lang.Object, java.lang.Object>> r9 = r8.f46818d
            T r9 = r9.f86529a
            com.plaid.internal.i4 r9 = (com.plaid.internal.AbstractC4442i4) r9
            r9.getClass()
            boolean r1 = r9 instanceof com.plaid.internal.AbstractC4442i4.a
            if (r1 == 0) goto L4d
            com.plaid.internal.i4$a r9 = (com.plaid.internal.AbstractC4442i4.a) r9
            int r9 = r9.f47734b
            r1 = 400(0x190, float:5.6E-43)
            if (r9 != r1) goto L4d
            goto L91
        L4d:
            kotlin.jvm.internal.l0 r9 = r8.f46817c
            int r9 = r9.f86527a
            double r4 = (double) r9
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r4 = java.lang.Math.pow(r6, r4)
            long r4 = (long) r4
            r9 = 1000(0x3e8, float:1.401E-42)
            long r6 = (long) r9
            long r4 = r4 * r6
            zn0.c$a r9 = zn0.c.INSTANCE
            r6 = 0
            long r6 = r9.g(r6, r4)
            long r6 = r6 + r4
            r4 = 32000(0x7d00, double:1.581E-319)
            long r4 = java.lang.Math.min(r6, r4)
            r9 = 0
            r8.f46815a = r9
            r8.f46816b = r3
            java.lang.Object r9 = kotlinx.coroutines.DelayKt.delay(r4, r8)
            if (r9 != r0) goto L78
            goto L86
        L78:
            kotlin.jvm.internal.n0<com.plaid.internal.i4<java.lang.Object, java.lang.Object>> r1 = r8.f46818d
            wn0.l<kotlin.coroutines.Continuation<? super com.plaid.internal.i4<java.lang.Object, ? extends java.lang.Object>>, java.lang.Object> r9 = r8.f46819e
            r8.f46815a = r1
            r8.f46816b = r2
            java.lang.Object r9 = r9.invoke(r8)
            if (r9 != r0) goto L87
        L86:
            return r0
        L87:
            r1.f86529a = r9
            kotlin.jvm.internal.l0 r9 = r8.f46817c
            int r1 = r9.f86527a
            int r1 = r1 + r3
            r9.f86527a = r1
            goto L24
        L91:
            jn0.h0 r9 = jn0.h0.f84049a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.Y0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
