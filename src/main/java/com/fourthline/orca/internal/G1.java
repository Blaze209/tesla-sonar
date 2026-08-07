package com.fourthline.orca.internal;

import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class G1 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4097z1 f25888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f25889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f25890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f25891d;

    public G1(C4097z1 c4097z1, Provider provider, Provider provider2, Provider provider3) {
        this.f25888a = c4097z1;
        this.f25889b = provider;
        this.f25890c = provider2;
        this.f25891d = provider3;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3991wi.e get() {
        return a(this.f25888a, (W0) this.f25889b.get(), (InterfaceC4044xs) this.f25890c.get(), (CoroutineScope) this.f25891d.get());
    }

    public static G1 a(C4097z1 c4097z1, Provider provider, Provider provider2, Provider provider3) {
        return new G1(c4097z1, provider, provider2, provider3);
    }

    public static C3991wi.e a(C4097z1 c4097z1, W0 w11, InterfaceC4044xs interfaceC4044xs, CoroutineScope coroutineScope) {
        return (C3991wi.e) qj0.h.d(c4097z1.a(w11, interfaceC4044xs, coroutineScope));
    }
}
