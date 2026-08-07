package n40;

import com.stripe.android.financialconnections.model.PartnerAccount;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "Lcom/stripe/android/financialconnections/model/c0;", "Ln40/d;", "a", "(Ljava/util/List;)Ljava/util/List;", "financial-connections_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class z {
    public static final List<CachedPartnerAccount> a(List<PartnerAccount> list) {
        p013kotlin.jvm.internal.s.k(list, "<this>");
        List<PartnerAccount> list2 = list;
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list2, 10));
        for (PartnerAccount partnerAccount : list2) {
            arrayList.add(new CachedPartnerAccount(partnerAccount.getId(), partnerAccount.getLinkedAccountId()));
        }
        return arrayList;
    }
}
