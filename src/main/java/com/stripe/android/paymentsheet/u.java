package com.stripe.android.paymentsheet;

import ch.qos.logback.core.joran.action.Action;
import com.stripe.android.model.PaymentMethod;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/stripe/android/paymentsheet/t;", "", "a", "(Lcom/stripe/android/paymentsheet/t;)Ljava/lang/String;", Action.KEY_ATTRIBUTE, "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class u {
    public static final String a(t tVar) {
        PaymentMethod paymentMethod;
        p013kotlin.jvm.internal.s.k(tVar, "<this>");
        String str = null;
        t.SavedPaymentMethod savedPaymentMethod = tVar instanceof t.SavedPaymentMethod ? (t.SavedPaymentMethod) tVar : null;
        if (savedPaymentMethod != null && (paymentMethod = savedPaymentMethod.getPaymentMethod()) != null) {
            str = paymentMethod.id;
        }
        return p013kotlin.collections.v.y0(p013kotlin.collections.v.r(tVar.getViewType(), str), "-", null, null, 0, null, null, 62, null);
    }
}
