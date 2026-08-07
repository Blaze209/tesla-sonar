package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Ir implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Hr f26378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f26379b;

    public Ir(Hr hr2, Provider provider) {
        this.f26378a = hr2;
        this.f26379b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Pi get() {
        return a(this.f26378a, (Mq) this.f26379b.get());
    }

    public static Ir a(Hr hr2, Provider provider) {
        return new Ir(hr2, provider);
    }

    public static Pi a(Hr hr2, Mq mq2) {
        return (Pi) qj0.h.d(hr2.a(mq2));
    }
}
