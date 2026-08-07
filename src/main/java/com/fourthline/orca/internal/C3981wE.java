package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.wE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3981wE implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3808sE f36399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f36400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f36401c;

    public C3981wE(C3808sE c3808sE, Provider provider, Provider provider2) {
        this.f36399a = c3808sE;
        this.f36400b = provider;
        this.f36401c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC4044xs get() {
        return a(this.f36399a, (C4087ys) this.f36400b.get(), (C3723qE) this.f36401c.get());
    }

    public static C3981wE a(C3808sE c3808sE, Provider provider, Provider provider2) {
        return new C3981wE(c3808sE, provider, provider2);
    }

    public static InterfaceC4044xs a(C3808sE c3808sE, C4087ys c4087ys, C3723qE c3723qE) {
        return (InterfaceC4044xs) qj0.h.d(c3808sE.a(c4087ys, c3723qE));
    }
}
