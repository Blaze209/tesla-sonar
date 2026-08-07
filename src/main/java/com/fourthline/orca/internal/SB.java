package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class SB implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BB f27740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f27741b;

    public SB(BB bb2, Provider provider) {
        this.f27740a = bb2;
        this.f27741b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ZA get() {
        return a(this.f27740a, (C3438jo) this.f27741b.get());
    }

    public static SB a(BB bb2, Provider provider) {
        return new SB(bb2, provider);
    }

    public static ZA a(BB bb2, C3438jo c3438jo) {
        return (ZA) qj0.h.d(bb2.a(c3438jo));
    }
}
