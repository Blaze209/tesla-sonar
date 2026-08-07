package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Ab, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2837Ab implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3811sb f24932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f24933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f24934c;

    public C2837Ab(C3811sb c3811sb, Provider provider, Provider provider2) {
        this.f24932a = c3811sb;
        this.f24933b = provider;
        this.f24934c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3947vi get() {
        return a(this.f24932a, (ou.m) this.f24933b.get(), (Uj) this.f24934c.get());
    }

    public static C2837Ab a(C3811sb c3811sb, Provider provider, Provider provider2) {
        return new C2837Ab(c3811sb, provider, provider2);
    }

    public static InterfaceC3947vi a(C3811sb c3811sb, ou.m mVar, Uj uj2) {
        return (InterfaceC3947vi) qj0.h.d(c3811sb.a(mVar, uj2));
    }
}
