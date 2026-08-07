package i70;

import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import javax.inject.Provider;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements qj0.e<l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<wn0.l<com.stripe.android.view.n, f30.n>> f76127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<wn0.l<com.stripe.android.view.n, com.stripe.android.a>> f76128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<w30.c> f76129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<PaymentAnalyticsRequestFactory> f76130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<Boolean> f76131e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider<CoroutineContext> f76132f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider<wn0.a<String>> f76133g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Provider<Boolean> f76134h;

    public m(Provider<wn0.l<com.stripe.android.view.n, f30.n>> provider, Provider<wn0.l<com.stripe.android.view.n, com.stripe.android.a>> provider2, Provider<w30.c> provider3, Provider<PaymentAnalyticsRequestFactory> provider4, Provider<Boolean> provider5, Provider<CoroutineContext> provider6, Provider<wn0.a<String>> provider7, Provider<Boolean> provider8) {
        this.f76127a = provider;
        this.f76128b = provider2;
        this.f76129c = provider3;
        this.f76130d = provider4;
        this.f76131e = provider5;
        this.f76132f = provider6;
        this.f76133g = provider7;
        this.f76134h = provider8;
    }

    public static m a(Provider<wn0.l<com.stripe.android.view.n, f30.n>> provider, Provider<wn0.l<com.stripe.android.view.n, com.stripe.android.a>> provider2, Provider<w30.c> provider3, Provider<PaymentAnalyticsRequestFactory> provider4, Provider<Boolean> provider5, Provider<CoroutineContext> provider6, Provider<wn0.a<String>> provider7, Provider<Boolean> provider8) {
        return new m(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static l c(wn0.l<com.stripe.android.view.n, f30.n> lVar, wn0.l<com.stripe.android.view.n, com.stripe.android.a> lVar2, w30.c cVar, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, boolean z11, CoroutineContext coroutineContext, wn0.a<String> aVar, boolean z12) {
        return new l(lVar, lVar2, cVar, paymentAnalyticsRequestFactory, z11, coroutineContext, aVar, z12);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l get() {
        return c(this.f76127a.get(), this.f76128b.get(), this.f76129c.get(), this.f76130d.get(), this.f76131e.get().booleanValue(), this.f76132f.get(), this.f76133g.get(), this.f76134h.get().booleanValue());
    }
}
