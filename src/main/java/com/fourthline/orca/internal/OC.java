package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class OC implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LC f27142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f27143b;

    public OC(LC lc2, Provider provider) {
        this.f27142a = lc2;
        this.f27143b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public TC get() {
        return a(this.f27142a, (Uj) this.f27143b.get());
    }

    public static OC a(LC lc2, Provider provider) {
        return new OC(lc2, provider);
    }

    public static TC a(LC lc2, Uj uj2) {
        return (TC) qj0.h.d(lc2.a(uj2));
    }
}
