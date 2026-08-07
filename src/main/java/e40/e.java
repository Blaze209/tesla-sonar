package e40;

import android.content.Context;
import f30.PaymentConfiguration;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements qj0.e<PaymentConfiguration> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<Context> f61700a;

    public e(Provider<Context> provider) {
        this.f61700a = provider;
    }

    public static e a(Provider<Context> provider) {
        return new e(provider);
    }

    public static PaymentConfiguration c(Context context) {
        return (PaymentConfiguration) qj0.h.d(c.INSTANCE.d(context));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public PaymentConfiguration get() {
        return c(this.f61700a.get());
    }
}
