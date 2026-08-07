package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class T2 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final S2 f27825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f27826b;

    public T2(S2 s11, Provider provider) {
        this.f27825a = s11;
        this.f27826b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public G2 get() {
        return a(this.f27825a, (InterfaceC3852tF) this.f27826b.get());
    }

    public static T2 a(S2 s11, Provider provider) {
        return new T2(s11, provider);
    }

    public static G2 a(S2 s11, InterfaceC3852tF interfaceC3852tF) {
        return (G2) qj0.h.d(s11.a(interfaceC3852tF));
    }
}
