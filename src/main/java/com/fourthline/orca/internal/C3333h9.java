package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.h9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3333h9 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K8 f32234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f32235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f32236c;

    public C3333h9(K8 k11, Provider provider, Provider provider2) {
        this.f32234a = k11;
        this.f32235b = provider;
        this.f32236c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4093yy get() {
        return a(this.f32234a, (C4104z8) this.f32235b.get(), (InterfaceC3429jf) this.f32236c.get());
    }

    public static C3333h9 a(K8 k11, Provider provider, Provider provider2) {
        return new C3333h9(k11, provider, provider2);
    }

    public static C4093yy a(K8 k11, C4104z8 c4104z8, InterfaceC3429jf interfaceC3429jf) {
        return (C4093yy) qj0.h.d(k11.a(c4104z8, interfaceC3429jf));
    }
}
