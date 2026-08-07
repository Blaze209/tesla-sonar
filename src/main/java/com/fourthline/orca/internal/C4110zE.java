package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.zE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4110zE implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3808sE f37243a;

    public C4110zE(C3808sE c3808sE) {
        this.f37243a = c3808sE;
    }

    public static NE b(C3808sE c3808sE) {
        return (NE) qj0.h.d(c3808sE.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public NE get() {
        return b(this.f37243a);
    }

    public static C4110zE a(C3808sE c3808sE) {
        return new C4110zE(c3808sE);
    }
}
