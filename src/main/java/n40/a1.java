package n40;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class a1 implements qj0.e<z0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<t50.p> f93044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<o30.d> f93045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<com.stripe.android.financialconnections.a.Configuration> f93046c;

    public a1(Provider<t50.p> provider, Provider<o30.d> provider2, Provider<com.stripe.android.financialconnections.a.Configuration> provider3) {
        this.f93044a = provider;
        this.f93045b = provider2;
        this.f93046c = provider3;
    }

    public static a1 a(Provider<t50.p> provider, Provider<o30.d> provider2, Provider<com.stripe.android.financialconnections.a.Configuration> provider3) {
        return new a1(provider, provider2, provider3);
    }

    public static z0 c(t50.p pVar, o30.d dVar, com.stripe.android.financialconnections.a.Configuration configuration) {
        return new z0(pVar, dVar, configuration);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public z0 get() {
        return c(this.f93044a.get(), this.f93045b.get(), this.f93046c.get());
    }
}
