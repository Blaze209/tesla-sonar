package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.l9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3503l9 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K8 f33252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f33253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f33254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f33255d;

    public C3503l9(K8 k11, Provider provider, Provider provider2, Provider provider3) {
        this.f33252a = k11;
        this.f33253b = provider;
        this.f33254c = provider2;
        this.f33255d = provider3;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC4066yD get() {
        return a(this.f33252a, (wn0.a) this.f33253b.get(), (C4104z8) this.f33254c.get(), (Vf) this.f33255d.get());
    }

    public static C3503l9 a(K8 k11, Provider provider, Provider provider2, Provider provider3) {
        return new C3503l9(k11, provider, provider2, provider3);
    }

    public static InterfaceC4066yD a(K8 k11, wn0.a aVar, C4104z8 c4104z8, Vf vf2) {
        return (InterfaceC4066yD) qj0.h.d(k11.a(aVar, c4104z8, vf2));
    }
}
