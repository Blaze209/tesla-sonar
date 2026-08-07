package n40;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements qj0.e<i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<t50.r> f93155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<w> f93156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<com.stripe.android.financialconnections.a.Configuration> f93157c;

    public k(Provider<t50.r> provider, Provider<w> provider2, Provider<com.stripe.android.financialconnections.a.Configuration> provider3) {
        this.f93155a = provider;
        this.f93156b = provider2;
        this.f93157c = provider3;
    }

    public static k a(Provider<t50.r> provider, Provider<w> provider2, Provider<com.stripe.android.financialconnections.a.Configuration> provider3) {
        return new k(provider, provider2, provider3);
    }

    public static i c(t50.r rVar, w wVar, com.stripe.android.financialconnections.a.Configuration configuration) {
        return new i(rVar, wVar, configuration);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c(this.f93155a.get(), this.f93156b.get(), this.f93157c.get());
    }
}
