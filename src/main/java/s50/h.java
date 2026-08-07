package s50;

import androidx.p003lifecycle.s0;
import javax.inject.Provider;
import m40.p;
import n40.n;
import n40.p0;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements qj0.e<f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<p> f110280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<s0> f110281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<p0> f110282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<z50.p> f110283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<n40.i> f110284e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider<n> f110285f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider<j40.f> f110286g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Provider<o30.d> f110287h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Provider<o50.f> f110288i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Provider<String> f110289j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Provider<FinancialConnectionsSheetNativeState> f110290k;

    public h(Provider<p> provider, Provider<s0> provider2, Provider<p0> provider3, Provider<z50.p> provider4, Provider<n40.i> provider5, Provider<n> provider6, Provider<j40.f> provider7, Provider<o30.d> provider8, Provider<o50.f> provider9, Provider<String> provider10, Provider<FinancialConnectionsSheetNativeState> provider11) {
        this.f110280a = provider;
        this.f110281b = provider2;
        this.f110282c = provider3;
        this.f110283d = provider4;
        this.f110284e = provider5;
        this.f110285f = provider6;
        this.f110286g = provider7;
        this.f110287h = provider8;
        this.f110288i = provider9;
        this.f110289j = provider10;
        this.f110290k = provider11;
    }

    public static h a(Provider<p> provider, Provider<s0> provider2, Provider<p0> provider3, Provider<z50.p> provider4, Provider<n40.i> provider5, Provider<n> provider6, Provider<j40.f> provider7, Provider<o30.d> provider8, Provider<o50.f> provider9, Provider<String> provider10, Provider<FinancialConnectionsSheetNativeState> provider11) {
        return new h(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    public static f c(p pVar, s0 s0Var, p0 p0Var, z50.p pVar2, n40.i iVar, n nVar, j40.f fVar, o30.d dVar, o50.f fVar2, String str, FinancialConnectionsSheetNativeState financialConnectionsSheetNativeState) {
        return new f(pVar, s0Var, p0Var, pVar2, iVar, nVar, fVar, dVar, fVar2, str, financialConnectionsSheetNativeState);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public f get() {
        return c(this.f110280a.get(), this.f110281b.get(), this.f110282c.get(), this.f110283d.get(), this.f110284e.get(), this.f110285f.get(), this.f110286g.get(), this.f110287h.get(), this.f110288i.get(), this.f110289j.get(), this.f110290k.get());
    }
}
