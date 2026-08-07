package com.fourthline.orca.internal;

import com.fourthline.networking.NetworkEnvironment;

/* JADX INFO: loaded from: classes4.dex */
public final class Ty implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Qy f27982a;

    public Ty(Qy qy2) {
        this.f27982a = qy2;
    }

    public static NetworkEnvironment b(Qy qy2) {
        return (NetworkEnvironment) qj0.h.d(qy2.c());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public NetworkEnvironment get() {
        return b(this.f27982a);
    }

    public static Ty a(Qy qy2) {
        return new Ty(qy2);
    }
}
