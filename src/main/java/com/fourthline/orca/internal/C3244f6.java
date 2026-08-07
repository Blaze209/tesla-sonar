package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.f6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3244f6 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Y5 f31626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f31627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f31628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f31629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f31630e;

    public C3244f6(Y5 y11, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f31626a = y11;
        this.f31627b = provider;
        this.f31628c = provider2;
        this.f31629d = provider3;
        this.f31630e = provider4;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public CC get() {
        return a(this.f31626a, (InterfaceC3457k6) this.f31627b.get(), (VC) this.f31628c.get(), (G6) this.f31629d.get(), (InterfaceC3051ak) this.f31630e.get());
    }

    public static C3244f6 a(Y5 y11, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new C3244f6(y11, provider, provider2, provider3, provider4);
    }

    public static CC a(Y5 y11, InterfaceC3457k6 interfaceC3457k6, VC vc2, G6 g11, InterfaceC3051ak interfaceC3051ak) {
        return (CC) qj0.h.d(y11.a(interfaceC3457k6, vc2, g11, interfaceC3051ak));
    }
}
