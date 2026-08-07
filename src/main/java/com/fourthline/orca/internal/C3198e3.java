package com.fourthline.orca.internal;

import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.fourthline.orca.internal.e3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3198e3 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3156d3 f31316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f31317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f31318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f31319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f31320e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f31321f;

    public C3198e3(C3156d3 c3156d3, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f31316a = c3156d3;
        this.f31317b = provider;
        this.f31318c = provider2;
        this.f31319d = provider3;
        this.f31320e = provider4;
        this.f31321f = provider5;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC2931Re get() {
        return a(this.f31316a, (InterfaceC3131cf) this.f31317b.get(), (Bs) this.f31318c.get(), (InterfaceC3216ef) this.f31319d.get(), (C3046af) this.f31320e.get(), (CoroutineScope) this.f31321f.get());
    }

    public static C3198e3 a(C3156d3 c3156d3, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new C3198e3(c3156d3, provider, provider2, provider3, provider4, provider5);
    }

    public static InterfaceC2931Re a(C3156d3 c3156d3, InterfaceC3131cf interfaceC3131cf, Bs bs2, InterfaceC3216ef interfaceC3216ef, C3046af c3046af, CoroutineScope coroutineScope) {
        return (InterfaceC2931Re) qj0.h.d(c3156d3.a(interfaceC3131cf, bs2, interfaceC3216ef, c3046af, coroutineScope));
    }
}
