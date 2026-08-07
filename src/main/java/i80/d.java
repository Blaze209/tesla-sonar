package i80;

import com.stripe.android.paymentsheet.y;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;
import w70.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lw70/j$e;", "Lcom/stripe/android/paymentsheet/y$m;", "initializationMode", "", "a", "(Lw70/j$e;Lcom/stripe/android/paymentsheet/y$m;)Z", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class d {
    public static final boolean a(j.e eVar, y.m initializationMode) {
        s.k(eVar, "<this>");
        s.k(initializationMode, "initializationMode");
        boolean z11 = eVar.getCustomerRequestedSave() == j.a.RequestReuse;
        if (initializationMode instanceof y.m.PaymentIntent) {
            return z11;
        }
        if (initializationMode instanceof y.m.SetupIntent) {
            return true;
        }
        if (initializationMode instanceof y.m.DeferredIntent) {
            return ((y.m.DeferredIntent) initializationMode).getIntentConfiguration().getMode().getSetupFutureUse() != null || z11;
        }
        throw new NoWhenBranchMatchedException();
    }
}
