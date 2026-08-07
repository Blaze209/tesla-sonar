package com.fourthline.vision.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class D0 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A0 f37649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f37650b;

    public D0(A0 a11, Provider provider) {
        this.f37649a = a11;
        this.f37650b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public zx.d get() {
        return a(this.f37649a, (C4213i4) this.f37650b.get());
    }

    public static D0 a(A0 a11, Provider provider) {
        return new D0(a11, provider);
    }

    public static zx.d a(A0 a11, C4213i4 c4213i4) {
        return (zx.d) qj0.h.d(a11.provideMlKitFastFaceDetector(c4213i4));
    }
}
