package v70;

import android.app.Application;
import androidx.p003lifecycle.s0;
import com.stripe.android.paymentsheet.PaymentOptionContract;
import ezvcard.property.Kind;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lv70/p;", "", "Lcom/stripe/android/paymentsheet/x;", "a", "()Lcom/stripe/android/paymentsheet/x;", "viewModel", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface p {

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH'¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lv70/p$a;", "", "Landroid/app/Application;", Kind.APPLICATION, "a", "(Landroid/app/Application;)Lv70/p$a;", "Landroidx/lifecycle/s0;", "handle", "b", "(Landroidx/lifecycle/s0;)Lv70/p$a;", "Lcom/stripe/android/paymentsheet/PaymentOptionContract$a;", "args", "c", "(Lcom/stripe/android/paymentsheet/PaymentOptionContract$a;)Lv70/p$a;", "Lv70/p;", "build", "()Lv70/p;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        a a(Application application);

        a b(s0 handle);

        p build();

        a c(PaymentOptionContract.Args args);
    }

    com.stripe.android.paymentsheet.x a();
}
