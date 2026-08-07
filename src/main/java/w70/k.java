package w70;

import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0018\u0010\u0006\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003¨\u0006\u0007"}, d2 = {"Lw70/j;", "", "a", "(Lw70/j;)Z", "isLink", "b", "isSaved", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class k {
    public static final boolean a(j jVar) {
        s.k(jVar, "<this>");
        if (jVar instanceof j.c) {
            return false;
        }
        if ((jVar instanceof j.d) || (jVar instanceof j.e.LinkInline)) {
            return true;
        }
        if (jVar instanceof j.e) {
            return false;
        }
        if (jVar instanceof j.Saved) {
            return ((j.Saved) jVar).getWalletType() == j.Saved.b.Link;
        }
        if (jVar instanceof j.ExternalPaymentMethod) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean b(j jVar) {
        s.k(jVar, "<this>");
        return jVar instanceof j.Saved;
    }
}
