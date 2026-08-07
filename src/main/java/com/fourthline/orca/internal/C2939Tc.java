package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Tc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2939Tc implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2909Nc f27884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f27885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f27886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f27887d;

    public C2939Tc(C2909Nc c2909Nc, Provider provider, Provider provider2, Provider provider3) {
        this.f27884a = c2909Nc;
        this.f27885b = provider;
        this.f27886c = provider2;
        this.f27887d = provider3;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4038xm get() {
        return a(this.f27884a, (O3) this.f27885b.get(), (C3438jo) this.f27886c.get(), (InterfaceC3732qh) this.f27887d.get());
    }

    public static C2939Tc a(C2909Nc c2909Nc, Provider provider, Provider provider2, Provider provider3) {
        return new C2939Tc(c2909Nc, provider, provider2, provider3);
    }

    public static C4038xm a(C2909Nc c2909Nc, O3 o11, C3438jo c3438jo, InterfaceC3732qh interfaceC3732qh) {
        return (C4038xm) qj0.h.d(c2909Nc.a(o11, c3438jo, interfaceC3732qh));
    }
}
