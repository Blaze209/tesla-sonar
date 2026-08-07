package n40;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class s1 implements qj0.e<r1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<t50.h> f93264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<com.stripe.android.financialconnections.a.Configuration> f93265b;

    public s1(Provider<t50.h> provider, Provider<com.stripe.android.financialconnections.a.Configuration> provider2) {
        this.f93264a = provider;
        this.f93265b = provider2;
    }

    public static s1 a(Provider<t50.h> provider, Provider<com.stripe.android.financialconnections.a.Configuration> provider2) {
        return new s1(provider, provider2);
    }

    public static r1 c(t50.h hVar, com.stripe.android.financialconnections.a.Configuration configuration) {
        return new r1(hVar, configuration);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public r1 get() {
        return c(this.f93264a.get(), this.f93265b.get());
    }
}
