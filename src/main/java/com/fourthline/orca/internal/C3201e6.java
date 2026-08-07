package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.e6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3201e6 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Y5 f31339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f31340b;

    public C3201e6(Y5 y11, Provider provider) {
        this.f31339a = y11;
        this.f31340b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public VC get() {
        return a(this.f31339a, (E6) this.f31340b.get());
    }

    public static C3201e6 a(Y5 y11, Provider provider) {
        return new C3201e6(y11, provider);
    }

    public static VC a(Y5 y11, E6 e11) {
        return (VC) qj0.h.d(y11.a(e11));
    }
}
