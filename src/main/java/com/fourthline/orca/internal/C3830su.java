package com.fourthline.orca.internal;

import com.fourthline.core.location.LocationProvider;
import java.util.Locale;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.fourthline.orca.internal.su, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3830su implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3146cu f35405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f35406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f35407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f35408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f35409e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f35410f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider f35411g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Provider f35412h;

    public C3830su(C3146cu c3146cu, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.f35405a = c3146cu;
        this.f35406b = provider;
        this.f35407c = provider2;
        this.f35408d = provider3;
        this.f35409e = provider4;
        this.f35410f = provider5;
        this.f35411g = provider6;
        this.f35412h = provider7;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3991wi.c get() {
        return a(this.f35405a, (C3104bu) this.f35406b.get(), (Yu) this.f35407c.get(), (LocationProvider) this.f35408d.get(), (Uv) this.f35409e.get(), (InterfaceC2931Re) this.f35410f.get(), (Locale) this.f35411g.get(), (CoroutineScope) this.f35412h.get());
    }

    public static C3830su a(C3146cu c3146cu, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        return new C3830su(c3146cu, provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static C3991wi.c a(C3146cu c3146cu, C3104bu c3104bu, Yu yu2, LocationProvider locationProvider, Uv uv2, InterfaceC2931Re interfaceC2931Re, Locale locale, CoroutineScope coroutineScope) {
        return (C3991wi.c) qj0.h.d(c3146cu.a(c3104bu, yu2, locationProvider, uv2, interfaceC2931Re, locale, coroutineScope));
    }
}
