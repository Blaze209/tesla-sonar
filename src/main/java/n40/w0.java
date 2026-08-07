package n40;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class w0 implements qj0.e<u0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<t50.h> f93312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<com.stripe.android.financialconnections.a.Configuration> f93313b;

    public w0(Provider<t50.h> provider, Provider<com.stripe.android.financialconnections.a.Configuration> provider2) {
        this.f93312a = provider;
        this.f93313b = provider2;
    }

    public static w0 a(Provider<t50.h> provider, Provider<com.stripe.android.financialconnections.a.Configuration> provider2) {
        return new w0(provider, provider2);
    }

    public static u0 c(t50.h hVar, com.stripe.android.financialconnections.a.Configuration configuration) {
        return new u0(hVar, configuration);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public u0 get() {
        return c(this.f93312a.get(), this.f93313b.get());
    }
}
