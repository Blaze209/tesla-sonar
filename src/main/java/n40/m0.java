package n40;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class m0 implements qj0.e<l0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<com.stripe.android.financialconnections.a.Configuration> f93182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<t50.p> f93183b;

    public m0(Provider<com.stripe.android.financialconnections.a.Configuration> provider, Provider<t50.p> provider2) {
        this.f93182a = provider;
        this.f93183b = provider2;
    }

    public static m0 a(Provider<com.stripe.android.financialconnections.a.Configuration> provider, Provider<t50.p> provider2) {
        return new m0(provider, provider2);
    }

    public static l0 c(com.stripe.android.financialconnections.a.Configuration configuration, t50.p pVar) {
        return new l0(configuration, pVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l0 get() {
        return c(this.f93182a.get(), this.f93183b.get());
    }
}
