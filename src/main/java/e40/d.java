package e40;

import android.content.Context;
import f30.PaymentConfiguration;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements qj0.e<w30.e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<Context> f61697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<PaymentConfiguration> f61698b;

    public d(Provider<Context> provider, Provider<PaymentConfiguration> provider2) {
        this.f61697a = provider;
        this.f61698b = provider2;
    }

    public static d a(Provider<Context> provider, Provider<PaymentConfiguration> provider2) {
        return new d(provider, provider2);
    }

    public static w30.e c(Context context, Provider<PaymentConfiguration> provider) {
        return (w30.e) qj0.h.d(c.INSTANCE.b(context, provider));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public w30.e get() {
        return c(this.f61697a.get(), this.f61698b);
    }
}
