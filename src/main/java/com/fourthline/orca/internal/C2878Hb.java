package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Hb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2878Hb implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3811sb f26101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f26102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f26103c;

    public C2878Hb(C3811sb c3811sb, Provider provider, Provider provider2) {
        this.f26101a = c3811sb;
        this.f26102b = provider;
        this.f26103c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3469kc get() {
        return a(this.f26101a, (InterfaceC3084ba) this.f26102b.get(), (InterfaceC3732qh) this.f26103c.get());
    }

    public static C2878Hb a(C3811sb c3811sb, Provider provider, Provider provider2) {
        return new C2878Hb(c3811sb, provider, provider2);
    }

    public static C3469kc a(C3811sb c3811sb, InterfaceC3084ba interfaceC3084ba, InterfaceC3732qh interfaceC3732qh) {
        return (C3469kc) qj0.h.d(c3811sb.a(interfaceC3084ba, interfaceC3732qh));
    }
}
