package pk;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class g<K, V> extends HashMap<K, V> {
    private g(Map<? extends K, ? extends V> map) {
        super(map);
    }

    public static <K, V> g<K, V> b(Map<? extends K, ? extends V> map) {
        return new g<>(map);
    }

    public static <K, V> Map<K, V> of(K k11, V v11) {
        HashMap map = new HashMap(1);
        map.put(k11, v11);
        return Collections.unmodifiableMap(map);
    }

    public static <K, V> Map<K, V> of(K k11, V v11, K k12, V v12) {
        HashMap map = new HashMap(2);
        map.put(k11, v11);
        map.put(k12, v12);
        return Collections.unmodifiableMap(map);
    }
}
