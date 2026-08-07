package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ow, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3661ow implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3489kw f34390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f34391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f34392c;

    public C3661ow(C3489kw c3489kw, Provider provider, Provider provider2) {
        this.f34390a = c3489kw;
        this.f34391b = provider;
        this.f34392c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public At get() {
        return a(this.f34390a, (Gl) this.f34391b.get(), (InterfaceC3901uf) this.f34392c.get());
    }

    public static C3661ow a(C3489kw c3489kw, Provider provider, Provider provider2) {
        return new C3661ow(c3489kw, provider, provider2);
    }

    public static At a(C3489kw c3489kw, Gl gl2, InterfaceC3901uf interfaceC3901uf) {
        return (At) qj0.h.d(c3489kw.a(gl2, interfaceC3901uf));
    }
}
