package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3366i implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3152d f32398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f32399b;

    public C3366i(C3152d c3152d, Provider provider) {
        this.f32398a = c3152d;
        this.f32399b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3029a4 get() {
        return a(this.f32398a, (C3072b4) this.f32399b.get());
    }

    public static C3366i a(C3152d c3152d, Provider provider) {
        return new C3366i(c3152d, provider);
    }

    public static InterfaceC3029a4 a(C3152d c3152d, C3072b4 c3072b4) {
        return (InterfaceC3029a4) qj0.h.d(c3152d.a(c3072b4));
    }
}
