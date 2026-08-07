package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3793s implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3152d f35184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f35185b;

    public C3793s(C3152d c3152d, Provider provider) {
        this.f35184a = c3152d;
        this.f35185b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3997wo get() {
        return a(this.f35184a, (Ts) this.f35185b.get());
    }

    public static C3793s a(C3152d c3152d, Provider provider) {
        return new C3793s(c3152d, provider);
    }

    public static InterfaceC3997wo a(C3152d c3152d, Ts ts2) {
        return (InterfaceC3997wo) qj0.h.d(c3152d.a(ts2));
    }
}
