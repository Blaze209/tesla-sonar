package g50;

import javax.inject.Provider;
import n40.b0;
import n40.l;
import n40.n0;
import n40.n1;
import n40.p0;
import n40.v1;
import n40.y;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<p0> f67431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<j40.f> f67432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<t50.f> f67433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<v1> f67434d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<b0> f67435e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider<l> f67436f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider<t50.c> f67437g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Provider<n0> f67438h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Provider<y> f67439i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Provider<n1> f67440j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Provider<o50.f> f67441k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Provider<o30.d> f67442l;

    public e(Provider<p0> provider, Provider<j40.f> provider2, Provider<t50.f> provider3, Provider<v1> provider4, Provider<b0> provider5, Provider<l> provider6, Provider<t50.c> provider7, Provider<n0> provider8, Provider<y> provider9, Provider<n1> provider10, Provider<o50.f> provider11, Provider<o30.d> provider12) {
        this.f67431a = provider;
        this.f67432b = provider2;
        this.f67433c = provider3;
        this.f67434d = provider4;
        this.f67435e = provider5;
        this.f67436f = provider6;
        this.f67437g = provider7;
        this.f67438h = provider8;
        this.f67439i = provider9;
        this.f67440j = provider10;
        this.f67441k = provider11;
        this.f67442l = provider12;
    }

    public static e a(Provider<p0> provider, Provider<j40.f> provider2, Provider<t50.f> provider3, Provider<v1> provider4, Provider<b0> provider5, Provider<l> provider6, Provider<t50.c> provider7, Provider<n0> provider8, Provider<y> provider9, Provider<n1> provider10, Provider<o50.f> provider11, Provider<o30.d> provider12) {
        return new e(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12);
    }

    public static d c(NetworkingSaveToLinkVerificationState networkingSaveToLinkVerificationState, p0 p0Var, j40.f fVar, t50.f fVar2, v1 v1Var, b0 b0Var, l lVar, t50.c cVar, n0 n0Var, y yVar, n1 n1Var, o50.f fVar3, o30.d dVar) {
        return new d(networkingSaveToLinkVerificationState, p0Var, fVar, fVar2, v1Var, b0Var, lVar, cVar, n0Var, yVar, n1Var, fVar3, dVar);
    }

    public d b(NetworkingSaveToLinkVerificationState networkingSaveToLinkVerificationState) {
        return c(networkingSaveToLinkVerificationState, this.f67431a.get(), this.f67432b.get(), this.f67433c.get(), this.f67434d.get(), this.f67435e.get(), this.f67436f.get(), this.f67437g.get(), this.f67438h.get(), this.f67439i.get(), this.f67440j.get(), this.f67441k.get(), this.f67442l.get());
    }
}
