package com.fourthline.orca.internal;

import com.fourthline.core.eid.EidServiceProvider;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.od, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3642od implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3599nd f34213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f34214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f34215c;

    public C3642od(C3599nd c3599nd, Provider provider, Provider provider2) {
        this.f34213a = c3599nd;
        this.f34214b = provider;
        this.f34215c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC2879Hc get() {
        return a(this.f34213a, (C2899Lc) this.f34214b.get(), (EidServiceProvider) this.f34215c.get());
    }

    public static C3642od a(C3599nd c3599nd, Provider provider, Provider provider2) {
        return new C3642od(c3599nd, provider, provider2);
    }

    public static InterfaceC2879Hc a(C3599nd c3599nd, C2899Lc c2899Lc, EidServiceProvider eidServiceProvider) {
        return (InterfaceC2879Hc) qj0.h.d(c3599nd.a(c2899Lc, eidServiceProvider));
    }
}
