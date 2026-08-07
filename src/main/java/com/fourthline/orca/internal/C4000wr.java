package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.wr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4000wr implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3357hr f36539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f36540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f36541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f36542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f36543e;

    public C4000wr(C3357hr c3357hr, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f36539a = c3357hr;
        this.f36540b = provider;
        this.f36541c = provider2;
        this.f36542d = provider3;
        this.f36543e = provider4;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ED get() {
        return a(this.f36539a, (C3485ks) this.f36540b.get(), (C3228er) this.f36541c.get(), (Vf) this.f36542d.get(), (InterfaceC3645og) this.f36543e.get());
    }

    public static C4000wr a(C3357hr c3357hr, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new C4000wr(c3357hr, provider, provider2, provider3, provider4);
    }

    public static ED a(C3357hr c3357hr, C3485ks c3485ks, C3228er c3228er, Vf vf2, InterfaceC3645og interfaceC3645og) {
        return (ED) qj0.h.d(c3357hr.a(c3485ks, c3228er, vf2, interfaceC3645og));
    }
}
