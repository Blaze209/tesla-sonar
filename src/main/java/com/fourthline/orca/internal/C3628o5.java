package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.o5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3628o5 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3286g5 f34073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f34074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f34075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f34076d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f34077e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f34078f;

    public C3628o5(C3286g5 c3286g5, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f34073a = c3286g5;
        this.f34074b = provider;
        this.f34075c = provider2;
        this.f34076d = provider3;
        this.f34077e = provider4;
        this.f34078f = provider5;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ED get() {
        return a(this.f34073a, (wn0.a) this.f34074b.get(), (F4) this.f34075c.get(), (C3158d5) this.f34076d.get(), (Vf) this.f34077e.get(), (InterfaceC3645og) this.f34078f.get());
    }

    public static C3628o5 a(C3286g5 c3286g5, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new C3628o5(c3286g5, provider, provider2, provider3, provider4, provider5);
    }

    public static ED a(C3286g5 c3286g5, wn0.a aVar, F4 f11, C3158d5 c3158d5, Vf vf2, InterfaceC3645og interfaceC3645og) {
        return (ED) qj0.h.d(c3286g5.a(aVar, f11, c3158d5, vf2, interfaceC3645og));
    }
}
