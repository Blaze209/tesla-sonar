package n40;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class o0 implements qj0.e<n0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<com.stripe.android.financialconnections.a.Configuration> f93219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<t50.p> f93220b;

    public o0(Provider<com.stripe.android.financialconnections.a.Configuration> provider, Provider<t50.p> provider2) {
        this.f93219a = provider;
        this.f93220b = provider2;
    }

    public static o0 a(Provider<com.stripe.android.financialconnections.a.Configuration> provider, Provider<t50.p> provider2) {
        return new o0(provider, provider2);
    }

    public static n0 c(com.stripe.android.financialconnections.a.Configuration configuration, t50.p pVar) {
        return new n0(configuration, pVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public n0 get() {
        return c(this.f93219a.get(), this.f93220b.get());
    }
}
