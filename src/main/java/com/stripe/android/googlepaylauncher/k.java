package com.stripe.android.googlepaylauncher;

import android.content.Context;
import androidx.p002activity.result.ActivityResultLauncher;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<Context> f50881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<wn0.l<a60.d, l>> f50882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<PaymentAnalyticsRequestFactory> f50883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<w30.c> f50884d;

    public k(Provider<Context> provider, Provider<wn0.l<a60.d, l>> provider2, Provider<PaymentAnalyticsRequestFactory> provider3, Provider<w30.c> provider4) {
        this.f50881a = provider;
        this.f50882b = provider2;
        this.f50883c = provider3;
        this.f50884d = provider4;
    }

    public static k a(Provider<Context> provider, Provider<wn0.l<a60.d, l>> provider2, Provider<PaymentAnalyticsRequestFactory> provider3, Provider<w30.c> provider4) {
        return new k(provider, provider2, provider3, provider4);
    }

    public static h c(CoroutineScope coroutineScope, h.Config config, h.f fVar, ActivityResultLauncher<GooglePayPaymentMethodLauncherContractV2.Args> activityResultLauncher, boolean z11, Context context, wn0.l<a60.d, l> lVar, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, w30.c cVar) {
        return new h(coroutineScope, config, fVar, activityResultLauncher, z11, context, lVar, paymentAnalyticsRequestFactory, cVar);
    }

    public h b(CoroutineScope coroutineScope, h.Config config, h.f fVar, ActivityResultLauncher<GooglePayPaymentMethodLauncherContractV2.Args> activityResultLauncher, boolean z11) {
        return c(coroutineScope, config, fVar, activityResultLauncher, z11, this.f50881a.get(), this.f50882b.get(), this.f50883c.get(), this.f50884d.get());
    }
}
