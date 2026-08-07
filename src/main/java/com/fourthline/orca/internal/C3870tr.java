package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.tr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3870tr implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3357hr f35703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f35704b;

    public C3870tr(C3357hr c3357hr, Provider provider) {
        this.f35703a = c3357hr;
        this.f35704b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3485ks get() {
        return a(this.f35703a, (InterfaceC3051ak) this.f35704b.get());
    }

    public static C3870tr a(C3357hr c3357hr, Provider provider) {
        return new C3870tr(c3357hr, provider);
    }

    public static C3485ks a(C3357hr c3357hr, InterfaceC3051ak interfaceC3051ak) {
        return (C3485ks) qj0.h.d(c3357hr.a(interfaceC3051ak));
    }
}
