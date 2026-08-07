package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.vj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3948vj implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3691pj f36123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f36124b;

    public C3948vj(C3691pj c3691pj, Provider provider) {
        this.f36123a = c3691pj;
        this.f36124b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Lj get() {
        return a(this.f36123a, (Aj) this.f36124b.get());
    }

    public static C3948vj a(C3691pj c3691pj, Provider provider) {
        return new C3948vj(c3691pj, provider);
    }

    public static Lj a(C3691pj c3691pj, Aj aj2) {
        return (Lj) qj0.h.d(c3691pj.a(aj2));
    }
}
