package e40;

import f30.PaymentConfiguration;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class v implements qj0.e<wn0.a<String>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<PaymentConfiguration> f61777a;

    public v(Provider<PaymentConfiguration> provider) {
        this.f61777a = provider;
    }

    public static v a(Provider<PaymentConfiguration> provider) {
        return new v(provider);
    }

    public static wn0.a<String> c(Provider<PaymentConfiguration> provider) {
        return (wn0.a) qj0.h.d(l.INSTANCE.l(provider));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public wn0.a<String> get() {
        return c(this.f61777a);
    }
}
