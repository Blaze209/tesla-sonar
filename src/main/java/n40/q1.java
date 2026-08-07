package n40;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class q1 implements qj0.e<p1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<t50.n> f93239a;

    public q1(Provider<t50.n> provider) {
        this.f93239a = provider;
    }

    public static q1 a(Provider<t50.n> provider) {
        return new q1(provider);
    }

    public static p1 c(t50.n nVar) {
        return new p1(nVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public p1 get() {
        return c(this.f93239a.get());
    }
}
