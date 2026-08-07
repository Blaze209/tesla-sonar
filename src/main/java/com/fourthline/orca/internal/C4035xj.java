package com.fourthline.orca.internal;

import com.fourthline.core.location.LocationProvider;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.fourthline.orca.internal.xj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4035xj implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3691pj f36744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f36745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f36746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f36747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f36748e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f36749f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider f36750g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Provider f36751h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Provider f36752i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Provider f36753j;

    public C4035xj(C3691pj c3691pj, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9) {
        this.f36744a = c3691pj;
        this.f36745b = provider;
        this.f36746c = provider2;
        this.f36747d = provider3;
        this.f36748e = provider4;
        this.f36749f = provider5;
        this.f36750g = provider6;
        this.f36751h = provider7;
        this.f36752i = provider8;
        this.f36753j = provider9;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Oj get() {
        return a(this.f36744a, (Nj) this.f36745b.get(), (C2874Gc) this.f36746c.get(), (C3648oj) this.f36747d.get(), (ED) this.f36748e.get(), (LocationProvider) this.f36749f.get(), (Lj) this.f36750g.get(), (Gj) this.f36751h.get(), (InterfaceC4044xs) this.f36752i.get(), (CoroutineScope) this.f36753j.get());
    }

    public static C4035xj a(C3691pj c3691pj, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9) {
        return new C4035xj(c3691pj, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static Oj a(C3691pj c3691pj, Nj nj2, C2874Gc c2874Gc, C3648oj c3648oj, ED ed2, LocationProvider locationProvider, Lj lj2, Gj gj2, InterfaceC4044xs interfaceC4044xs, CoroutineScope coroutineScope) {
        return (Oj) qj0.h.d(c3691pj.a(nj2, c2874Gc, c3648oj, ed2, locationProvider, lj2, gj2, interfaceC4044xs, coroutineScope));
    }
}
