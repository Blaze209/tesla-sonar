package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Nr implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Hr f27087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f27088b;

    public Nr(Hr hr2, Provider provider) {
        this.f27087a = hr2;
        this.f27088b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Ni get() {
        return a(this.f27087a, (Mq) this.f27088b.get());
    }

    public static Nr a(Hr hr2, Provider provider) {
        return new Nr(hr2, provider);
    }

    public static Ni a(Hr hr2, Mq mq2) {
        return (Ni) qj0.h.d(hr2.b(mq2));
    }
}
