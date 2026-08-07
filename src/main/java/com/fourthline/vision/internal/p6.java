package com.fourthline.vision.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class p6 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o6 f38754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f38755b;

    public p6(o6 o6Var, Provider provider) {
        this.f38754a = o6Var;
        this.f38755b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public H6 get() {
        return a(this.f38754a, (C4257p) this.f38755b.get());
    }

    public static p6 a(o6 o6Var, Provider provider) {
        return new p6(o6Var, provider);
    }

    public static H6 a(o6 o6Var, C4257p c4257p) {
        return (H6) qj0.h.d(o6Var.provideImageProducer(c4257p));
    }
}
