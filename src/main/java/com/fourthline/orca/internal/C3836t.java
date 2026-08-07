package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3836t implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3152d f35492a;

    public C3836t(C3152d c3152d) {
        this.f35492a = c3152d;
    }

    public static wn0.a b(C3152d c3152d) {
        return (wn0.a) qj0.h.d(c3152d.m());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public wn0.a get() {
        return b(this.f35492a);
    }

    public static C3836t a(C3152d c3152d) {
        return new C3836t(c3152d);
    }
}
