package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3580n0 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3494l0 f33756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f33757b;

    public C3580n0(C3494l0 c3494l0, Provider provider) {
        this.f33756a = c3494l0;
        this.f33757b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3692pk get() {
        return a(this.f33756a, (C3438jo) this.f33757b.get());
    }

    public static C3580n0 a(C3494l0 c3494l0, Provider provider) {
        return new C3580n0(c3494l0, provider);
    }

    public static InterfaceC3692pk a(C3494l0 c3494l0, C3438jo c3438jo) {
        return (InterfaceC3692pk) qj0.h.d(c3494l0.a(c3438jo));
    }
}
