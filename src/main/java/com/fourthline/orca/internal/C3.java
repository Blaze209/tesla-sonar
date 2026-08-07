package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class C3 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3712q3 f25172a;

    public C3(C3712q3 c3712q3) {
        this.f25172a = c3712q3;
    }

    public static XA b(C3712q3 c3712q3) {
        return (XA) qj0.h.d(c3712q3.i());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public XA get() {
        return b(this.f25172a);
    }

    public static C3 a(C3712q3 c3712q3) {
        return new C3(c3712q3);
    }
}
