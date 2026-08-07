package f80;

import f30.PaymentConfiguration;
import javax.inject.Provider;
import p013kotlin.coroutines.CoroutineContext;
import z60.g;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements qj0.e<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<g> f64590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<PaymentConfiguration> f64591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<CoroutineContext> f64592c;

    public e(Provider<g> provider, Provider<PaymentConfiguration> provider2, Provider<CoroutineContext> provider3) {
        this.f64590a = provider;
        this.f64591b = provider2;
        this.f64592c = provider3;
    }

    public static e a(Provider<g> provider, Provider<PaymentConfiguration> provider2, Provider<CoroutineContext> provider3) {
        return new e(provider, provider2, provider3);
    }

    public static d c(g gVar, Provider<PaymentConfiguration> provider, CoroutineContext coroutineContext) {
        return new d(gVar, provider, coroutineContext);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c(this.f64590a.get(), this.f64591b, this.f64592c.get());
    }
}
