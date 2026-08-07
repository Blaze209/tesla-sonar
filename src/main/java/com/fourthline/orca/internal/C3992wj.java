package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.wj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3992wj implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3691pj f36492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f36493b;

    public C3992wj(C3691pj c3691pj, Provider provider) {
        this.f36492a = c3691pj;
        this.f36493b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Nj get() {
        return a(this.f36492a, (Uj) this.f36493b.get());
    }

    public static C3992wj a(C3691pj c3691pj, Provider provider) {
        return new C3992wj(c3691pj, provider);
    }

    public static Nj a(C3691pj c3691pj, Uj uj2) {
        return (Nj) qj0.h.d(c3691pj.a(uj2));
    }
}
