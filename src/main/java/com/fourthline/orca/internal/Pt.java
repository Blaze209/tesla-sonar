package com.fourthline.orca.internal;

import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class Pt implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Et f27387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f27388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f27389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f27390d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f27391e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f27392f;

    public Pt(Et et2, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f27387a = et2;
        this.f27388b = provider;
        this.f27389c = provider2;
        this.f27390d = provider3;
        this.f27391e = provider4;
        this.f27392f = provider5;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC2931Re get() {
        return a(this.f27387a, (Kv) this.f27388b.get(), (Lv) this.f27389c.get(), (Bs) this.f27390d.get(), (C3046af) this.f27391e.get(), (CoroutineScope) this.f27392f.get());
    }

    public static Pt a(Et et2, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new Pt(et2, provider, provider2, provider3, provider4, provider5);
    }

    public static InterfaceC2931Re a(Et et2, Kv kv2, Lv lv2, Bs bs2, C3046af c3046af, CoroutineScope coroutineScope) {
        return (InterfaceC2931Re) qj0.h.d(et2.a(kv2, lv2, bs2, c3046af, coroutineScope));
    }
}
