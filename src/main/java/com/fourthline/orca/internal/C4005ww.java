package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ww, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4005ww implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3489kw f36609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f36610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f36611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f36612d;

    public C4005ww(C3489kw c3489kw, Provider provider, Provider provider2, Provider provider3) {
        this.f36609a = c3489kw;
        this.f36610b = provider;
        this.f36611c = provider2;
        this.f36612d = provider3;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Zv get() {
        return a(this.f36609a, (Dt) this.f36610b.get(), (Gl) this.f36611c.get(), (InterfaceC3617nv) this.f36612d.get());
    }

    public static C4005ww a(C3489kw c3489kw, Provider provider, Provider provider2, Provider provider3) {
        return new C4005ww(c3489kw, provider, provider2, provider3);
    }

    public static Zv a(C3489kw c3489kw, Dt dt2, Gl gl2, InterfaceC3617nv interfaceC3617nv) {
        return (Zv) qj0.h.d(c3489kw.a(dt2, gl2, interfaceC3617nv));
    }
}
