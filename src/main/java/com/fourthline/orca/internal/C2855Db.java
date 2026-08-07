package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Db, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2855Db implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3811sb f25444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f25445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f25446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f25447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f25448e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f25449f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider f25450g;

    public C2855Db(C3811sb c3811sb, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.f25444a = c3811sb;
        this.f25445b = provider;
        this.f25446c = provider2;
        this.f25447d = provider3;
        this.f25448e = provider4;
        this.f25449f = provider5;
        this.f25450g = provider6;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3768rb get() {
        return a(this.f25444a, (InterfaceC3863tk) this.f25445b.get(), (Fp) this.f25446c.get(), (C4087ys) this.f25447d.get(), (C3392ik) this.f25448e.get(), (Uj) this.f25449f.get(), (InterfaceC3732qh) this.f25450g.get());
    }

    public static C2855Db a(C3811sb c3811sb, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        return new C2855Db(c3811sb, provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static C3768rb a(C3811sb c3811sb, InterfaceC3863tk interfaceC3863tk, Fp fp2, C4087ys c4087ys, C3392ik c3392ik, Uj uj2, InterfaceC3732qh interfaceC3732qh) {
        return (C3768rb) qj0.h.d(c3811sb.a(interfaceC3863tk, fp2, c4087ys, c3392ik, uj2, interfaceC3732qh));
    }
}
