package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3537m0 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3494l0 f33470a;

    public C3537m0(C3494l0 c3494l0) {
        this.f33470a = c3494l0;
    }

    public static C3687pf b(C3494l0 c3494l0) {
        return (C3687pf) qj0.h.d(c3494l0.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3687pf get() {
        return b(this.f33470a);
    }

    public static C3537m0 a(C3494l0 c3494l0) {
        return new C3537m0(c3494l0);
    }
}
