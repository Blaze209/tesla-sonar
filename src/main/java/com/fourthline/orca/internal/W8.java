package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class W8 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K8 f29461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f29462b;

    public W8(K8 k11, Provider provider) {
        this.f29461a = k11;
        this.f29462b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3553ma get() {
        return a(this.f29461a, (C3438jo) this.f29462b.get());
    }

    public static W8 a(K8 k11, Provider provider) {
        return new W8(k11, provider);
    }

    public static C3553ma a(K8 k11, C3438jo c3438jo) {
        return (C3553ma) qj0.h.d(k11.b(c3438jo));
    }
}
