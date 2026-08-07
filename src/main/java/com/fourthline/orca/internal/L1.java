package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class L1 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4097z1 f26696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f26697b;

    public L1(C4097z1 c4097z1, Provider provider) {
        this.f26696a = c4097z1;
        this.f26697b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3925v2 get() {
        return a(this.f26696a, (C3438jo) this.f26697b.get());
    }

    public static L1 a(C4097z1 c4097z1, Provider provider) {
        return new L1(c4097z1, provider);
    }

    public static C3925v2 a(C4097z1 c4097z1, C3438jo c3438jo) {
        return (C3925v2) qj0.h.d(c4097z1.c(c3438jo));
    }
}
