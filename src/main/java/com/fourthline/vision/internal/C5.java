package com.fourthline.vision.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class C5 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4297u5 f37646a;

    public C5(C4297u5 c4297u5) {
        this.f37646a = c4297u5;
    }

    public static C4323y3 b(C4297u5 c4297u5) {
        return (C4323y3) qj0.h.d(c4297u5.provideMetadataRepository());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4323y3 get() {
        return b(this.f37646a);
    }

    public static C5 a(C4297u5 c4297u5) {
        return new C5(c4297u5);
    }
}
