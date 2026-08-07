package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.g3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3284g3 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3156d3 f31928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f31929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f31930c;

    public C3284g3(C3156d3 c3156d3, Provider provider, Provider provider2) {
        this.f31928a = c3156d3;
        this.f31929b = provider;
        this.f31930c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3791ry get() {
        return a(this.f31928a, (Uj) this.f31929b.get(), (InterfaceC3732qh) this.f31930c.get());
    }

    public static C3284g3 a(C3156d3 c3156d3, Provider provider, Provider provider2) {
        return new C3284g3(c3156d3, provider, provider2);
    }

    public static InterfaceC3791ry a(C3156d3 c3156d3, Uj uj2, InterfaceC3732qh interfaceC3732qh) {
        return (InterfaceC3791ry) qj0.h.d(c3156d3.a(uj2, interfaceC3732qh));
    }
}
