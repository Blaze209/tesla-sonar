package w40;

import javax.inject.Provider;
import n40.b0;
import n40.p0;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<p0> f120798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<b0> f120799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<p0> f120800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<j40.f> f120801d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<o50.f> f120802e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider<o30.d> f120803f;

    public e(Provider<p0> provider, Provider<b0> provider2, Provider<p0> provider3, Provider<j40.f> provider4, Provider<o50.f> provider5, Provider<o30.d> provider6) {
        this.f120798a = provider;
        this.f120799b = provider2;
        this.f120800c = provider3;
        this.f120801d = provider4;
        this.f120802e = provider5;
        this.f120803f = provider6;
    }

    public static e a(Provider<p0> provider, Provider<b0> provider2, Provider<p0> provider3, Provider<j40.f> provider4, Provider<o50.f> provider5, Provider<o30.d> provider6) {
        return new e(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static d c(ExitState exitState, p0 p0Var, b0 b0Var, p0 p0Var2, j40.f fVar, o50.f fVar2, o30.d dVar) {
        return new d(exitState, p0Var, b0Var, p0Var2, fVar, fVar2, dVar);
    }

    public d b(ExitState exitState) {
        return c(exitState, this.f120798a.get(), this.f120799b.get(), this.f120800c.get(), this.f120801d.get(), this.f120802e.get(), this.f120803f.get());
    }
}
