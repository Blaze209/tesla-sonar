package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.lh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3517lh implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3474kh f33320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f33321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f33322c;

    public C3517lh(C3474kh c3474kh, Provider provider, Provider provider2) {
        this.f33320a = c3474kh;
        this.f33321b = provider;
        this.f33322c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public XC get() {
        return a(this.f33320a, (InterfaceC3051ak) this.f33321b.get(), (Gl) this.f33322c.get());
    }

    public static C3517lh a(C3474kh c3474kh, Provider provider, Provider provider2) {
        return new C3517lh(c3474kh, provider, provider2);
    }

    public static XC a(C3474kh c3474kh, InterfaceC3051ak interfaceC3051ak, Gl gl2) {
        return (XC) qj0.h.d(c3474kh.a(interfaceC3051ak, gl2));
    }
}
