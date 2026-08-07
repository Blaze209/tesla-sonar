package com.plaid.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.plaid.internal.f3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4414f3 implements qj0.e<Y2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4521r3 f47649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<C4575x3> f47650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider<L4> f47651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final G3 f47652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Provider<i8> f47653e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Provider<t8> f47654f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Provider<C6> f47655g;

    public C4414f3(C4396d3 c4396d3, C4521r3 c4521r3, Provider provider, Provider provider2, G3 g11, Provider provider3, Provider provider4, Provider provider5) {
        this.f47649a = c4521r3;
        this.f47650b = provider;
        this.f47651c = provider2;
        this.f47652d = g11;
        this.f47653e = provider3;
        this.f47654f = provider4;
        this.f47655g = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d8 api = (d8) this.f47649a.get();
        C4575x3 linkWorkflowAnalytics = this.f47650b.get();
        L4 paneStore = this.f47651c.get();
        F3 localErrorFactory = (F3) this.f47652d.get();
        i8 requestFactory = this.f47653e.get();
        t8 writeOAuthRedirectUri = this.f47654f.get();
        C6 remoteLogController = this.f47655g.get();
        p013kotlin.jvm.internal.s.k(api, "api");
        p013kotlin.jvm.internal.s.k(linkWorkflowAnalytics, "linkWorkflowAnalytics");
        p013kotlin.jvm.internal.s.k(paneStore, "paneStore");
        p013kotlin.jvm.internal.s.k(localErrorFactory, "localErrorFactory");
        p013kotlin.jvm.internal.s.k(requestFactory, "requestFactory");
        p013kotlin.jvm.internal.s.k(writeOAuthRedirectUri, "writeOAuthRedirectUri");
        p013kotlin.jvm.internal.s.k(remoteLogController, "remoteLogController");
        return (Y2) qj0.h.d(new Y2(api, paneStore, linkWorkflowAnalytics, localErrorFactory, requestFactory, writeOAuthRedirectUri, remoteLogController));
    }
}
