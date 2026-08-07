package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class T8 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K8 f27843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f27844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f27845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f27846d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f27847e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f27848f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider f27849g;

    public T8(K8 k11, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.f27843a = k11;
        this.f27844b = provider;
        this.f27845c = provider2;
        this.f27846d = provider3;
        this.f27847e = provider4;
        this.f27848f = provider5;
        this.f27849g = provider6;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3546m9 get() {
        return a(this.f27843a, (C4104z8) this.f27844b.get(), (Kp) this.f27845c.get(), (E6) this.f27846d.get(), (Cm) this.f27847e.get(), (InterfaceC4124zm) this.f27848f.get(), ((Boolean) this.f27849g.get()).booleanValue());
    }

    public static T8 a(K8 k11, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        return new T8(k11, provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static InterfaceC3546m9 a(K8 k11, C4104z8 c4104z8, Kp kp2, E6 e11, Cm cm2, InterfaceC4124zm interfaceC4124zm, boolean z11) {
        return (InterfaceC3546m9) qj0.h.d(k11.a(c4104z8, kp2, e11, cm2, interfaceC4124zm, z11));
    }
}
