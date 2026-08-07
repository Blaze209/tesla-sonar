package e60;

import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import h70.h;
import javax.inject.Provider;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements qj0.e<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<w30.c> f62111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<PaymentAnalyticsRequestFactory> f62112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<h> f62113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<CoroutineContext> f62114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<o30.d> f62115e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider<z30.d> f62116f;

    public b(Provider<w30.c> provider, Provider<PaymentAnalyticsRequestFactory> provider2, Provider<h> provider3, Provider<CoroutineContext> provider4, Provider<o30.d> provider5, Provider<z30.d> provider6) {
        this.f62111a = provider;
        this.f62112b = provider2;
        this.f62113c = provider3;
        this.f62114d = provider4;
        this.f62115e = provider5;
        this.f62116f = provider6;
    }

    public static b a(Provider<w30.c> provider, Provider<PaymentAnalyticsRequestFactory> provider2, Provider<h> provider3, Provider<CoroutineContext> provider4, Provider<o30.d> provider5, Provider<z30.d> provider6) {
        return new b(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static a c(w30.c cVar, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, h hVar, CoroutineContext coroutineContext, o30.d dVar, z30.d dVar2) {
        return new a(cVar, paymentAnalyticsRequestFactory, hVar, coroutineContext, dVar, dVar2);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f62111a.get(), this.f62112b.get(), this.f62113c.get(), this.f62114d.get(), this.f62115e.get(), this.f62116f.get());
    }
}
