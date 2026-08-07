package p40;

import javax.inject.Provider;
import n40.p0;
import n40.z1;
import o50.f;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<p0> f101093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<t50.a> f101094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<f> f101095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<j40.f> f101096d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<z1> f101097e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider<o30.d> f101098f;

    public d(Provider<p0> provider, Provider<t50.a> provider2, Provider<f> provider3, Provider<j40.f> provider4, Provider<z1> provider5, Provider<o30.d> provider6) {
        this.f101093a = provider;
        this.f101094b = provider2;
        this.f101095c = provider3;
        this.f101096d = provider4;
        this.f101097e = provider5;
        this.f101098f = provider6;
    }

    public static d a(Provider<p0> provider, Provider<t50.a> provider2, Provider<f> provider3, Provider<j40.f> provider4, Provider<z1> provider5, Provider<o30.d> provider6) {
        return new d(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static c c(AccountUpdateRequiredState accountUpdateRequiredState, p0 p0Var, t50.a aVar, f fVar, j40.f fVar2, z1 z1Var, o30.d dVar) {
        return new c(accountUpdateRequiredState, p0Var, aVar, fVar, fVar2, z1Var, dVar);
    }

    public c b(AccountUpdateRequiredState accountUpdateRequiredState) {
        return c(accountUpdateRequiredState, this.f101093a.get(), this.f101094b.get(), this.f101095c.get(), this.f101096d.get(), this.f101097e.get(), this.f101098f.get());
    }
}
