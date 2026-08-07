package n70;

import com.stripe.android.model.PaymentMethod;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ln70/a;", "", "Lcom/stripe/android/model/v0;", "paymentMethod", "", "shouldSavePaymentMethod", "Lcom/stripe/android/paymentsheet/a;", "a", "(Lcom/stripe/android/model/v0;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface a {
    Object a(PaymentMethod paymentMethod, boolean z11, Continuation<? super com.stripe.android.paymentsheet.a> continuation);
}
