package com.stripe.android.payments.bankaccount.navigation;

import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/payments/bankaccount/navigation/e;", "Lcom/stripe/android/payments/bankaccount/navigation/a;", "a", "(Lcom/stripe/android/payments/bankaccount/navigation/e;)Lcom/stripe/android/payments/bankaccount/navigation/a;", "payments-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class b {
    public static final a a(e eVar) {
        s.k(eVar, "<this>");
        if (eVar instanceof e.a) {
            return a.C0932a.f51996a;
        }
        if (!(eVar instanceof e.Completed)) {
            if (eVar instanceof e.Failed) {
                return new a.Failed(((e.Failed) eVar).getError());
            }
            throw new NoWhenBranchMatchedException();
        }
        e.Completed completed = (e.Completed) eVar;
        if (completed.getResponse().getIntent() == null) {
            return new a.Failed(new IllegalArgumentException("StripeIntent not set for this session"));
        }
        return completed.getResponse().getInstantDebitsData() == null ? new a.Failed(new IllegalArgumentException("instant debits data cannot be null")) : new a.Completed(completed.getResponse().getIntent(), completed.getResponse().getInstantDebitsData().getPaymentMethodId(), completed.getResponse().getInstantDebitsData().getLast4(), completed.getResponse().getInstantDebitsData().getBankName());
    }
}
