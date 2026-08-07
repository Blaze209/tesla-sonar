package n40;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class c0 implements qj0.e<b0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<t50.p> f93065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<com.stripe.android.financialconnections.a.Configuration> f93066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<String> f93067c;

    public c0(Provider<t50.p> provider, Provider<com.stripe.android.financialconnections.a.Configuration> provider2, Provider<String> provider3) {
        this.f93065a = provider;
        this.f93066b = provider2;
        this.f93067c = provider3;
    }

    public static c0 a(Provider<t50.p> provider, Provider<com.stripe.android.financialconnections.a.Configuration> provider2, Provider<String> provider3) {
        return new c0(provider, provider2, provider3);
    }

    public static b0 c(t50.p pVar, com.stripe.android.financialconnections.a.Configuration configuration, String str) {
        return new b0(pVar, configuration, str);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b0 get() {
        return c(this.f93065a.get(), this.f93066b.get(), this.f93067c.get());
    }
}
