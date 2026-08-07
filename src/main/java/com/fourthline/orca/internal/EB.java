package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class EB implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BB f25578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f25579b;

    public EB(BB bb2, Provider provider) {
        this.f25578a = bb2;
        this.f25579b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3255fb get() {
        return a(this.f25578a, (C4104z8) this.f25579b.get());
    }

    public static EB a(BB bb2, Provider provider) {
        return new EB(bb2, provider);
    }

    public static C3255fb a(BB bb2, C4104z8 c4104z8) {
        return (C3255fb) qj0.h.d(bb2.a(c4104z8));
    }
}
