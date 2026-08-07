package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Wi implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Ti f29565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f29566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f29567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f29568d;

    public Wi(Ti ti2, Provider provider, Provider provider2, Provider provider3) {
        this.f29565a = ti2;
        this.f29566b = provider;
        this.f29567c = provider2;
        this.f29568d = provider3;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3081bD get() {
        return a(this.f29565a, (InterfaceC3457k6) this.f29566b.get(), (E6) this.f29567c.get(), (InterfaceC3051ak) this.f29568d.get());
    }

    public static Wi a(Ti ti2, Provider provider, Provider provider2, Provider provider3) {
        return new Wi(ti2, provider, provider2, provider3);
    }

    public static C3081bD a(Ti ti2, InterfaceC3457k6 interfaceC3457k6, E6 e11, InterfaceC3051ak interfaceC3051ak) {
        return (C3081bD) qj0.h.d(ti2.a(interfaceC3457k6, e11, interfaceC3051ak));
    }
}
