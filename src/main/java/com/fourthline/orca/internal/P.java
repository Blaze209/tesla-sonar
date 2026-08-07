package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class P implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O f27262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f27263b;

    public P(O o11, Provider provider) {
        this.f27262a = o11;
        this.f27263b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4095z get() {
        return a(this.f27262a, (C3438jo) this.f27263b.get());
    }

    public static P a(O o11, Provider provider) {
        return new P(o11, provider);
    }

    public static C4095z a(O o11, C3438jo c3438jo) {
        return (C4095z) qj0.h.d(o11.a(c3438jo));
    }
}
