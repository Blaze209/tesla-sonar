package com.fourthline.orca.internal;

import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.fourthline.orca.internal.lr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3527lr implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3357hr f33388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f33389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f33390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f33391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f33392e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f33393f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider f33394g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Provider f33395h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Provider f33396i;

    public C3527lr(C3357hr c3357hr, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8) {
        this.f33388a = c3357hr;
        this.f33389b = provider;
        this.f33390c = provider2;
        this.f33391d = provider3;
        this.f33392e = provider4;
        this.f33393f = provider5;
        this.f33394g = provider6;
        this.f33395h = provider7;
        this.f33396i = provider8;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Gr get() {
        return a(this.f33388a, (Fr) this.f33389b.get(), (Lq) this.f33390c.get(), (C3101br) this.f33391d.get(), (ED) this.f33392e.get(), (Cr) this.f33393f.get(), (Dr) this.f33394g.get(), (InterfaceC4044xs) this.f33395h.get(), (CoroutineScope) this.f33396i.get());
    }

    public static C3527lr a(C3357hr c3357hr, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8) {
        return new C3527lr(c3357hr, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static Gr a(C3357hr c3357hr, Fr fr2, Lq lq2, C3101br c3101br, ED ed2, Cr cr2, Dr dr2, InterfaceC4044xs interfaceC4044xs, CoroutineScope coroutineScope) {
        return (Gr) qj0.h.d(c3357hr.a(fr2, lq2, c3101br, ed2, cr2, dr2, interfaceC4044xs, coroutineScope));
    }
}
