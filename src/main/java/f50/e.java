package f50;

import javax.inject.Provider;
import n40.b0;
import n40.d0;
import n40.e0;
import n40.j0;
import n40.l;
import n40.n0;
import n40.p0;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<p0> f64499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<b0> f64500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<l> f64501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<n0> f64502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<o50.f> f64503e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider<j40.f> f64504f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider<j0> f64505g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Provider<o30.d> f64506h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Provider<e0> f64507i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Provider<n40.c> f64508j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Provider<t50.f> f64509k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Provider<d0> f64510l;

    public e(Provider<p0> provider, Provider<b0> provider2, Provider<l> provider3, Provider<n0> provider4, Provider<o50.f> provider5, Provider<j40.f> provider6, Provider<j0> provider7, Provider<o30.d> provider8, Provider<e0> provider9, Provider<n40.c> provider10, Provider<t50.f> provider11, Provider<d0> provider12) {
        this.f64499a = provider;
        this.f64500b = provider2;
        this.f64501c = provider3;
        this.f64502d = provider4;
        this.f64503e = provider5;
        this.f64504f = provider6;
        this.f64505g = provider7;
        this.f64506h = provider8;
        this.f64507i = provider9;
        this.f64508j = provider10;
        this.f64509k = provider11;
        this.f64510l = provider12;
    }

    public static e a(Provider<p0> provider, Provider<b0> provider2, Provider<l> provider3, Provider<n0> provider4, Provider<o50.f> provider5, Provider<j40.f> provider6, Provider<j0> provider7, Provider<o30.d> provider8, Provider<e0> provider9, Provider<n40.c> provider10, Provider<t50.f> provider11, Provider<d0> provider12) {
        return new e(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12);
    }

    public static d c(NetworkingLinkVerificationState networkingLinkVerificationState, p0 p0Var, b0 b0Var, l lVar, n0 n0Var, o50.f fVar, j40.f fVar2, j0 j0Var, o30.d dVar, e0 e0Var, n40.c cVar, t50.f fVar3, d0 d0Var) {
        return new d(networkingLinkVerificationState, p0Var, b0Var, lVar, n0Var, fVar, fVar2, j0Var, dVar, e0Var, cVar, fVar3, d0Var);
    }

    public d b(NetworkingLinkVerificationState networkingLinkVerificationState) {
        return c(networkingLinkVerificationState, this.f64499a.get(), this.f64500b.get(), this.f64501c.get(), this.f64502d.get(), this.f64503e.get(), this.f64504f.get(), this.f64505g.get(), this.f64506h.get(), this.f64507i.get(), this.f64508j.get(), this.f64509k.get(), this.f64510l.get());
    }
}
