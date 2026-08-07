package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.b9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3077b9 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K8 f30575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f30576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f30577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f30578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f30579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f30580f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider f30581g;

    public C3077b9(K8 k11, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.f30575a = k11;
        this.f30576b = provider;
        this.f30577c = provider2;
        this.f30578d = provider3;
        this.f30579e = provider4;
        this.f30580f = provider5;
        this.f30581g = provider6;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3931v8 get() {
        return a(this.f30575a, (InterfaceC3051ak) this.f30576b.get(), (C4104z8) this.f30577c.get(), (wn0.a) this.f30578d.get(), (InterfaceC4124zm) this.f30579e.get(), (wn0.a) this.f30580f.get(), (InterfaceC3546m9) this.f30581g.get());
    }

    public static C3077b9 a(K8 k11, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        return new C3077b9(k11, provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static C3931v8 a(K8 k11, InterfaceC3051ak interfaceC3051ak, C4104z8 c4104z8, wn0.a aVar, InterfaceC4124zm interfaceC4124zm, wn0.a aVar2, InterfaceC3546m9 interfaceC3546m9) {
        return (C3931v8) qj0.h.d(k11.a(interfaceC3051ak, c4104z8, aVar, interfaceC4124zm, aVar2, interfaceC3546m9));
    }
}
