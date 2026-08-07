package t50;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class t implements qj0.e<s> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<r50.a> f112660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<u50.c> f112661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<r30.g> f112662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<w30.l.b> f112663d;

    public t(Provider<r50.a> provider, Provider<u50.c> provider2, Provider<r30.g> provider3, Provider<w30.l.b> provider4) {
        this.f112660a = provider;
        this.f112661b = provider2;
        this.f112662c = provider3;
        this.f112663d = provider4;
    }

    public static t a(Provider<r50.a> provider, Provider<u50.c> provider2, Provider<r30.g> provider3, Provider<w30.l.b> provider4) {
        return new t(provider, provider2, provider3, provider4);
    }

    public static s c(r50.a aVar, u50.c cVar, r30.g gVar, w30.l.b bVar) {
        return new s(aVar, cVar, gVar, bVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public s get() {
        return c(this.f112660a.get(), this.f112661b.get(), this.f112662c.get(), this.f112663d.get());
    }
}
