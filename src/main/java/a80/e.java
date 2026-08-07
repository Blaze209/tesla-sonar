package a80;

import android.content.Context;
import f30.PaymentConfiguration;
import javax.inject.Provider;
import qj0.h;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements qj0.e<PaymentConfiguration> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<Context> f848b;

    public e(d dVar, Provider<Context> provider) {
        this.f847a = dVar;
        this.f848b = provider;
    }

    public static e a(d dVar, Provider<Context> provider) {
        return new e(dVar, provider);
    }

    public static PaymentConfiguration c(d dVar, Context context) {
        return (PaymentConfiguration) h.d(dVar.a(context));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public PaymentConfiguration get() {
        return c(this.f847a, this.f848b.get());
    }
}
