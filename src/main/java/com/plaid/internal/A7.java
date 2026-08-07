package com.plaid.internal;

import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.workflow.webview.WebviewFallbackAnalytics", f = "WebviewFallbackAnalytics.kt", i = {0}, l = {31}, m = "trackWebviewFallbackCancel$link_sdk_release", n = {"this"}, s = {"L$0"})
public final class A7 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public D7 f46208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f46209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ D7 f46210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f46211d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A7(D7 d11, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f46210c = d11;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f46209b = obj;
        this.f46211d |= Integer.MIN_VALUE;
        return this.f46210c.a(this);
    }
}
