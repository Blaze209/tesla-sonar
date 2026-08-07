package com.plaid.internal;

import kotlinx.coroutines.CoroutineScope;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.plaid.internal.h2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.link.LinkActivityViewModel$onActivityReady$1", f = "LinkActivityViewModel.kt", i = {}, l = {64, 65, 70}, m = "invokeSuspend", n = {}, s = {})
public final class C4431h2 extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f47705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC4587y6 f47706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4449j2 f47707c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4431h2(AbstractC4587y6 abstractC4587y6, C4449j2 c4449j2, Continuation<? super C4431h2> continuation) {
        super(2, continuation);
        this.f47706b = abstractC4587y6;
        this.f47707c = c4449j2;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
        return new C4431h2(this.f47706b, this.f47707c, continuation);
    }

    @Override // wn0.p
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
        return new C4431h2(this.f47706b, this.f47707c, continuation).invokeSuspend(jn0.h0.f84049a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003d  */
    /* JADX WARN: Code duplicated, block: B:20:0x003f  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r2.b(r7) == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0065, code lost:
    
        if (r2.a(r8, r7) == r0) goto L34;
     */
    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.f47705a
            r2 = 0
            java.lang.String r3 = "controller"
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L25
            if (r1 == r6) goto L21
            if (r1 == r5) goto L1d
            if (r1 != r4) goto L15
            goto L1d
        L15:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1d:
            jn0.t.b(r8)
            goto L68
        L21:
            jn0.t.b(r8)
            goto L37
        L25:
            jn0.t.b(r8)
            com.plaid.internal.y6 r8 = r7.f47706b
            if (r8 != 0) goto L4b
            com.plaid.link.Plaid r8 = com.plaid.link.Plaid.INSTANCE
            r7.f47705a = r6
            java.lang.Object r8 = r8.awaitPreload$link_sdk_release(r7)
            if (r8 != r0) goto L37
            goto L67
        L37:
            com.plaid.internal.j2 r8 = r7.f47707c
            com.plaid.internal.u2 r8 = r8.f47766c
            if (r8 == 0) goto L3f
            r2 = r8
            goto L42
        L3f:
            p013kotlin.jvm.internal.s.B(r3)
        L42:
            r7.f47705a = r5
            java.lang.Object r8 = r2.b(r7)
            if (r8 != r0) goto L68
            goto L67
        L4b:
            boolean r8 = r8 instanceof com.plaid.internal.AbstractC4587y6.e
            if (r8 == 0) goto L52
            jn0.h0 r8 = jn0.h0.f84049a
            return r8
        L52:
            com.plaid.internal.j2 r8 = r7.f47707c
            com.plaid.internal.u2 r8 = r8.f47766c
            if (r8 == 0) goto L5a
            r2 = r8
            goto L5d
        L5a:
            p013kotlin.jvm.internal.s.B(r3)
        L5d:
            com.plaid.internal.y6 r8 = r7.f47706b
            r7.f47705a = r4
            java.lang.Object r8 = r2.a(r8, r7)
            if (r8 != r0) goto L68
        L67:
            return r0
        L68:
            jn0.h0 r8 = jn0.h0.f84049a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.C4431h2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
