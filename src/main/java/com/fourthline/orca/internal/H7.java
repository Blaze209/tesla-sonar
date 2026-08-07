package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class H7 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F7 f26090a;

    public H7(F7 f11) {
        this.f26090a = f11;
    }

    public static InterfaceC3051ak b(F7 f11) {
        return (InterfaceC3051ak) qj0.h.d(f11.b());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3051ak get() {
        return b(this.f26090a);
    }

    public static H7 a(F7 f11) {
        return new H7(f11);
    }
}
