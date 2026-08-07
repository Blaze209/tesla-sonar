package f30;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.action.Action;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.ShippingInformation;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@jn0.e
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0004\u001a\t\u000b\u0013J-\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ-\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\nJQ\u0010\u0013\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lf30/f;", "", "", "paymentMethodId", "", "productUsage", "Lf30/f$c;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ljn0/h0;", "b", "(Ljava/lang/String;Ljava/util/Set;Lf30/f$c;)V", "c", "Lcom/stripe/android/model/v0$p;", Action.PAYMENT_METHOD_TYPE, "", "limit", "endingBefore", "startingAfter", "Lf30/f$d;", DateTokenConverter.CONVERTER_KEY, "(Lcom/stripe/android/model/v0$p;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Lf30/f$d;)V", "Lcom/stripe/android/model/f1;", "shippingInformation", "Lf30/f$b;", "f", "(Lcom/stripe/android/model/f1;Ljava/util/Set;Lf30/f$b;)V", "a", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f63990b = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final TimeUnit f63991c = TimeUnit.SECONDS;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f63992d = TimeUnit.MINUTES.toMillis(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static /* synthetic */ f f63993e;

    /* JADX INFO: renamed from: f30.f$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\u0006\"\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011¨\u0006\u0016"}, d2 = {"Lf30/f$a;", "", "<init>", "()V", "Lf30/f;", "a", "()Lf30/f;", "instance", "Lf30/f;", "b", "setInstance$payments_core_release", "(Lf30/f;)V", "", "CUSTOMER_CACHE_DURATION_MILLISECONDS", "J", "", "KEEP_ALIVE_TIME", "I", "Ljava/util/concurrent/TimeUnit;", "KEEP_ALIVE_TIME_UNIT", "Ljava/util/concurrent/TimeUnit;", "THREAD_POOL_SIZE", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a() {
            f fVarB = b();
            if (fVarB != null) {
                return fVarB;
            }
            throw new IllegalStateException("Attempted to get instance of CustomerSession without initialization.");
        }

        public final f b() {
            return f.f63993e;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf30/f$b;", "", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf30/f$c;", "", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf30/f$d;", "", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface d {
    }

    public static /* synthetic */ void e(f fVar, PaymentMethod.p pVar, Integer num, String str, String str2, Set set, d dVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            num = null;
        }
        if ((i11 & 4) != 0) {
            str = null;
        }
        if ((i11 & 8) != 0) {
            str2 = null;
        }
        fVar.d(pVar, num, str, str2, set, dVar);
    }

    public final /* synthetic */ void b(String paymentMethodId, Set productUsage, c listener) {
        p013kotlin.jvm.internal.s.k(paymentMethodId, "paymentMethodId");
        p013kotlin.jvm.internal.s.k(productUsage, "productUsage");
        p013kotlin.jvm.internal.s.k(listener, "listener");
        throw null;
    }

    public final /* synthetic */ void c(String paymentMethodId, Set productUsage, c listener) {
        p013kotlin.jvm.internal.s.k(paymentMethodId, "paymentMethodId");
        p013kotlin.jvm.internal.s.k(productUsage, "productUsage");
        p013kotlin.jvm.internal.s.k(listener, "listener");
        throw null;
    }

    public final /* synthetic */ void d(PaymentMethod.p paymentMethodType, Integer limit, String endingBefore, String startingAfter, Set productUsage, d listener) {
        p013kotlin.jvm.internal.s.k(paymentMethodType, "paymentMethodType");
        p013kotlin.jvm.internal.s.k(productUsage, "productUsage");
        p013kotlin.jvm.internal.s.k(listener, "listener");
        throw null;
    }

    public final /* synthetic */ void f(ShippingInformation shippingInformation, Set productUsage, b listener) {
        p013kotlin.jvm.internal.s.k(shippingInformation, "shippingInformation");
        p013kotlin.jvm.internal.s.k(productUsage, "productUsage");
        p013kotlin.jvm.internal.s.k(listener, "listener");
        throw null;
    }
}
