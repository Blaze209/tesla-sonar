package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.mr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3570mr implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3357hr f33700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f33701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f33702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f33703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f33704e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f33705f;

    public C3570mr(C3357hr c3357hr, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f33700a = c3357hr;
        this.f33701b = provider;
        this.f33702c = provider2;
        this.f33703d = provider3;
        this.f33704e = provider4;
        this.f33705f = provider5;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3101br get() {
        return a(this.f33700a, (InterfaceC3863tk) this.f33701b.get(), (C4087ys) this.f33702c.get(), (Fp) this.f33703d.get(), (Uj) this.f33704e.get(), (InterfaceC3732qh) this.f33705f.get());
    }

    public static C3570mr a(C3357hr c3357hr, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new C3570mr(c3357hr, provider, provider2, provider3, provider4, provider5);
    }

    public static C3101br a(C3357hr c3357hr, InterfaceC3863tk interfaceC3863tk, C4087ys c4087ys, Fp fp2, Uj uj2, InterfaceC3732qh interfaceC3732qh) {
        return (C3101br) qj0.h.d(c3357hr.a(interfaceC3863tk, c4087ys, fp2, uj2, interfaceC3732qh));
    }
}
