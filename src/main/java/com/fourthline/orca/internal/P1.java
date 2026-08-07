package com.fourthline.orca.internal;

import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class P1 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4097z1 f27266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f27267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f27268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f27269d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f27270e;

    public P1(C4097z1 c4097z1, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f27266a = c4097z1;
        this.f27267b = provider;
        this.f27268c = provider2;
        this.f27269d = provider3;
        this.f27270e = provider4;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public J2 get() {
        return a(this.f27266a, (wn0.a) this.f27267b.get(), (InterfaceC3839t2) this.f27268c.get(), (W0) this.f27269d.get(), (CoroutineScope) this.f27270e.get());
    }

    public static P1 a(C4097z1 c4097z1, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new P1(c4097z1, provider, provider2, provider3, provider4);
    }

    public static J2 a(C4097z1 c4097z1, wn0.a aVar, InterfaceC3839t2 interfaceC3839t2, W0 w11, CoroutineScope coroutineScope) {
        return (J2) qj0.h.d(c4097z1.a(aVar, interfaceC3839t2, w11, coroutineScope));
    }
}
