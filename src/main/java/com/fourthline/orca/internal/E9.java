package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class E9 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C9 f25577a;

    public E9(C9 c11) {
        this.f25577a = c11;
    }

    public static W6 b(C9 c11) {
        return (W6) qj0.h.d(c11.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public W6 get() {
        return b(this.f25577a);
    }

    public static E9 a(C9 c11) {
        return new E9(c11);
    }
}
