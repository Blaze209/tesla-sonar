package e40;

import f30.PaymentConfiguration;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements qj0.e<wn0.a<String>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<PaymentConfiguration> f61731a;

    public f(Provider<PaymentConfiguration> provider) {
        this.f61731a = provider;
    }

    public static f a(Provider<PaymentConfiguration> provider) {
        return new f(provider);
    }

    public static wn0.a<String> c(Provider<PaymentConfiguration> provider) {
        return (wn0.a) qj0.h.d(c.INSTANCE.e(provider));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public wn0.a<String> get() {
        return c(this.f61731a);
    }
}
