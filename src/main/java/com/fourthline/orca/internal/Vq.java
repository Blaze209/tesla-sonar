package com.fourthline.orca.internal;

import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class Vq implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Tq f29193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f29194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f29195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f29196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f29197e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f29198f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider f29199g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Provider f29200h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Provider f29201i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Provider f29202j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Provider f29203k;

    public Vq(Tq tq2, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10) {
        this.f29193a = tq2;
        this.f29194b = provider;
        this.f29195c = provider2;
        this.f29196d = provider3;
        this.f29197e = provider4;
        this.f29198f = provider5;
        this.f29199g = provider6;
        this.f29200h = provider7;
        this.f29201i = provider8;
        this.f29202j = provider9;
        this.f29203k = provider10;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3229es get() {
        return a(this.f29193a, (Ur) this.f29194b.get(), (C3101br) this.f29195c.get(), (C3497l3) this.f29196d.get(), (C3944vf) this.f29197e.get(), (InterfaceC3102bs) this.f29198f.get(), (CoroutineScope) this.f29199g.get(), (InterfaceC3858tf) this.f29200h.get(), (C4087ys) this.f29201i.get(), (InterfaceC3732qh) this.f29202j.get(), (C3186ds) this.f29203k.get());
    }

    public static Vq a(Tq tq2, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10) {
        return new Vq(tq2, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    public static C3229es a(Tq tq2, Ur ur2, C3101br c3101br, C3497l3 c3497l3, C3944vf c3944vf, InterfaceC3102bs interfaceC3102bs, CoroutineScope coroutineScope, InterfaceC3858tf interfaceC3858tf, C4087ys c4087ys, InterfaceC3732qh interfaceC3732qh, C3186ds c3186ds) {
        return (C3229es) qj0.h.d(tq2.a(ur2, c3101br, c3497l3, c3944vf, interfaceC3102bs, coroutineScope, interfaceC3858tf, c4087ys, interfaceC3732qh, c3186ds));
    }
}
