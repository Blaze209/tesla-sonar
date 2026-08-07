package v40;

import j40.f;
import javax.inject.Provider;
import n40.b0;
import n40.p0;
import t50.l;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<p0> f117843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<b0> f117844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<l> f117845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<f> f117846d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<o50.f> f117847e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider<o30.d> f117848f;

    public d(Provider<p0> provider, Provider<b0> provider2, Provider<l> provider3, Provider<f> provider4, Provider<o50.f> provider5, Provider<o30.d> provider6) {
        this.f117843a = provider;
        this.f117844b = provider2;
        this.f117845c = provider3;
        this.f117846d = provider4;
        this.f117847e = provider5;
        this.f117848f = provider6;
    }

    public static d a(Provider<p0> provider, Provider<b0> provider2, Provider<l> provider3, Provider<f> provider4, Provider<o50.f> provider5, Provider<o30.d> provider6) {
        return new d(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static c c(ErrorState errorState, p0 p0Var, b0 b0Var, l lVar, f fVar, o50.f fVar2, o30.d dVar) {
        return new c(errorState, p0Var, b0Var, lVar, fVar, fVar2, dVar);
    }

    public c b(ErrorState errorState) {
        return c(errorState, this.f117843a.get(), this.f117844b.get(), this.f117845c.get(), this.f117846d.get(), this.f117847e.get(), this.f117848f.get());
    }
}
