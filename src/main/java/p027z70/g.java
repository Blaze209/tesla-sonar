package p027z70;

import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;
import x30.c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lz70/f;", "Lx30/c;", "mandate", "a", "(Lz70/f;Lx30/c;)Lz70/f;", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class g {
    public static final f a(f fVar, c cVar) {
        s.k(fVar, "<this>");
        if (fVar instanceof f.BillingDetailsCollection) {
            return fVar;
        }
        if (fVar instanceof f.MandateCollection) {
            return f.MandateCollection.f((f.MandateCollection) fVar, null, null, null, null, null, cVar, 31, null);
        }
        if (fVar instanceof f.SavedAccount) {
            return f.SavedAccount.f((f.SavedAccount) fVar, null, null, null, null, null, cVar, 31, null);
        }
        if (fVar instanceof f.VerifyWithMicrodeposits) {
            return f.VerifyWithMicrodeposits.f((f.VerifyWithMicrodeposits) fVar, null, null, null, null, cVar, 15, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
