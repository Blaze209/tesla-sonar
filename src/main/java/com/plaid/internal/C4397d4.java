package com.plaid.internal;

/* JADX INFO: renamed from: com.plaid.internal.d4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4397d4 implements M5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public M5 f47615a;

    @Override // com.plaid.internal.M5
    public final boolean a(String url) {
        p013kotlin.jvm.internal.s.k(url, "url");
        M5 m11 = this.f47615a;
        if (m11 != null) {
            return m11.a(url);
        }
        return false;
    }

    @Override // com.plaid.internal.M5
    public final void a(AbstractC4531s4 openInterstitialMessage) {
        p013kotlin.jvm.internal.s.k(openInterstitialMessage, "openInterstitialMessage");
        M5 m11 = this.f47615a;
        if (m11 != null) {
            m11.a(openInterstitialMessage);
        }
    }
}
