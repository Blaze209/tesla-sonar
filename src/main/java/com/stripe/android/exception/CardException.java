package com.stripe.android.exception;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.wallet.WalletConstants;
import com.stripe.android.core.exception.StripeException;
import o30.StripeError;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\tR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\tR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u000e\u0010\tR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0014\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/exception/CardException;", "Lcom/stripe/android/core/exception/StripeException;", "Lo30/f;", "stripeError", "", "requestId", "<init>", "(Lo30/f;Ljava/lang/String;)V", "a", "()Ljava/lang/String;", "f", "Ljava/lang/String;", "getCode", "code", "g", "getParam", "param", "h", "declineCode", IntegerTokenConverter.CONVERTER_KEY, "getCharge", "charge", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CardException extends StripeException {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String code;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String param;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final String declineCode;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final String charge;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardException(StripeError stripeError, String str) {
        super(stripeError, str, WalletConstants.ERROR_CODE_SERVICE_UNAVAILABLE, null, null, 24, null);
        s.k(stripeError, "stripeError");
        this.code = stripeError.getCode();
        this.param = stripeError.getParam();
        this.declineCode = stripeError.getDeclineCode();
        this.charge = stripeError.getCharge();
    }

    @Override // com.stripe.android.core.exception.StripeException
    public String a() {
        return "cardError";
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getDeclineCode() {
        return this.declineCode;
    }
}
