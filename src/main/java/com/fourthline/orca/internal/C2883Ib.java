package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Ib, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2883Ib implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3811sb f26285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f26286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f26287c;

    public C2883Ib(C3811sb c3811sb, Provider provider, Provider provider2) {
        this.f26285a = c3811sb;
        this.f26286b = provider;
        this.f26287c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ED get() {
        return a(this.f26285a, (InterfaceC4071yc) this.f26286b.get(), (C2938Tb) this.f26287c.get());
    }

    public static C2883Ib a(C3811sb c3811sb, Provider provider, Provider provider2) {
        return new C2883Ib(c3811sb, provider, provider2);
    }

    public static ED a(C3811sb c3811sb, InterfaceC4071yc interfaceC4071yc, C2938Tb c2938Tb) {
        return (ED) qj0.h.d(c3811sb.a(interfaceC4071yc, c2938Tb));
    }
}
