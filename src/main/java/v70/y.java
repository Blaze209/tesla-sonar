package v70;

import android.content.Context;
import f30.PaymentConfiguration;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class y implements qj0.e<PaymentConfiguration> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<Context> f118325a;

    public y(Provider<Context> provider) {
        this.f118325a = provider;
    }

    public static y a(Provider<Context> provider) {
        return new y(provider);
    }

    public static PaymentConfiguration c(Context context) {
        return (PaymentConfiguration) qj0.h.d(r.INSTANCE.i(context));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public PaymentConfiguration get() {
        return c(this.f118325a.get());
    }
}
