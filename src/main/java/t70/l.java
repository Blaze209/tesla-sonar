package t70;

import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements qj0.e<CoroutineScope> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<com.stripe.android.paymentsheet.flowcontroller.f> f112867a;

    public l(Provider<com.stripe.android.paymentsheet.flowcontroller.f> provider) {
        this.f112867a = provider;
    }

    public static l a(Provider<com.stripe.android.paymentsheet.flowcontroller.f> provider) {
        return new l(provider);
    }

    public static CoroutineScope c(com.stripe.android.paymentsheet.flowcontroller.f fVar) {
        return (CoroutineScope) qj0.h.d(g.f112862a.e(fVar));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoroutineScope get() {
        return c(this.f112867a.get());
    }
}
