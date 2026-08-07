package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class H1 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4097z1 f26071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f26072b;

    public H1(C4097z1 c4097z1, Provider provider) {
        this.f26071a = c4097z1;
        this.f26072b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3092bi get() {
        return a(this.f26071a, (C3438jo) this.f26072b.get());
    }

    public static H1 a(C4097z1 c4097z1, Provider provider) {
        return new H1(c4097z1, provider);
    }

    public static C3092bi a(C4097z1 c4097z1, C3438jo c3438jo) {
        return (C3092bi) qj0.h.d(c4097z1.b(c3438jo));
    }
}
