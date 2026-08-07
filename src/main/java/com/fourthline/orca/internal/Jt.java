package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class Jt implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Et f26504a;

    public Jt(Et et2) {
        this.f26504a = et2;
    }

    public static C3701pt b(Et et2) {
        return (C3701pt) qj0.h.d(et2.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3701pt get() {
        return b(this.f26504a);
    }

    public static Jt a(Et et2) {
        return new Jt(et2);
    }
}
