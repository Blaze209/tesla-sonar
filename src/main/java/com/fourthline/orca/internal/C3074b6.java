package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.b6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3074b6 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Y5 f30560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f30561b;

    public C3074b6(Y5 y11, Provider provider) {
        this.f30560a = y11;
        this.f30561b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public wn0.a get() {
        return a(this.f30560a, (InterfaceC3051ak) this.f30561b.get());
    }

    public static C3074b6 a(Y5 y11, Provider provider) {
        return new C3074b6(y11, provider);
    }

    public static wn0.a a(Y5 y11, InterfaceC3051ak interfaceC3051ak) {
        return (wn0.a) qj0.h.d(y11.a(interfaceC3051ak));
    }
}
