package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class W2 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final S2 f29387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f29388b;

    public W2(S2 s11, Provider provider) {
        this.f29387a = s11;
        this.f29388b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3839t2 get() {
        return a(this.f29387a, (Gl) this.f29388b.get());
    }

    public static W2 a(S2 s11, Provider provider) {
        return new W2(s11, provider);
    }

    public static InterfaceC3839t2 a(S2 s11, Gl gl2) {
        return (InterfaceC3839t2) qj0.h.d(s11.b(gl2));
    }
}
