package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.kr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3484kr implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3357hr f33050a;

    public C3484kr(C3357hr c3357hr) {
        this.f33050a = c3357hr;
    }

    public static C3058ar b(C3357hr c3357hr) {
        return (C3058ar) qj0.h.d(c3357hr.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3058ar get() {
        return b(this.f33050a);
    }

    public static C3484kr a(C3357hr c3357hr) {
        return new C3484kr(c3357hr);
    }
}
