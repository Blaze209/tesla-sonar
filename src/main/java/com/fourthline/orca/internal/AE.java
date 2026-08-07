package com.fourthline.orca.internal;

import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class AE implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3808sE f24919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f24920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f24921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f24922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f24923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f24924f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider f24925g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Provider f24926h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Provider f24927i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Provider f24928j;

    public AE(C3808sE c3808sE, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9) {
        this.f24919a = c3808sE;
        this.f24920b = provider;
        this.f24921c = provider2;
        this.f24922d = provider3;
        this.f24923e = provider4;
        this.f24924f = provider5;
        this.f24925g = provider6;
        this.f24926h = provider7;
        this.f24927i = provider8;
        this.f24928j = provider9;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public OE get() {
        return a(this.f24919a, (KE) this.f24920b.get(), (InterfaceC3051ak) this.f24921c.get(), (InterfaceC3955vp) this.f24922d.get(), (NE) this.f24923e.get(), (QE) this.f24924f.get(), (InterfaceC4044xs) this.f24925g.get(), (EE) this.f24926h.get(), (C3723qE) this.f24927i.get(), (CoroutineScope) this.f24928j.get());
    }

    public static AE a(C3808sE c3808sE, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9) {
        return new AE(c3808sE, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static OE a(C3808sE c3808sE, KE ke2, InterfaceC3051ak interfaceC3051ak, InterfaceC3955vp interfaceC3955vp, NE ne2, QE qe2, InterfaceC4044xs interfaceC4044xs, EE ee2, C3723qE c3723qE, CoroutineScope coroutineScope) {
        return (OE) qj0.h.d(c3808sE.a(ke2, interfaceC3051ak, interfaceC3955vp, ne2, qe2, interfaceC4044xs, ee2, c3723qE, coroutineScope));
    }
}
