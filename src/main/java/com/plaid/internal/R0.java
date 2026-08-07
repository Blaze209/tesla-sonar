package com.plaid.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class R0 implements M5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S0 f46641a;

    public R0(S0 embeddedWebviewUrlParser) {
        p013kotlin.jvm.internal.s.k(embeddedWebviewUrlParser, "embeddedWebviewUrlParser");
        this.f46641a = embeddedWebviewUrlParser;
    }

    @Override // com.plaid.internal.M5
    public final void a(AbstractC4531s4 openInterstitialMessage) {
        p013kotlin.jvm.internal.s.k(openInterstitialMessage, "openInterstitialMessage");
    }

    @Override // com.plaid.internal.M5
    public final boolean a(String url) {
        p013kotlin.jvm.internal.s.k(url, "url");
        try {
            this.f46641a.b(url);
            return true;
        } catch (Exception e11) {
            X5.a.a(X5.f46812a, e11);
            return true;
        }
    }
}
