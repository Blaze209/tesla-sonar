package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.sw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3832sw implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3489kw f35418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f35419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f35420c;

    public C3832sw(C3489kw c3489kw, Provider provider, Provider provider2) {
        this.f35418a = c3489kw;
        this.f35419b = provider;
        this.f35420c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3746qv get() {
        return a(this.f35418a, (Dt) this.f35419b.get(), (Gl) this.f35420c.get());
    }

    public static C3832sw a(C3489kw c3489kw, Provider provider, Provider provider2) {
        return new C3832sw(c3489kw, provider, provider2);
    }

    public static InterfaceC3746qv a(C3489kw c3489kw, Dt dt2, Gl gl2) {
        return (InterfaceC3746qv) qj0.h.d(c3489kw.b(dt2, gl2));
    }
}
