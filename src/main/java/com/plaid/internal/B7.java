package com.plaid.internal;

import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.workflow.webview.WebviewFallbackAnalytics", f = "WebviewFallbackAnalytics.kt", i = {0}, l = {41}, m = "trackWebviewFallbackEmitPreCompletionResult$link_sdk_release", n = {"this"}, s = {"L$0"})
public final class B7 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public D7 f46229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f46230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ D7 f46231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f46232d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B7(D7 d11, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f46231c = d11;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f46230b = obj;
        this.f46232d |= Integer.MIN_VALUE;
        return this.f46231c.b(this);
    }
}
