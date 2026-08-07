package e40;

import android.app.Application;
import androidx.p003lifecycle.s0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ezvcard.property.Kind;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Le40/j;", "", "Lcom/stripe/android/customersheet/l;", "a", "()Lcom/stripe/android/customersheet/l;", "viewModel", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface j {

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\nH'¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH'¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012H'¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Le40/j$a;", "", "Landroid/app/Application;", Kind.APPLICATION, "a", "(Landroid/app/Application;)Le40/j$a;", "Lcom/stripe/android/customersheet/d$c;", "configuration", "c", "(Lcom/stripe/android/customersheet/d$c;)Le40/j$a;", "", "statusBarColor", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Integer;)Le40/j$a;", "Lcom/stripe/android/customersheet/g$c;", "integrationType", "e", "(Lcom/stripe/android/customersheet/g$c;)Le40/j$a;", "Landroidx/lifecycle/s0;", "savedStateHandle", "b", "(Landroidx/lifecycle/s0;)Le40/j$a;", "Le40/j;", "build", "()Le40/j;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        a a(Application application);

        a b(s0 savedStateHandle);

        j build();

        a c(com.stripe.android.customersheet.d.Configuration configuration);

        a d(Integer statusBarColor);

        a e(com.stripe.android.customersheet.g.c integrationType);
    }

    com.stripe.android.customersheet.l a();
}
