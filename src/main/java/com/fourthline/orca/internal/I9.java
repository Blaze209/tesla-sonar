package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class I9 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C9 f26267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f26268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f26269c;

    public I9(C9 c11, Provider provider, Provider provider2) {
        this.f26267a = c11;
        this.f26268b = provider;
        this.f26269c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3383ia get() {
        return a(this.f26267a, (InterfaceC3051ak) this.f26268b.get(), (C3424ja) this.f26269c.get());
    }

    public static I9 a(C9 c11, Provider provider, Provider provider2) {
        return new I9(c11, provider, provider2);
    }

    public static C3383ia a(C9 c11, InterfaceC3051ak interfaceC3051ak, C3424ja c3424ja) {
        return (C3383ia) qj0.h.d(c11.a(interfaceC3051ak, c3424ja));
    }
}
