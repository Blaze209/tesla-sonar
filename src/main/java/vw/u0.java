package vw;

import javax.inject.Provider;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes5.dex */
public final class u0 implements xw.b<t0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<yw.j> f120047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<n0> f120048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<k0> f120049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<w0> f120050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<u6.h<SessionData>> f120051e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider<w> f120052f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider<CoroutineContext> f120053g;

    public u0(Provider<yw.j> provider, Provider<n0> provider2, Provider<k0> provider3, Provider<w0> provider4, Provider<u6.h<SessionData>> provider5, Provider<w> provider6, Provider<CoroutineContext> provider7) {
        this.f120047a = provider;
        this.f120048b = provider2;
        this.f120049c = provider3;
        this.f120050d = provider4;
        this.f120051e = provider5;
        this.f120052f = provider6;
        this.f120053g = provider7;
    }

    public static u0 a(Provider<yw.j> provider, Provider<n0> provider2, Provider<k0> provider3, Provider<w0> provider4, Provider<u6.h<SessionData>> provider5, Provider<w> provider6, Provider<CoroutineContext> provider7) {
        return new u0(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static t0 c(yw.j jVar, n0 n0Var, k0 k0Var, w0 w0Var, u6.h<SessionData> hVar, w wVar, CoroutineContext coroutineContext) {
        return new t0(jVar, n0Var, k0Var, w0Var, hVar, wVar, coroutineContext);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public t0 get() {
        return c(this.f120047a.get(), this.f120048b.get(), this.f120049c.get(), this.f120050d.get(), this.f120051e.get(), this.f120052f.get(), this.f120053g.get());
    }
}
