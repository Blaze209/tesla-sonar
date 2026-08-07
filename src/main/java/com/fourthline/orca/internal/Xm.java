package com.fourthline.orca.internal;

import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class Xm implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Qm f29749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f29750b;

    public Xm(Qm qm2, Provider provider) {
        this.f29749a = qm2;
        this.f29750b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2874Gc get() {
        return a(this.f29749a, (CoroutineScope) this.f29750b.get());
    }

    public static Xm a(Qm qm2, Provider provider) {
        return new Xm(qm2, provider);
    }

    public static C2874Gc a(Qm qm2, CoroutineScope coroutineScope) {
        return (C2874Gc) qj0.h.d(qm2.a(coroutineScope));
    }
}
