package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.gF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3296gF implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3253fF f31980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f31981b;

    public C3296gF(C3253fF c3253fF, Provider provider) {
        this.f31980a = c3253fF;
        this.f31981b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public wn0.a get() {
        return a(this.f31980a, (InterfaceC3051ak) this.f31981b.get());
    }

    public static C3296gF a(C3253fF c3253fF, Provider provider) {
        return new C3296gF(c3253fF, provider);
    }

    public static wn0.a a(C3253fF c3253fF, InterfaceC3051ak interfaceC3051ak) {
        return (wn0.a) qj0.h.d(c3253fF.a(interfaceC3051ak));
    }
}
