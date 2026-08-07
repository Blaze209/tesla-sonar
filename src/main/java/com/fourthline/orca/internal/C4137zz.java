package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.zz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4137zz implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3965vz f37383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f37384b;

    public C4137zz(C3965vz c3965vz, Provider provider) {
        this.f37383a = c3965vz;
        this.f37384b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3889u9 get() {
        return a(this.f37383a, (W6) this.f37384b.get());
    }

    public static C4137zz a(C3965vz c3965vz, Provider provider) {
        return new C4137zz(c3965vz, provider);
    }

    public static C3889u9 a(C3965vz c3965vz, W6 w11) {
        return (C3889u9) qj0.h.d(c3965vz.a(w11));
    }
}
