package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class XB implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BB f29708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f29709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f29710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f29711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f29712e;

    public XB(BB bb2, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f29708a = bb2;
        this.f29709b = provider;
        this.f29710c = provider2;
        this.f29711d = provider3;
        this.f29712e = provider4;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ED get() {
        return a(this.f29708a, (YA) this.f29709b.get(), (C4064yB) this.f29710c.get(), (Vf) this.f29711d.get(), (InterfaceC3645og) this.f29712e.get());
    }

    public static XB a(BB bb2, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new XB(bb2, provider, provider2, provider3, provider4);
    }

    public static ED a(BB bb2, YA ya2, C4064yB c4064yB, Vf vf2, InterfaceC3645og interfaceC3645og) {
        return (ED) qj0.h.d(bb2.a(ya2, c4064yB, vf2, interfaceC3645og));
    }
}
