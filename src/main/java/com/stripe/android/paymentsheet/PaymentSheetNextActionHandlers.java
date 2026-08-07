package com.stripe.android.paymentsheet;

import androidx.annotation.Keep;
import com.stripe.android.model.StripeIntent;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u001c\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetNextActionHandlers;", "", "<init>", "()V", "", "Ljava/lang/Class;", "Lcom/stripe/android/model/StripeIntent$a;", "Li70/f;", "Lcom/stripe/android/model/StripeIntent;", "get", "()Ljava/util/Map;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PaymentSheetNextActionHandlers {
    public static final int $stable = 0;
    public static final PaymentSheetNextActionHandlers INSTANCE = new PaymentSheetNextActionHandlers();

    private PaymentSheetNextActionHandlers() {
    }

    public final Map<Class<? extends StripeIntent.a>, i70.f<StripeIntent>> get() {
        return v0.m(jn0.x.a(StripeIntent.a.l.class, new com.stripe.android.paymentsheet.paymentdatacollection.polling.a()), jn0.x.a(StripeIntent.a.b.class, new com.stripe.android.paymentsheet.paymentdatacollection.polling.a()));
    }
}
