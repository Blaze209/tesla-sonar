package com.fourthline.vision.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class B0 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A0 f37633a;

    public B0(A0 a11) {
        this.f37633a = a11;
    }

    public static sx.a b(A0 a11) {
        return (sx.a) qj0.h.d(a11.provideBarcodeScanner());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public sx.a get() {
        return b(this.f37633a);
    }

    public static B0 a(A0 a11) {
        return new B0(a11);
    }
}
