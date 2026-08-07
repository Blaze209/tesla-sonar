package b60;

import com.google.android.gms.wallet.PaymentsClient;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements qj0.e<PaymentsClient> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<com.stripe.android.googlepaylauncher.h.Config> f16730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<a60.h> f16731b;

    public h(Provider<com.stripe.android.googlepaylauncher.h.Config> provider, Provider<a60.h> provider2) {
        this.f16730a = provider;
        this.f16731b = provider2;
    }

    public static h a(Provider<com.stripe.android.googlepaylauncher.h.Config> provider, Provider<a60.h> provider2) {
        return new h(provider, provider2);
    }

    public static PaymentsClient c(com.stripe.android.googlepaylauncher.h.Config config, a60.h hVar) {
        return (PaymentsClient) qj0.h.d(g.INSTANCE.a(config, hVar));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public PaymentsClient get() {
        return c(this.f16730a.get(), this.f16731b.get());
    }
}
