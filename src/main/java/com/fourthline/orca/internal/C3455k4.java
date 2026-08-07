package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.k4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3455k4 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3371i4 f32884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f32885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f32886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f32887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f32888e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f32889f;

    public C3455k4(C3371i4 c3371i4, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f32884a = c3371i4;
        this.f32885b = provider;
        this.f32886c = provider2;
        this.f32887d = provider3;
        this.f32888e = provider4;
        this.f32889f = provider5;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC4044xs get() {
        return a(this.f32884a, (InterfaceC3863tk) this.f32885b.get(), (InterfaceC3051ak) this.f32886c.get(), (InterfaceC3997wo) this.f32887d.get(), (C4087ys) this.f32888e.get(), (InterfaceC3732qh) this.f32889f.get());
    }

    public static C3455k4 a(C3371i4 c3371i4, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new C3455k4(c3371i4, provider, provider2, provider3, provider4, provider5);
    }

    public static InterfaceC4044xs a(C3371i4 c3371i4, InterfaceC3863tk interfaceC3863tk, InterfaceC3051ak interfaceC3051ak, InterfaceC3997wo interfaceC3997wo, C4087ys c4087ys, InterfaceC3732qh interfaceC3732qh) {
        return (InterfaceC4044xs) qj0.h.d(c3371i4.a(interfaceC3863tk, interfaceC3051ak, interfaceC3997wo, c4087ys, interfaceC3732qh));
    }
}
