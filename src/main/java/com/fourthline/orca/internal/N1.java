package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class N1 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4097z1 f26994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f26995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f26996c;

    public N1(C4097z1 c4097z1, Provider provider, Provider provider2) {
        this.f26994a = c4097z1;
        this.f26995b = provider;
        this.f26996c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ED get() {
        return a(this.f26994a, (InterfaceC3051ak) this.f26995b.get(), (InterfaceC3645og) this.f26996c.get());
    }

    public static N1 a(C4097z1 c4097z1, Provider provider, Provider provider2) {
        return new N1(c4097z1, provider, provider2);
    }

    public static ED a(C4097z1 c4097z1, InterfaceC3051ak interfaceC3051ak, InterfaceC3645og interfaceC3645og) {
        return (ED) qj0.h.d(c4097z1.a(interfaceC3051ak, interfaceC3645og));
    }
}
