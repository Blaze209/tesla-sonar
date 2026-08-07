package e40;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Le40/i0;", "", "Lcom/stripe/android/customersheet/s;", "a", "()Lcom/stripe/android/customersheet/s;", "stripeCustomerAdapter", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface i0 {

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\nH'¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00002\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH'¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Le40/i0$a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "a", "(Landroid/content/Context;)Le40/i0$a;", "Lcom/stripe/android/customersheet/c;", "customerEphemeralKeyProvider", "c", "(Lcom/stripe/android/customersheet/c;)Le40/i0$a;", "Lcom/stripe/android/customersheet/r;", "setupIntentClientSecretProvider", "b", "(Lcom/stripe/android/customersheet/r;)Le40/i0$a;", "", "", "paymentMethodTypes", DateTokenConverter.CONVERTER_KEY, "(Ljava/util/List;)Le40/i0$a;", "Le40/i0;", "build", "()Le40/i0;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        a a(Context context);

        a b(com.stripe.android.customersheet.r setupIntentClientSecretProvider);

        i0 build();

        a c(com.stripe.android.customersheet.c customerEphemeralKeyProvider);

        a d(List<String> paymentMethodTypes);
    }

    com.stripe.android.customersheet.s a();
}
