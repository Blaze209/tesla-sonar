package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.pw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3704pw implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3489kw f34647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f34648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f34649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f34650d;

    public C3704pw(C3489kw c3489kw, Provider provider, Provider provider2, Provider provider3) {
        this.f34647a = c3489kw;
        this.f34648b = provider;
        this.f34649c = provider2;
        this.f34650d = provider3;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Bt get() {
        return a(this.f34647a, (Dt) this.f34648b.get(), (Gl) this.f34649c.get(), (InterfaceC3901uf) this.f34650d.get());
    }

    public static C3704pw a(C3489kw c3489kw, Provider provider, Provider provider2, Provider provider3) {
        return new C3704pw(c3489kw, provider, provider2, provider3);
    }

    public static Bt a(C3489kw c3489kw, Dt dt2, Gl gl2, InterfaceC3901uf interfaceC3901uf) {
        return (Bt) qj0.h.d(c3489kw.a(dt2, gl2, interfaceC3901uf));
    }
}
