package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class BF implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4025xF f25083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f25084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f25085c;

    public BF(C4025xF c4025xF, Provider provider, Provider provider2) {
        this.f25083a = c4025xF;
        this.f25084b = provider;
        this.f25085c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3559mg get() {
        return a(this.f25083a, (InterfaceC3051ak) this.f25084b.get(), (Gl) this.f25085c.get());
    }

    public static BF a(C4025xF c4025xF, Provider provider, Provider provider2) {
        return new BF(c4025xF, provider, provider2);
    }

    public static InterfaceC3559mg a(C4025xF c4025xF, InterfaceC3051ak interfaceC3051ak, Gl gl2) {
        return (InterfaceC3559mg) qj0.h.d(c4025xF.a(interfaceC3051ak, gl2));
    }
}
