package k70;

import com.stripe.android.model.StripeIntent;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lk70/b0;", "", "<init>", "()V", "Li70/n;", "unsupportedNextActionHandler", "Li70/f;", "Lcom/stripe/android/model/StripeIntent;", "a", "(Li70/n;)Li70/f;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b0 {
    public final i70.f<StripeIntent> a(i70.n unsupportedNextActionHandler) {
        Object objB;
        p013kotlin.jvm.internal.s.k(unsupportedNextActionHandler, "unsupportedNextActionHandler");
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            Object objNewInstance = Class.forName("com.stripe.android.payments.wechatpay.WeChatPayNextActionHandler").getConstructor(null).newInstance(null);
            p013kotlin.jvm.internal.s.i(objNewInstance, "null cannot be cast to non-null type com.stripe.android.payments.core.authentication.PaymentNextActionHandler<com.stripe.android.model.StripeIntent>");
            objB = jn0.s.b((i70.f) objNewInstance);
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(jn0.t.a(th2));
        }
        Object obj = unsupportedNextActionHandler;
        if (!jn0.s.g(objB)) {
            obj = objB;
        }
        return (i70.f) obj;
    }
}
