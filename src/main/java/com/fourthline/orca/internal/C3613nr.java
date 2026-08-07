package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.nr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3613nr implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3357hr f33989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f33990b;

    public C3613nr(C3357hr c3357hr, Provider provider) {
        this.f33989a = c3357hr;
        this.f33990b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3092bi get() {
        return a(this.f33989a, (C3438jo) this.f33990b.get());
    }

    public static C3613nr a(C3357hr c3357hr, Provider provider) {
        return new C3613nr(c3357hr, provider);
    }

    public static C3092bi a(C3357hr c3357hr, C3438jo c3438jo) {
        return (C3092bi) qj0.h.d(c3357hr.c(c3438jo));
    }
}
