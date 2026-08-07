package i50;

import j40.f;
import javax.inject.Provider;
import n40.b0;
import n40.b1;
import n40.d0;
import n40.g;
import n40.l1;
import n40.p0;
import n40.x0;
import n40.z0;
import z50.p;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<g> f75976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<b1> f75977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<n40.e> f75978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<l1> f75979d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<f> f75980e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider<String> f75981f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider<p> f75982g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Provider<z0> f75983h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Provider<b0> f75984i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Provider<k40.a> f75985j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Provider<d0> f75986k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Provider<o50.f> f75987l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Provider<x0> f75988m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Provider<o30.d> f75989n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Provider<h50.f> f75990o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Provider<p0> f75991p;

    public c(Provider<g> provider, Provider<b1> provider2, Provider<n40.e> provider3, Provider<l1> provider4, Provider<f> provider5, Provider<String> provider6, Provider<p> provider7, Provider<z0> provider8, Provider<b0> provider9, Provider<k40.a> provider10, Provider<d0> provider11, Provider<o50.f> provider12, Provider<x0> provider13, Provider<o30.d> provider14, Provider<h50.f> provider15, Provider<p0> provider16) {
        this.f75976a = provider;
        this.f75977b = provider2;
        this.f75978c = provider3;
        this.f75979d = provider4;
        this.f75980e = provider5;
        this.f75981f = provider6;
        this.f75982g = provider7;
        this.f75983h = provider8;
        this.f75984i = provider9;
        this.f75985j = provider10;
        this.f75986k = provider11;
        this.f75987l = provider12;
        this.f75988m = provider13;
        this.f75989n = provider14;
        this.f75990o = provider15;
        this.f75991p = provider16;
    }

    public static c a(Provider<g> provider, Provider<b1> provider2, Provider<n40.e> provider3, Provider<l1> provider4, Provider<f> provider5, Provider<String> provider6, Provider<p> provider7, Provider<z0> provider8, Provider<b0> provider9, Provider<k40.a> provider10, Provider<d0> provider11, Provider<o50.f> provider12, Provider<x0> provider13, Provider<o30.d> provider14, Provider<h50.f> provider15, Provider<p0> provider16) {
        return new c(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16);
    }

    public static b c(g gVar, b1 b1Var, n40.e eVar, l1 l1Var, f fVar, String str, p pVar, z0 z0Var, b0 b0Var, k40.a aVar, d0 d0Var, o50.f fVar2, x0 x0Var, o30.d dVar, h50.f fVar3, SharedPartnerAuthState sharedPartnerAuthState, p0 p0Var) {
        return new b(gVar, b1Var, eVar, l1Var, fVar, str, pVar, z0Var, b0Var, aVar, d0Var, fVar2, x0Var, dVar, fVar3, sharedPartnerAuthState, p0Var);
    }

    public b b(SharedPartnerAuthState sharedPartnerAuthState) {
        return c(this.f75976a.get(), this.f75977b.get(), this.f75978c.get(), this.f75979d.get(), this.f75980e.get(), this.f75981f.get(), this.f75982g.get(), this.f75983h.get(), this.f75984i.get(), this.f75985j.get(), this.f75986k.get(), this.f75987l.get(), this.f75988m.get(), this.f75989n.get(), this.f75990o.get(), sharedPartnerAuthState, this.f75991p.get());
    }
}
