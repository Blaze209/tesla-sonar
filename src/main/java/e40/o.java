package e40;

import f30.PaymentConfiguration;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class o implements qj0.e<wn0.a<Boolean>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<PaymentConfiguration> f61769a;

    public o(Provider<PaymentConfiguration> provider) {
        this.f61769a = provider;
    }

    public static o a(Provider<PaymentConfiguration> provider) {
        return new o(provider);
    }

    public static wn0.a<Boolean> c(Provider<PaymentConfiguration> provider) {
        return (wn0.a) qj0.h.d(l.INSTANCE.d(provider));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public wn0.a<Boolean> get() {
        return c(this.f61769a);
    }
}
