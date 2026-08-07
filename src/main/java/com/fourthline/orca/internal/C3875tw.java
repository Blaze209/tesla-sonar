package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.tw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3875tw implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3489kw f35754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f35755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f35756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f35757d;

    public C3875tw(C3489kw c3489kw, Provider provider, Provider provider2, Provider provider3) {
        this.f35754a = c3489kw;
        this.f35755b = provider;
        this.f35756c = provider2;
        this.f35757d = provider3;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3788rv get() {
        return a(this.f35754a, (InterfaceC3746qv) this.f35755b.get(), (At) this.f35756c.get(), (Bt) this.f35757d.get());
    }

    public static C3875tw a(C3489kw c3489kw, Provider provider, Provider provider2, Provider provider3) {
        return new C3875tw(c3489kw, provider, provider2, provider3);
    }

    public static InterfaceC3788rv a(C3489kw c3489kw, InterfaceC3746qv interfaceC3746qv, At at2, Bt bt2) {
        return (InterfaceC3788rv) qj0.h.d(c3489kw.a(interfaceC3746qv, at2, bt2));
    }
}
