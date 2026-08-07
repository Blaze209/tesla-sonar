package v70;

import f30.PaymentConfiguration;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class b0 implements qj0.e<wn0.a<String>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<PaymentConfiguration> f118138a;

    public b0(Provider<PaymentConfiguration> provider) {
        this.f118138a = provider;
    }

    public static b0 a(Provider<PaymentConfiguration> provider) {
        return new b0(provider);
    }

    public static wn0.a<String> c(Provider<PaymentConfiguration> provider) {
        return (wn0.a) qj0.h.d(r.INSTANCE.l(provider));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public wn0.a<String> get() {
        return c(this.f118138a);
    }
}
