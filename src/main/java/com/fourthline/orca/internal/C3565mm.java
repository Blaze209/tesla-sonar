package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.mm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3565mm implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Zl f33615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f33616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f33617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f33618d;

    public C3565mm(Zl zl2, Provider provider, Provider provider2, Provider provider3) {
        this.f33615a = zl2;
        this.f33616b = provider;
        this.f33617c = provider2;
        this.f33618d = provider3;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Gn get() {
        return a(this.f33615a, (C4104z8) this.f33616b.get(), (Kp) this.f33617c.get(), (Cm) this.f33618d.get());
    }

    public static C3565mm a(Zl zl2, Provider provider, Provider provider2, Provider provider3) {
        return new C3565mm(zl2, provider, provider2, provider3);
    }

    public static Gn a(Zl zl2, C4104z8 c4104z8, Kp kp2, Cm cm2) {
        return (Gn) qj0.h.d(zl2.a(c4104z8, kp2, cm2));
    }
}
