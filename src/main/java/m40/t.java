package m40;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class t implements qj0.e<u50.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<r50.a> f91206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<w30.l.Options> f91207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<w30.l.b> f91208c;

    public t(Provider<r50.a> provider, Provider<w30.l.Options> provider2, Provider<w30.l.b> provider3) {
        this.f91206a = provider;
        this.f91207b = provider2;
        this.f91208c = provider3;
    }

    public static t a(Provider<r50.a> provider, Provider<w30.l.Options> provider2, Provider<w30.l.b> provider3) {
        return new t(provider, provider2, provider3);
    }

    public static u50.a c(r50.a aVar, w30.l.Options options, w30.l.b bVar) {
        return (u50.a) qj0.h.d(q.INSTANCE.c(aVar, options, bVar));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public u50.a get() {
        return c(this.f91206a.get(), this.f91207b.get(), this.f91208c.get());
    }
}
