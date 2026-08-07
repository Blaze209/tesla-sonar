package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.gn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3310gn implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Qm f32058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f32059b;

    public C3310gn(Qm qm2, Provider provider) {
        this.f32058a = qm2;
        this.f32059b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ND get() {
        return a(this.f32058a, (Lm) this.f32059b.get());
    }

    public static C3310gn a(Qm qm2, Provider provider) {
        return new C3310gn(qm2, provider);
    }

    public static ND a(Qm qm2, Lm lm2) {
        return (ND) qj0.h.d(qm2.a(lm2));
    }
}
