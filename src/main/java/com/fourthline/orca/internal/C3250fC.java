package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.fC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3250fC implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BB f31659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f31660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f31661c;

    public C3250fC(BB bb2, Provider provider, Provider provider2) {
        this.f31659a = bb2;
        this.f31660b = provider;
        this.f31661c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public BC get() {
        return a(this.f31659a, (XA) this.f31660b.get(), (C4104z8) this.f31661c.get());
    }

    public static C3250fC a(BB bb2, Provider provider, Provider provider2) {
        return new C3250fC(bb2, provider, provider2);
    }

    public static BC a(BB bb2, XA xa2, C4104z8 c4104z8) {
        return (BC) qj0.h.d(bb2.a(xa2, c4104z8));
    }
}
