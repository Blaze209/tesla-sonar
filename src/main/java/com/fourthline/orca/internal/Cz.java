package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Cz implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3965vz f25293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f25294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f25295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f25296d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f25297e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f25298f;

    public Cz(C3965vz c3965vz, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f25293a = c3965vz;
        this.f25294b = provider;
        this.f25295c = provider2;
        this.f25296d = provider3;
        this.f25297e = provider4;
        this.f25298f = provider5;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public WC get() {
        return a(this.f25293a, (wn0.a) this.f25294b.get(), (W6) this.f25295c.get(), (ou.m) this.f25296d.get(), (InterfaceC3212eb) this.f25297e.get(), (Gl) this.f25298f.get());
    }

    public static Cz a(C3965vz c3965vz, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new Cz(c3965vz, provider, provider2, provider3, provider4, provider5);
    }

    public static WC a(C3965vz c3965vz, wn0.a aVar, W6 w11, ou.m mVar, InterfaceC3212eb interfaceC3212eb, Gl gl2) {
        return (WC) qj0.h.d(c3965vz.a(aVar, w11, mVar, interfaceC3212eb, gl2));
    }
}
