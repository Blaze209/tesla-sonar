package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.rr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3784rr implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3357hr f35139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f35140b;

    public C3784rr(C3357hr c3357hr, Provider provider) {
        this.f35139a = c3357hr;
        this.f35140b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Dr get() {
        return a(this.f35139a, (C4104z8) this.f35140b.get());
    }

    public static C3784rr a(C3357hr c3357hr, Provider provider) {
        return new C3784rr(c3357hr, provider);
    }

    public static Dr a(C3357hr c3357hr, C4104z8 c4104z8) {
        return (Dr) qj0.h.d(c3357hr.a(c4104z8));
    }
}
