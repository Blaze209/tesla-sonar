package com.fourthline.vision.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.vision.internal.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4216j0 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final L f38439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f38440b;

    public C4216j0(L l11, Provider provider) {
        this.f38439a = l11;
        this.f38440b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Y2 get() {
        return a(this.f38439a, (r6) this.f38440b.get());
    }

    public static C4216j0 a(L l11, Provider provider) {
        return new C4216j0(l11, provider);
    }

    public static Y2 a(L l11, r6 r6Var) {
        return (Y2) qj0.h.d(l11.providesLegacyPreviewCalculator(r6Var));
    }
}
