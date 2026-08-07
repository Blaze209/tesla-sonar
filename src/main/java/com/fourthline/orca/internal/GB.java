package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class GB implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BB f25926a;

    public GB(BB bb2) {
        this.f25926a = bb2;
    }

    public static C3677pB b(BB bb2) {
        return (C3677pB) qj0.h.d(bb2.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3677pB get() {
        return b(this.f25926a);
    }

    public static GB a(BB bb2) {
        return new GB(bb2);
    }
}
