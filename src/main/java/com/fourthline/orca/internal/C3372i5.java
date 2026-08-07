package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.i5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3372i5 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3286g5 f32429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f32430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f32431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f32432d;

    public C3372i5(C3286g5 c3286g5, Provider provider, Provider provider2, Provider provider3) {
        this.f32429a = c3286g5;
        this.f32430b = provider;
        this.f32431c = provider2;
        this.f32432d = provider3;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public H4 get() {
        return a(this.f32429a, (C3714q5) this.f32430b.get(), (InterfaceC3732qh) this.f32431c.get(), (C3438jo) this.f32432d.get());
    }

    public static C3372i5 a(C3286g5 c3286g5, Provider provider, Provider provider2, Provider provider3) {
        return new C3372i5(c3286g5, provider, provider2, provider3);
    }

    public static H4 a(C3286g5 c3286g5, C3714q5 c3714q5, InterfaceC3732qh interfaceC3732qh, C3438jo c3438jo) {
        return (H4) qj0.h.d(c3286g5.a(c3714q5, interfaceC3732qh, c3438jo));
    }
}
