package c70;

import android.app.Application;
import androidx.p003lifecycle.s0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import ezvcard.property.Kind;
import kotlinx.coroutines.flow.MutableSharedFlow;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lc70/a;", "", "Lcom/stripe/android/payments/bankaccount/ui/b;", "a", "()Lcom/stripe/android/payments/bankaccount/ui/b;", "viewModel", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: c70.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\b\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H'¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH'¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH'¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lc70/a$a;", "", "Landroid/app/Application;", Kind.APPLICATION, "a", "(Landroid/app/Application;)Lc70/a$a;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/stripe/android/payments/bankaccount/ui/a;", DateTokenConverter.CONVERTER_KEY, "(Lkotlinx/coroutines/flow/MutableSharedFlow;)Lc70/a$a;", "Landroidx/lifecycle/s0;", "savedStateHandle", "b", "(Landroidx/lifecycle/s0;)Lc70/a$a;", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$a;", "configuration", "c", "(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$a;)Lc70/a$a;", "Lc70/a;", "build", "()Lc70/a;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface InterfaceC0384a {
        InterfaceC0384a a(Application application);

        InterfaceC0384a b(s0 savedStateHandle);

        a build();

        InterfaceC0384a c(CollectBankAccountContract.a configuration);

        InterfaceC0384a d(MutableSharedFlow<com.stripe.android.payments.bankaccount.ui.a> application);
    }

    com.stripe.android.payments.bankaccount.ui.b a();
}
