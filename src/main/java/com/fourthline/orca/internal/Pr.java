package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Pr implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Hr f27385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f27386b;

    public Pr(Hr hr2, Provider provider) {
        this.f27385a = hr2;
        this.f27386b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Oi get() {
        return a(this.f27385a, (Mq) this.f27386b.get());
    }

    public static Pr a(Hr hr2, Provider provider) {
        return new Pr(hr2, provider);
    }

    public static Oi a(Hr hr2, Mq mq2) {
        return (Oi) qj0.h.d(hr2.c(mq2));
    }
}
