package com.fourthline.orca.internal;

import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.fourthline.orca.internal.nm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3608nm implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Zl f33955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f33956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f33957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f33958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f33959e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f33960f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider f33961g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Provider f33962h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Provider f33963i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Provider f33964j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Provider f33965k;

    public C3608nm(Zl zl2, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10) {
        this.f33955a = zl2;
        this.f33956b = provider;
        this.f33957c = provider2;
        this.f33958d = provider3;
        this.f33959e = provider4;
        this.f33960f = provider5;
        this.f33961g = provider6;
        this.f33962h = provider7;
        this.f33963i = provider8;
        this.f33964j = provider9;
        this.f33965k = provider10;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Pn get() {
        return a(this.f33955a, (Ln) this.f33956b.get(), (ND) this.f33957c.get(), (Gn) this.f33958d.get(), (InterfaceC2931Re) this.f33959e.get(), (C4125zn) this.f33960f.get(), (C4087ys) this.f33961g.get(), (CoroutineScope) this.f33962h.get(), (Uj) this.f33963i.get(), (InterfaceC3732qh) this.f33964j.get(), (C3085bb) this.f33965k.get());
    }

    public static C3608nm a(Zl zl2, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10) {
        return new C3608nm(zl2, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    public static Pn a(Zl zl2, Ln ln2, ND nd2, Gn gn2, InterfaceC2931Re interfaceC2931Re, C4125zn c4125zn, C4087ys c4087ys, CoroutineScope coroutineScope, Uj uj2, InterfaceC3732qh interfaceC3732qh, C3085bb c3085bb) {
        return (Pn) qj0.h.d(zl2.a(ln2, nd2, gn2, interfaceC2931Re, c4125zn, c4087ys, coroutineScope, uj2, interfaceC3732qh, c3085bb));
    }
}
