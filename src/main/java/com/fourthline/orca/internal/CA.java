package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class CA implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AA f25190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f25191b;

    public CA(AA aa2, Provider provider) {
        this.f25190a = aa2;
        this.f25191b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Yz get() {
        return a(this.f25190a, (C3765rE) this.f25191b.get());
    }

    public static CA a(AA aa2, Provider provider) {
        return new CA(aa2, provider);
    }

    public static Yz a(AA aa2, C3765rE c3765rE) {
        return (Yz) qj0.h.d(aa2.a(c3765rE));
    }
}
