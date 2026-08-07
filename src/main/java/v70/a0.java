package v70;

import f30.PaymentConfiguration;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class a0 implements qj0.e<wn0.a<String>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<PaymentConfiguration> f118137a;

    public a0(Provider<PaymentConfiguration> provider) {
        this.f118137a = provider;
    }

    public static a0 a(Provider<PaymentConfiguration> provider) {
        return new a0(provider);
    }

    public static wn0.a<String> c(Provider<PaymentConfiguration> provider) {
        return (wn0.a) qj0.h.d(r.INSTANCE.k(provider));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public wn0.a<String> get() {
        return c(this.f118137a);
    }
}
