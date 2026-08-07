package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class A3 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3712q3 f24890a;

    public A3(C3712q3 c3712q3) {
        this.f24890a = c3712q3;
    }

    public static C3490kx b(C3712q3 c3712q3) {
        return (C3490kx) qj0.h.d(c3712q3.h());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3490kx get() {
        return b(this.f24890a);
    }

    public static A3 a(C3712q3 c3712q3) {
        return new A3(c3712q3);
    }
}
