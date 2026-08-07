package com.stripe.android.googlepaylauncher;

import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.PaymentsClient;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/googlepaylauncher/e;", "", "Lcom/google/android/gms/wallet/IsReadyToPayRequest;", "request", "", "a", "(Lcom/google/android/gms/wallet/IsReadyToPayRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface e {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/googlepaylauncher/e$a;", "", "Lcom/google/android/gms/wallet/PaymentsClient;", "paymentsClient", "Lcom/stripe/android/googlepaylauncher/e;", "a", "(Lcom/google/android/gms/wallet/PaymentsClient;)Lcom/stripe/android/googlepaylauncher/e;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        e a(PaymentsClient paymentsClient);
    }

    Object a(IsReadyToPayRequest isReadyToPayRequest, Continuation<? super Boolean> continuation);
}
