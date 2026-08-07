package n40;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements qj0.e<g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<p0> f93111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<t50.p> f93112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<com.stripe.android.financialconnections.a.Configuration> f93113c;

    public h(Provider<p0> provider, Provider<t50.p> provider2, Provider<com.stripe.android.financialconnections.a.Configuration> provider3) {
        this.f93111a = provider;
        this.f93112b = provider2;
        this.f93113c = provider3;
    }

    public static h a(Provider<p0> provider, Provider<t50.p> provider2, Provider<com.stripe.android.financialconnections.a.Configuration> provider3) {
        return new h(provider, provider2, provider3);
    }

    public static g c(p0 p0Var, t50.p pVar, com.stripe.android.financialconnections.a.Configuration configuration) {
        return new g(p0Var, pVar, configuration);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g get() {
        return c(this.f93111a.get(), this.f93112b.get(), this.f93113c.get());
    }
}
