package t70;

import com.stripe.android.paymentsheet.analytics.EventReporter;
import javax.inject.Provider;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements qj0.e<com.stripe.android.paymentsheet.flowcontroller.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<g80.h> f112857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<CoroutineContext> f112858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<EventReporter> f112859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<com.stripe.android.paymentsheet.flowcontroller.f> f112860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<n> f112861e;

    public f(Provider<g80.h> provider, Provider<CoroutineContext> provider2, Provider<EventReporter> provider3, Provider<com.stripe.android.paymentsheet.flowcontroller.f> provider4, Provider<n> provider5) {
        this.f112857a = provider;
        this.f112858b = provider2;
        this.f112859c = provider3;
        this.f112860d = provider4;
        this.f112861e = provider5;
    }

    public static f a(Provider<g80.h> provider, Provider<CoroutineContext> provider2, Provider<EventReporter> provider3, Provider<com.stripe.android.paymentsheet.flowcontroller.f> provider4, Provider<n> provider5) {
        return new f(provider, provider2, provider3, provider4, provider5);
    }

    public static com.stripe.android.paymentsheet.flowcontroller.c c(g80.h hVar, CoroutineContext coroutineContext, EventReporter eventReporter, com.stripe.android.paymentsheet.flowcontroller.f fVar, n nVar) {
        return new com.stripe.android.paymentsheet.flowcontroller.c(hVar, coroutineContext, eventReporter, fVar, nVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.paymentsheet.flowcontroller.c get() {
        return c(this.f112857a.get(), this.f112858b.get(), this.f112859c.get(), this.f112860d.get(), this.f112861e.get());
    }
}
