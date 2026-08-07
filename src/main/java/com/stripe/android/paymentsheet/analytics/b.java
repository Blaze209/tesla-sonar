package com.stripe.android.paymentsheet.analytics;

import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import javax.inject.Provider;
import p013kotlin.coroutines.CoroutineContext;
import qj0.e;
import z30.d;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements e<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<EventReporter.Mode> f52547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<w30.c> f52548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<PaymentAnalyticsRequestFactory> f52549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<d> f52550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<CoroutineContext> f52551e;

    public b(Provider<EventReporter.Mode> provider, Provider<w30.c> provider2, Provider<PaymentAnalyticsRequestFactory> provider3, Provider<d> provider4, Provider<CoroutineContext> provider5) {
        this.f52547a = provider;
        this.f52548b = provider2;
        this.f52549c = provider3;
        this.f52550d = provider4;
        this.f52551e = provider5;
    }

    public static b a(Provider<EventReporter.Mode> provider, Provider<w30.c> provider2, Provider<PaymentAnalyticsRequestFactory> provider3, Provider<d> provider4, Provider<CoroutineContext> provider5) {
        return new b(provider, provider2, provider3, provider4, provider5);
    }

    public static a c(EventReporter.Mode mode, w30.c cVar, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, d dVar, CoroutineContext coroutineContext) {
        return new a(mode, cVar, paymentAnalyticsRequestFactory, dVar, coroutineContext);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f52547a.get(), this.f52548b.get(), this.f52549c.get(), this.f52550d.get(), this.f52551e.get());
    }
}
