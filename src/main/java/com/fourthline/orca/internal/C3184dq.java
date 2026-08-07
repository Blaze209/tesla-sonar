package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.dq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3184dq implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Sp f31226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f31227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f31228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f31229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f31230e;

    public C3184dq(Sp sp2, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f31226a = sp2;
        this.f31227b = provider;
        this.f31228c = provider2;
        this.f31229d = provider3;
        this.f31230e = provider4;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ED get() {
        return a(this.f31226a, (Mp) this.f31227b.get(), (Vf) this.f31228c.get(), (C3698pq) this.f31229d.get(), (InterfaceC3645og) this.f31230e.get());
    }

    public static C3184dq a(Sp sp2, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new C3184dq(sp2, provider, provider2, provider3, provider4);
    }

    public static ED a(Sp sp2, Mp mp2, Vf vf2, C3698pq c3698pq, InterfaceC3645og interfaceC3645og) {
        return (ED) qj0.h.d(sp2.a(mp2, vf2, c3698pq, interfaceC3645og));
    }
}
