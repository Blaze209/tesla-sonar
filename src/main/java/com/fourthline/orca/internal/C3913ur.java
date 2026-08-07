package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ur, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3913ur implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3357hr f35945a;

    public C3913ur(C3357hr c3357hr) {
        this.f35945a = c3357hr;
    }

    public static C3528ls b(C3357hr c3357hr) {
        return (C3528ls) qj0.h.d(c3357hr.b());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3528ls get() {
        return b(this.f35945a);
    }

    public static C3913ur a(C3357hr c3357hr) {
        return new C3913ur(c3357hr);
    }
}
