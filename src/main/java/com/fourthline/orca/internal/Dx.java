package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Dx implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Ax f25518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f25519b;

    public Dx(Ax ax2, Provider provider) {
        this.f25518a = ax2;
        this.f25519b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Mx get() {
        return a(this.f25518a, (C3438jo) this.f25519b.get());
    }

    public static Dx a(Ax ax2, Provider provider) {
        return new Dx(ax2, provider);
    }

    public static Mx a(Ax ax2, C3438jo c3438jo) {
        return (Mx) qj0.h.d(ax2.a(c3438jo));
    }
}
