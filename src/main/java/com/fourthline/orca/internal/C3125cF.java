package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.cF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3125cF implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final YE f30844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f30845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f30846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f30847d;

    public C3125cF(YE ye2, Provider provider, Provider provider2, Provider provider3) {
        this.f30844a = ye2;
        this.f30845b = provider;
        this.f30846c = provider2;
        this.f30847d = provider3;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Gl get() {
        return a(this.f30844a, (Gl) this.f30845b.get(), (wn0.a) this.f30846c.get(), (C3438jo) this.f30847d.get());
    }

    public static C3125cF a(YE ye2, Provider provider, Provider provider2, Provider provider3) {
        return new C3125cF(ye2, provider, provider2, provider3);
    }

    public static Gl a(YE ye2, Gl gl2, wn0.a aVar, C3438jo c3438jo) {
        return (Gl) qj0.h.d(ye2.b(gl2, aVar, c3438jo));
    }
}
