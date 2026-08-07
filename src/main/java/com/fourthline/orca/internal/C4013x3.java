package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.x3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4013x3 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3712q3 f36659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f36660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f36661c;

    public C4013x3(C3712q3 c3712q3, Provider provider, Provider provider2) {
        this.f36659a = c3712q3;
        this.f36660b = provider;
        this.f36661c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Cm get() {
        return a(this.f36659a, (A7) this.f36660b.get(), (Kp) this.f36661c.get());
    }

    public static C4013x3 a(C3712q3 c3712q3, Provider provider, Provider provider2) {
        return new C4013x3(c3712q3, provider, provider2);
    }

    public static Cm a(C3712q3 c3712q3, A7 a11, Kp kp2) {
        return (Cm) qj0.h.d(c3712q3.a(a11, kp2));
    }
}
