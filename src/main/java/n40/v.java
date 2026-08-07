package n40;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class v implements qj0.e<u> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<t50.h> f93301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<com.stripe.android.financialconnections.a.Configuration> f93302b;

    public v(Provider<t50.h> provider, Provider<com.stripe.android.financialconnections.a.Configuration> provider2) {
        this.f93301a = provider;
        this.f93302b = provider2;
    }

    public static v a(Provider<t50.h> provider, Provider<com.stripe.android.financialconnections.a.Configuration> provider2) {
        return new v(provider, provider2);
    }

    public static u c(t50.h hVar, com.stripe.android.financialconnections.a.Configuration configuration) {
        return new u(hVar, configuration);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public u get() {
        return c(this.f93301a.get(), this.f93302b.get());
    }
}
