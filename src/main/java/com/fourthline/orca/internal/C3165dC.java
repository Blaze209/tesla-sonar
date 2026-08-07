package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.dC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3165dC implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BB f31096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f31097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f31098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f31099d;

    public C3165dC(BB bb2, Provider provider, Provider provider2, Provider provider3) {
        this.f31096a = bb2;
        this.f31097b = provider;
        this.f31098c = provider2;
        this.f31099d = provider3;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3991wi get() {
        return a(this.f31096a, (C3092bi) this.f31097b.get(), (C3891uB) this.f31098c.get(), (Uj) this.f31099d.get());
    }

    public static C3165dC a(BB bb2, Provider provider, Provider provider2, Provider provider3) {
        return new C3165dC(bb2, provider, provider2, provider3);
    }

    public static C3991wi a(BB bb2, C3092bi c3092bi, C3891uB c3891uB, Uj uj2) {
        return (C3991wi) qj0.h.d(bb2.a(c3092bi, c3891uB, uj2));
    }
}
