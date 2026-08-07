package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ku, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3487ku implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3146cu f33063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f33064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f33065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f33066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f33067e;

    public C3487ku(C3146cu c3146cu, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f33063a = c3146cu;
        this.f33064b = provider;
        this.f33065c = provider2;
        this.f33066d = provider3;
        this.f33067e = provider4;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC4044xs get() {
        return a(this.f33063a, (C4087ys) this.f33064b.get(), (InterfaceC3997wo) this.f33065c.get(), (Uj) this.f33066d.get(), (InterfaceC3732qh) this.f33067e.get());
    }

    public static C3487ku a(C3146cu c3146cu, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new C3487ku(c3146cu, provider, provider2, provider3, provider4);
    }

    public static InterfaceC4044xs a(C3146cu c3146cu, C4087ys c4087ys, InterfaceC3997wo interfaceC3997wo, Uj uj2, InterfaceC3732qh interfaceC3732qh) {
        return (InterfaceC4044xs) qj0.h.d(c3146cu.a(c4087ys, interfaceC3997wo, uj2, interfaceC3732qh));
    }
}
