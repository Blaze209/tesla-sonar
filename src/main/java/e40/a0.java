package e40;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class a0 implements qj0.e<h70.h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<w30.e> f61682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<w30.c> f61683b;

    public a0(Provider<w30.e> provider, Provider<w30.c> provider2) {
        this.f61682a = provider;
        this.f61683b = provider2;
    }

    public static a0 a(Provider<w30.e> provider, Provider<w30.c> provider2) {
        return new a0(provider, provider2);
    }

    public static h70.h c(w30.e eVar, w30.c cVar) {
        return (h70.h) qj0.h.d(l.INSTANCE.q(eVar, cVar));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public h70.h get() {
        return c(this.f61682a.get(), this.f61683b.get());
    }
}
