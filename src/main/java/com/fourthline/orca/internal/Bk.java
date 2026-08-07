package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class Bk implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4079yk f25098a;

    public Bk(C4079yk c4079yk) {
        this.f25098a = c4079yk;
    }

    public static p011ja.w b(C4079yk c4079yk) {
        return (p011ja.w) qj0.h.d(c4079yk.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public p011ja.w get() {
        return b(this.f25098a);
    }

    public static Bk a(C4079yk c4079yk) {
        return new Bk(c4079yk);
    }
}
