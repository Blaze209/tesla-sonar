package com.stripe.android.paymentsheet;

import com.stripe.android.model.PaymentMethod;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lw70/j;", "Lcom/stripe/android/paymentsheet/y$m;", "initializationMode", "Lcom/stripe/android/paymentsheet/y$h;", "configuration", "Lcom/stripe/android/paymentsheet/p;", "a", "(Lw70/j;Lcom/stripe/android/paymentsheet/y$m;Lcom/stripe/android/paymentsheet/y$h;)Lcom/stripe/android/paymentsheet/p;", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class q {
    public static final p a(w70.j jVar, y.m initializationMode, y.Configuration configuration) {
        p013kotlin.jvm.internal.s.k(jVar, "<this>");
        p013kotlin.jvm.internal.s.k(initializationMode, "initializationMode");
        p013kotlin.jvm.internal.s.k(configuration, "configuration");
        if (jVar instanceof w70.j.Saved) {
            w70.j.Saved saved = (w70.j.Saved) jVar;
            return new p.d.Saved(initializationMode, configuration.getShippingDetails(), saved.getPaymentMethod(), saved.getPaymentMethodOptionsParams());
        }
        if (jVar instanceof w70.j.ExternalPaymentMethod) {
            w70.j.ExternalPaymentMethod externalPaymentMethod = (w70.j.ExternalPaymentMethod) jVar;
            return new p.ExternalPaymentMethod(externalPaymentMethod.getType(), externalPaymentMethod.getBillingDetails());
        }
        if (jVar instanceof w70.j.e) {
            w70.j.e eVar = (w70.j.e) jVar;
            if (p013kotlin.jvm.internal.s.f(eVar.getPaymentMethodCreateParams().i(), PaymentMethod.p.BacsDebit.code)) {
                return new p.BacsPaymentMethod(initializationMode, configuration.getShippingDetails(), eVar.getPaymentMethodCreateParams(), eVar.getPaymentMethodOptionsParams(), configuration.getAppearance());
            }
            return new p.d.New(initializationMode, configuration.getShippingDetails(), eVar.getPaymentMethodCreateParams(), eVar.getPaymentMethodOptionsParams(), eVar.getCustomerRequestedSave() == w70.j.a.RequestReuse);
        }
        if (!(jVar instanceof w70.j.c)) {
            if (jVar instanceof w70.j.d) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        y.GooglePayConfiguration googlePay = configuration.getGooglePay();
        if (googlePay != null) {
            return new p.GooglePay(initializationMode, configuration.getShippingDetails(), new p.GooglePay.Config(googlePay.getEnvironment(), configuration.getMerchantDisplayName(), googlePay.getCountryCode(), googlePay.getCurrencyCode(), googlePay.getAmount(), googlePay.getLabel(), configuration.getBillingDetailsCollectionConfiguration()));
        }
        return null;
    }
}
