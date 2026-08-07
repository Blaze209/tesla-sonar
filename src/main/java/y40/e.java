package y40;

import javax.inject.Provider;
import n40.b0;
import n40.b1;
import n40.d0;
import n40.p0;
import n40.p1;
import n40.q;
import n40.z1;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<com.stripe.android.financialconnections.a.Configuration> f124938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<b1> f124939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<b0> f124940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<p1> f124941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<q> f124942e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider<j40.f> f124943f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider<d0> f124944g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Provider<o50.f> f124945h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Provider<z1> f124946i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Provider<o30.d> f124947j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Provider<p0> f124948k;

    public e(Provider<com.stripe.android.financialconnections.a.Configuration> provider, Provider<b1> provider2, Provider<b0> provider3, Provider<p1> provider4, Provider<q> provider5, Provider<j40.f> provider6, Provider<d0> provider7, Provider<o50.f> provider8, Provider<z1> provider9, Provider<o30.d> provider10, Provider<p0> provider11) {
        this.f124938a = provider;
        this.f124939b = provider2;
        this.f124940c = provider3;
        this.f124941d = provider4;
        this.f124942e = provider5;
        this.f124943f = provider6;
        this.f124944g = provider7;
        this.f124945h = provider8;
        this.f124946i = provider9;
        this.f124947j = provider10;
        this.f124948k = provider11;
    }

    public static e a(Provider<com.stripe.android.financialconnections.a.Configuration> provider, Provider<b1> provider2, Provider<b0> provider3, Provider<p1> provider4, Provider<q> provider5, Provider<j40.f> provider6, Provider<d0> provider7, Provider<o50.f> provider8, Provider<z1> provider9, Provider<o30.d> provider10, Provider<p0> provider11) {
        return new e(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    public static d c(com.stripe.android.financialconnections.a.Configuration configuration, b1 b1Var, b0 b0Var, p1 p1Var, q qVar, j40.f fVar, d0 d0Var, o50.f fVar2, z1 z1Var, o30.d dVar, InstitutionPickerState institutionPickerState, p0 p0Var) {
        return new d(configuration, b1Var, b0Var, p1Var, qVar, fVar, d0Var, fVar2, z1Var, dVar, institutionPickerState, p0Var);
    }

    public d b(InstitutionPickerState institutionPickerState) {
        return c(this.f124938a.get(), this.f124939b.get(), this.f124940c.get(), this.f124941d.get(), this.f124942e.get(), this.f124943f.get(), this.f124944g.get(), this.f124945h.get(), this.f124946i.get(), this.f124947j.get(), institutionPickerState, this.f124948k.get());
    }
}
