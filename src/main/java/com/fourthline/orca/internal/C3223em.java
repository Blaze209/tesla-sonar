package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.em, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3223em implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Zl f31476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f31477b;

    public C3223em(Zl zl2, Provider provider) {
        this.f31476a = zl2;
        this.f31477b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public O3 get() {
        return a(this.f31476a, (C4104z8) this.f31477b.get());
    }

    public static C3223em a(Zl zl2, Provider provider) {
        return new C3223em(zl2, provider);
    }

    public static O3 a(Zl zl2, C4104z8 c4104z8) {
        return (O3) qj0.h.d(zl2.a(c4104z8));
    }
}
