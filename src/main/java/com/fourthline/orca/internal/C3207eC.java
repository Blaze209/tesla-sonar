package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.eC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3207eC implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BB f31364a;

    public C3207eC(BB bb2) {
        this.f31364a = bb2;
    }

    public static InterfaceC3463kC b(BB bb2) {
        return (InterfaceC3463kC) qj0.h.d(bb2.e());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3463kC get() {
        return b(this.f31364a);
    }

    public static C3207eC a(BB bb2) {
        return new C3207eC(bb2);
    }
}
