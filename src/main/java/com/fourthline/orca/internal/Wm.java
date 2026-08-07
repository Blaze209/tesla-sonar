package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Wm implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Qm f29584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f29585b;

    public Wm(Qm qm2, Provider provider) {
        this.f29584a = qm2;
        this.f29585b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3523ln get() {
        return a(this.f29584a, (C3438jo) this.f29585b.get());
    }

    public static Wm a(Qm qm2, Provider provider) {
        return new Wm(qm2, provider);
    }

    public static C3523ln a(Qm qm2, C3438jo c3438jo) {
        return (C3523ln) qj0.h.d(qm2.a(c3438jo));
    }
}
