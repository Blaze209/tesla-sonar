package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.kq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3483kq implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Sp f33040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f33041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f33042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f33043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f33044e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f33045f;

    public C3483kq(Sp sp2, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f33040a = sp2;
        this.f33041b = provider;
        this.f33042c = provider2;
        this.f33043d = provider3;
        this.f33044e = provider4;
        this.f33045f = provider5;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Jq get() {
        return a(this.f33040a, (C3438jo) this.f33041b.get(), (Gq) this.f33042c.get(), (InterfaceC3732qh) this.f33043d.get(), (C3208eD) this.f33044e.get(), (Nf) this.f33045f.get());
    }

    public static C3483kq a(Sp sp2, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new C3483kq(sp2, provider, provider2, provider3, provider4, provider5);
    }

    public static Jq a(Sp sp2, C3438jo c3438jo, Gq gq2, InterfaceC3732qh interfaceC3732qh, C3208eD c3208eD, Nf nf2) {
        return (Jq) qj0.h.d(sp2.a(c3438jo, gq2, interfaceC3732qh, c3208eD, nf2));
    }
}
