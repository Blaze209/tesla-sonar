package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3623o0 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3494l0 f34029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f34030b;

    public C3623o0(C3494l0 c3494l0, Provider provider) {
        this.f34029a = c3494l0;
        this.f34030b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3438jo get() {
        return a(this.f34029a, (C3687pf) this.f34030b.get());
    }

    public static C3623o0 a(C3494l0 c3494l0, Provider provider) {
        return new C3623o0(c3494l0, provider);
    }

    public static C3438jo a(C3494l0 c3494l0, C3687pf c3687pf) {
        return (C3438jo) qj0.h.d(c3494l0.a(c3687pf));
    }
}
