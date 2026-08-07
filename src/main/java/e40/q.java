package e40;

import android.app.Application;
import f30.PaymentConfiguration;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class q implements qj0.e<w30.e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<Application> f61771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<PaymentConfiguration> f61772b;

    public q(Provider<Application> provider, Provider<PaymentConfiguration> provider2) {
        this.f61771a = provider;
        this.f61772b = provider2;
    }

    public static q a(Provider<Application> provider, Provider<PaymentConfiguration> provider2) {
        return new q(provider, provider2);
    }

    public static w30.e c(Application application, Provider<PaymentConfiguration> provider) {
        return (w30.e) qj0.h.d(l.INSTANCE.g(application, provider));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public w30.e get() {
        return c(this.f61771a.get(), this.f61772b);
    }
}
