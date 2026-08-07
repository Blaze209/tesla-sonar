package yw;

import javax.inject.Provider;
import p013kotlin.coroutines.CoroutineContext;
import vw.w0;

/* JADX INFO: loaded from: classes5.dex */
public final class n implements xw.b<m> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<CoroutineContext> f125955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<w0> f125956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<u6.h<SessionConfigs>> f125957c;

    public n(Provider<CoroutineContext> provider, Provider<w0> provider2, Provider<u6.h<SessionConfigs>> provider3) {
        this.f125955a = provider;
        this.f125956b = provider2;
        this.f125957c = provider3;
    }

    public static n a(Provider<CoroutineContext> provider, Provider<w0> provider2, Provider<u6.h<SessionConfigs>> provider3) {
        return new n(provider, provider2, provider3);
    }

    public static m c(CoroutineContext coroutineContext, w0 w0Var, u6.h<SessionConfigs> hVar) {
        return new m(coroutineContext, w0Var, hVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m get() {
        return c(this.f125955a.get(), this.f125956b.get(), this.f125957c.get());
    }
}
