package com.fourthline.orca.internal;

import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class Om implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Mm f27197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f27198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f27199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f27200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f27201e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f27202f;

    public Om(Mm mm2, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f27197a = mm2;
        this.f27198b = provider;
        this.f27199c = provider2;
        this.f27200d = provider3;
        this.f27201e = provider4;
        this.f27202f = provider5;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC2931Re get() {
        return a(this.f27197a, (Fm) this.f27198b.get(), (Bs) this.f27199c.get(), (Gm) this.f27200d.get(), (C3046af) this.f27201e.get(), (CoroutineScope) this.f27202f.get());
    }

    public static Om a(Mm mm2, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new Om(mm2, provider, provider2, provider3, provider4, provider5);
    }

    public static InterfaceC2931Re a(Mm mm2, Fm fm2, Bs bs2, Gm gm2, C3046af c3046af, CoroutineScope coroutineScope) {
        return (InterfaceC2931Re) qj0.h.d(mm2.a(fm2, bs2, gm2, c3046af, coroutineScope));
    }
}
