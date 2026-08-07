package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class X implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O f29640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f29641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f29642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f29643d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f29644e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f29645f;

    public X(O o11, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f29640a = o11;
        this.f29641b = provider;
        this.f29642c = provider2;
        this.f29643d = provider3;
        this.f29644e = provider4;
        this.f29645f = provider5;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Gi get() {
        return a(this.f29640a, (G) this.f29641b.get(), (InterfaceC3732qh) this.f29642c.get(), (O5) this.f29643d.get(), (wn0.a) this.f29644e.get(), (C3438jo) this.f29645f.get());
    }

    public static X a(O o11, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new X(o11, provider, provider2, provider3, provider4, provider5);
    }

    public static Gi a(O o11, G g11, InterfaceC3732qh interfaceC3732qh, O5 o12, wn0.a aVar, C3438jo c3438jo) {
        return (Gi) qj0.h.d(o11.a(g11, interfaceC3732qh, o12, aVar, c3438jo));
    }
}
