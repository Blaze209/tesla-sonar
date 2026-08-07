package m40;

import android.app.Application;
import androidx.p003lifecycle.s0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.financialconnections.FinancialConnectionsSheetState;
import ezvcard.property.Kind;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lm40/e;", "", "Lcom/stripe/android/financialconnections/d;", "a", "()Lcom/stripe/android/financialconnections/d;", "viewModel", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface e {

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH'¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH'¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lm40/e$a;", "", "Landroid/app/Application;", Kind.APPLICATION, "a", "(Landroid/app/Application;)Lm40/e$a;", "Landroidx/lifecycle/s0;", "savedStateHandle", "b", "(Landroidx/lifecycle/s0;)Lm40/e$a;", "Lcom/stripe/android/financialconnections/b;", "initialState", DateTokenConverter.CONVERTER_KEY, "(Lcom/stripe/android/financialconnections/b;)Lm40/e$a;", "Lcom/stripe/android/financialconnections/a$b;", "configuration", "c", "(Lcom/stripe/android/financialconnections/a$b;)Lm40/e$a;", "Lm40/e;", "build", "()Lm40/e;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        a a(Application application);

        a b(s0 savedStateHandle);

        e build();

        a c(com.stripe.android.financialconnections.a.Configuration configuration);

        a d(FinancialConnectionsSheetState initialState);
    }

    com.stripe.android.financialconnections.d a();
}
