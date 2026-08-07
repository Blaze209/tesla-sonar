package n40;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class i1 implements qj0.e<h1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<t50.l> f93136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<j40.f> f93137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<o30.d> f93138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<o50.f> f93139d;

    public i1(Provider<t50.l> provider, Provider<j40.f> provider2, Provider<o30.d> provider3, Provider<o50.f> provider4) {
        this.f93136a = provider;
        this.f93137b = provider2;
        this.f93138c = provider3;
        this.f93139d = provider4;
    }

    public static i1 a(Provider<t50.l> provider, Provider<j40.f> provider2, Provider<o30.d> provider3, Provider<o50.f> provider4) {
        return new i1(provider, provider2, provider3, provider4);
    }

    public static h1 c(t50.l lVar, j40.f fVar, o30.d dVar, o50.f fVar2) {
        return new h1(lVar, fVar, dVar, fVar2);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public h1 get() {
        return c(this.f93136a.get(), this.f93137b.get(), this.f93138c.get(), this.f93139d.get());
    }
}
