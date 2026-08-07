package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.k5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3456k5 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3286g5 f32892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f32893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f32894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f32895d;

    public C3456k5(C3286g5 c3286g5, Provider provider, Provider provider2, Provider provider3) {
        this.f32892a = c3286g5;
        this.f32893b = provider;
        this.f32894c = provider2;
        this.f32895d = provider3;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3243f5 get() {
        return a(this.f32892a, (InterfaceC3863tk) this.f32893b.get(), (C4087ys) this.f32894c.get(), (InterfaceC3732qh) this.f32895d.get());
    }

    public static C3456k5 a(C3286g5 c3286g5, Provider provider, Provider provider2, Provider provider3) {
        return new C3456k5(c3286g5, provider, provider2, provider3);
    }

    public static C3243f5 a(C3286g5 c3286g5, InterfaceC3863tk interfaceC3863tk, C4087ys c4087ys, InterfaceC3732qh interfaceC3732qh) {
        return (C3243f5) qj0.h.d(c3286g5.a(interfaceC3863tk, c4087ys, interfaceC3732qh));
    }
}
