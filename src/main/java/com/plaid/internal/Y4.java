package com.plaid.internal;

import com.plaid.internal.core.crashreporting.internal.models.Crash;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.core.crashreporting.internal.PlaidCrashHandler$handleCrash$1", f = "PlaidCrashHandler.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
public final class Y4 extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f46828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Z4 f46829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f46830c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y4(Z4 z11, Throwable th2, Continuation<? super Y4> continuation) {
        super(2, continuation);
        this.f46829b = z11;
        this.f46830c = th2;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
        return new Y4(this.f46829b, this.f46830c, continuation);
    }

    @Override // wn0.p
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
        return new Y4(this.f46829b, this.f46830c, continuation).invokeSuspend(jn0.h0.f84049a);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f46828a;
        if (i11 == 0) {
            jn0.t.b(obj);
            Z4 z11 = this.f46829b;
            C4456k0 c4456k0 = z11.f46850b;
            Crash crashA = z11.f46849a.a(this.f46830c);
            this.f46828a = 1;
            if (c4456k0.a(crashA, this) == coroutine_suspended) {
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
