package com.stripe.android.paymentsheet;

import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.y0;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p017o70.AddressDetails;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0080@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/paymentsheet/i;", "Lcom/stripe/android/paymentsheet/p$d;", "confirmationOption", "Lcom/stripe/android/paymentsheet/i$b;", "a", "(Lcom/stripe/android/paymentsheet/i;Lcom/stripe/android/paymentsheet/p$d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class j {
    public static final Object a(i iVar, p.d dVar, Continuation<? super i.b> continuation) {
        if (dVar instanceof p.d.New) {
            y.m initializationMode = dVar.getInitializationMode();
            p.d.New r11 = (p.d.New) dVar;
            y0 optionsParams = r11.getOptionsParams();
            PaymentMethodCreateParams createParams = r11.getCreateParams();
            AddressDetails shippingDetails = dVar.getShippingDetails();
            return iVar.b(initializationMode, createParams, optionsParams, shippingDetails != null ? p017o70.b.a(shippingDetails) : null, r11.getShouldSave(), continuation);
        }
        if (!(dVar instanceof p.d.Saved)) {
            throw new NoWhenBranchMatchedException();
        }
        ConfirmPaymentIntentParams.Shipping shippingA = null;
        y.m initializationMode2 = dVar.getInitializationMode();
        p.d.Saved saved = (p.d.Saved) dVar;
        PaymentMethod paymentMethod = saved.getPaymentMethod();
        y0 optionsParams2 = saved.getOptionsParams();
        AddressDetails shippingDetails2 = dVar.getShippingDetails();
        if (shippingDetails2 != null) {
            shippingA = p017o70.b.a(shippingDetails2);
        }
        return iVar.a(initializationMode2, paymentMethod, optionsParams2, shippingA, continuation);
    }
}
