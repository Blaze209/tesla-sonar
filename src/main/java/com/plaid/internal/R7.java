package com.plaid.internal;

import kotlinx.coroutines.CoroutineScope;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.workflow.webview.WebviewViewModel$trackWebviewFallbackOpen$1", f = "WebviewViewModel.kt", i = {}, l = {152}, m = "invokeSuspend", n = {}, s = {})
public final class R7 extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f46675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ P7 f46676b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R7(P7 p11, Continuation<? super R7> continuation) {
        super(2, continuation);
        this.f46676b = p11;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
        return new R7(this.f46676b, continuation);
    }

    @Override // wn0.p
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
        return new R7(this.f46676b, continuation).invokeSuspend(jn0.h0.f84049a);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f46675a;
        if (i11 == 0) {
            jn0.t.b(obj);
            D7 d11 = this.f46676b.f46598g;
            if (d11 == null) {
                p013kotlin.jvm.internal.s.B("webviewFallbackAnalytics");
                d11 = null;
            }
            this.f46675a = 1;
            if (d11.c(this) == coroutine_suspended) {
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
