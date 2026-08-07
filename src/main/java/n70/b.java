package n70;

import androidx.p003lifecycle.s0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.model.PaymentMethod;
import g80.CustomerState;
import java.util.List;
import kotlinx.coroutines.flow.StateFlow;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0004\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u0012B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0012\u0010\u0017R#\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00190\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017¨\u0006\u001d"}, d2 = {"Ln70/b;", "", "Landroidx/lifecycle/s0;", "savedStateHandle", "Lkotlinx/coroutines/flow/StateFlow;", "Lw70/j;", "selection", "<init>", "(Landroidx/lifecycle/s0;Lkotlinx/coroutines/flow/StateFlow;)V", "Lg80/a;", "customerState", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lg80/a;)V", "Lcom/stripe/android/model/v0;", "paymentMethod", "e", "(Lcom/stripe/android/model/v0;)V", "a", "Landroidx/lifecycle/s0;", "b", "Lkotlinx/coroutines/flow/StateFlow;", "c", "()Lkotlinx/coroutines/flow/StateFlow;", "customer", "", "paymentMethods", "mostRecentlySelectedSavedPaymentMethod", "f", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f93388g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final s0 savedStateHandle;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<w70.j> selection;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<CustomerState> customer;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<List<PaymentMethod>> paymentMethods;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<PaymentMethod> mostRecentlySelectedSavedPaymentMethod;

    /* JADX INFO: renamed from: n70.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Ln70/b$a;", "", "<init>", "()V", "Lk80/a;", "viewModel", "Ln70/b;", "a", "(Lk80/a;)Ln70/b;", "", "SAVED_CUSTOMER", "Ljava/lang/String;", "SAVED_PM_SELECTION", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(k80.a viewModel) {
            p013kotlin.jvm.internal.s.k(viewModel, "viewModel");
            return new b(viewModel.getSavedStateHandle(), viewModel.C());
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: n70.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lg80/a;", "state", "", "Lcom/stripe/android/model/v0;", "a", "(Lg80/a;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    static final class C1994b extends p013kotlin.jvm.internal.u implements wn0.l<CustomerState, List<? extends PaymentMethod>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C1994b f93394c = new C1994b();

        C1994b() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<PaymentMethod> invoke(CustomerState customerState) {
            List<PaymentMethod> listD;
            return (customerState == null || (listD = customerState.d()) == null) ? p013kotlin.collections.v.m() : listD;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(s0 savedStateHandle, StateFlow<? extends w70.j> selection) {
        p013kotlin.jvm.internal.s.k(savedStateHandle, "savedStateHandle");
        p013kotlin.jvm.internal.s.k(selection, "selection");
        this.savedStateHandle = savedStateHandle;
        this.selection = selection;
        StateFlow<CustomerState> stateFlowI = savedStateHandle.i("customer_info", null);
        this.customer = stateFlowI;
        this.paymentMethods = r90.g.m(stateFlowI, C1994b.f93394c);
        Object value = selection.getValue();
        w70.j.Saved saved = value instanceof w70.j.Saved ? (w70.j.Saved) value : null;
        this.mostRecentlySelectedSavedPaymentMethod = savedStateHandle.i("saved_selection", saved != null ? saved.getPaymentMethod() : null);
    }

    public final StateFlow<CustomerState> a() {
        return this.customer;
    }

    public final StateFlow<PaymentMethod> b() {
        return this.mostRecentlySelectedSavedPaymentMethod;
    }

    public final StateFlow<List<PaymentMethod>> c() {
        return this.paymentMethods;
    }

    public final void d(CustomerState customerState) {
        this.savedStateHandle.n("customer_info", customerState);
    }

    public final void e(PaymentMethod paymentMethod) {
        this.savedStateHandle.n("saved_selection", paymentMethod);
    }
}
