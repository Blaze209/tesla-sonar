package com.plaid.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class Q5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U5 f46633a;

    public Q5(U5 u11) {
        this.f46633a = u11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        U5 webView = this.f46633a;
        webView.f46743b.getClass();
        p013kotlin.jvm.internal.s.k(webView, "webView");
        X5.f46812a.getClass();
        X5.a.a("JS send Link is shown", true);
        webView.loadUrl("javascript:window.SdkJsBridge.send('{\"message_type\": \"open\", \"data\": {}}')");
        A6.a.b(p013kotlin.collections.v0.i(), "JSBridge - sent open");
    }
}
