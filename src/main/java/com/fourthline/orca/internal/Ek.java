package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class Ek implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4079yk f25604a;

    public Ek(C4079yk c4079yk) {
        this.f25604a = c4079yk;
    }

    public static lq.b b(C4079yk c4079yk) {
        return (lq.b) qj0.h.d(c4079yk.b());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public lq.b get() {
        return b(this.f25604a);
    }

    public static Ek a(C4079yk c4079yk) {
        return new Ek(c4079yk);
    }
}
