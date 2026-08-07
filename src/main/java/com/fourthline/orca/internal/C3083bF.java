package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.bF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3083bF implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final YE f30596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f30597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f30598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f30599d;

    public C3083bF(YE ye2, Provider provider, Provider provider2, Provider provider3) {
        this.f30596a = ye2;
        this.f30597b = provider;
        this.f30598c = provider2;
        this.f30599d = provider3;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Gl get() {
        return a(this.f30596a, (Gl) this.f30597b.get(), (wn0.a) this.f30598c.get(), (C3438jo) this.f30599d.get());
    }

    public static C3083bF a(YE ye2, Provider provider, Provider provider2, Provider provider3) {
        return new C3083bF(ye2, provider, provider2, provider3);
    }

    public static Gl a(YE ye2, Gl gl2, wn0.a aVar, C3438jo c3438jo) {
        return (Gl) qj0.h.d(ye2.a(gl2, aVar, c3438jo));
    }
}
