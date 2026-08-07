package s90;

import java.util.ArrayList;
import java.util.Map;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\u001a9\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"K", "V", "", "a", "(Ljava/util/Map;)Ljava/util/Map;", "payments-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class b {
    public static final <K, V> Map<K, V> a(Map<K, ? extends V> map) {
        s.k(map, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            Pair pairA = value != null ? x.a(key, value) : null;
            if (pairA != null) {
                arrayList.add(pairA);
            }
        }
        return v0.y(arrayList);
    }
}
