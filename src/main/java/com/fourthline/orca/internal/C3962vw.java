package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.vw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3962vw implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3489kw f36302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f36303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f36304c;

    public C3962vw(C3489kw c3489kw, Provider provider, Provider provider2) {
        this.f36302a = c3489kw;
        this.f36303b = provider;
        this.f36304c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Uv get() {
        return a(this.f36302a, (Tv) this.f36303b.get(), (InterfaceC3617nv) this.f36304c.get());
    }

    public static C3962vw a(C3489kw c3489kw, Provider provider, Provider provider2) {
        return new C3962vw(c3489kw, provider, provider2);
    }

    public static Uv a(C3489kw c3489kw, Tv tv2, InterfaceC3617nv interfaceC3617nv) {
        return (Uv) qj0.h.d(c3489kw.a(tv2, interfaceC3617nv));
    }
}
