package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.cC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3122cC implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BB f30821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f30822b;

    public C3122cC(BB bb2, Provider provider) {
        this.f30821a = bb2;
        this.f30822b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3092bi get() {
        return a(this.f30821a, (C3438jo) this.f30822b.get());
    }

    public static C3122cC a(BB bb2, Provider provider) {
        return new C3122cC(bb2, provider);
    }

    public static C3092bi a(BB bb2, C3438jo c3438jo) {
        return (C3092bi) qj0.h.d(bb2.b(c3438jo));
    }
}
