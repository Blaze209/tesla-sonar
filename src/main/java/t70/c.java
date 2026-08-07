package t70;

import com.fourthline.adapters.serialization.OrcaKeys;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.y;
import com.stripe.android.paymentsheet.z;
import g80.CustomerState;
import g80.Full;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import u60.PaymentMethodMetadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J.\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lt70/c;", "Lt70/n;", "<init>", "()V", "Lw70/j;", "selection", "Lg80/l;", "state", "", "b", "(Lw70/j;Lg80/l;)Z", "Lw70/j$e;", "currentSelection", "Lu60/e;", OrcaKeys.METADATA, "c", "(Lw70/j$e;Lu60/e;)Z", "Lcom/stripe/android/paymentsheet/y$h;", "previousConfig", "newState", "a", "(Lw70/j;Lcom/stripe/android/paymentsheet/y$h;Lg80/l;)Lw70/j;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c implements n {
    private final boolean b(w70.j selection, Full state) {
        List<PaymentMethod> listM;
        List<String> listK = state.getPaymentMethodMetadata().K();
        if (selection instanceof w70.j.e) {
            w70.j.e eVar = (w70.j.e) selection;
            return listK.contains(eVar.getPaymentMethodCreateParams().i()) && !c(eVar, state.getPaymentMethodMetadata());
        }
        if (!(selection instanceof w70.j.Saved)) {
            if (selection instanceof w70.j.c) {
                return state.getPaymentMethodMetadata().getIsGooglePayReady();
            }
            if (selection instanceof w70.j.d) {
                return state.getLinkState() != null;
            }
            if (selection instanceof w70.j.ExternalPaymentMethod) {
                return state.getPaymentMethodMetadata().x(((w70.j.ExternalPaymentMethod) selection).getType());
            }
            throw new NoWhenBranchMatchedException();
        }
        PaymentMethod paymentMethod = ((w70.j.Saved) selection).getPaymentMethod();
        PaymentMethod.p pVar = paymentMethod.type;
        if (v.g0(listK, pVar != null ? pVar.code : null)) {
            CustomerState customer = state.getCustomer();
            if (customer == null || (listM = customer.d()) == null) {
                listM = v.m();
            }
            if (listM.contains(paymentMethod)) {
                return true;
            }
        }
        return false;
    }

    private final boolean c(w70.j.e currentSelection, PaymentMethodMetadata metadata) {
        return metadata.D(currentSelection.getPaymentMethodCreateParams().i()) && !o.b(currentSelection);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001e  */
    @Override // t70.n
    public w70.j a(w70.j currentSelection, y.Configuration previousConfig, Full newState) {
        boolean z11;
        s.k(newState, "newState");
        if (currentSelection != null) {
            if (b(currentSelection, newState)) {
                z11 = previousConfig != null ? z.a(previousConfig, newState.getConfig()) ^ true : true;
            }
            if (!z11) {
                currentSelection = null;
            }
            if (currentSelection != null) {
                return currentSelection;
            }
        }
        return newState.getPaymentSelection();
    }
}
