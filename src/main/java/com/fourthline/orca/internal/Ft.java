package com.fourthline.orca.internal;

import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class Ft implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Et f25871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f25872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f25873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f25874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f25875e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f25876f;

    public Ft(Et et2, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f25871a = et2;
        this.f25872b = provider;
        this.f25873c = provider2;
        this.f25874d = provider3;
        this.f25875e = provider4;
        this.f25876f = provider5;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC2931Re get() {
        return a(this.f25871a, (InterfaceC3131cf) this.f25872b.get(), (C3534ly) this.f25873c.get(), (Bs) this.f25874d.get(), (C3046af) this.f25875e.get(), (CoroutineScope) this.f25876f.get());
    }

    public static Ft a(Et et2, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new Ft(et2, provider, provider2, provider3, provider4, provider5);
    }

    public static InterfaceC2931Re a(Et et2, InterfaceC3131cf interfaceC3131cf, C3534ly c3534ly, Bs bs2, C3046af c3046af, CoroutineScope coroutineScope) {
        return (InterfaceC2931Re) qj0.h.d(et2.a(interfaceC3131cf, c3534ly, bs2, c3046af, coroutineScope));
    }
}
