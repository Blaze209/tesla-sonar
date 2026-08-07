package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class M8 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K8 f26899a;

    public M8(K8 k11) {
        this.f26899a = k11;
    }

    public static DocumentAnalysisConfig b(K8 k11) {
        return (DocumentAnalysisConfig) qj0.h.d(k11.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DocumentAnalysisConfig get() {
        return b(this.f26899a);
    }

    public static M8 a(K8 k11) {
        return new M8(k11);
    }
}
