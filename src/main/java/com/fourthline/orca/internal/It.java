package com.fourthline.orca.internal;

import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class It implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Et f26380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f26381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f26382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f26383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f26384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f26385f;

    public It(Et et2, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f26380a = et2;
        this.f26381b = provider;
        this.f26382c = provider2;
        this.f26383d = provider3;
        this.f26384e = provider4;
        this.f26385f = provider5;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC2931Re get() {
        return a(this.f26380a, (C3701pt) this.f26381b.get(), (C3744qt) this.f26382c.get(), (Bs) this.f26383d.get(), (C3046af) this.f26384e.get(), (CoroutineScope) this.f26385f.get());
    }

    public static It a(Et et2, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new It(et2, provider, provider2, provider3, provider4, provider5);
    }

    public static InterfaceC2931Re a(Et et2, C3701pt c3701pt, C3744qt c3744qt, Bs bs2, C3046af c3046af, CoroutineScope coroutineScope) {
        return (InterfaceC2931Re) qj0.h.d(et2.a(c3701pt, c3744qt, bs2, c3046af, coroutineScope));
    }
}
