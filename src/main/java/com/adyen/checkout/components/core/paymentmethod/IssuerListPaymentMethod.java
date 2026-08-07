package com.adyen.checkout.components.core.paymentmethod;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b&\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\t\u001a\u0004\u0018\u00010\u00048&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/adyen/checkout/components/core/paymentmethod/IssuerListPaymentMethod;", "Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;", "<init>", "()V", "", "getIssuer", "()Ljava/lang/String;", "setIssuer", "(Ljava/lang/String;)V", IssuerListPaymentMethod.ISSUER, "Companion", "a", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class IssuerListPaymentMethod extends PaymentMethodDetails {
    public static final String ISSUER = "issuer";

    public abstract String getIssuer();

    public abstract void setIssuer(String str);
}
