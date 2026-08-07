package n40;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class p implements qj0.e<o> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<com.stripe.android.financialconnections.a.Configuration> f93227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<t50.p> f93228b;

    public p(Provider<com.stripe.android.financialconnections.a.Configuration> provider, Provider<t50.p> provider2) {
        this.f93227a = provider;
        this.f93228b = provider2;
    }

    public static p a(Provider<com.stripe.android.financialconnections.a.Configuration> provider, Provider<t50.p> provider2) {
        return new p(provider, provider2);
    }

    public static o c(com.stripe.android.financialconnections.a.Configuration configuration, t50.p pVar) {
        return new o(configuration, pVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public o get() {
        return c(this.f93227a.get(), this.f93228b.get());
    }
}
