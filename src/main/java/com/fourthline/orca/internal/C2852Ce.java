package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Ce, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2852Ce implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4116ze f25214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f25215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f25216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f25217d;

    public C2852Ce(C4116ze c4116ze, Provider provider, Provider provider2, Provider provider3) {
        this.f25214a = c4116ze;
        this.f25215b = provider;
        this.f25216c = provider2;
        this.f25217d = provider3;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ED get() {
        return a(this.f25214a, (C3214ed) this.f25215b.get(), (Vf) this.f25216c.get(), (InterfaceC3645og) this.f25217d.get());
    }

    public static C2852Ce a(C4116ze c4116ze, Provider provider, Provider provider2, Provider provider3) {
        return new C2852Ce(c4116ze, provider, provider2, provider3);
    }

    public static ED a(C4116ze c4116ze, C3214ed c3214ed, Vf vf2, InterfaceC3645og interfaceC3645og) {
        return (ED) qj0.h.d(c4116ze.a(c3214ed, vf2, interfaceC3645og));
    }
}
