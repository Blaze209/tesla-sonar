package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class G7 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F7 f25912a;

    public G7(F7 f11) {
        this.f25912a = f11;
    }

    public static A9 b(F7 f11) {
        return (A9) qj0.h.d(f11.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public A9 get() {
        return b(this.f25912a);
    }

    public static G7 a(F7 f11) {
        return new G7(f11);
    }
}
