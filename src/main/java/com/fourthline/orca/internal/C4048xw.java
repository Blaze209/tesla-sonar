package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.xw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4048xw implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3489kw f36841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f36842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f36843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f36844d;

    public C4048xw(C3489kw c3489kw, Provider provider, Provider provider2, Provider provider3) {
        this.f36841a = c3489kw;
        this.f36842b = provider;
        this.f36843c = provider2;
        this.f36844d = provider3;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3106bw get() {
        return a(this.f36841a, (Dt) this.f36842b.get(), (Gl) this.f36843c.get(), (InterfaceC3617nv) this.f36844d.get());
    }

    public static C4048xw a(C3489kw c3489kw, Provider provider, Provider provider2, Provider provider3) {
        return new C4048xw(c3489kw, provider, provider2, provider3);
    }

    public static InterfaceC3106bw a(C3489kw c3489kw, Dt dt2, Gl gl2, InterfaceC3617nv interfaceC3617nv) {
        return (InterfaceC3106bw) qj0.h.d(c3489kw.b(dt2, gl2, interfaceC3617nv));
    }
}
