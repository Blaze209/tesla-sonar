package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.h7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3331h7 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Z6 f32207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f32208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f32209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f32210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f32211e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f32212f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider f32213g;

    public C3331h7(Z6 z11, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.f32207a = z11;
        this.f32208b = provider;
        this.f32209c = provider2;
        this.f32210d = provider3;
        this.f32211e = provider4;
        this.f32212f = provider5;
        this.f32213g = provider6;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC4044xs get() {
        return a(this.f32207a, (C4087ys) this.f32208b.get(), (Fs) this.f32209c.get(), (InterfaceC3212eb) this.f32210d.get(), (ND) this.f32211e.get(), (InterfaceC3732qh) this.f32212f.get(), (W6) this.f32213g.get());
    }

    public static C3331h7 a(Z6 z11, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        return new C3331h7(z11, provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static InterfaceC4044xs a(Z6 z11, C4087ys c4087ys, Fs fs2, InterfaceC3212eb interfaceC3212eb, ND nd2, InterfaceC3732qh interfaceC3732qh, W6 w11) {
        return (InterfaceC4044xs) qj0.h.d(z11.a(c4087ys, fs2, interfaceC3212eb, nd2, interfaceC3732qh, w11));
    }
}
