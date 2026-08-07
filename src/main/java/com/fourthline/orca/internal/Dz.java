package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Dz implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3965vz f25520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f25521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f25522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f25523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f25524e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f25525f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider f25526g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Provider f25527h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Provider f25528i;

    public Dz(C3965vz c3965vz, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8) {
        this.f25520a = c3965vz;
        this.f25521b = provider;
        this.f25522c = provider2;
        this.f25523d = provider3;
        this.f25524e = provider4;
        this.f25525f = provider5;
        this.f25526g = provider6;
        this.f25527h = provider7;
        this.f25528i = provider8;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3921uz get() {
        return a(this.f25520a, (DocumentAnalysisConfig) this.f25521b.get(), (C3889u9) this.f25522c.get(), (InterfaceC3837t0) this.f25523d.get(), (InterfaceC3408j0) this.f25524e.get(), (C3930v7) this.f25525f.get(), (InterfaceC4044xs) this.f25526g.get(), (ou.m) this.f25527h.get(), (C3438jo) this.f25528i.get());
    }

    public static Dz a(C3965vz c3965vz, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8) {
        return new Dz(c3965vz, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static InterfaceC3921uz a(C3965vz c3965vz, DocumentAnalysisConfig documentAnalysisConfig, C3889u9 c3889u9, InterfaceC3837t0 interfaceC3837t0, InterfaceC3408j0 interfaceC3408j0, C3930v7 c3930v7, InterfaceC4044xs interfaceC4044xs, ou.m mVar, C3438jo c3438jo) {
        return (InterfaceC3921uz) qj0.h.d(c3965vz.a(documentAnalysisConfig, c3889u9, interfaceC3837t0, interfaceC3408j0, c3930v7, interfaceC4044xs, mVar, c3438jo));
    }
}
