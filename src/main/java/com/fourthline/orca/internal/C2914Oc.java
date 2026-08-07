package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Oc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2914Oc implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2909Nc f27160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f27161b;

    public C2914Oc(C2909Nc c2909Nc, Provider provider) {
        this.f27160a = c2909Nc;
        this.f27161b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public O3 get() {
        return a(this.f27160a, (C2899Lc) this.f27161b.get());
    }

    public static C2914Oc a(C2909Nc c2909Nc, Provider provider) {
        return new C2914Oc(c2909Nc, provider);
    }

    public static O3 a(C2909Nc c2909Nc, C2899Lc c2899Lc) {
        return (O3) qj0.h.d(c2909Nc.a(c2899Lc));
    }
}
