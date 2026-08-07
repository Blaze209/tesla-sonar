package f70;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb70/a;", "Lcom/stripe/android/financialconnections/a$c;", "b", "(Lb70/a;)Lcom/stripe/android/financialconnections/a$c;", "payments-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class a {
    /* JADX INFO: Access modifiers changed from: private */
    public static final com.stripe.android.financialconnections.a.ElementsSessionContext b(b70.a aVar) {
        b70.a.InstantDebits instantDebits = aVar instanceof b70.a.InstantDebits ? (b70.a.InstantDebits) aVar : null;
        if (instantDebits != null) {
            return instantDebits.getElementsSessionContext();
        }
        return null;
    }
}
