package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class Sz implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Oz f27818a;

    public Sz(Oz oz2) {
        this.f27818a = oz2;
    }

    public static N2 b(Oz oz2) {
        return (N2) qj0.h.d(oz2.d());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public N2 get() {
        return b(this.f27818a);
    }

    public static Sz a(Oz oz2) {
        return new Sz(oz2);
    }
}
