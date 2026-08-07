package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.gC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3293gC implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BB f31976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f31977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f31978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f31979d;

    public C3293gC(BB bb2, Provider provider, Provider provider2, Provider provider3) {
        this.f31976a = bb2;
        this.f31977b = provider;
        this.f31978c = provider2;
        this.f31979d = provider3;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4064yB get() {
        return a(this.f31976a, (wn0.a) this.f31977b.get(), (XA) this.f31978c.get(), (C4104z8) this.f31979d.get());
    }

    public static C3293gC a(BB bb2, Provider provider, Provider provider2, Provider provider3) {
        return new C3293gC(bb2, provider, provider2, provider3);
    }

    public static C4064yB a(BB bb2, wn0.a aVar, XA xa2, C4104z8 c4104z8) {
        return (C4064yB) qj0.h.d(bb2.a(aVar, xa2, c4104z8));
    }
}
