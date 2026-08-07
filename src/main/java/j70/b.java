package j70;

import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import javax.inject.Provider;
import p013kotlin.coroutines.CoroutineContext;
import w30.f0;
import z60.g;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements qj0.e<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<g> f82783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<w30.c> f82784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<PaymentAnalyticsRequestFactory> f82785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<f0> f82786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<o30.d> f82787e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider<CoroutineContext> f82788f;

    public b(Provider<g> provider, Provider<w30.c> provider2, Provider<PaymentAnalyticsRequestFactory> provider3, Provider<f0> provider4, Provider<o30.d> provider5, Provider<CoroutineContext> provider6) {
        this.f82783a = provider;
        this.f82784b = provider2;
        this.f82785c = provider3;
        this.f82786d = provider4;
        this.f82787e = provider5;
        this.f82788f = provider6;
    }

    public static b a(Provider<g> provider, Provider<w30.c> provider2, Provider<PaymentAnalyticsRequestFactory> provider3, Provider<f0> provider4, Provider<o30.d> provider5, Provider<CoroutineContext> provider6) {
        return new b(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static a c(g gVar, w30.c cVar, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, f0 f0Var, o30.d dVar, CoroutineContext coroutineContext) {
        return new a(gVar, cVar, paymentAnalyticsRequestFactory, f0Var, dVar, coroutineContext);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f82783a.get(), this.f82784b.get(), this.f82785c.get(), this.f82786d.get(), this.f82787e.get(), this.f82788f.get());
    }
}
