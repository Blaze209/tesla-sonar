package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.m5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3542m5 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3286g5 f33510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f33511b;

    public C3542m5(C3286g5 c3286g5, Provider provider) {
        this.f33510a = c3286g5;
        this.f33511b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3158d5 get() {
        return a(this.f33510a, (InterfaceC3051ak) this.f33511b.get());
    }

    public static C3542m5 a(C3286g5 c3286g5, Provider provider) {
        return new C3542m5(c3286g5, provider);
    }

    public static C3158d5 a(C3286g5 c3286g5, InterfaceC3051ak interfaceC3051ak) {
        return (C3158d5) qj0.h.d(c3286g5.a(interfaceC3051ak));
    }
}
