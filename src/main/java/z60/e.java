package z60;

import android.content.Context;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import java.util.Set;
import javax.inject.Provider;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements qj0.e<com.stripe.android.networking.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<Context> f127035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<wn0.a<String>> f127036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<CoroutineContext> f127037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<Set<String>> f127038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<PaymentAnalyticsRequestFactory> f127039e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider<w30.c> f127040f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider<o30.d> f127041g;

    public e(Provider<Context> provider, Provider<wn0.a<String>> provider2, Provider<CoroutineContext> provider3, Provider<Set<String>> provider4, Provider<PaymentAnalyticsRequestFactory> provider5, Provider<w30.c> provider6, Provider<o30.d> provider7) {
        this.f127035a = provider;
        this.f127036b = provider2;
        this.f127037c = provider3;
        this.f127038d = provider4;
        this.f127039e = provider5;
        this.f127040f = provider6;
        this.f127041g = provider7;
    }

    public static e a(Provider<Context> provider, Provider<wn0.a<String>> provider2, Provider<CoroutineContext> provider3, Provider<Set<String>> provider4, Provider<PaymentAnalyticsRequestFactory> provider5, Provider<w30.c> provider6, Provider<o30.d> provider7) {
        return new e(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static com.stripe.android.networking.a c(Context context, wn0.a<String> aVar, CoroutineContext coroutineContext, Set<String> set, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, w30.c cVar, o30.d dVar) {
        return new com.stripe.android.networking.a(context, aVar, coroutineContext, set, paymentAnalyticsRequestFactory, cVar, dVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.networking.a get() {
        return c(this.f127035a.get(), this.f127036b.get(), this.f127037c.get(), this.f127038d.get(), this.f127039e.get(), this.f127040f.get(), this.f127041g.get());
    }
}
