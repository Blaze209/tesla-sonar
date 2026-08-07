package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class R1 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4097z1 f27585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f27586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f27587c;

    public R1(C4097z1 c4097z1, Provider provider, Provider provider2) {
        this.f27585a = c4097z1;
        this.f27586b = provider;
        this.f27587c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public B2 get() {
        return a(this.f27585a, (W0) this.f27586b.get(), (wn0.a) this.f27587c.get());
    }

    public static R1 a(C4097z1 c4097z1, Provider provider, Provider provider2) {
        return new R1(c4097z1, provider, provider2);
    }

    public static B2 a(C4097z1 c4097z1, W0 w11, wn0.a aVar) {
        return (B2) qj0.h.d(c4097z1.a(w11, aVar));
    }
}
