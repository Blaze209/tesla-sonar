package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class V8 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K8 f29044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f29045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f29046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f29047d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f29048e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f29049f;

    public V8(K8 k11, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f29044a = k11;
        this.f29045b = provider;
        this.f29046c = provider2;
        this.f29047d = provider3;
        this.f29048e = provider4;
        this.f29049f = provider5;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3846t9 get() {
        return a(this.f29044a, (On) this.f29045b.get(), (C4104z8) this.f29046c.get(), (InterfaceC3645og) this.f29047d.get(), (InterfaceC4124zm) this.f29048e.get(), (wn0.a) this.f29049f.get());
    }

    public static V8 a(K8 k11, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new V8(k11, provider, provider2, provider3, provider4, provider5);
    }

    public static C3846t9 a(K8 k11, On on2, C4104z8 c4104z8, InterfaceC3645og interfaceC3645og, InterfaceC4124zm interfaceC4124zm, wn0.a aVar) {
        return (C3846t9) qj0.h.d(k11.a(on2, c4104z8, interfaceC3645og, interfaceC4124zm, aVar));
    }
}
