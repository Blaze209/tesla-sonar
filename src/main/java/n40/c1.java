package n40;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class c1 implements qj0.e<b1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<t50.p> f93068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<com.stripe.android.financialconnections.a.Configuration> f93069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<String> f93070c;

    public c1(Provider<t50.p> provider, Provider<com.stripe.android.financialconnections.a.Configuration> provider2, Provider<String> provider3) {
        this.f93068a = provider;
        this.f93069b = provider2;
        this.f93070c = provider3;
    }

    public static c1 a(Provider<t50.p> provider, Provider<com.stripe.android.financialconnections.a.Configuration> provider2, Provider<String> provider3) {
        return new c1(provider, provider2, provider3);
    }

    public static b1 c(t50.p pVar, com.stripe.android.financialconnections.a.Configuration configuration, String str) {
        return new b1(pVar, configuration, str);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b1 get() {
        return c(this.f93068a.get(), this.f93069b.get(), this.f93070c.get());
    }
}
