package com.stripe.android.customersheet;

import android.app.Application;
import f30.PaymentConfiguration;
import javax.inject.Provider;
import p008h80.t;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements qj0.e<l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<Application> f49959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<w70.j> f49960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<PaymentConfiguration> f49961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<d.Configuration> f49962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<g.c> f49963e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider<o30.d> f49964f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider<z60.g> f49965g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Provider<b40.b> f49966h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Provider<CoroutineContext> f49967i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Provider<wn0.a<Boolean>> f49968j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Provider<com.stripe.android.paymentsheet.h.d> f49969k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Provider<h> f49970l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Provider<l70.d> f49971m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Provider<t.a> f49972n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Provider<h70.h> f49973o;

    public m(Provider<Application> provider, Provider<w70.j> provider2, Provider<PaymentConfiguration> provider3, Provider<d.Configuration> provider4, Provider<g.c> provider5, Provider<o30.d> provider6, Provider<z60.g> provider7, Provider<b40.b> provider8, Provider<CoroutineContext> provider9, Provider<wn0.a<Boolean>> provider10, Provider<com.stripe.android.paymentsheet.h.d> provider11, Provider<h> provider12, Provider<l70.d> provider13, Provider<t.a> provider14, Provider<h70.h> provider15) {
        this.f49959a = provider;
        this.f49960b = provider2;
        this.f49961c = provider3;
        this.f49962d = provider4;
        this.f49963e = provider5;
        this.f49964f = provider6;
        this.f49965g = provider7;
        this.f49966h = provider8;
        this.f49967i = provider9;
        this.f49968j = provider10;
        this.f49969k = provider11;
        this.f49970l = provider12;
        this.f49971m = provider13;
        this.f49972n = provider14;
        this.f49973o = provider15;
    }

    public static m a(Provider<Application> provider, Provider<w70.j> provider2, Provider<PaymentConfiguration> provider3, Provider<d.Configuration> provider4, Provider<g.c> provider5, Provider<o30.d> provider6, Provider<z60.g> provider7, Provider<b40.b> provider8, Provider<CoroutineContext> provider9, Provider<wn0.a<Boolean>> provider10, Provider<com.stripe.android.paymentsheet.h.d> provider11, Provider<h> provider12, Provider<l70.d> provider13, Provider<t.a> provider14, Provider<h70.h> provider15) {
        return new m(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15);
    }

    public static l c(Application application, w70.j jVar, Provider<PaymentConfiguration> provider, d.Configuration configuration, g.c cVar, o30.d dVar, z60.g gVar, b40.b bVar, CoroutineContext coroutineContext, wn0.a<Boolean> aVar, com.stripe.android.paymentsheet.h.d dVar2, h hVar, l70.d dVar3, t.a aVar2, h70.h hVar2) {
        return new l(application, jVar, provider, configuration, cVar, dVar, gVar, bVar, coroutineContext, aVar, dVar2, hVar, dVar3, aVar2, hVar2);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l get() {
        return c(this.f49959a.get(), this.f49960b.get(), this.f49961c, this.f49962d.get(), this.f49963e.get(), this.f49964f.get(), this.f49965g.get(), this.f49966h.get(), this.f49967i.get(), this.f49968j.get(), this.f49969k.get(), this.f49970l.get(), this.f49971m.get(), this.f49972n.get(), this.f49973o.get());
    }
}
