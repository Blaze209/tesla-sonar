package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.c3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3113c3 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3028a3 f30779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f30780b;

    public C3113c3(C3028a3 c3028a3, Provider provider) {
        this.f30779a = c3028a3;
        this.f30780b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3216ef get() {
        return a(this.f30779a, (InterfaceC3732qh) this.f30780b.get());
    }

    public static C3113c3 a(C3028a3 c3028a3, Provider provider) {
        return new C3113c3(c3028a3, provider);
    }

    public static InterfaceC3216ef a(C3028a3 c3028a3, InterfaceC3732qh interfaceC3732qh) {
        return (InterfaceC3216ef) qj0.h.d(c3028a3.a(interfaceC3732qh));
    }
}
