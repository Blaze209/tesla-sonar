package k80;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.t;
import g80.CustomerState;
import java.util.List;
import kotlinx.coroutines.flow.StateFlow;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import r90.g;
import wn0.l;
import wn0.r;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001Bu\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u001a\u0010\r\u001a\u0016\u0012\f\u0012\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\u0004\u0012\u00020\f0\t\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f¢\u0006\u0004\b\u0011\u0010\u0012J?\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001c\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00130\u0002H\u0086\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001cR\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001cR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR(\u0010\r\u001a\u0016\u0012\f\u0012\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\u0004\u0012\u00020\f0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lk80/b;", "", "Lkotlinx/coroutines/flow/StateFlow;", "Lg80/a;", "customerState", "", "isGooglePayReady", "isLinkEnabled", "canRemovePaymentMethods", "Lkotlin/Function1;", "", "Lcom/stripe/android/model/PaymentMethodCode;", "Lx30/c;", "nameProvider", "isNotPaymentFlow", "Lkotlin/Function0;", "isCbcEligible", "<init>", "(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lwn0/l;ZLwn0/a;)V", "", "Lcom/stripe/android/model/v0;", "paymentMethods", "Lcom/stripe/android/paymentsheet/t;", "b", "(Ljava/util/List;Ljava/lang/Boolean;ZZ)Ljava/util/List;", "c", "()Lkotlinx/coroutines/flow/StateFlow;", "a", "Lkotlinx/coroutines/flow/StateFlow;", DateTokenConverter.CONVERTER_KEY, "e", "Lwn0/l;", "f", "Z", "g", "Lwn0/a;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<CustomerState> customerState;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<Boolean> isGooglePayReady;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<Boolean> isLinkEnabled;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<Boolean> canRemovePaymentMethods;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final l<String, x30.c> nameProvider;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean isNotPaymentFlow;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<Boolean> isCbcEligible;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lg80/a;", "customerState", "", "isLinkEnabled", "isGooglePayReady", "canRemove", "", "Lcom/stripe/android/paymentsheet/t;", "a", "(Lg80/a;Ljava/lang/Boolean;ZZ)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements r<CustomerState, Boolean, Boolean, Boolean, List<? extends t>> {
        a() {
            super(4);
        }

        public final List<t> a(CustomerState customerState, Boolean bool, boolean z11, boolean z12) {
            List<PaymentMethod> listM;
            b bVar = b.this;
            if (customerState == null || (listM = customerState.d()) == null) {
                listM = v.m();
            }
            List<t> listB = bVar.b(listM, bool, z11, z12);
            return listB == null ? v.m() : listB;
        }

        @Override // wn0.r
        public /* bridge */ /* synthetic */ List<? extends t> invoke(CustomerState customerState, Boolean bool, Boolean bool2, Boolean bool3) {
            return a(customerState, bool, bool2.booleanValue(), bool3.booleanValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(StateFlow<CustomerState> customerState, StateFlow<Boolean> isGooglePayReady, StateFlow<Boolean> isLinkEnabled, StateFlow<Boolean> canRemovePaymentMethods, l<? super String, ? extends x30.c> nameProvider, boolean z11, wn0.a<Boolean> isCbcEligible) {
        s.k(customerState, "customerState");
        s.k(isGooglePayReady, "isGooglePayReady");
        s.k(isLinkEnabled, "isLinkEnabled");
        s.k(canRemovePaymentMethods, "canRemovePaymentMethods");
        s.k(nameProvider, "nameProvider");
        s.k(isCbcEligible, "isCbcEligible");
        this.customerState = customerState;
        this.isGooglePayReady = isGooglePayReady;
        this.isLinkEnabled = isLinkEnabled;
        this.canRemovePaymentMethods = canRemovePaymentMethods;
        this.nameProvider = nameProvider;
        this.isNotPaymentFlow = z11;
        this.isCbcEligible = isCbcEligible;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<t> b(List<PaymentMethod> paymentMethods, Boolean isLinkEnabled, boolean isGooglePayReady, boolean canRemovePaymentMethods) {
        if (isLinkEnabled == null) {
            return null;
        }
        com.stripe.android.paymentsheet.v vVar = com.stripe.android.paymentsheet.v.f53787a;
        boolean z11 = true;
        if (!isGooglePayReady || !this.isNotPaymentFlow) {
            z11 = false;
        }
        return vVar.b(paymentMethods, z11, isLinkEnabled.booleanValue() && this.isNotPaymentFlow, this.nameProvider, canRemovePaymentMethods, this.isCbcEligible.invoke().booleanValue());
    }

    public final StateFlow<List<t>> c() {
        return g.f(this.customerState, this.isLinkEnabled, this.isGooglePayReady, this.canRemovePaymentMethods, new a());
    }
}
