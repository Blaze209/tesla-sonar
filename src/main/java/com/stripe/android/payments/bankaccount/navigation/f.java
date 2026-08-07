package com.stripe.android.payments.bankaccount.navigation;

import e70.CollectBankAccountResponse;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/payments/bankaccount/navigation/e;", "Lcom/stripe/android/payments/bankaccount/navigation/d;", "a", "(Lcom/stripe/android/payments/bankaccount/navigation/e;)Lcom/stripe/android/payments/bankaccount/navigation/d;", "payments-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class f {
    public static final d a(e eVar) {
        s.k(eVar, "<this>");
        if (eVar instanceof e.a) {
            return d.a.f52011a;
        }
        if (!(eVar instanceof e.Completed)) {
            if (eVar instanceof e.Failed) {
                return new d.Failed(((e.Failed) eVar).getError());
            }
            throw new NoWhenBranchMatchedException();
        }
        e.Completed completed = (e.Completed) eVar;
        if (completed.getResponse().getUsBankAccountData() == null) {
            return new d.Failed(new IllegalArgumentException("ACH payload cannot be null"));
        }
        return completed.getResponse().getIntent() == null ? new d.Failed(new IllegalArgumentException("StripeIntent cannot be null")) : new d.Completed(new CollectBankAccountResponse(completed.getResponse().getIntent(), completed.getResponse().getUsBankAccountData().getFinancialConnectionsSession()));
    }
}
