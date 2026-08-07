package ve0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;
import vc0.n;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\"!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u00008F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"", "Lvc0/n;", "", "", "a", "(Ljava/util/List;)[Ljava/lang/String;", "analyticsName", "tesla-ble_globalPlayRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class a {
    public static final String[] a(List<? extends n> list) {
        s.k(list, "<this>");
        List<? extends n> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(t.r1(((n) it.next()).name(), "AUTHENTICATIONREASON_", null, 2, null));
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}
