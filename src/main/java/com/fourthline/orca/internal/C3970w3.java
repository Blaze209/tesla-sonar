package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.w3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3970w3 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3712q3 f36325a;

    public C3970w3(C3712q3 c3712q3) {
        this.f36325a = c3712q3;
    }

    public static C2899Lc b(C3712q3 c3712q3) {
        return (C2899Lc) qj0.h.d(c3712q3.e());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2899Lc get() {
        return b(this.f36325a);
    }

    public static C3970w3 a(C3712q3 c3712q3) {
        return new C3970w3(c3712q3);
    }
}
