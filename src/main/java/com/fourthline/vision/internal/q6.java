package com.fourthline.vision.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class q6 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o6 f38788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f38789b;

    public q6(o6 o6Var, Provider provider) {
        this.f38788a = o6Var;
        this.f38789b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public r6 get() {
        return a(this.f38788a, (C4312x) this.f38789b.get());
    }

    public static q6 a(o6 o6Var, Provider provider) {
        return new q6(o6Var, provider);
    }

    public static r6 a(o6 o6Var, C4312x c4312x) {
        return (r6) qj0.h.d(o6Var.provideVisionInfo(c4312x));
    }
}
