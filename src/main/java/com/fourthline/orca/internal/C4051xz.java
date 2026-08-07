package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.xz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4051xz implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3965vz f36861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f36862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f36863c;

    public C4051xz(C3965vz c3965vz, Provider provider, Provider provider2) {
        this.f36861a = c3965vz;
        this.f36862b = provider;
        this.f36863c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3408j0 get() {
        return a(this.f36861a, (InterfaceC3212eb) this.f36862b.get(), (DocumentAnalysisConfig) this.f36863c.get());
    }

    public static C4051xz a(C3965vz c3965vz, Provider provider, Provider provider2) {
        return new C4051xz(c3965vz, provider, provider2);
    }

    public static InterfaceC3408j0 a(C3965vz c3965vz, InterfaceC3212eb interfaceC3212eb, DocumentAnalysisConfig documentAnalysisConfig) {
        return (InterfaceC3408j0) qj0.h.d(c3965vz.a(interfaceC3212eb, documentAnalysisConfig));
    }
}
