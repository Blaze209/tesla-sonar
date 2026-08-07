package n40;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class a0 implements qj0.e<y> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<t50.h> f93042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<com.stripe.android.financialconnections.a.Configuration> f93043b;

    public a0(Provider<t50.h> provider, Provider<com.stripe.android.financialconnections.a.Configuration> provider2) {
        this.f93042a = provider;
        this.f93043b = provider2;
    }

    public static a0 a(Provider<t50.h> provider, Provider<com.stripe.android.financialconnections.a.Configuration> provider2) {
        return new a0(provider, provider2);
    }

    public static y c(t50.h hVar, com.stripe.android.financialconnections.a.Configuration configuration) {
        return new y(hVar, configuration);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public y get() {
        return c(this.f93042a.get(), this.f93043b.get());
    }
}
