package com.fourthline.orca.internal;

import com.fourthline.orca.Orca;

/* JADX INFO: loaded from: classes4.dex */
public final class Sy implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Qy f27817a;

    public Sy(Qy qy2) {
        this.f27817a = qy2;
    }

    public static Orca.a b(Qy qy2) {
        return (Orca.a) qj0.h.d(qy2.b());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Orca.a get() {
        return b(this.f27817a);
    }

    public static Sy a(Qy qy2) {
        return new Sy(qy2);
    }
}
