package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class Uy implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Qy f28939a;

    public Uy(Qy qy2) {
        this.f28939a = qy2;
    }

    public static C3765rE b(Qy qy2) {
        return (C3765rE) qj0.h.d(qy2.d());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3765rE get() {
        return b(this.f28939a);
    }

    public static Uy a(Qy qy2) {
        return new Uy(qy2);
    }
}
