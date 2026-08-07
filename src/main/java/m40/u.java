package m40;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class u implements qj0.e<e50.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<n40.e0> f91209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<e50.b> f91210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<e50.d> f91211c;

    public u(Provider<n40.e0> provider, Provider<e50.b> provider2, Provider<e50.d> provider3) {
        this.f91209a = provider;
        this.f91210b = provider2;
        this.f91211c = provider3;
    }

    public static u a(Provider<n40.e0> provider, Provider<e50.b> provider2, Provider<e50.d> provider3) {
        return new u(provider, provider2, provider3);
    }

    public static e50.a c(n40.e0 e0Var, Provider<e50.b> provider, Provider<e50.d> provider2) {
        return (e50.a) qj0.h.d(q.INSTANCE.d(e0Var, provider, provider2));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e50.a get() {
        return c(this.f91209a.get(), this.f91210b, this.f91211c);
    }
}
