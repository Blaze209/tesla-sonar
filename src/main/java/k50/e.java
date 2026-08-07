package k50;

import javax.inject.Provider;
import n40.b0;
import n40.p0;
import n40.y;
import t50.z;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<y> f85052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<b0> f85053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<z> f85054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<j40.f> f85055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<o30.d> f85056e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider<p0> f85057f;

    public e(Provider<y> provider, Provider<b0> provider2, Provider<z> provider3, Provider<j40.f> provider4, Provider<o30.d> provider5, Provider<p0> provider6) {
        this.f85052a = provider;
        this.f85053b = provider2;
        this.f85054c = provider3;
        this.f85055d = provider4;
        this.f85056e = provider5;
        this.f85057f = provider6;
    }

    public static e a(Provider<y> provider, Provider<b0> provider2, Provider<z> provider3, Provider<j40.f> provider4, Provider<o30.d> provider5, Provider<p0> provider6) {
        return new e(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static d c(SuccessState successState, y yVar, b0 b0Var, z zVar, j40.f fVar, o30.d dVar, p0 p0Var) {
        return new d(successState, yVar, b0Var, zVar, fVar, dVar, p0Var);
    }

    public d b(SuccessState successState) {
        return c(successState, this.f85052a.get(), this.f85053b.get(), this.f85054c.get(), this.f85055d.get(), this.f85056e.get(), this.f85057f.get());
    }
}
