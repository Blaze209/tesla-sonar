package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.yh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4076yh implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4033xh f37008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f37009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f37010c;

    public C4076yh(C4033xh c4033xh, Provider provider, Provider provider2) {
        this.f37008a = c4033xh;
        this.f37009b = provider;
        this.f37010c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Kx get() {
        return a(this.f37008a, (wn0.a) this.f37009b.get(), (C4135zx) this.f37010c.get());
    }

    public static C4076yh a(C4033xh c4033xh, Provider provider, Provider provider2) {
        return new C4076yh(c4033xh, provider, provider2);
    }

    public static Kx a(C4033xh c4033xh, wn0.a aVar, C4135zx c4135zx) {
        return (Kx) qj0.h.d(c4033xh.a(aVar, c4135zx));
    }
}
