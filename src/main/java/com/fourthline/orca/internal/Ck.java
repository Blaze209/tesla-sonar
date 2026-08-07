package com.fourthline.orca.internal;

import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class Ck implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4079yk f25228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f25229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f25230c;

    public Ck(C4079yk c4079yk, Provider provider, Provider provider2) {
        this.f25228a = c4079yk;
        this.f25229b = provider;
        this.f25230c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3863tk get() {
        return a(this.f25228a, (Zj) this.f25229b.get(), (CoroutineScope) this.f25230c.get());
    }

    public static Ck a(C4079yk c4079yk, Provider provider, Provider provider2) {
        return new Ck(c4079yk, provider, provider2);
    }

    public static InterfaceC3863tk a(C4079yk c4079yk, Zj zj2, CoroutineScope coroutineScope) {
        return (InterfaceC3863tk) qj0.h.d(c4079yk.a(zj2, coroutineScope));
    }
}
