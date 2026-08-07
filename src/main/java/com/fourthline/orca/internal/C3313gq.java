package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.gq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3313gq implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Sp f32073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f32074b;

    public C3313gq(Sp sp2, Provider provider) {
        this.f32073a = sp2;
        this.f32074b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public M9 get() {
        return a(this.f32073a, (C3438jo) this.f32074b.get());
    }

    public static C3313gq a(Sp sp2, Provider provider) {
        return new C3313gq(sp2, provider);
    }

    public static M9 a(Sp sp2, C3438jo c3438jo) {
        return (M9) qj0.h.d(sp2.a(c3438jo));
    }
}
