package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3152d f34950a;

    public r(C3152d c3152d) {
        this.f34950a = c3152d;
    }

    public static wn0.a b(C3152d c3152d) {
        return (wn0.a) qj0.h.d(c3152d.l());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public wn0.a get() {
        return b(this.f34950a);
    }

    public static r a(C3152d c3152d) {
        return new r(c3152d);
    }
}
