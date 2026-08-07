package n40;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class y0 implements qj0.e<x0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<t50.r> f93329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<com.stripe.android.financialconnections.a.Configuration> f93330b;

    public y0(Provider<t50.r> provider, Provider<com.stripe.android.financialconnections.a.Configuration> provider2) {
        this.f93329a = provider;
        this.f93330b = provider2;
    }

    public static y0 a(Provider<t50.r> provider, Provider<com.stripe.android.financialconnections.a.Configuration> provider2) {
        return new y0(provider, provider2);
    }

    public static x0 c(t50.r rVar, com.stripe.android.financialconnections.a.Configuration configuration) {
        return new x0(rVar, configuration);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public x0 get() {
        return c(this.f93329a.get(), this.f93330b.get());
    }
}
