package com.fourthline.orca.internal;

import com.fourthline.core.eid.EidServiceProvider;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.pd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3685pd implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3599nd f34505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f34506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f34507c;

    public C3685pd(C3599nd c3599nd, Provider provider, Provider provider2) {
        this.f34505a = c3599nd;
        this.f34506b = provider;
        this.f34507c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC2889Jc get() {
        return a(this.f34505a, (C2899Lc) this.f34506b.get(), (EidServiceProvider) this.f34507c.get());
    }

    public static C3685pd a(C3599nd c3599nd, Provider provider, Provider provider2) {
        return new C3685pd(c3599nd, provider, provider2);
    }

    public static InterfaceC2889Jc a(C3599nd c3599nd, C2899Lc c2899Lc, EidServiceProvider eidServiceProvider) {
        return (InterfaceC2889Jc) qj0.h.d(c3599nd.b(c2899Lc, eidServiceProvider));
    }
}
