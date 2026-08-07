package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Q8 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K8 f27424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f27425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f27426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f27427d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f27428e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f27429f;

    public Q8(K8 k11, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f27424a = k11;
        this.f27425b = provider;
        this.f27426c = provider2;
        this.f27427d = provider3;
        this.f27428e = provider4;
        this.f27429f = provider5;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3375i8 get() {
        return a(this.f27424a, (InterfaceC3732qh) this.f27425b.get(), (InterfaceC3289g8) this.f27426c.get(), (Z7) this.f27427d.get(), (Nf) this.f27428e.get(), (C3438jo) this.f27429f.get());
    }

    public static Q8 a(K8 k11, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new Q8(k11, provider, provider2, provider3, provider4, provider5);
    }

    public static InterfaceC3375i8 a(K8 k11, InterfaceC3732qh interfaceC3732qh, InterfaceC3289g8 interfaceC3289g8, Z7 z11, Nf nf2, C3438jo c3438jo) {
        return (InterfaceC3375i8) qj0.h.d(k11.a(interfaceC3732qh, interfaceC3289g8, z11, nf2, c3438jo));
    }
}
