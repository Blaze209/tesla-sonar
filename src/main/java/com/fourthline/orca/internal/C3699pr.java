package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.pr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3699pr implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3357hr f34628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f34629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f34630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f34631d;

    public C3699pr(C3357hr c3357hr, Provider provider, Provider provider2, Provider provider3) {
        this.f34628a = c3357hr;
        this.f34629b = provider;
        this.f34630c = provider2;
        this.f34631d = provider3;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3991wi get() {
        return a(this.f34628a, (C3092bi) this.f34629b.get(), (C3101br) this.f34630c.get(), (C3314gr) this.f34631d.get());
    }

    public static C3699pr a(C3357hr c3357hr, Provider provider, Provider provider2, Provider provider3) {
        return new C3699pr(c3357hr, provider, provider2, provider3);
    }

    public static C3991wi a(C3357hr c3357hr, C3092bi c3092bi, C3101br c3101br, C3314gr c3314gr) {
        return (C3991wi) qj0.h.d(c3357hr.a(c3092bi, c3101br, c3314gr));
    }
}
