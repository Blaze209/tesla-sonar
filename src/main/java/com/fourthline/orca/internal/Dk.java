package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Dk implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4079yk f25475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f25476b;

    public Dk(C4079yk c4079yk, Provider provider) {
        this.f25475a = c4079yk;
        this.f25476b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public HA get() {
        return a(this.f25475a, (lq.b) this.f25476b.get());
    }

    public static Dk a(C4079yk c4079yk, Provider provider) {
        return new Dk(c4079yk, provider);
    }

    public static HA a(C4079yk c4079yk, lq.b bVar) {
        return (HA) qj0.h.d(c4079yk.a(bVar));
    }
}
