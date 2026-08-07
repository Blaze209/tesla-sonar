package com.fourthline.orca.internal;

import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.fourthline.orca.internal.fn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3267fn implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Qm f31793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f31794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f31795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f31796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f31797e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f31798f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider f31799g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Provider f31800h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Provider f31801i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Provider f31802j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Provider f31803k;

    public C3267fn(Qm qm2, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10) {
        this.f31793a = qm2;
        this.f31794b = provider;
        this.f31795c = provider2;
        this.f31796d = provider3;
        this.f31797e = provider4;
        this.f31798f = provider5;
        this.f31799g = provider6;
        this.f31800h = provider7;
        this.f31801i = provider8;
        this.f31802j = provider9;
        this.f31803k = provider10;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Pn get() {
        return a(this.f31793a, (Ln) this.f31794b.get(), (ND) this.f31795c.get(), (Gn) this.f31796d.get(), (InterfaceC2931Re) this.f31797e.get(), (ED) this.f31798f.get(), (C4125zn) this.f31799g.get(), (C4087ys) this.f31800h.get(), (CoroutineScope) this.f31801i.get(), (Uj) this.f31802j.get(), (InterfaceC3732qh) this.f31803k.get());
    }

    public static C3267fn a(Qm qm2, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10) {
        return new C3267fn(qm2, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    public static Pn a(Qm qm2, Ln ln2, ND nd2, Gn gn2, InterfaceC2931Re interfaceC2931Re, ED ed2, C4125zn c4125zn, C4087ys c4087ys, CoroutineScope coroutineScope, Uj uj2, InterfaceC3732qh interfaceC3732qh) {
        return (Pn) qj0.h.d(qm2.a(ln2, nd2, gn2, interfaceC2931Re, ed2, c4125zn, c4087ys, coroutineScope, uj2, interfaceC3732qh));
    }
}
