package com.plaid.internal;

import java.io.IOException;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.plaid.internal.x1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.workflow.persistence.HybridLinkStateStore$storeLinkState$2", f = "HybridLinkStateStore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class C4573x1 extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N2 f48211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4582y1 f48212b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4573x1(N2 n11, C4582y1 c4582y1, Continuation<? super C4573x1> continuation) {
        super(2, continuation);
        this.f48211a = n11;
        this.f48212b = c4582y1;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
        return new C4573x1(this.f48211a, this.f48212b, continuation);
    }

    @Override // wn0.p
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
        return new C4573x1(this.f48211a, this.f48212b, continuation).invokeSuspend(jn0.h0.f84049a);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws IOException {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        jn0.t.b(obj);
        X5.a.a(X5.f46812a, "Store LinkState: " + this.f48211a);
        this.f48212b.f48227d = this.f48211a;
        C4582y1.b(this.f48212b, this.f48211a);
        return jn0.h0.f84049a;
    }
}
