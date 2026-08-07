package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.uE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3894uE implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3808sE f35852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f35853b;

    public C3894uE(C3808sE c3808sE, Provider provider) {
        this.f35852a = c3808sE;
        this.f35853b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public EE get() {
        return a(this.f35852a, (C3438jo) this.f35853b.get());
    }

    public static C3894uE a(C3808sE c3808sE, Provider provider) {
        return new C3894uE(c3808sE, provider);
    }

    public static EE a(C3808sE c3808sE, C3438jo c3438jo) {
        return (EE) qj0.h.d(c3808sE.a(c3438jo));
    }
}
