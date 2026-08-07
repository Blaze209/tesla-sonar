package com.plaid.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.plaid.internal.z5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4595z5 implements qj0.e<W4> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4515q5 f48282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<H5> f48283b;

    public C4595z5(C4515q5 c4515q5, Provider<H5> provider) {
        this.f48282a = c4515q5;
        this.f48283b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C4515q5 c4515q5 = this.f48282a;
        H5 storage = this.f48283b.get();
        c4515q5.getClass();
        p013kotlin.jvm.internal.s.k(storage, "storage");
        return (W4) qj0.h.d(new W4(storage));
    }
}
