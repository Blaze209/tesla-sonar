package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Df, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2859Df implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2847Bf f25464a;

    public C2859Df(C2847Bf c2847Bf) {
        this.f25464a = c2847Bf;
    }

    public static InterfaceC3051ak b(C2847Bf c2847Bf) {
        return (InterfaceC3051ak) qj0.h.d(c2847Bf.b());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3051ak get() {
        return b(this.f25464a);
    }

    public static C2859Df a(C2847Bf c2847Bf) {
        return new C2859Df(c2847Bf);
    }
}
