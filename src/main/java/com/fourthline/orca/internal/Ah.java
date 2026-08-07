package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Ah implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4033xh f24949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f24950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f24951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f24952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f24953e;

    public Ah(C4033xh c4033xh, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f24949a = c4033xh;
        this.f24950b = provider;
        this.f24951c = provider2;
        this.f24952d = provider3;
        this.f24953e = provider4;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ED get() {
        return a(this.f24949a, (C3963vx) this.f24950b.get(), (Kx) this.f24951c.get(), (Vf) this.f24952d.get(), (InterfaceC3645og) this.f24953e.get());
    }

    public static Ah a(C4033xh c4033xh, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new Ah(c4033xh, provider, provider2, provider3, provider4);
    }

    public static ED a(C4033xh c4033xh, C3963vx c3963vx, Kx kx2, Vf vf2, InterfaceC3645og interfaceC3645og) {
        return (ED) qj0.h.d(c4033xh.a(c3963vx, kx2, vf2, interfaceC3645og));
    }
}
