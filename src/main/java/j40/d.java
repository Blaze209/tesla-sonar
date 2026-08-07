package j40;

import javax.inject.Provider;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements qj0.e<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<w30.c> f82588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<w30.e> f82589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<CoroutineContext> f82590c;

    public d(Provider<w30.c> provider, Provider<w30.e> provider2, Provider<CoroutineContext> provider3) {
        this.f82588a = provider;
        this.f82589b = provider2;
        this.f82590c = provider3;
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
        return c(this.f82588a.get(), this.f82589b.get(), this.f82590c.get());
    }
}
