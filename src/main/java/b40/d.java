package b40;

import javax.inject.Provider;
import p013kotlin.coroutines.CoroutineContext;
import qj0.e;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements e<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<w30.c> f16415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<w30.e> f16416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<CoroutineContext> f16417c;

    public d(Provider<w30.c> provider, Provider<w30.e> provider2, Provider<CoroutineContext> provider3) {
        this.f16415a = provider;
        this.f16416b = provider2;
        this.f16417c = provider3;
    }

    public static d a(Provider<w30.c> provider, Provider<w30.e> provider2, Provider<CoroutineContext> provider3) {
        return new d(provider, provider2, provider3);
    }

    public static c c(w30.c cVar, w30.e eVar, CoroutineContext coroutineContext) {
        return new c(cVar, eVar, coroutineContext);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c(this.f16415a.get(), this.f16416b.get(), this.f16417c.get());
    }
}
