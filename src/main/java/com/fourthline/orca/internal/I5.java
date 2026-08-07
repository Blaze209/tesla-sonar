package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class I5 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final H5 f26260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f26261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f26262c;

    public I5(H5 h11, Provider provider, Provider provider2) {
        this.f26260a = h11;
        this.f26261b = provider;
        this.f26262c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C5 get() {
        return a(this.f26260a, (Rw) this.f26261b.get(), (P5) this.f26262c.get());
    }

    public static I5 a(H5 h11, Provider provider, Provider provider2) {
        return new I5(h11, provider, provider2);
    }

    public static C5 a(H5 h11, Rw rw2, P5 p11) {
        return (C5) qj0.h.d(h11.a(rw2, p11));
    }
}
