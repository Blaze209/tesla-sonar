package z80;

import com.stripe.android.core.exception.StripeException;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"Lz80/b1;", "", "Lh70/h;", "errorReporter", "<init>", "(Lh70/h;)V", "", "externalPaymentMethodData", "", "Lz80/a1;", "a", "(Ljava/lang/String;)Ljava/util/List;", "Lh70/h;", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h70.h errorReporter;

    public b1(h70.h errorReporter) {
        p013kotlin.jvm.internal.s.k(errorReporter, "errorReporter");
        this.errorReporter = errorReporter;
    }

    public final List<ExternalPaymentMethodSpec> a(String externalPaymentMethodData) {
        if (externalPaymentMethodData == null || externalPaymentMethodData.length() == 0) {
            return p013kotlin.collections.v.m();
        }
        Object objA = d1.f127429a.a(externalPaymentMethodData);
        Throwable thE = jn0.s.e(objA);
        if (thE != null) {
            h70.h.b.a(this.errorReporter, h70.h.f.EXTERNAL_PAYMENT_METHOD_SERIALIZATION_FAILURE, StripeException.INSTANCE.b(thE), null, 4, null);
        }
        if (jn0.s.e(objA) != null) {
            objA = p013kotlin.collections.v.m();
        }
        return (List) objA;
    }
}
