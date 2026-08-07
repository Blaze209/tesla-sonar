package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ir, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3399ir implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3357hr f32579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f32580b;

    public C3399ir(C3357hr c3357hr, Provider provider) {
        this.f32579a = c3357hr;
        this.f32580b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Lq get() {
        return a(this.f32579a, (C3438jo) this.f32580b.get());
    }

    public static C3399ir a(C3357hr c3357hr, Provider provider) {
        return new C3399ir(c3357hr, provider);
    }

    public static Lq a(C3357hr c3357hr, C3438jo c3438jo) {
        return (Lq) qj0.h.d(c3357hr.a(c3438jo));
    }
}
