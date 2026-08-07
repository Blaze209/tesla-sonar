package com.stripe.android.payments.paymentlauncher;

import com.stripe.android.payments.paymentlauncher.d;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/payments/paymentlauncher/b$c;", "Lcom/stripe/android/payments/paymentlauncher/b$b;", "b", "(Lcom/stripe/android/payments/paymentlauncher/b$c;)Lcom/stripe/android/payments/paymentlauncher/b$b;", "payments-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class d {
    public static final b.InterfaceC0952b b(final b.c cVar) {
        s.k(cVar, "<this>");
        return new b.InterfaceC0952b() { // from class: m70.a
            @Override // com.stripe.android.payments.paymentlauncher.b.InterfaceC0952b
            public final void a(com.stripe.android.payments.paymentlauncher.a aVar) {
                d.c(cVar, aVar);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(b.c this_toInternalResultCallback, a result) {
        s.k(this_toInternalResultCallback, "$this_toInternalResultCallback");
        s.k(result, "result");
        if (result instanceof a.Completed) {
            this_toInternalResultCallback.a(f.c.f52256c);
        } else if (result instanceof a.d) {
            this_toInternalResultCallback.a(new f.d(((a.d) result).getThrowable()));
        } else if (result instanceof a.C0948a) {
            this_toInternalResultCallback.a(f.a.f52255c);
        }
    }
}
