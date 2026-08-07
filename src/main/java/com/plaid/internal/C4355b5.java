package com.plaid.internal;

import com.plaid.internal.core.crashreporting.internal.models.Crash;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.plaid.internal.b5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.core.crashreporting.PlaidCrashReporter$sendTestCrash$1", f = "PlaidCrashReporter.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
public final class C4355b5 extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f46886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4364c5 f46887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RuntimeException f46888c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4355b5(C4364c5 c4364c5, RuntimeException runtimeException, Continuation<? super C4355b5> continuation) {
        super(2, continuation);
        this.f46887b = c4364c5;
        this.f46888c = runtimeException;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
        return new C4355b5(this.f46887b, this.f46888c, continuation);
    }

    @Override // wn0.p
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
        return new C4355b5(this.f46887b, this.f46888c, continuation).invokeSuspend(jn0.h0.f84049a);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f46886a;
        if (i11 == 0) {
            jn0.t.b(obj);
            C4364c5 c4364c5 = this.f46887b;
            C4456k0 c4456k0 = c4364c5.f46904c;
            Crash crashA = c4364c5.f46903b.a(this.f46888c);
            this.f46886a = 1;
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
