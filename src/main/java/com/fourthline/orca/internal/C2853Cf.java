package com.fourthline.orca.internal;

import com.fourthline.orca.Orca;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Cf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2853Cf implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2847Bf f25218a;

    public C2853Cf(C2847Bf c2847Bf) {
        this.f25218a = c2847Bf;
    }

    public static Orca.a b(C2847Bf c2847Bf) {
        return (Orca.a) qj0.h.d(c2847Bf.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Orca.a get() {
        return b(this.f25218a);
    }

    public static C2853Cf a(C2847Bf c2847Bf) {
        return new C2853Cf(c2847Bf);
    }
}
