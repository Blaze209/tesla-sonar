package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Yl implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Vl f29893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f29894b;

    public Yl(Vl vl2, Provider provider) {
        this.f29893a = vl2;
        this.f29894b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Fm get() {
        return a(this.f29893a, (ND) this.f29894b.get());
    }

    public static Yl a(Vl vl2, Provider provider) {
        return new Yl(vl2, provider);
    }

    public static Fm a(Vl vl2, ND nd2) {
        return (Fm) qj0.h.d(vl2.a(nd2));
    }
}
