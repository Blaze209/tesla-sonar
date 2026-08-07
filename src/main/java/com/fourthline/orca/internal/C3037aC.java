package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.aC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3037aC implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BB f30325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f30326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f30327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f30328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f30329e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f30330f;

    public C3037aC(BB bb2, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f30325a = bb2;
        this.f30326b = provider;
        this.f30327c = provider2;
        this.f30328d = provider3;
        this.f30329e = provider4;
        this.f30330f = provider5;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3891uB get() {
        return a(this.f30325a, (InterfaceC3863tk) this.f30326b.get(), (BC) this.f30327c.get(), (Cy) this.f30328d.get(), (C4087ys) this.f30329e.get(), (InterfaceC3732qh) this.f30330f.get());
    }

    public static C3037aC a(BB bb2, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new C3037aC(bb2, provider, provider2, provider3, provider4, provider5);
    }

    public static C3891uB a(BB bb2, InterfaceC3863tk interfaceC3863tk, BC bc2, Cy cy2, C4087ys c4087ys, InterfaceC3732qh interfaceC3732qh) {
        return (C3891uB) qj0.h.d(bb2.a(interfaceC3863tk, bc2, cy2, c4087ys, interfaceC3732qh));
    }
}
