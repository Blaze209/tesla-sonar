package n40;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class r implements qj0.e<q> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<t50.n> f93240a;

    public r(Provider<t50.n> provider) {
        this.f93240a = provider;
    }

    public static r a(Provider<t50.n> provider) {
        return new r(provider);
    }

    public static q c(t50.n nVar) {
        return new q(nVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public q get() {
        return c(this.f93240a.get());
    }
}
