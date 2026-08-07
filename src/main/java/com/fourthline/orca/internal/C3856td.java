package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.td, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3856td implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3599nd f35643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f35644b;

    public C3856td(C3599nd c3599nd, Provider provider) {
        this.f35643a = c3599nd;
        this.f35644b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Yf get() {
        return a(this.f35643a, (C3438jo) this.f35644b.get());
    }

    public static C3856td a(C3599nd c3599nd, Provider provider) {
        return new C3856td(c3599nd, provider);
    }

    public static Yf a(C3599nd c3599nd, C3438jo c3438jo) {
        return (Yf) qj0.h.d(c3599nd.a(c3438jo));
    }
}
