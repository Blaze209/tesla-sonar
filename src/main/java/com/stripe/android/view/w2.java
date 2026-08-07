package com.stripe.android.view;

import com.stripe.android.model.PaymentMethod;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/view/w2;", "Lcom/stripe/android/view/c2$b;", "Lcom/stripe/android/view/l1;", "deletePaymentMethodDialogFactory", "<init>", "(Lcom/stripe/android/view/l1;)V", "Lcom/stripe/android/model/v0;", "paymentMethod", "Ljn0/h0;", "a", "(Lcom/stripe/android/model/v0;)V", "Lcom/stripe/android/view/l1;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class w2 implements c2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l1 deletePaymentMethodDialogFactory;

    public w2(l1 deletePaymentMethodDialogFactory) {
        p013kotlin.jvm.internal.s.k(deletePaymentMethodDialogFactory, "deletePaymentMethodDialogFactory");
        this.deletePaymentMethodDialogFactory = deletePaymentMethodDialogFactory;
    }

    @Override // com.stripe.android.view.c2.b
    public void a(PaymentMethod paymentMethod) {
        p013kotlin.jvm.internal.s.k(paymentMethod, "paymentMethod");
        this.deletePaymentMethodDialogFactory.d(paymentMethod).show();
    }
}
