package com.plaid.internal;

import java.io.IOException;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.globalvalues.PlaidClientSideOnlyConfigurationStore$storeNoLoadingUi$3", f = "PlaidClientSideOnlyConfigurationStore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class V4 extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ W4 f46775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f46776b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V4(W4 w11, boolean z11, Continuation<? super V4> continuation) {
        super(2, continuation);
        this.f46775a = w11;
        this.f46776b = z11;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
        return new V4(this.f46775a, this.f46776b, continuation);
    }

    @Override // wn0.p
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
        return new V4(this.f46775a, this.f46776b, continuation).invokeSuspend(jn0.h0.f84049a);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws IOException {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        jn0.t.b(obj);
        this.f46775a.f46793a.a("plaid_no_loading_ui", String.valueOf(this.f46776b));
        return jn0.h0.f84049a;
    }
}
