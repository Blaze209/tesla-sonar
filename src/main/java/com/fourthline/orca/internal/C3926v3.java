package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.v3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3926v3 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3712q3 f35997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f35998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f35999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f36000d;

    public C3926v3(C3712q3 c3712q3, Provider provider, Provider provider2, Provider provider3) {
        this.f35997a = c3712q3;
        this.f35998b = provider;
        this.f35999c = provider2;
        this.f36000d = provider3;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4104z8 get() {
        return a(this.f35997a, (A7) this.f35998b.get(), (C3404ix) this.f35999c.get(), (Kp) this.f36000d.get());
    }

    public static C3926v3 a(C3712q3 c3712q3, Provider provider, Provider provider2, Provider provider3) {
        return new C3926v3(c3712q3, provider, provider2, provider3);
    }

    public static C4104z8 a(C3712q3 c3712q3, A7 a11, C3404ix c3404ix, Kp kp2) {
        return (C4104z8) qj0.h.d(c3712q3.a(a11, c3404ix, kp2));
    }
}
