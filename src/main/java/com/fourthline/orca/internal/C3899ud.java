package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ud, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3899ud implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3599nd f35882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f35883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f35884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f35885d;

    public C3899ud(C3599nd c3599nd, Provider provider, Provider provider2, Provider provider3) {
        this.f35882a = c3599nd;
        this.f35883b = provider;
        this.f35884c = provider2;
        this.f35885d = provider3;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3346hg get() {
        return a(this.f35882a, (C2899Lc) this.f35883b.get(), (wn0.a) this.f35884c.get(), (C3257fd) this.f35885d.get());
    }

    public static C3899ud a(C3599nd c3599nd, Provider provider, Provider provider2, Provider provider3) {
        return new C3899ud(c3599nd, provider, provider2, provider3);
    }

    public static InterfaceC3346hg a(C3599nd c3599nd, C2899Lc c2899Lc, wn0.a aVar, C3257fd c3257fd) {
        return (InterfaceC3346hg) qj0.h.d(c3599nd.a(c2899Lc, aVar, c3257fd));
    }
}
