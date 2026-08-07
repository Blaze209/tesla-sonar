package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.c7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3117c7 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Z6 f30795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f30796b;

    public C3117c7(Z6 z11, Provider provider) {
        this.f30795a = z11;
        this.f30796b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DocumentAnalysisConfig get() {
        return a(this.f30795a, (ou.m) this.f30796b.get());
    }

    public static C3117c7 a(Z6 z11, Provider provider) {
        return new C3117c7(z11, provider);
    }

    public static DocumentAnalysisConfig a(Z6 z11, ou.m mVar) {
        return (DocumentAnalysisConfig) qj0.h.d(z11.a(mVar));
    }
}
