package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.rj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3776rj implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3691pj f35080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f35081b;

    public C3776rj(C3691pj c3691pj, Provider provider) {
        this.f35080a = c3691pj;
        this.f35081b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3562mj get() {
        return a(this.f35080a, (InterfaceC3051ak) this.f35081b.get());
    }

    public static C3776rj a(C3691pj c3691pj, Provider provider) {
        return new C3776rj(c3691pj, provider);
    }

    public static C3562mj a(C3691pj c3691pj, InterfaceC3051ak interfaceC3051ak) {
        return (C3562mj) qj0.h.d(c3691pj.a(interfaceC3051ak));
    }
}
