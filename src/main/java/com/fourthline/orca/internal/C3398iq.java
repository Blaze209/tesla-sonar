package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.iq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3398iq implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Sp f32577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f32578b;

    public C3398iq(Sp sp2, Provider provider) {
        this.f32577a = sp2;
        this.f32578b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Bq get() {
        return a(this.f32577a, (C3438jo) this.f32578b.get());
    }

    public static C3398iq a(Sp sp2, Provider provider) {
        return new C3398iq(sp2, provider);
    }

    public static Bq a(Sp sp2, C3438jo c3438jo) {
        return (Bq) qj0.h.d(sp2.b(c3438jo));
    }
}
