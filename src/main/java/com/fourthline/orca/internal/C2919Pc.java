package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Pc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2919Pc implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2909Nc f27329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f27330b;

    public C2919Pc(C2909Nc c2909Nc, Provider provider) {
        this.f27329a = c2909Nc;
        this.f27330b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Q3 get() {
        return a(this.f27329a, (C2899Lc) this.f27330b.get());
    }

    public static C2919Pc a(C2909Nc c2909Nc, Provider provider) {
        return new C2919Pc(c2909Nc, provider);
    }

    public static Q3 a(C2909Nc c2909Nc, C2899Lc c2899Lc) {
        return (Q3) qj0.h.d(c2909Nc.b(c2899Lc));
    }
}
