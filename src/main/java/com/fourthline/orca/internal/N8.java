package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class N8 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K8 f27029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f27030b;

    public N8(K8 k11, Provider provider) {
        this.f27029a = k11;
        this.f27030b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Y7 get() {
        return a(this.f27029a, (C3438jo) this.f27030b.get());
    }

    public static N8 a(K8 k11, Provider provider) {
        return new N8(k11, provider);
    }

    public static Y7 a(K8 k11, C3438jo c3438jo) {
        return (Y7) qj0.h.d(k11.a(c3438jo));
    }
}
