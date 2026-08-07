package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.wz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4008wz implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3965vz f36630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f36631b;

    public C4008wz(C3965vz c3965vz, Provider provider) {
        this.f36630a = c3965vz;
        this.f36631b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3921uz get() {
        return a(this.f36630a, (ou.m) this.f36631b.get());
    }

    public static C4008wz a(C3965vz c3965vz, Provider provider) {
        return new C4008wz(c3965vz, provider);
    }

    public static InterfaceC3921uz a(C3965vz c3965vz, ou.m mVar) {
        return (InterfaceC3921uz) qj0.h.d(c3965vz.a(mVar));
    }
}
