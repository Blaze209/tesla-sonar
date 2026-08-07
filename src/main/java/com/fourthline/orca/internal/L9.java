package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class L9 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C9 f26748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f26749b;

    public L9(C9 c11, Provider provider) {
        this.f26748a = c11;
        this.f26749b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public wn0.a get() {
        return a(this.f26748a, (InterfaceC3051ak) this.f26749b.get());
    }

    public static L9 a(C9 c11, Provider provider) {
        return new L9(c11, provider);
    }

    public static wn0.a a(C9 c11, InterfaceC3051ak interfaceC3051ak) {
        return (wn0.a) qj0.h.d(c11.a(interfaceC3051ak));
    }
}
