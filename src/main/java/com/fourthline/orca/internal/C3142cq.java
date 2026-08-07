package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.cq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3142cq implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Sp f30964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f30965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f30966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f30967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f30968e;

    public C3142cq(Sp sp2, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f30964a = sp2;
        this.f30965b = provider;
        this.f30966c = provider2;
        this.f30967d = provider3;
        this.f30968e = provider4;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ED get() {
        return a(this.f30964a, (C3741qq) this.f30965b.get(), (Vf) this.f30966c.get(), (C3698pq) this.f30967d.get(), (InterfaceC3645og) this.f30968e.get());
    }

    public static C3142cq a(Sp sp2, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new C3142cq(sp2, provider, provider2, provider3, provider4);
    }

    public static ED a(Sp sp2, C3741qq c3741qq, Vf vf2, C3698pq c3698pq, InterfaceC3645og interfaceC3645og) {
        return (ED) qj0.h.d(sp2.a(c3741qq, vf2, c3698pq, interfaceC3645og));
    }
}
