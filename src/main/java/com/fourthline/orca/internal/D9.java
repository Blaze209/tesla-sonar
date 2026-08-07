package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class D9 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C9 f25320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f25321b;

    public D9(C9 c11, Provider provider) {
        this.f25320a = c11;
        this.f25321b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DocumentAnalysisConfig get() {
        return a(this.f25320a, (A9) this.f25321b.get());
    }

    public static D9 a(C9 c11, Provider provider) {
        return new D9(c11, provider);
    }

    public static DocumentAnalysisConfig a(C9 c11, A9 a11) {
        return (DocumentAnalysisConfig) qj0.h.d(c11.a(a11));
    }
}
