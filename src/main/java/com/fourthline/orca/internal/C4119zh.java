package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.zh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4119zh implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4033xh f37278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f37279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f37280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f37281d;

    public C4119zh(C4033xh c4033xh, Provider provider, Provider provider2, Provider provider3) {
        this.f37278a = c4033xh;
        this.f37279b = provider;
        this.f37280c = provider2;
        this.f37281d = provider3;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4092yx get() {
        return a(this.f37278a, (InterfaceC3863tk) this.f37279b.get(), (Qx) this.f37280c.get(), (Bh) this.f37281d.get());
    }

    public static C4119zh a(C4033xh c4033xh, Provider provider, Provider provider2, Provider provider3) {
        return new C4119zh(c4033xh, provider, provider2, provider3);
    }

    public static C4092yx a(C4033xh c4033xh, InterfaceC3863tk interfaceC3863tk, Qx qx2, Bh bh2) {
        return (C4092yx) qj0.h.d(c4033xh.a(interfaceC3863tk, qx2, bh2));
    }
}
