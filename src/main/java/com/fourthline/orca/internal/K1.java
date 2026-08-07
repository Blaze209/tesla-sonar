package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class K1 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4097z1 f26530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f26531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f26532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f26533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f26534e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f26535f;

    public K1(C4097z1 c4097z1, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f26530a = c4097z1;
        this.f26531b = provider;
        this.f26532c = provider2;
        this.f26533d = provider3;
        this.f26534e = provider4;
        this.f26535f = provider5;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3991wi get() {
        return a(this.f26530a, (C3092bi) this.f26531b.get(), (C4054y1) this.f26532c.get(), (C3991wi.e) this.f26533d.get(), (C3283g2) this.f26534e.get(), (C3496l2) this.f26535f.get());
    }

    public static K1 a(C4097z1 c4097z1, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new K1(c4097z1, provider, provider2, provider3, provider4, provider5);
    }

    public static C3991wi a(C4097z1 c4097z1, C3092bi c3092bi, C4054y1 c4054y1, C3991wi.e eVar, C3283g2 c3283g2, C3496l2 c3496l2) {
        return (C3991wi) qj0.h.d(c4097z1.a(c3092bi, c4054y1, eVar, c3283g2, c3496l2));
    }
}
