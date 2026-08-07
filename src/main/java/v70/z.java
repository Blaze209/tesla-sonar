package v70;

import android.content.Context;
import javax.inject.Provider;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes7.dex */
public final class z implements qj0.e<wn0.l<com.stripe.android.paymentsheet.y.CustomerConfiguration, n70.r>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<Context> f118326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<CoroutineContext> f118327b;

    public z(Provider<Context> provider, Provider<CoroutineContext> provider2) {
        this.f118326a = provider;
        this.f118327b = provider2;
    }

    public static z a(Provider<Context> provider, Provider<CoroutineContext> provider2) {
        return new z(provider, provider2);
    }

    public static wn0.l<com.stripe.android.paymentsheet.y.CustomerConfiguration, n70.r> c(Context context, CoroutineContext coroutineContext) {
        return (wn0.l) qj0.h.d(r.INSTANCE.j(context, coroutineContext));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public wn0.l<com.stripe.android.paymentsheet.y.CustomerConfiguration, n70.r> get() {
        return c(this.f118326a.get(), this.f118327b.get());
    }
}
