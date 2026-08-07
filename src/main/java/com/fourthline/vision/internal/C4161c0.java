package com.fourthline.vision.internal;

/* JADX INFO: renamed from: com.fourthline.vision.internal.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4161c0 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final L f38188a;

    public C4161c0(L l11) {
        this.f38188a = l11;
    }

    public static C4213i4 b(L l11) {
        return (C4213i4) qj0.h.d(l11.provideScannerConfig());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4213i4 get() {
        return b(this.f38188a);
    }

    public static C4161c0 a(L l11) {
        return new C4161c0(l11);
    }
}
