package com.adyen.checkout.components.core.paymentmethod;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b&\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\t\u001a\u0004\u0018\u00010\u00048&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\f\u001a\u0004\u0018\u00010\u00048&@&X¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00048&@&X¦\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00048&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/adyen/checkout/components/core/paymentmethod/EContextPaymentMethod;", "Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;", "<init>", "()V", "", "getFirstName", "()Ljava/lang/String;", "setFirstName", "(Ljava/lang/String;)V", EContextPaymentMethod.FIRST_NAME, "getLastName", "setLastName", EContextPaymentMethod.LAST_NAME, "getTelephoneNumber", "setTelephoneNumber", EContextPaymentMethod.TELEPHONE_NUMBER, "getShopperEmail", "setShopperEmail", EContextPaymentMethod.SHOPPER_EMAIL, "Companion", "a", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class EContextPaymentMethod extends PaymentMethodDetails {
    public static final String FIRST_NAME = "firstName";
    public static final String LAST_NAME = "lastName";
    public static final String SHOPPER_EMAIL = "shopperEmail";
    public static final String TELEPHONE_NUMBER = "telephoneNumber";

    public abstract String getFirstName();

    public abstract String getLastName();

    public abstract String getShopperEmail();

    public abstract String getTelephoneNumber();

    public abstract void setFirstName(String str);

    public abstract void setLastName(String str);

    public abstract void setShopperEmail(String str);

    public abstract void setTelephoneNumber(String str);
}
