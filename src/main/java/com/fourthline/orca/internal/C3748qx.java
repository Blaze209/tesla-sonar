package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.qx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3748qx implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3662ox f34919a;

    public C3748qx(C3662ox c3662ox) {
        this.f34919a = c3662ox;
    }

    public static Ts b(C3662ox c3662ox) {
        return (Ts) qj0.h.d(c3662ox.b());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Ts get() {
        return b(this.f34919a);
    }

    public static C3748qx a(C3662ox c3662ox) {
        return new C3748qx(c3662ox);
    }
}
