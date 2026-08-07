package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class H8 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C8 f26091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f26092b;

    public H8(C8 c11, Provider provider) {
        this.f26091a = c11;
        this.f26092b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Oi get() {
        return a(this.f26091a, (C4061y8) this.f26092b.get());
    }

    public static H8 a(C8 c11, Provider provider) {
        return new H8(c11, provider);
    }

    public static Oi a(C8 c11, C4061y8 c4061y8) {
        return (Oi) qj0.h.d(c11.c(c4061y8));
    }
}
