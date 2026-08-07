package n40;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class m1 implements qj0.e<l1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<p0> f93184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<t50.p> f93185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<com.stripe.android.financialconnections.a.Configuration> f93186c;

    public m1(Provider<p0> provider, Provider<t50.p> provider2, Provider<com.stripe.android.financialconnections.a.Configuration> provider3) {
        this.f93184a = provider;
        this.f93185b = provider2;
        this.f93186c = provider3;
    }

    public static m1 a(Provider<p0> provider, Provider<t50.p> provider2, Provider<com.stripe.android.financialconnections.a.Configuration> provider3) {
        return new m1(provider, provider2, provider3);
    }

    public static l1 c(p0 p0Var, t50.p pVar, com.stripe.android.financialconnections.a.Configuration configuration) {
        return new l1(p0Var, pVar, configuration);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l1 get() {
        return c(this.f93184a.get(), this.f93185b.get(), this.f93186c.get());
    }
}
