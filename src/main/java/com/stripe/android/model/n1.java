package com.stripe.android.model;

import java.util.Set;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\" \u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0002\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/stripe/android/model/StripeIntent;", "", "a", "(Lcom/stripe/android/model/StripeIntent;)I", "", "b", "(Lcom/stripe/android/model/StripeIntent;)Z", "", "Lcom/stripe/android/model/v0$p;", "Ljava/util/Set;", "getREFRESHABLE_PAYMENT_METHODS", "()Ljava/util/Set;", "REFRESHABLE_PAYMENT_METHODS", "payments-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set<PaymentMethod.p> f51413a = p013kotlin.collections.d1.c(PaymentMethod.p.WeChatPay);

    public static final int a(StripeIntent stripeIntent) {
        p013kotlin.jvm.internal.s.k(stripeIntent, "<this>");
        return com.stripe.android.b.INSTANCE.c(stripeIntent);
    }

    public static final boolean b(StripeIntent stripeIntent) {
        p013kotlin.jvm.internal.s.k(stripeIntent, "<this>");
        if (!(stripeIntent instanceof PaymentIntent)) {
            return false;
        }
        Set<PaymentMethod.p> set = f51413a;
        PaymentMethod paymentMethod = stripeIntent.getPaymentMethod();
        return p013kotlin.collections.v.g0(set, paymentMethod != null ? paymentMethod.type : null) && stripeIntent.f2();
    }
}
