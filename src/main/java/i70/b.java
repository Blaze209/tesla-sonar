package i70;

import android.content.Context;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentsheet.PaymentSheetNextActionHandlers;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aA\u0010\u000b\u001a$\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005j\u0002`\u0007\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\t0\bj\u0002`\n0\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\f*\u0018\b\u0002\u0010\r\"\b\u0012\u0004\u0012\u00020\t0\b2\b\u0012\u0004\u0012\u00020\t0\b*\u001c\b\u0002\u0010\u000e\"\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00052\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005¨\u0006\u000f"}, d2 = {"", "includePaymentSheetNextActionHandlers", "Landroid/content/Context;", "applicationContext", "", "Ljava/lang/Class;", "Lcom/stripe/android/model/StripeIntent$a;", "Lcom/stripe/android/payments/core/authentication/NextActionHandlerKey;", "Li70/f;", "Lcom/stripe/android/model/StripeIntent;", "Lcom/stripe/android/payments/core/authentication/NextActionHandler;", "b", "(ZLandroid/content/Context;)Ljava/util/Map;", "NextActionHandler", "NextActionHandlerKey", "payments-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class b {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<Class<? extends StripeIntent.a>, f<StripeIntent>> b(boolean z11, Context context) {
        try {
            if (!z11) {
                return v0.i();
            }
            PaymentSheetNextActionHandlers paymentSheetNextActionHandlers = PaymentSheetNextActionHandlers.INSTANCE;
            Object obj = PaymentSheetNextActionHandlers.class.getDeclaredField("INSTANCE").get(null);
            Object objInvoke = obj.getClass().getDeclaredMethod("get", null).invoke(obj, null);
            p013kotlin.jvm.internal.s.i(objInvoke, "null cannot be cast to non-null type kotlin.collections.Map<java.lang.Class<out com.stripe.android.model.StripeIntent.NextActionData>{ com.stripe.android.payments.core.authentication.DefaultPaymentNextActionHandlerRegistryKt.NextActionHandlerKey }, @[JvmSuppressWildcards(suppress = <null>)] com.stripe.android.payments.core.authentication.PaymentNextActionHandler<com.stripe.android.model.StripeIntent>{ com.stripe.android.payments.core.authentication.DefaultPaymentNextActionHandlerRegistryKt.NextActionHandler }>");
            return (Map) objInvoke;
        } catch (Exception e11) {
            h70.h.b.a(h70.h.Companion.b(h70.h.INSTANCE, context, null, 2, null), h70.h.f.PAYMENT_SHEET_AUTHENTICATORS_NOT_FOUND, StripeException.INSTANCE.b(e11), null, 4, null);
            return v0.i();
        }
    }
}
