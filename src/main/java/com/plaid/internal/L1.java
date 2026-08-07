package com.plaid.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class L1 implements qj0.e<InterfaceC4547u2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<G2> f46420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<Z2> f46421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider<Y2> f46422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Provider<t8> f46423d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Provider<x8> f46424e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Provider<s8> f46425f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Provider<w8> f46426g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Provider<v8> f46427h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C0 f46428i;

    public L1(I1 i11, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, C0 c11) {
        this.f46420a = provider;
        this.f46421b = provider2;
        this.f46422c = provider3;
        this.f46423d = provider4;
        this.f46424e = provider5;
        this.f46425f = provider6;
        this.f46426g = provider7;
        this.f46427h = provider8;
        this.f46428i = c11;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        G2 navigator = this.f46420a.get();
        Z2 linkStateStore = this.f46421b.get();
        Y2 reducer = this.f46422c.get();
        t8 writeOAuthRedirectUri = this.f46423d.get();
        x8 writeWebviewFallbackUri = this.f46424e.get();
        s8 writeChannelInfo = this.f46425f.get();
        w8 writeWebviewFallbackId = this.f46426g.get();
        v8 writeWebviewBackgroundTransparencyState = this.f46427h.get();
        A0 destinationFactory = (A0) this.f46428i.get();
        p013kotlin.jvm.internal.s.k(navigator, "navigator");
        p013kotlin.jvm.internal.s.k(linkStateStore, "linkStateStore");
        p013kotlin.jvm.internal.s.k(reducer, "reducer");
        p013kotlin.jvm.internal.s.k(writeOAuthRedirectUri, "writeOAuthRedirectUri");
        p013kotlin.jvm.internal.s.k(writeWebviewFallbackUri, "writeWebviewFallbackUri");
        p013kotlin.jvm.internal.s.k(writeChannelInfo, "writeChannelInfo");
        p013kotlin.jvm.internal.s.k(writeWebviewFallbackId, "writeWebviewFallbackId");
        p013kotlin.jvm.internal.s.k(writeWebviewBackgroundTransparencyState, "writeWebviewBackgroundTransparencyState");
        p013kotlin.jvm.internal.s.k(destinationFactory, "destinationFactory");
        return (InterfaceC4547u2) qj0.h.d(new C4538t2(navigator, linkStateStore, reducer, writeOAuthRedirectUri, writeWebviewFallbackUri, writeChannelInfo, writeWebviewFallbackId, writeWebviewBackgroundTransparencyState, destinationFactory));
    }
}
