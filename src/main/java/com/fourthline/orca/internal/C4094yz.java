package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.yz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4094yz implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3965vz f37157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f37158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f37159c;

    public C4094yz(C3965vz c3965vz, Provider provider, Provider provider2) {
        this.f37157a = c3965vz;
        this.f37158b = provider;
        this.f37159c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3921uz get() {
        return a(this.f37157a, (C3889u9) this.f37158b.get(), (WC) this.f37159c.get());
    }

    public static C4094yz a(C3965vz c3965vz, Provider provider, Provider provider2) {
        return new C4094yz(c3965vz, provider, provider2);
    }

    public static InterfaceC3921uz a(C3965vz c3965vz, C3889u9 c3889u9, WC wc2) {
        return (InterfaceC3921uz) qj0.h.d(c3965vz.a(c3889u9, wc2));
    }
}
