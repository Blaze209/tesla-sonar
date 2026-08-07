package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class NC implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LC f27038a;

    public NC(LC lc2) {
        this.f27038a = lc2;
    }

    public static EC b(LC lc2) {
        return (EC) qj0.h.d(lc2.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public EC get() {
        return b(this.f27038a);
    }

    public static NC a(LC lc2) {
        return new NC(lc2);
    }
}
