package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class ZB implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BB f30005a;

    public ZB(BB bb2) {
        this.f30005a = bb2;
    }

    public static C3720qB b(BB bb2) {
        return (C3720qB) qj0.h.d(bb2.d());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3720qB get() {
        return b(this.f30005a);
    }

    public static ZB a(BB bb2) {
        return new ZB(bb2);
    }
}
