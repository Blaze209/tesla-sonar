package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Gt implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Et f26008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f26009b;

    public Gt(Et et2, Provider provider) {
        this.f26008a = et2;
        this.f26009b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3131cf get() {
        return a(this.f26008a, (ND) this.f26009b.get());
    }

    public static Gt a(Et et2, Provider provider) {
        return new Gt(et2, provider);
    }

    public static InterfaceC3131cf a(Et et2, ND nd2) {
        return (InterfaceC3131cf) qj0.h.d(et2.a(nd2));
    }
}
