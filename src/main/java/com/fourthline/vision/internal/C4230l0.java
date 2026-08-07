package com.fourthline.vision.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.vision.internal.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4230l0 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final L f38528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f38529b;

    public C4230l0(L l11, Provider provider) {
        this.f38528a = l11;
        this.f38529b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public U3 get() {
        return a(this.f38528a, (r6) this.f38529b.get());
    }

    public static C4230l0 a(L l11, Provider provider) {
        return new C4230l0(l11, provider);
    }

    public static U3 a(L l11, r6 r6Var) {
        return (U3) qj0.h.d(l11.providesPreviewCalculator(r6Var));
    }
}
