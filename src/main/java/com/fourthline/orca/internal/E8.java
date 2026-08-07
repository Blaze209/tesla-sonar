package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class E8 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C8 f25575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f25576b;

    public E8(C8 c11, Provider provider) {
        this.f25575a = c11;
        this.f25576b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Ni get() {
        return a(this.f25575a, (C4061y8) this.f25576b.get());
    }

    public static E8 a(C8 c11, Provider provider) {
        return new E8(c11, provider);
    }

    public static Ni a(C8 c11, C4061y8 c4061y8) {
        return (Ni) qj0.h.d(c11.b(c4061y8));
    }
}
