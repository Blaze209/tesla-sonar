package n40;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements qj0.e<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<t50.p> f93048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<com.stripe.android.financialconnections.a.Configuration> f93049b;

    public b(Provider<t50.p> provider, Provider<com.stripe.android.financialconnections.a.Configuration> provider2) {
        this.f93048a = provider;
        this.f93049b = provider2;
    }

    public static b a(Provider<t50.p> provider, Provider<com.stripe.android.financialconnections.a.Configuration> provider2) {
        return new b(provider, provider2);
    }

    public static a c(t50.p pVar, com.stripe.android.financialconnections.a.Configuration configuration) {
        return new a(pVar, configuration);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f93048a.get(), this.f93049b.get());
    }
}
