package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.aj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3050aj implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Xi f30428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f30429b;

    public C3050aj(Xi xi2, Provider provider) {
        this.f30428a = xi2;
        this.f30429b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public wn0.a get() {
        return a(this.f30428a, (C3954vo) this.f30429b.get());
    }

    public static C3050aj a(Xi xi2, Provider provider) {
        return new C3050aj(xi2, provider);
    }

    public static wn0.a a(Xi xi2, C3954vo c3954vo) {
        return (wn0.a) qj0.h.d(xi2.a(c3954vo));
    }
}
