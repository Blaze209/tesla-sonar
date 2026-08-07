package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class FB implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BB f25791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f25792b;

    public FB(BB bb2, Provider provider) {
        this.f25791a = bb2;
        this.f25792b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3341hb get() {
        return a(this.f25791a, (C4104z8) this.f25792b.get());
    }

    public static FB a(BB bb2, Provider provider) {
        return new FB(bb2, provider);
    }

    public static C3341hb a(BB bb2, C4104z8 c4104z8) {
        return (C3341hb) qj0.h.d(bb2.b(c4104z8));
    }
}
