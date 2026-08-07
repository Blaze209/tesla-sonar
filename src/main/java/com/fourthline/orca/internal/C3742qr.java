package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.qr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3742qr implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3357hr f34884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f34885b;

    public C3742qr(C3357hr c3357hr, Provider provider) {
        this.f34884a = c3357hr;
        this.f34885b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Cr get() {
        return a(this.f34884a, (C3528ls) this.f34885b.get());
    }

    public static C3742qr a(C3357hr c3357hr, Provider provider) {
        return new C3742qr(c3357hr, provider);
    }

    public static Cr a(C3357hr c3357hr, C3528ls c3528ls) {
        return (Cr) qj0.h.d(c3357hr.a(c3528ls));
    }
}
