package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class S1 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4097z1 f27706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f27707b;

    public S1(C4097z1 c4097z1, Provider provider) {
        this.f27706a = c4097z1;
        this.f27707b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public L2 get() {
        return a(this.f27706a, (W0) this.f27707b.get());
    }

    public static S1 a(C4097z1 c4097z1, Provider provider) {
        return new S1(c4097z1, provider);
    }

    public static L2 a(C4097z1 c4097z1, W0 w11) {
        return (L2) qj0.h.d(c4097z1.d(w11));
    }
}
