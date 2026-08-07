package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class Lr implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Hr f26850a;

    public Lr(Hr hr2) {
        this.f26850a = hr2;
    }

    public static Nq b(Hr hr2) {
        return (Nq) qj0.h.d(hr2.b());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Nq get() {
        return b(this.f26850a);
    }

    public static Lr a(Hr hr2) {
        return new Lr(hr2);
    }
}
