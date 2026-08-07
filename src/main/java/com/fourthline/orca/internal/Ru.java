package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Ru implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3146cu f27680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f27681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f27682c;

    public Ru(C3146cu c3146cu, Provider provider, Provider provider2) {
        this.f27680a = c3146cu;
        this.f27681b = provider;
        this.f27682c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ED get() {
        return a(this.f27680a, (Uv) this.f27681b.get(), (Rv) this.f27682c.get());
    }

    public static Ru a(C3146cu c3146cu, Provider provider, Provider provider2) {
        return new Ru(c3146cu, provider, provider2);
    }

    public static ED a(C3146cu c3146cu, Uv uv2, Rv rv2) {
        return (ED) qj0.h.d(c3146cu.a(uv2, rv2));
    }
}
