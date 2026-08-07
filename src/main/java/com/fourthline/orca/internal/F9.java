package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class F9 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C9 f25784a;

    public F9(C9 c11) {
        this.f25784a = c11;
    }

    public static C3392ik b(C9 c11) {
        return (C3392ik) qj0.h.d(c11.b());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3392ik get() {
        return b(this.f25784a);
    }

    public static F9 a(C9 c11) {
        return new F9(c11);
    }
}
