package com.plaid.internal;

import kotlinx.coroutines.CoroutineScope;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.workflow.ChannelPolling$getNewPollingJob$1", f = "ChannelPolling.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
public final class D extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f46254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F f46255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A f46256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ G f46257d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(F f11, A a11, G g11, Continuation<? super D> continuation) {
        super(2, continuation);
        this.f46255b = f11;
        this.f46256c = a11;
        this.f46257d = g11;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
        return new D(this.f46255b, this.f46256c, this.f46257d, continuation);
    }

    @Override // wn0.p
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
        return ((D) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f46254a;
        if (i11 == 0) {
            jn0.t.b(obj);
            F f11 = this.f46255b;
            A a11 = this.f46256c;
            G g11 = this.f46257d;
            this.f46254a = 1;
            if (F.a(f11, a11, g11, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
        }
        return jn0.h0.f84049a;
    }
}
