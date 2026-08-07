package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.lm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3522lm implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Zl f33354a;

    public C3522lm(Zl zl2) {
        this.f33354a = zl2;
    }

    public static C4125zn b(Zl zl2) {
        return (C4125zn) qj0.h.d(zl2.b());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4125zn get() {
        return b(this.f33354a);
    }

    public static C3522lm a(Zl zl2) {
        return new C3522lm(zl2);
    }
}
