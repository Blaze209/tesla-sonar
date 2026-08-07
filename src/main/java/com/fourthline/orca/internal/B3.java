package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class B3 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3712q3 f25053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f25054b;

    public B3(C3712q3 c3712q3, Provider provider) {
        this.f25053a = c3712q3;
        this.f25054b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4135zx get() {
        return a(this.f25053a, (C3490kx) this.f25054b.get());
    }

    public static B3 a(C3712q3 c3712q3, Provider provider) {
        return new B3(c3712q3, provider);
    }

    public static C4135zx a(C3712q3 c3712q3, C3490kx c3490kx) {
        return (C4135zx) qj0.h.d(c3712q3.a(c3490kx));
    }
}
