package r50;

import j40.l;
import javax.inject.Provider;
import o30.d;
import qj0.e;
import w30.j0;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements e<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<j0> f107047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<l> f107048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<wo0.b> f107049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<d> f107050d;

    public b(Provider<j0> provider, Provider<l> provider2, Provider<wo0.b> provider3, Provider<d> provider4) {
        this.f107047a = provider;
        this.f107048b = provider2;
        this.f107049c = provider3;
        this.f107050d = provider4;
    }

    public static b a(Provider<j0> provider, Provider<l> provider2, Provider<wo0.b> provider3, Provider<d> provider4) {
        return new b(provider, provider2, provider3, provider4);
    }

    public static a c(j0 j0Var, l lVar, wo0.b bVar, d dVar) {
        return new a(j0Var, lVar, bVar, dVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f107047a.get(), this.f107048b.get(), this.f107049c.get(), this.f107050d.get());
    }
}
