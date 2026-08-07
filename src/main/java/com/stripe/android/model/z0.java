package com.stripe.android.model;

import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/model/y0;", "Lcom/stripe/android/model/l$c;", "a", "(Lcom/stripe/android/model/y0;)Lcom/stripe/android/model/l$c;", "payments-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class z0 {
    public static final ConfirmPaymentIntentParams.c a(y0 y0Var) {
        p013kotlin.jvm.internal.s.k(y0Var, "<this>");
        if (y0Var instanceof y0.Blik) {
            return null;
        }
        if (y0Var instanceof y0.Card) {
            return ((y0.Card) y0Var).getSetupFutureUsage();
        }
        if (y0Var instanceof y0.Konbini) {
            return null;
        }
        if (y0Var instanceof y0.USBankAccount) {
            return ((y0.USBankAccount) y0Var).getSetupFutureUsage();
        }
        if ((y0Var instanceof y0.WeChatPay) || p013kotlin.jvm.internal.s.f(y0Var, y0.f.f51754c)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
