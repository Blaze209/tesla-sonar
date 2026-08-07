package f30;

import android.content.Intent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\t\u0010\nJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH&¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH&¢\u0006\u0004\b\u0012\u0010\u0011J$\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u000e\u001a\u00020\rH¦@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00132\u0006\u0010\u000e\u001a\u00020\rH¦@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0016\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"Lf30/p;", "", "Lcom/stripe/android/view/n;", "host", "Lcom/stripe/android/model/n;", "confirmStripeIntentParams", "Lw30/l$c;", "requestOptions", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lcom/stripe/android/view/n;Lcom/stripe/android/model/n;Lw30/l$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "requestCode", "Landroid/content/Intent;", "data", "", "c", "(ILandroid/content/Intent;)Z", "a", "Ljn0/s;", "Lf30/q;", "b", "(Landroid/content/Intent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lf30/g0;", "e", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface p {
    boolean a(int requestCode, Intent data);

    Object b(Intent intent, Continuation<? super jn0.s<PaymentIntentResult>> continuation);

    boolean c(int requestCode, Intent data);

    Object d(com.stripe.android.view.n nVar, com.stripe.android.model.n nVar2, w30.l.Options options, Continuation<? super jn0.h0> continuation);

    Object e(Intent intent, Continuation<? super jn0.s<SetupIntentResult>> continuation);
}
