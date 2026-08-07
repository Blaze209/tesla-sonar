package com.fourthline.orca.internal;

import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class Xl implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Vl f29743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f29744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f29745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f29746d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f29747e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f29748f;

    public Xl(Vl vl2, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f29743a = vl2;
        this.f29744b = provider;
        this.f29745c = provider2;
        this.f29746d = provider3;
        this.f29747e = provider4;
        this.f29748f = provider5;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC2931Re get() {
        return a(this.f29743a, (Fm) this.f29744b.get(), (Bs) this.f29745c.get(), (Gm) this.f29746d.get(), (C3046af) this.f29747e.get(), (CoroutineScope) this.f29748f.get());
    }

    public static Xl a(Vl vl2, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new Xl(vl2, provider, provider2, provider3, provider4, provider5);
    }

    public static InterfaceC2931Re a(Vl vl2, Fm fm2, Bs bs2, Gm gm2, C3046af c3046af, CoroutineScope coroutineScope) {
        return (InterfaceC2931Re) qj0.h.d(vl2.a(fm2, bs2, gm2, c3046af, coroutineScope));
    }
}
