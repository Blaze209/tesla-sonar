package n40;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class i0 implements qj0.e<h0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<t50.j> f93134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<com.stripe.android.financialconnections.a.Configuration> f93135b;

    public i0(Provider<t50.j> provider, Provider<com.stripe.android.financialconnections.a.Configuration> provider2) {
        this.f93134a = provider;
        this.f93135b = provider2;
    }

    public static i0 a(Provider<t50.j> provider, Provider<com.stripe.android.financialconnections.a.Configuration> provider2) {
        return new i0(provider, provider2);
    }

    public static h0 c(t50.j jVar, com.stripe.android.financialconnections.a.Configuration configuration) {
        return new h0(jVar, configuration);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public h0 get() {
        return c(this.f93134a.get(), this.f93135b.get());
    }
}
