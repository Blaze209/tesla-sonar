package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class C1 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4097z1 f25170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f25171b;

    public C1(C4097z1 c4097z1, Provider provider) {
        this.f25170a = c4097z1;
        this.f25171b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3452k1 get() {
        return a(this.f25170a, (W0) this.f25171b.get());
    }

    public static C1 a(C4097z1 c4097z1, Provider provider) {
        return new C1(c4097z1, provider);
    }

    public static InterfaceC3452k1 a(C4097z1 c4097z1, W0 w11) {
        return (InterfaceC3452k1) qj0.h.d(c4097z1.b(w11));
    }
}
