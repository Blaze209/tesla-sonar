package com.stripe.android.model;

import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\n\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/model/n0;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "getExpectedPaymentMethodType", "expectedPaymentMethodType", "Passthrough", "LinkPaymentMethod", "LinkCardBrand", "payments-model_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum n0 {
    Passthrough("PASSTHROUGH"),
    LinkPaymentMethod("LINK_PAYMENT_METHOD"),
    LinkCardBrand("LINK_CARD_BRAND");

    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
    private final String value;

    n0(String str) {
        this.value = str;
    }

    public static EnumEntries<n0> getEntries() {
        return $ENTRIES;
    }

    public final String getExpectedPaymentMethodType() {
        return this == LinkCardBrand ? "card" : "bank_account";
    }

    public final String getValue() {
        return this.value;
    }
}
