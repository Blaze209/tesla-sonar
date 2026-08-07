package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.tb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3854tb implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3811sb f35631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f35632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f35633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f35634d;

    public C3854tb(C3811sb c3811sb, Provider provider, Provider provider2, Provider provider3) {
        this.f35631a = c3811sb;
        this.f35632b = provider;
        this.f35633c = provider2;
        this.f35634d = provider3;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public R0 get() {
        return a(this.f35631a, (KD) this.f35632b.get(), (InterfaceC3732qh) this.f35633c.get(), (C3438jo) this.f35634d.get());
    }

    public static C3854tb a(C3811sb c3811sb, Provider provider, Provider provider2, Provider provider3) {
        return new C3854tb(c3811sb, provider, provider2, provider3);
    }

    public static R0 a(C3811sb c3811sb, KD kd2, InterfaceC3732qh interfaceC3732qh, C3438jo c3438jo) {
        return (R0) qj0.h.d(c3811sb.a(kd2, interfaceC3732qh, c3438jo));
    }
}
