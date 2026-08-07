package com.fourthline.orca.internal;

import com.fourthline.networking.NetworkEnvironment;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Ef, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2865Ef implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2847Bf f25595a;

    public C2865Ef(C2847Bf c2847Bf) {
        this.f25595a = c2847Bf;
    }

    public static NetworkEnvironment b(C2847Bf c2847Bf) {
        return (NetworkEnvironment) qj0.h.d(c2847Bf.c());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public NetworkEnvironment get() {
        return b(this.f25595a);
    }

    public static C2865Ef a(C2847Bf c2847Bf) {
        return new C2865Ef(c2847Bf);
    }
}
