package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class V2 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final S2 f28952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f28953b;

    public V2(S2 s11, Provider provider) {
        this.f28952a = s11;
        this.f28953b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3624o1 get() {
        return a(this.f28952a, (Gl) this.f28953b.get());
    }

    public static V2 a(S2 s11, Provider provider) {
        return new V2(s11, provider);
    }

    public static InterfaceC3624o1 a(S2 s11, Gl gl2) {
        return (InterfaceC3624o1) qj0.h.d(s11.a(gl2));
    }
}
