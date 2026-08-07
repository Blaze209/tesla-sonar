package t40;

import javax.inject.Provider;
import n40.b0;
import n40.p0;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<p0> f112472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<n40.a> f112473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<b0> f112474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<o50.f> f112475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<j40.f> f112476e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider<v50.d> f112477f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider<o30.d> f112478g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Provider<h50.f> f112479h;

    public f(Provider<p0> provider, Provider<n40.a> provider2, Provider<b0> provider3, Provider<o50.f> provider4, Provider<j40.f> provider5, Provider<v50.d> provider6, Provider<o30.d> provider7, Provider<h50.f> provider8) {
        this.f112472a = provider;
        this.f112473b = provider2;
        this.f112474c = provider3;
        this.f112475d = provider4;
        this.f112476e = provider5;
        this.f112477f = provider6;
        this.f112478g = provider7;
        this.f112479h = provider8;
    }

    public static f a(Provider<p0> provider, Provider<n40.a> provider2, Provider<b0> provider3, Provider<o50.f> provider4, Provider<j40.f> provider5, Provider<v50.d> provider6, Provider<o30.d> provider7, Provider<h50.f> provider8) {
        return new f(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static d c(ConsentState consentState, p0 p0Var, n40.a aVar, b0 b0Var, o50.f fVar, j40.f fVar2, v50.d dVar, o30.d dVar2, h50.f fVar3) {
        return new d(consentState, p0Var, aVar, b0Var, fVar, fVar2, dVar, dVar2, fVar3);
    }

    public d b(ConsentState consentState) {
        return c(consentState, this.f112472a.get(), this.f112473b.get(), this.f112474c.get(), this.f112475d.get(), this.f112476e.get(), this.f112477f.get(), this.f112478g.get(), this.f112479h.get());
    }
}
