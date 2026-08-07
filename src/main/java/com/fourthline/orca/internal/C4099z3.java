package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.z3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4099z3 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3712q3 f37191a;

    public C4099z3(C3712q3 c3712q3) {
        this.f37191a = c3712q3;
    }

    public static C3404ix b(C3712q3 c3712q3) {
        return (C3404ix) qj0.h.d(c3712q3.g());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3404ix get() {
        return b(this.f37191a);
    }

    public static C4099z3 a(C3712q3 c3712q3) {
        return new C4099z3(c3712q3);
    }
}
