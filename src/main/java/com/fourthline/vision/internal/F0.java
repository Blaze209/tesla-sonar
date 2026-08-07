package com.fourthline.vision.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class F0 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A0 f37688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f37689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f37690c;

    public F0(A0 a11, Provider provider, Provider provider2) {
        this.f37688a = a11;
        this.f37689b = provider;
        this.f37690c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public W3 get() {
        return a(this.f37688a, (sx.a) this.f37689b.get(), (S3) this.f37690c.get());
    }

    public static F0 a(A0 a11, Provider provider, Provider provider2) {
        return new F0(a11, provider, provider2);
    }

    public static W3 a(A0 a11, sx.a aVar, S3 s11) {
        return (W3) qj0.h.d(a11.provideQrCodeTextDetector(aVar, s11));
    }
}
