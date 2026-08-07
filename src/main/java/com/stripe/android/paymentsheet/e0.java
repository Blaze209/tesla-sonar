package com.stripe.android.paymentsheet;

import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/stripe/android/paymentsheet/y$m;", "", "b", "(Lcom/stripe/android/paymentsheet/y$m;)Z", "isProcessingPayment", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class e0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(y.m mVar) {
        if (mVar instanceof y.m.PaymentIntent) {
            return true;
        }
        if (mVar instanceof y.m.SetupIntent) {
            return false;
        }
        if (mVar instanceof y.m.DeferredIntent) {
            return ((y.m.DeferredIntent) mVar).getIntentConfiguration().getMode() instanceof y.n.d.a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
