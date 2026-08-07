package com.plaid.internal;

import kotlinx.coroutines.CoroutineScope;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.plaid.internal.w1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.workflow.persistence.HybridLinkStateStore$getCurrentLinkState$2", f = "HybridLinkStateStore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class C4564w1 extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super N2>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4582y1 f48193a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4564w1(C4582y1 c4582y1, Continuation<? super C4564w1> continuation) {
        super(2, continuation);
        this.f48193a = c4582y1;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
        return new C4564w1(this.f48193a, continuation);
    }

    @Override // wn0.p
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super N2> continuation) {
        return new C4564w1(this.f48193a, continuation).invokeSuspend(jn0.h0.f84049a);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        jn0.t.b(obj);
        if (this.f48193a.f48227d == null) {
            X5.a.a(X5.f46812a, "Initializing statestore");
            C4582y1 c4582y1 = this.f48193a;
            c4582y1.f48227d = C4582y1.b(c4582y1);
        }
        X5.a.a(X5.f46812a, "Get current LinkState: " + this.f48193a.f48227d);
        N2 n11 = this.f48193a.f48227d;
        p013kotlin.jvm.internal.s.h(n11);
        return n11;
    }
}
