package w70;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw70/j;", "Lw70/m;", "a", "(Lw70/j;)Lw70/m;", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class n {
    public static final m a(j jVar) {
        s.k(jVar, "<this>");
        if (jVar instanceof j.c) {
            return m.a.f121198a;
        }
        if (jVar instanceof j.d) {
            return m.b.f121199a;
        }
        if (!(jVar instanceof j.Saved)) {
            return null;
        }
        String str = ((j.Saved) jVar).getPaymentMethod().id;
        if (str == null) {
            str = "";
        }
        return new m.PaymentMethod(str);
    }
}
