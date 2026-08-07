package u60;

import com.stripe.android.model.ElementsSession;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/model/h0;", "Lu60/h;", "a", "(Lcom/stripe/android/model/h0;)Lu60/h;", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class f {
    public static final h a(ElementsSession elementsSession) {
        ElementsSession.Customer.Session session;
        ElementsSession.Customer.Components components;
        s.k(elementsSession, "<this>");
        ElementsSession.Customer customer = elementsSession.getCustomer();
        ElementsSession.Customer.Components.c mobilePaymentElement = (customer == null || (session = customer.getSession()) == null || (components = session.getComponents()) == null) ? null : components.getMobilePaymentElement();
        if (mobilePaymentElement instanceof ElementsSession.Customer.Components.c.Enabled) {
            ElementsSession.Customer.Components.c.Enabled enabled = (ElementsSession.Customer.Components.c.Enabled) mobilePaymentElement;
            return enabled.getIsPaymentMethodSaveEnabled() ? h.c.f115779a : new h.Disabled(enabled.getAllowRedisplayOverride());
        }
        if ((mobilePaymentElement instanceof ElementsSession.Customer.Components.c.C0896a) || mobilePaymentElement == null) {
            return h.d.f115780a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
