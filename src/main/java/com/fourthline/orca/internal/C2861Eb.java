package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Eb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2861Eb implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3811sb f25586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f25587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f25588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f25589d;

    public C2861Eb(C3811sb c3811sb, Provider provider, Provider provider2, Provider provider3) {
        this.f25586a = c3811sb;
        this.f25587b = provider;
        this.f25588c = provider2;
        this.f25589d = provider3;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2938Tb get() {
        return a(this.f25586a, (wn0.a) this.f25587b.get(), (InterfaceC4124zm) this.f25588c.get(), (C4104z8) this.f25589d.get());
    }

    public static C2861Eb a(C3811sb c3811sb, Provider provider, Provider provider2, Provider provider3) {
        return new C2861Eb(c3811sb, provider, provider2, provider3);
    }

    public static C2938Tb a(C3811sb c3811sb, wn0.a aVar, InterfaceC4124zm interfaceC4124zm, C4104z8 c4104z8) {
        return (C2938Tb) qj0.h.d(c3811sb.a(aVar, interfaceC4124zm, c4104z8));
    }
}
