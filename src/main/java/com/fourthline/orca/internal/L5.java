package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class L5 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final H5 f26704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f26705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f26706c;

    public L5(H5 h11, Provider provider, Provider provider2) {
        this.f26704a = h11;
        this.f26705b = provider;
        this.f26706c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC4117zf get() {
        return a(this.f26704a, (D5) this.f26705b.get(), (C5) this.f26706c.get());
    }

    public static L5 a(H5 h11, Provider provider, Provider provider2) {
        return new L5(h11, provider, provider2);
    }

    public static InterfaceC4117zf a(H5 h11, D5 d11, C5 c11) {
        return (InterfaceC4117zf) qj0.h.d(h11.a(d11, c11));
    }
}
