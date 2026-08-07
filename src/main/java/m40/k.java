package m40;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements qj0.e<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<com.stripe.android.financialconnections.a.Configuration> f91189a;

    public k(Provider<com.stripe.android.financialconnections.a.Configuration> provider) {
        this.f91189a = provider;
    }

    public static k a(Provider<com.stripe.android.financialconnections.a.Configuration> provider) {
        return new k(provider);
    }

    public static String c(com.stripe.android.financialconnections.a.Configuration configuration) {
        return f.f91173a.e(configuration);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return c(this.f91189a.get());
    }
}
