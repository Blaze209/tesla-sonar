package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class K5 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final H5 f26542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f26543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f26544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f26545d;

    public K5(H5 h11, Provider provider, Provider provider2, Provider provider3) {
        this.f26542a = h11;
        this.f26543b = provider;
        this.f26544c = provider2;
        this.f26545d = provider3;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3988wf get() {
        return a(this.f26542a, (D5) this.f26543b.get(), (C5) this.f26544c.get(), (wn0.a) this.f26545d.get());
    }

    public static K5 a(H5 h11, Provider provider, Provider provider2, Provider provider3) {
        return new K5(h11, provider, provider2, provider3);
    }

    public static InterfaceC3988wf a(H5 h11, D5 d11, C5 c11, wn0.a aVar) {
        return (InterfaceC3988wf) qj0.h.d(h11.a(d11, c11, aVar));
    }
}
