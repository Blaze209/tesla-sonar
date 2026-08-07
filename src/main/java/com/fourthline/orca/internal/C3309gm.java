package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.gm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3309gm implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Zl f32053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f32054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f32055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f32056d;

    public C3309gm(Zl zl2, Provider provider, Provider provider2, Provider provider3) {
        this.f32053a = zl2;
        this.f32054b = provider;
        this.f32055c = provider2;
        this.f32056d = provider3;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4038xm get() {
        return a(this.f32053a, (O3) this.f32054b.get(), (C3438jo) this.f32055c.get(), (InterfaceC3732qh) this.f32056d.get());
    }

    public static C3309gm a(Zl zl2, Provider provider, Provider provider2, Provider provider3) {
        return new C3309gm(zl2, provider, provider2, provider3);
    }

    public static C4038xm a(Zl zl2, O3 o11, C3438jo c3438jo, InterfaceC3732qh interfaceC3732qh) {
        return (C4038xm) qj0.h.d(zl2.a(o11, c3438jo, interfaceC3732qh));
    }
}
