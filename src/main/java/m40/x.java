package m40;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class x implements qj0.e<t50.n> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<r50.a> f91226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<u50.c> f91227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<w30.l.b> f91228c;

    public x(Provider<r50.a> provider, Provider<u50.c> provider2, Provider<w30.l.b> provider3) {
        this.f91226a = provider;
        this.f91227b = provider2;
        this.f91228c = provider3;
    }

    public static x a(Provider<r50.a> provider, Provider<u50.c> provider2, Provider<w30.l.b> provider3) {
        return new x(provider, provider2, provider3);
    }

    public static t50.n c(r50.a aVar, u50.c cVar, w30.l.b bVar) {
        return (t50.n) qj0.h.d(q.INSTANCE.g(aVar, cVar, bVar));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public t50.n get() {
        return c(this.f91226a.get(), this.f91227b.get(), this.f91228c.get());
    }
}
