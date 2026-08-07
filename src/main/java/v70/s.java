package v70;

import android.content.Context;
import f30.PaymentConfiguration;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class s implements qj0.e<w30.e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<Context> f118318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<PaymentConfiguration> f118319b;

    public s(Provider<Context> provider, Provider<PaymentConfiguration> provider2) {
        this.f118318a = provider;
        this.f118319b = provider2;
    }

    public static s a(Provider<Context> provider, Provider<PaymentConfiguration> provider2) {
        return new s(provider, provider2);
    }

    public static w30.e c(Context context, Provider<PaymentConfiguration> provider) {
        return (w30.e) qj0.h.d(r.INSTANCE.b(context, provider));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public w30.e get() {
        return c(this.f118318a.get(), this.f118319b);
    }
}
