package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ay, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3065ay implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Yx f30529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f30530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f30531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f30532d;

    public C3065ay(Yx yx2, Provider provider, Provider provider2, Provider provider3) {
        this.f30529a = yx2;
        this.f30530b = provider;
        this.f30531c = provider2;
        this.f30532d = provider3;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3663oy get() {
        return a(this.f30529a, (Xx) this.f30530b.get(), (E6) this.f30531c.get(), ((Boolean) this.f30532d.get()).booleanValue());
    }

    public static C3065ay a(Yx yx2, Provider provider, Provider provider2, Provider provider3) {
        return new C3065ay(yx2, provider, provider2, provider3);
    }

    public static InterfaceC3663oy a(Yx yx2, Xx xx2, E6 e11, boolean z11) {
        return (InterfaceC3663oy) qj0.h.d(yx2.a(xx2, e11, z11));
    }
}
