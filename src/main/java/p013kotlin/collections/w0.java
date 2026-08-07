package p013kotlin.collections;

import ch.qos.logback.core.joran.action.Action;
import java.util.Map;
import java.util.NoSuchElementException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\u001a3\u0010\u0004\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"K", "V", "", Action.KEY_ATTRIBUTE, "a", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/collections/MapsKt")
class w0 {
    public static final <K, V> V a(Map<K, ? extends V> map, K k11) {
        s.k(map, "<this>");
        if (map instanceof u0) {
            return (V) ((u0) map).g(k11);
        }
        V v11 = map.get(k11);
        if (v11 != null || map.containsKey(k11)) {
            return v11;
        }
        throw new NoSuchElementException("Key " + k11 + " is missing in the map.");
    }
}
