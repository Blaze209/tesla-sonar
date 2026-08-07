package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Qc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2924Qc implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2909Nc f27453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f27454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f27455c;

    public C2924Qc(C2909Nc c2909Nc, Provider provider, Provider provider2) {
        this.f27453a = c2909Nc;
        this.f27454b = provider;
        this.f27455c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3011Xc get() {
        return a(this.f27453a, (C4038xm) this.f27454b.get(), (InterfaceC3732qh) this.f27455c.get());
    }

    public static C2924Qc a(C2909Nc c2909Nc, Provider provider, Provider provider2) {
        return new C2924Qc(c2909Nc, provider, provider2);
    }

    public static C3011Xc a(C2909Nc c2909Nc, C4038xm c4038xm, InterfaceC3732qh interfaceC3732qh) {
        return (C3011Xc) qj0.h.d(c2909Nc.a(c4038xm, interfaceC3732qh));
    }
}
