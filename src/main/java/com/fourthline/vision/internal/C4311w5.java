package com.fourthline.vision.internal;

/* JADX INFO: renamed from: com.fourthline.vision.internal.w5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4311w5 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4297u5 f39060a;

    public C4311w5(C4297u5 c4297u5) {
        this.f39060a = c4297u5;
    }

    public static C4313x0 b(C4297u5 c4297u5) {
        return (C4313x0) qj0.h.d(c4297u5.provideDebugConsumer());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4313x0 get() {
        return b(this.f39060a);
    }

    public static C4311w5 a(C4297u5 c4297u5) {
        return new C4311w5(c4297u5);
    }
}
