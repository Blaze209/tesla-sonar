package v50;

import javax.inject.Provider;
import z50.p;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements qj0.e<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<p> f117916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<j40.f> f117917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<o30.d> f117918c;

    public e(Provider<p> provider, Provider<j40.f> provider2, Provider<o30.d> provider3) {
        this.f117916a = provider;
        this.f117917b = provider2;
        this.f117918c = provider3;
    }

    public static e a(Provider<p> provider, Provider<j40.f> provider2, Provider<o30.d> provider3) {
        return new e(provider, provider2, provider3);
    }

    public static d c(p pVar, j40.f fVar, o30.d dVar) {
        return new d(pVar, fVar, dVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c(this.f117916a.get(), this.f117917b.get(), this.f117918c.get());
    }
}
