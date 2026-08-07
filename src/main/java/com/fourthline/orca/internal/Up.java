package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Up implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Sp f28829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f28830b;

    public Up(Sp sp2, Provider provider) {
        this.f28829a = sp2;
        this.f28830b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Mp get() {
        return a(this.f28829a, (InterfaceC3051ak) this.f28830b.get());
    }

    public static Up a(Sp sp2, Provider provider) {
        return new Up(sp2, provider);
    }

    public static Mp a(Sp sp2, InterfaceC3051ak interfaceC3051ak) {
        return (Mp) qj0.h.d(sp2.a(interfaceC3051ak));
    }
}
