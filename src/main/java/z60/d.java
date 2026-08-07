package z60;

import android.content.Context;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import java.util.Set;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements qj0.e<PaymentAnalyticsRequestFactory> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<Context> f127032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<wn0.a<String>> f127033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<Set<String>> f127034c;

    public d(Provider<Context> provider, Provider<wn0.a<String>> provider2, Provider<Set<String>> provider3) {
        this.f127032a = provider;
        this.f127033b = provider2;
        this.f127034c = provider3;
    }

    public static d a(Provider<Context> provider, Provider<wn0.a<String>> provider2, Provider<Set<String>> provider3) {
        return new d(provider, provider2, provider3);
    }

    public static PaymentAnalyticsRequestFactory c(Context context, wn0.a<String> aVar, Set<String> set) {
        return new PaymentAnalyticsRequestFactory(context, aVar, set);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public PaymentAnalyticsRequestFactory get() {
        return c(this.f127032a.get(), this.f127033b.get(), this.f127034c.get());
    }
}
