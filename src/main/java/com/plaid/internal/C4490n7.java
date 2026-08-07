package com.plaid.internal;

import kotlinx.coroutines.CoroutineScope;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.plaid.internal.n7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.sna.TwilioAuthController$asyncAuthentication$result$1", f = "TwilioAuthController.kt", i = {}, l = {26}, m = "invokeSuspend", n = {}, s = {})
public final class C4490n7 extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super InterfaceC4471l6>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f47939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4499o7 f47940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4508p7 f47941c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4490n7(C4499o7 c4499o7, C4508p7 c4508p7, Continuation<? super C4490n7> continuation) {
        super(2, continuation);
        this.f47940b = c4499o7;
        this.f47941c = c4508p7;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
        return new C4490n7(this.f47940b, this.f47941c, continuation);
    }

    @Override // wn0.p
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super InterfaceC4471l6> continuation) {
        return new C4490n7(this.f47940b, this.f47941c, continuation).invokeSuspend(jn0.h0.f84049a);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f47939a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            return obj;
        }
        jn0.t.b(obj);
        InterfaceC4517q7 interfaceC4517q7 = this.f47940b.f47993a;
        String str = this.f47941c.f48042b;
        this.f47939a = 1;
        Object objA = interfaceC4517q7.a(str, this);
        return objA == coroutine_suspended ? coroutine_suspended : objA;
    }
}
