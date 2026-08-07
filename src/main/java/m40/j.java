package m40;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements qj0.e<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<com.stripe.android.financialconnections.a.Configuration> f91186a;

    public j(Provider<com.stripe.android.financialconnections.a.Configuration> provider) {
        this.f91186a = provider;
    }

    public static j a(Provider<com.stripe.android.financialconnections.a.Configuration> provider) {
        return new j(provider);
    }

    public static String c(com.stripe.android.financialconnections.a.Configuration configuration) {
        return (String) qj0.h.d(f.f91173a.d(configuration));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return c(this.f91186a.get());
    }
}
