package d50;

import javax.inject.Provider;
import n40.b0;
import n40.d0;
import n40.o;
import n40.p0;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<p0> f59615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<j40.f> f59616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<d0> f59617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<b0> f59618d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<o> f59619e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider<o50.f> f59620f;

    public e(Provider<p0> provider, Provider<j40.f> provider2, Provider<d0> provider3, Provider<b0> provider4, Provider<o> provider5, Provider<o50.f> provider6) {
        this.f59615a = provider;
        this.f59616b = provider2;
        this.f59617c = provider3;
        this.f59618d = provider4;
        this.f59619e = provider5;
        this.f59620f = provider6;
    }

    public static e a(Provider<p0> provider, Provider<j40.f> provider2, Provider<d0> provider3, Provider<b0> provider4, Provider<o> provider5, Provider<o50.f> provider6) {
        return new e(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static d c(NetworkingLinkLoginWarmupState networkingLinkLoginWarmupState, p0 p0Var, j40.f fVar, d0 d0Var, b0 b0Var, o oVar, o50.f fVar2) {
        return new d(networkingLinkLoginWarmupState, p0Var, fVar, d0Var, b0Var, oVar, fVar2);
    }

    public d b(NetworkingLinkLoginWarmupState networkingLinkLoginWarmupState) {
        return c(networkingLinkLoginWarmupState, this.f59615a.get(), this.f59616b.get(), this.f59617c.get(), this.f59618d.get(), this.f59619e.get(), this.f59620f.get());
    }
}
