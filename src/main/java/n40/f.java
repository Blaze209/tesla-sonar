package n40;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements qj0.e<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<p0> f93084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<t50.p> f93085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<com.stripe.android.financialconnections.a.Configuration> f93086c;

    public f(Provider<p0> provider, Provider<t50.p> provider2, Provider<com.stripe.android.financialconnections.a.Configuration> provider3) {
        this.f93084a = provider;
        this.f93085b = provider2;
        this.f93086c = provider3;
    }

    public static f a(Provider<p0> provider, Provider<t50.p> provider2, Provider<com.stripe.android.financialconnections.a.Configuration> provider3) {
        return new f(provider, provider2, provider3);
    }

    public static e c(p0 p0Var, t50.p pVar, com.stripe.android.financialconnections.a.Configuration configuration) {
        return new e(p0Var, pVar, configuration);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e get() {
        return c(this.f93084a.get(), this.f93085b.get(), this.f93086c.get());
    }
}
