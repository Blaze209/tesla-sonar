package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class J1 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4097z1 f26414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f26415b;

    public J1(C4097z1 c4097z1, Provider provider) {
        this.f26414a = c4097z1;
        this.f26415b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3496l2 get() {
        return a(this.f26414a, (Uj) this.f26415b.get());
    }

    public static J1 a(C4097z1 c4097z1, Provider provider) {
        return new J1(c4097z1, provider);
    }

    public static C3496l2 a(C4097z1 c4097z1, Uj uj2) {
        return (C3496l2) qj0.h.d(c4097z1.a(uj2));
    }
}
