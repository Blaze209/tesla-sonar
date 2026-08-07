package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.dm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3181dm implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Zl f31210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f31211b;

    public C3181dm(Zl zl2, Provider provider) {
        this.f31210a = zl2;
        this.f31211b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3737qm get() {
        return a(this.f31210a, (C3438jo) this.f31211b.get());
    }

    public static C3181dm a(Zl zl2, Provider provider) {
        return new C3181dm(zl2, provider);
    }

    public static C3737qm a(Zl zl2, C3438jo c3438jo) {
        return (C3737qm) qj0.h.d(zl2.a(c3438jo));
    }
}
