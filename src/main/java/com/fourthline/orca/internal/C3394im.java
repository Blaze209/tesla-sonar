package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.im, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3394im implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Zl f32560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f32561b;

    public C3394im(Zl zl2, Provider provider) {
        this.f32560a = zl2;
        this.f32561b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3523ln get() {
        return a(this.f32560a, (C3438jo) this.f32561b.get());
    }

    public static C3394im a(Zl zl2, Provider provider) {
        return new C3394im(zl2, provider);
    }

    public static C3523ln a(Zl zl2, C3438jo c3438jo) {
        return (C3523ln) qj0.h.d(zl2.b(c3438jo));
    }
}
