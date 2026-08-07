package com.plaid.internal;

import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.workflow.webview.WebviewFallbackAnalytics", f = "WebviewFallbackAnalytics.kt", i = {0}, l = {20}, m = "trackWebviewFallbackOpen$link_sdk_release", n = {"this"}, s = {"L$0"})
public final class C7 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public D7 f46250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f46251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ D7 f46252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f46253d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7(D7 d11, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f46252c = d11;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f46251b = obj;
        this.f46253d |= Integer.MIN_VALUE;
        return this.f46252c.c(this);
    }
}
