package n40;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class g0 implements qj0.e<f0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<t50.p> f93105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<com.stripe.android.financialconnections.a.Configuration> f93106b;

    public g0(Provider<t50.p> provider, Provider<com.stripe.android.financialconnections.a.Configuration> provider2) {
        this.f93105a = provider;
        this.f93106b = provider2;
    }

    public static g0 a(Provider<t50.p> provider, Provider<com.stripe.android.financialconnections.a.Configuration> provider2) {
        return new g0(provider, provider2);
    }

    public static f0 c(t50.p pVar, com.stripe.android.financialconnections.a.Configuration configuration) {
        return new f0(pVar, configuration);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public f0 get() {
        return c(this.f93105a.get(), this.f93106b.get());
    }
}
