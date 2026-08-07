package e50;

import javax.inject.Provider;
import n40.b0;
import n40.n1;
import n40.y;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements qj0.e<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<b0> f61889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<y> f61890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<n1> f61891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<j40.f> f61892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<o50.f> f61893e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider<o30.d> f61894f;

    public e(Provider<b0> provider, Provider<y> provider2, Provider<n1> provider3, Provider<j40.f> provider4, Provider<o50.f> provider5, Provider<o30.d> provider6) {
        this.f61889a = provider;
        this.f61890b = provider2;
        this.f61891c = provider3;
        this.f61892d = provider4;
        this.f61893e = provider5;
        this.f61894f = provider6;
    }

    public static e a(Provider<b0> provider, Provider<y> provider2, Provider<n1> provider3, Provider<j40.f> provider4, Provider<o50.f> provider5, Provider<o30.d> provider6) {
        return new e(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static d c(b0 b0Var, y yVar, n1 n1Var, j40.f fVar, o50.f fVar2, o30.d dVar) {
        return new d(b0Var, yVar, n1Var, fVar, fVar2, dVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c(this.f61889a.get(), this.f61890b.get(), this.f61891c.get(), this.f61892d.get(), this.f61893e.get(), this.f61894f.get());
    }
}
