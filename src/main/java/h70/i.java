package h70;

import com.stripe.android.core.exception.StripeException;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J5\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lh70/i;", "Lh70/h;", "Lw30/c;", "analyticsRequestExecutor", "Lw30/e;", "analyticsRequestFactory", "<init>", "(Lw30/c;Lw30/e;)V", "Lh70/h$c;", "errorEvent", "Lcom/stripe/android/core/exception/StripeException;", "stripeException", "", "", "additionalNonPiiParams", "Ljn0/h0;", "a", "(Lh70/h$c;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;)V", "b", "Lw30/c;", "c", "Lw30/e;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class i implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final w30.c analyticsRequestExecutor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final w30.e analyticsRequestFactory;

    public i(w30.c analyticsRequestExecutor, w30.e analyticsRequestFactory) {
        s.k(analyticsRequestExecutor, "analyticsRequestExecutor");
        s.k(analyticsRequestFactory, "analyticsRequestFactory");
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.analyticsRequestFactory = analyticsRequestFactory;
    }

    @Override // h70.h
    public void a(h.c errorEvent, StripeException stripeException, Map<String, String> additionalNonPiiParams) {
        s.k(errorEvent, "errorEvent");
        s.k(additionalNonPiiParams, "additionalNonPiiParams");
        this.analyticsRequestExecutor.a(this.analyticsRequestFactory.g(errorEvent, v0.r(stripeException == null ? v0.i() : h.INSTANCE.d(stripeException), additionalNonPiiParams)));
    }

    @Override // r30.n
    public void b(StripeException stripeException) {
        h.b.b(this, stripeException);
    }
}
