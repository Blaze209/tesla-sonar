package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class E1 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4097z1 f25538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f25539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f25540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f25541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f25542e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f25543f;

    public E1(C4097z1 c4097z1, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f25538a = c4097z1;
        this.f25539b = provider;
        this.f25540c = provider2;
        this.f25541d = provider3;
        this.f25542e = provider4;
        this.f25543f = provider5;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3538m1 get() {
        return a(this.f25538a, (InterfaceC3452k1) this.f25539b.get(), (InterfaceC3155d2) this.f25540c.get(), (InterfaceC3732qh) this.f25541d.get(), (Uj) this.f25542e.get(), (C3438jo) this.f25543f.get());
    }

    public static E1 a(C4097z1 c4097z1, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new E1(c4097z1, provider, provider2, provider3, provider4, provider5);
    }

    public static C3538m1 a(C4097z1 c4097z1, InterfaceC3452k1 interfaceC3452k1, InterfaceC3155d2 interfaceC3155d2, InterfaceC3732qh interfaceC3732qh, Uj uj2, C3438jo c3438jo) {
        return (C3538m1) qj0.h.d(c4097z1.a(interfaceC3452k1, interfaceC3155d2, interfaceC3732qh, uj2, c3438jo));
    }
}
