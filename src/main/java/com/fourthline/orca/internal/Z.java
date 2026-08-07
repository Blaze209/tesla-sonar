package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Z implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O f29952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f29953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f29954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f29955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f29956e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f29957f;

    public Z(O o11, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f29952a = o11;
        this.f29953b = provider;
        this.f29954c = provider2;
        this.f29955d = provider3;
        this.f29956e = provider4;
        this.f29957f = provider5;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ED get() {
        return a(this.f29952a, (wn0.a) this.f29953b.get(), (C4052y) this.f29954c.get(), (L) this.f29955d.get(), (Vf) this.f29956e.get(), (InterfaceC3645og) this.f29957f.get());
    }

    public static Z a(O o11, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new Z(o11, provider, provider2, provider3, provider4, provider5);
    }

    public static ED a(O o11, wn0.a aVar, C4052y c4052y, L l11, Vf vf2, InterfaceC3645og interfaceC3645og) {
        return (ED) qj0.h.d(o11.a(aVar, c4052y, l11, vf2, interfaceC3645og));
    }
}
