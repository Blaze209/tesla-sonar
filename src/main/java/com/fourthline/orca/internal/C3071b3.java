package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.b3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3071b3 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3028a3 f30546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f30547b;

    public C3071b3(C3028a3 c3028a3, Provider provider) {
        this.f30546a = c3028a3;
        this.f30547b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3131cf get() {
        return a(this.f30546a, (ND) this.f30547b.get());
    }

    public static C3071b3 a(C3028a3 c3028a3, Provider provider) {
        return new C3071b3(c3028a3, provider);
    }

    public static InterfaceC3131cf a(C3028a3 c3028a3, ND nd2) {
        return (InterfaceC3131cf) qj0.h.d(c3028a3.a(nd2));
    }
}
