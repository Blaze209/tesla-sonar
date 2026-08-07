package n40;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class e1 implements qj0.e<d1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<com.stripe.android.financialconnections.a.Configuration> f93082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<t50.j> f93083b;

    public e1(Provider<com.stripe.android.financialconnections.a.Configuration> provider, Provider<t50.j> provider2) {
        this.f93082a = provider;
        this.f93083b = provider2;
    }

    public static e1 a(Provider<com.stripe.android.financialconnections.a.Configuration> provider, Provider<t50.j> provider2) {
        return new e1(provider, provider2);
    }

    public static d1 c(com.stripe.android.financialconnections.a.Configuration configuration, t50.j jVar) {
        return new d1(configuration, jVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d1 get() {
        return c(this.f93082a.get(), this.f93083b.get());
    }
}
