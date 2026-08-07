package com.fourthline.orca.internal;

import java.util.List;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Bz implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3965vz f25156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f25157b;

    public Bz(C3965vz c3965vz, Provider provider) {
        this.f25156a = c3965vz;
        this.f25157b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3930v7 get() {
        return a(this.f25156a, (List) this.f25157b.get());
    }

    public static Bz a(C3965vz c3965vz, Provider provider) {
        return new Bz(c3965vz, provider);
    }

    public static C3930v7 a(C3965vz c3965vz, List list) {
        return (C3930v7) qj0.h.d(c3965vz.a(list));
    }
}
