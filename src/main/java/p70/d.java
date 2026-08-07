package p70;

import javax.inject.Provider;
import p013kotlin.coroutines.CoroutineContext;
import qj0.e;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements e<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<w30.c> f101837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<w30.e> f101838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<CoroutineContext> f101839c;

    public d(Provider<w30.c> provider, Provider<w30.e> provider2, Provider<CoroutineContext> provider3) {
        this.f101837a = provider;
        this.f101838b = provider2;
        this.f101839c = provider3;
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
        return c(this.f101837a.get(), this.f101838b.get(), this.f101839c.get());
    }
}
