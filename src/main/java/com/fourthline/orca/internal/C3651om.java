package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.om, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3651om implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Zl f34327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f34328b;

    public C3651om(Zl zl2, Provider provider) {
        this.f34327a = zl2;
        this.f34328b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ND get() {
        return a(this.f34327a, (Ul) this.f34328b.get());
    }

    public static C3651om a(Zl zl2, Provider provider) {
        return new C3651om(zl2, provider);
    }

    public static ND a(Zl zl2, Ul ul2) {
        return (ND) qj0.h.d(zl2.a(ul2));
    }
}
