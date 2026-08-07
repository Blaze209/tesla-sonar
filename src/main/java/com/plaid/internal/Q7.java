package com.plaid.internal;

import java.util.LinkedHashMap;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.workflow.webview.WebviewViewModel$onSessionHandoff$1", f = "WebviewViewModel.kt", i = {}, l = {170}, m = "invokeSuspend", n = {}, s = {})
public final class Q7 extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f46638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ P7 f46639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f46640c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q7(P7 p11, LinkedHashMap linkedHashMap, Continuation continuation) {
        super(2, continuation);
        this.f46639b = p11;
        this.f46640c = linkedHashMap;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
        return new Q7(this.f46639b, this.f46640c, continuation);
    }

    @Override // wn0.p
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
        return new Q7(this.f46639b, this.f46640c, continuation).invokeSuspend(jn0.h0.f84049a);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f46638a;
        if (i11 == 0) {
            jn0.t.b(obj);
            InterfaceC4547u2 interfaceC4547u2B = this.f46639b.b();
            LinkedHashMap linkedHashMap = this.f46640c;
            this.f46638a = 1;
            if (interfaceC4547u2B.a(linkedHashMap, this) == coroutine_suspended) {
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
