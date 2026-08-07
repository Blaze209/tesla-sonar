package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class OB implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BB f27140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f27141b;

    public OB(BB bb2, Provider provider) {
        this.f27140a = bb2;
        this.f27141b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Dy get() {
        return a(this.f27140a, (C4104z8) this.f27141b.get());
    }

    public static OB a(BB bb2, Provider provider) {
        return new OB(bb2, provider);
    }

    public static Dy a(BB bb2, C4104z8 c4104z8) {
        return (Dy) qj0.h.d(bb2.d(c4104z8));
    }
}
