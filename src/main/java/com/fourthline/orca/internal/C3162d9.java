package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.d9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3162d9 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K8 f31082a;

    public C3162d9(K8 k11) {
        this.f31082a = k11;
    }

    public static InterfaceC4124zm b(K8 k11) {
        return (InterfaceC4124zm) qj0.h.d(k11.b());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC4124zm get() {
        return b(this.f31082a);
    }

    public static C3162d9 a(K8 k11) {
        return new C3162d9(k11);
    }
}
