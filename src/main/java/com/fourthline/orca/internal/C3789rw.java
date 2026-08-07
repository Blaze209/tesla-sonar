package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.rw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3789rw implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3489kw f35170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f35171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f35172c;

    public C3789rw(C3489kw c3489kw, Provider provider, Provider provider2) {
        this.f35170a = c3489kw;
        this.f35171b = provider;
        this.f35172c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3703pv get() {
        return a(this.f35170a, (Dt) this.f35171b.get(), (Gl) this.f35172c.get());
    }

    public static C3789rw a(C3489kw c3489kw, Provider provider, Provider provider2) {
        return new C3789rw(c3489kw, provider, provider2);
    }

    public static InterfaceC3703pv a(C3489kw c3489kw, Dt dt2, Gl gl2) {
        return (InterfaceC3703pv) qj0.h.d(c3489kw.a(dt2, gl2));
    }
}
