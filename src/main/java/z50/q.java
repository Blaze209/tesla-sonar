package z50;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class q implements qj0.e<p> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<o30.d> f127021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<j40.f> f127022b;

    public q(Provider<o30.d> provider, Provider<j40.f> provider2) {
        this.f127021a = provider;
        this.f127022b = provider2;
    }

    public static q a(Provider<o30.d> provider, Provider<j40.f> provider2) {
        return new q(provider, provider2);
    }

    public static p c(o30.d dVar, j40.f fVar) {
        return new p(dVar, fVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public p get() {
        return c(this.f127021a.get(), this.f127022b.get());
    }
}
