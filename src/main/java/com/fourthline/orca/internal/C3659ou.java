package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ou, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3659ou implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3146cu f34382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f34383b;

    public C3659ou(C3146cu c3146cu, Provider provider) {
        this.f34382a = c3146cu;
        this.f34383b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3786rt get() {
        return a(this.f34382a, (C3104bu) this.f34383b.get());
    }

    public static C3659ou a(C3146cu c3146cu, Provider provider) {
        return new C3659ou(c3146cu, provider);
    }

    public static InterfaceC3786rt a(C3146cu c3146cu, C3104bu c3104bu) {
        return (InterfaceC3786rt) qj0.h.d(c3146cu.a(c3104bu));
    }
}
