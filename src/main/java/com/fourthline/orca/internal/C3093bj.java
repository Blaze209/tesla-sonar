package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.bj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3093bj implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Xi f30665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f30666b;

    public C3093bj(Xi xi2, Provider provider) {
        this.f30665a = xi2;
        this.f30666b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3208eD get() {
        return a(this.f30665a, (XA) this.f30666b.get());
    }

    public static C3093bj a(Xi xi2, Provider provider) {
        return new C3093bj(xi2, provider);
    }

    public static C3208eD a(Xi xi2, XA xa2) {
        return (C3208eD) qj0.h.d(xi2.a(xa2));
    }
}
