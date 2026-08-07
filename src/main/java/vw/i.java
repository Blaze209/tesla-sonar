package vw;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements xw.b<g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<yv.b<nq.j>> f119944a;

    public i(Provider<yv.b<nq.j>> provider) {
        this.f119944a = provider;
    }

    public static i a(Provider<yv.b<nq.j>> provider) {
        return new i(provider);
    }

    public static g c(yv.b<nq.j> bVar) {
        return new g(bVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g get() {
        return c(this.f119944a.get());
    }
}
