package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class J5 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final H5 f26432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f26433b;

    public J5(H5 h11, Provider provider) {
        this.f26432a = h11;
        this.f26433b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public D5 get() {
        return a(this.f26432a, (Rw) this.f26433b.get());
    }

    public static J5 a(H5 h11, Provider provider) {
        return new J5(h11, provider);
    }

    public static D5 a(H5 h11, Rw rw2) {
        return (D5) qj0.h.d(h11.a(rw2));
    }
}
