package c40;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.a1;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lc40/n;", "", "Lc40/j;", "", "Lcom/stripe/android/model/v0;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "paymentMethodId", "Lcom/stripe/android/model/a1;", "params", "e", "(Ljava/lang/String;Lcom/stripe/android/model/a1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface n {
    Object a(Continuation<? super j<List<PaymentMethod>>> continuation);

    Object b(String str, Continuation<? super j<PaymentMethod>> continuation);

    Object d(String str, Continuation<? super j<PaymentMethod>> continuation);

    Object e(String str, a1 a1Var, Continuation<? super j<PaymentMethod>> continuation);
}
