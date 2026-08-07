package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Qt implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Et f27535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f27536b;

    public Qt(Et et2, Provider provider) {
        this.f27535a = et2;
        this.f27536b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Kv get() {
        return a(this.f27535a, (InterfaceC3997wo) this.f27536b.get());
    }

    public static Qt a(Et et2, Provider provider) {
        return new Qt(et2, provider);
    }

    public static Kv a(Et et2, InterfaceC3997wo interfaceC3997wo) {
        return (Kv) qj0.h.d(et2.b(interfaceC3997wo));
    }
}
