package e50;

import javax.inject.Provider;
import n40.b0;
import n40.h0;
import n40.p0;
import z50.p;

/* JADX INFO: loaded from: classes7.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<p0> f62058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<h0> f62059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<p> f62060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<j40.f> f62061d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<b0> f62062e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider<o50.f> f62063f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider<o30.d> f62064g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Provider<h50.f> f62065h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Provider<a> f62066i;

    public k(Provider<p0> provider, Provider<h0> provider2, Provider<p> provider3, Provider<j40.f> provider4, Provider<b0> provider5, Provider<o50.f> provider6, Provider<o30.d> provider7, Provider<h50.f> provider8, Provider<a> provider9) {
        this.f62058a = provider;
        this.f62059b = provider2;
        this.f62060c = provider3;
        this.f62061d = provider4;
        this.f62062e = provider5;
        this.f62063f = provider6;
        this.f62064g = provider7;
        this.f62065h = provider8;
        this.f62066i = provider9;
    }

    public static k a(Provider<p0> provider, Provider<h0> provider2, Provider<p> provider3, Provider<j40.f> provider4, Provider<b0> provider5, Provider<o50.f> provider6, Provider<o30.d> provider7, Provider<h50.f> provider8, Provider<a> provider9) {
        return new k(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static i c(NetworkingLinkSignupState networkingLinkSignupState, p0 p0Var, h0 h0Var, p pVar, j40.f fVar, b0 b0Var, o50.f fVar2, o30.d dVar, h50.f fVar3, a aVar) {
        return new i(networkingLinkSignupState, p0Var, h0Var, pVar, fVar, b0Var, fVar2, dVar, fVar3, aVar);
    }

    public i b(NetworkingLinkSignupState networkingLinkSignupState) {
        return c(networkingLinkSignupState, this.f62058a.get(), this.f62059b.get(), this.f62060c.get(), this.f62061d.get(), this.f62062e.get(), this.f62063f.get(), this.f62064g.get(), this.f62065h.get(), this.f62066i.get());
    }
}
