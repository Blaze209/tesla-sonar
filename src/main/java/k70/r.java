package k70;

import androidx.p003lifecycle.s0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lk70/r;", "", "Lcom/stripe/android/payments/paymentlauncher/e;", "a", "()Lcom/stripe/android/payments/paymentlauncher/e;", "viewModel", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface r {

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lk70/r$a;", "", "", "isPaymentIntent", "a", "(Z)Lk70/r$a;", "Landroidx/lifecycle/s0;", "handle", "b", "(Landroidx/lifecycle/s0;)Lk70/r$a;", "Lk70/r;", "build", "()Lk70/r;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        a a(boolean isPaymentIntent);

        a b(s0 handle);

        r build();
    }

    com.stripe.android.payments.paymentlauncher.e a();
}
