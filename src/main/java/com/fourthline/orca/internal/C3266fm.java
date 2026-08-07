package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.fm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3266fm implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Zl f31790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f31791b;

    public C3266fm(Zl zl2, Provider provider) {
        this.f31790a = zl2;
        this.f31791b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Q3 get() {
        return a(this.f31790a, (C4104z8) this.f31791b.get());
    }

    public static C3266fm a(Zl zl2, Provider provider) {
        return new C3266fm(zl2, provider);
    }

    public static Q3 a(Zl zl2, C4104z8 c4104z8) {
        return (Q3) qj0.h.d(zl2.b(c4104z8));
    }
}
