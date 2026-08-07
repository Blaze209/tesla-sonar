package e40;

import android.app.Application;
import f30.PaymentConfiguration;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class p implements qj0.e<PaymentConfiguration> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<Application> f61770a;

    public p(Provider<Application> provider) {
        this.f61770a = provider;
    }

    public static p a(Provider<Application> provider) {
        return new p(provider);
    }

    public static PaymentConfiguration c(Application application) {
        return (PaymentConfiguration) qj0.h.d(l.INSTANCE.e(application));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public PaymentConfiguration get() {
        return c(this.f61770a.get());
    }
}
