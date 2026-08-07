package ee;

import com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H¦@¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lee/a;", "", "", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lde/a;", "event", "Ljn0/h0;", "c", "(Lde/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", PaymentMethodDetails.CHECKOUT_ATTEMPT_ID, "b", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface a {
    Object a(Continuation<? super String> continuation);

    Object b(String str, Continuation<? super h0> continuation);

    Object c(de.a aVar, Continuation<? super h0> continuation);
}
