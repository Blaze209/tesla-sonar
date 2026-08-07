package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.yw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4091yw implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3489kw f37138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f37139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f37140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f37141d;

    public C4091yw(C3489kw c3489kw, Provider provider, Provider provider2, Provider provider3) {
        this.f37138a = c3489kw;
        this.f37139b = provider;
        this.f37140c = provider2;
        this.f37141d = provider3;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3233ew get() {
        return a(this.f37138a, (Dt) this.f37139b.get(), (Gl) this.f37140c.get(), (InterfaceC3617nv) this.f37141d.get());
    }

    public static C4091yw a(C3489kw c3489kw, Provider provider, Provider provider2, Provider provider3) {
        return new C4091yw(c3489kw, provider, provider2, provider3);
    }

    public static InterfaceC3233ew a(C3489kw c3489kw, Dt dt2, Gl gl2, InterfaceC3617nv interfaceC3617nv) {
        return (InterfaceC3233ew) qj0.h.d(c3489kw.c(dt2, gl2, interfaceC3617nv));
    }
}
