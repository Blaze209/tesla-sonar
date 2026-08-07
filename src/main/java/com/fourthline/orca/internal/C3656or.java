package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.or, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3656or implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3357hr f34370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f34371b;

    public C3656or(C3357hr c3357hr, Provider provider) {
        this.f34370a = c3357hr;
        this.f34371b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3314gr get() {
        return a(this.f34370a, (Uj) this.f34371b.get());
    }

    public static C3656or a(C3357hr c3357hr, Provider provider) {
        return new C3656or(c3357hr, provider);
    }

    public static C3314gr a(C3357hr c3357hr, Uj uj2) {
        return (C3314gr) qj0.h.d(c3357hr.a(uj2));
    }
}
