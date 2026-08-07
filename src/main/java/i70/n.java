package i70;

import com.stripe.android.core.exception.StripeException;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.n1;
import java.util.Map;
import jn0.h0;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u001d\b\u0007\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0094@¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Li70/n;", "Li70/f;", "Lcom/stripe/android/model/StripeIntent;", "Lkotlin/Function1;", "Lcom/stripe/android/view/n;", "Lcom/stripe/android/a;", "paymentRelayStarterFactory", "<init>", "(Lwn0/l;)V", "host", "actionable", "Lw30/l$c;", "requestOptions", "Ljn0/h0;", "f", "(Lcom/stripe/android/view/n;Lcom/stripe/android/model/StripeIntent;Lw30/l$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lwn0/l;", "b", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class n extends f<StripeIntent> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<Class<? extends StripeIntent.a>, String> f76136c = v0.f(x.a(StripeIntent.a.WeChatPayRedirect.class, "com.stripe:stripe-wechatpay:20.52.3"));

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<com.stripe.android.view.n, com.stripe.android.a> paymentRelayStarterFactory;

    public n(wn0.l<com.stripe.android.view.n, com.stripe.android.a> paymentRelayStarterFactory) {
        p013kotlin.jvm.internal.s.k(paymentRelayStarterFactory, "paymentRelayStarterFactory");
        this.paymentRelayStarterFactory = paymentRelayStarterFactory;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:6:0x003a  */
    @Override // i70.f
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Object e(com.stripe.android.view.n nVar, StripeIntent stripeIntent, w30.l.Options options, Continuation<h0> continuation) {
        StripeException stripeExceptionB;
        StripeIntent.a nextActionData = stripeIntent.getNextActionData();
        if (nextActionData != null) {
            Class<?> cls = nextActionData.getClass();
            stripeExceptionB = StripeException.INSTANCE.b(new IllegalArgumentException(cls.getSimpleName() + " type is not supported, add " + ((Object) f76136c.get(cls)) + " in build.gradle to support it"));
            if (stripeExceptionB == null) {
                stripeExceptionB = StripeException.INSTANCE.b(new IllegalArgumentException("stripeIntent.nextActionData is null"));
            }
        } else {
            stripeExceptionB = StripeException.INSTANCE.b(new IllegalArgumentException("stripeIntent.nextActionData is null"));
        }
        this.paymentRelayStarterFactory.invoke(nVar).a(new com.stripe.android.a.AbstractC0787a.ErrorArgs(stripeExceptionB, n1.a(stripeIntent)));
        return h0.f84049a;
    }
}
