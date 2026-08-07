package n40;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class u1 implements qj0.e<t1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<com.stripe.android.financialconnections.a.Configuration> f93298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<t50.z> f93299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<t50.h> f93300c;

    public u1(Provider<com.stripe.android.financialconnections.a.Configuration> provider, Provider<t50.z> provider2, Provider<t50.h> provider3) {
        this.f93298a = provider;
        this.f93299b = provider2;
        this.f93300c = provider3;
    }

    public static u1 a(Provider<com.stripe.android.financialconnections.a.Configuration> provider, Provider<t50.z> provider2, Provider<t50.h> provider3) {
        return new u1(provider, provider2, provider3);
    }

    public static t1 c(com.stripe.android.financialconnections.a.Configuration configuration, t50.z zVar, t50.h hVar) {
        return new t1(configuration, zVar, hVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public t1 get() {
        return c(this.f93298a.get(), this.f93299b.get(), this.f93300c.get());
    }
}
