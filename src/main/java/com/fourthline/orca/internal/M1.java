package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class M1 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4097z1 f26880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f26881b;

    public M1(C4097z1 c4097z1, Provider provider) {
        this.f26880a = c4097z1;
        this.f26881b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public E2 get() {
        return a(this.f26880a, (Uj) this.f26881b.get());
    }

    public static M1 a(C4097z1 c4097z1, Provider provider) {
        return new M1(c4097z1, provider);
    }

    public static E2 a(C4097z1 c4097z1, Uj uj2) {
        return (E2) qj0.h.d(c4097z1.b(uj2));
    }
}
