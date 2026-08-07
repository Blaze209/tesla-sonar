package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.jq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3440jq implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Sp f32829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f32830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f32831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f32832d;

    public C3440jq(Sp sp2, Provider provider, Provider provider2, Provider provider3) {
        this.f32829a = sp2;
        this.f32830b = provider;
        this.f32831c = provider2;
        this.f32832d = provider3;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Gq get() {
        return a(this.f32829a, (InterfaceC3051ak) this.f32830b.get(), (C4104z8) this.f32831c.get(), (Kp) this.f32832d.get());
    }

    public static C3440jq a(Sp sp2, Provider provider, Provider provider2, Provider provider3) {
        return new C3440jq(sp2, provider, provider2, provider3);
    }

    public static Gq a(Sp sp2, InterfaceC3051ak interfaceC3051ak, C4104z8 c4104z8, Kp kp2) {
        return (Gq) qj0.h.d(sp2.a(interfaceC3051ak, c4104z8, kp2));
    }
}
