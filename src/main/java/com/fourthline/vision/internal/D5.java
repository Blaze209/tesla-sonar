package com.fourthline.vision.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class D5 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4297u5 f37655a;

    public D5(C4297u5 c4297u5) {
        this.f37655a = c4297u5;
    }

    public static Q5 b(C4297u5 c4297u5) {
        return (Q5) qj0.h.d(c4297u5.provideTriggerRepository());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Q5 get() {
        return b(this.f37655a);
    }

    public static D5 a(C4297u5 c4297u5) {
        return new D5(c4297u5);
    }
}
