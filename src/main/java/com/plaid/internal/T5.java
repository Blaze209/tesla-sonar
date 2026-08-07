package com.plaid.internal;

import kotlinx.coroutines.CoroutineScope;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.core.webview.PlaidWebview$submit$1$2$1", f = "PlaidWebview.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class T5 extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U5 f46718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f46719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f46720c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T5(U5 u11, String str, String str2, Continuation<? super T5> continuation) {
        super(2, continuation);
        this.f46718a = u11;
        this.f46719b = str;
        this.f46720c = str2;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
        return new T5(this.f46718a, this.f46719b, this.f46720c, continuation);
    }

    @Override // wn0.p
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
        return ((T5) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        jn0.t.b(obj);
        if (this.f46718a.a().get()) {
            T6.a.a("Webview is destroyed, cannot submit data");
            return jn0.h0.f84049a;
        }
        this.f46718a.loadUrl("javascript:window.SdkJsBridge.send('{\"message_type\": \"submit\", \"data\": {\"phone_number\":\"" + this.f46719b + "\", \"date_of_birth\":\"" + this.f46720c + "\"}}')");
        A6.a.b(p013kotlin.collections.v0.i(), "JSBridge - sent submit");
        return jn0.h0.f84049a;
    }
}
