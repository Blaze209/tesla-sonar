package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class WB implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BB f29482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f29483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f29484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f29485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f29486e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f29487f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider f29488g;

    public WB(BB bb2, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.f29482a = bb2;
        this.f29483b = provider;
        this.f29484c = provider2;
        this.f29485d = provider3;
        this.f29486e = provider4;
        this.f29487f = provider5;
        this.f29488g = provider6;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3591nB get() {
        return a(this.f29482a, (Cy) this.f29483b.get(), (InterfaceC3335hB) this.f29484c.get(), (InterfaceC3463kC) this.f29485d.get(), (AbstractC3292gB) this.f29486e.get(), (InterfaceC3732qh) this.f29487f.get(), (C3438jo) this.f29488g.get());
    }

    public static WB a(BB bb2, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        return new WB(bb2, provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static C3591nB a(BB bb2, Cy cy2, InterfaceC3335hB interfaceC3335hB, InterfaceC3463kC interfaceC3463kC, AbstractC3292gB abstractC3292gB, InterfaceC3732qh interfaceC3732qh, C3438jo c3438jo) {
        return (C3591nB) qj0.h.d(bb2.a(cy2, interfaceC3335hB, interfaceC3463kC, abstractC3292gB, interfaceC3732qh, c3438jo));
    }
}
