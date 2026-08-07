package com.fourthline.vision.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class C0 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A0 f37643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f37644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f37645c;

    public C0(A0 a11, Provider provider, Provider provider2) {
        this.f37643a = a11;
        this.f37644b = provider;
        this.f37645c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC4287t2 get() {
        return a(this.f37643a, (zx.d) this.f37644b.get(), (S3) this.f37645c.get());
    }

    public static C0 a(A0 a11, Provider provider, Provider provider2) {
        return new C0(a11, provider, provider2);
    }

    public static InterfaceC4287t2 a(A0 a11, zx.d dVar, S3 s11) {
        return (InterfaceC4287t2) qj0.h.d(a11.provideFastFaceDetector(dVar, s11));
    }
}
