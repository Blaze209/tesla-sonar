package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.le, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3514le implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3344he f33296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f33297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f33298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f33299d;

    public C3514le(C3344he c3344he, Provider provider, Provider provider2, Provider provider3) {
        this.f33296a = c3344he;
        this.f33297b = provider;
        this.f33298c = provider2;
        this.f33299d = provider3;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Kn get() {
        return a(this.f33296a, (Ln) this.f33297b.get(), (Uj) this.f33298c.get(), (InterfaceC3732qh) this.f33299d.get());
    }

    public static C3514le a(C3344he c3344he, Provider provider, Provider provider2, Provider provider3) {
        return new C3514le(c3344he, provider, provider2, provider3);
    }

    public static Kn a(C3344he c3344he, Ln ln2, Uj uj2, InterfaceC3732qh interfaceC3732qh) {
        return (Kn) qj0.h.d(c3344he.a(ln2, uj2, interfaceC3732qh));
    }
}
