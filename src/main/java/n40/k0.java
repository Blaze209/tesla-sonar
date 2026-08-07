package n40;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class k0 implements qj0.e<j0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<h0> f93158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<v1> f93159b;

    public k0(Provider<h0> provider, Provider<v1> provider2) {
        this.f93158a = provider;
        this.f93159b = provider2;
    }

    public static k0 a(Provider<h0> provider, Provider<v1> provider2) {
        return new k0(provider, provider2);
    }

    public static j0 c(h0 h0Var, v1 v1Var) {
        return new j0(h0Var, v1Var);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public j0 get() {
        return c(this.f93158a.get(), this.f93159b.get());
    }
}
