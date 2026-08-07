package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.sx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3833sx implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3662ox f35424a;

    public C3833sx(C3662ox c3662ox) {
        this.f35424a = c3662ox;
    }

    public static Xx b(C3662ox c3662ox) {
        return (Xx) qj0.h.d(c3662ox.d());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Xx get() {
        return b(this.f35424a);
    }

    public static C3833sx a(C3662ox c3662ox) {
        return new C3833sx(c3662ox);
    }
}
