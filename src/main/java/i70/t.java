package i70;

import a70.DefaultReturnUrl;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import java.util.Map;
import javax.inject.Provider;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes7.dex */
public final class t implements qj0.e<s> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<wn0.l<com.stripe.android.view.n, f30.n>> f76185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<w30.c> f76186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<PaymentAnalyticsRequestFactory> f76187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<Boolean> f76188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<CoroutineContext> f76189e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider<Map<String, String>> f76190f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider<wn0.a<String>> f76191g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Provider<Boolean> f76192h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Provider<DefaultReturnUrl> f76193i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Provider<k> f76194j;

    public t(Provider<wn0.l<com.stripe.android.view.n, f30.n>> provider, Provider<w30.c> provider2, Provider<PaymentAnalyticsRequestFactory> provider3, Provider<Boolean> provider4, Provider<CoroutineContext> provider5, Provider<Map<String, String>> provider6, Provider<wn0.a<String>> provider7, Provider<Boolean> provider8, Provider<DefaultReturnUrl> provider9, Provider<k> provider10) {
        this.f76185a = provider;
        this.f76186b = provider2;
        this.f76187c = provider3;
        this.f76188d = provider4;
        this.f76189e = provider5;
        this.f76190f = provider6;
        this.f76191g = provider7;
        this.f76192h = provider8;
        this.f76193i = provider9;
        this.f76194j = provider10;
    }

    public static t a(Provider<wn0.l<com.stripe.android.view.n, f30.n>> provider, Provider<w30.c> provider2, Provider<PaymentAnalyticsRequestFactory> provider3, Provider<Boolean> provider4, Provider<CoroutineContext> provider5, Provider<Map<String, String>> provider6, Provider<wn0.a<String>> provider7, Provider<Boolean> provider8, Provider<DefaultReturnUrl> provider9, Provider<k> provider10) {
        return new t(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    public static s c(wn0.l<com.stripe.android.view.n, f30.n> lVar, w30.c cVar, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, boolean z11, CoroutineContext coroutineContext, Map<String, String> map, wn0.a<String> aVar, boolean z12, DefaultReturnUrl defaultReturnUrl, k kVar) {
        return new s(lVar, cVar, paymentAnalyticsRequestFactory, z11, coroutineContext, map, aVar, z12, defaultReturnUrl, kVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public s get() {
        return c(this.f76185a.get(), this.f76186b.get(), this.f76187c.get(), this.f76188d.get().booleanValue(), this.f76189e.get(), this.f76190f.get(), this.f76191g.get(), this.f76192h.get().booleanValue(), this.f76193i.get(), this.f76194j.get());
    }
}
