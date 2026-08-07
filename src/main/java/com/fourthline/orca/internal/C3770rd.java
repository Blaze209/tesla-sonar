package com.fourthline.orca.internal;

import com.fourthline.core.eid.EidServiceProvider;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.rd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3770rd implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3599nd f35046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f35047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f35048c;

    public C3770rd(C3599nd c3599nd, Provider provider, Provider provider2) {
        this.f35046a = c3599nd;
        this.f35047b = provider;
        this.f35048c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC4073ye get() {
        return a(this.f35046a, (C2899Lc) this.f35047b.get(), (EidServiceProvider) this.f35048c.get());
    }

    public static C3770rd a(C3599nd c3599nd, Provider provider, Provider provider2) {
        return new C3770rd(c3599nd, provider, provider2);
    }

    public static InterfaceC4073ye a(C3599nd c3599nd, C2899Lc c2899Lc, EidServiceProvider eidServiceProvider) {
        return (InterfaceC4073ye) qj0.h.d(c3599nd.c(c2899Lc, eidServiceProvider));
    }
}
