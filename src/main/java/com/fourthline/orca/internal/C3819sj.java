package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.sj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3819sj implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3691pj f35325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f35326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f35327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f35328d;

    public C3819sj(C3691pj c3691pj, Provider provider, Provider provider2, Provider provider3) {
        this.f35325a = c3691pj;
        this.f35326b = provider;
        this.f35327c = provider2;
        this.f35328d = provider3;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3648oj get() {
        return a(this.f35325a, (InterfaceC3863tk) this.f35326b.get(), (C4087ys) this.f35327c.get(), (InterfaceC3732qh) this.f35328d.get());
    }

    public static C3819sj a(C3691pj c3691pj, Provider provider, Provider provider2, Provider provider3) {
        return new C3819sj(c3691pj, provider, provider2, provider3);
    }

    public static C3648oj a(C3691pj c3691pj, InterfaceC3863tk interfaceC3863tk, C4087ys c4087ys, InterfaceC3732qh interfaceC3732qh) {
        return (C3648oj) qj0.h.d(c3691pj.a(interfaceC3863tk, c4087ys, interfaceC3732qh));
    }
}
