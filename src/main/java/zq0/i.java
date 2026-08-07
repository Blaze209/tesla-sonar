package zq0;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes10.dex */
public class i implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SortedMap<Integer, byte[]> f128498a;

    public i(Map<Integer, byte[]> map) {
        this.f128498a = new TreeMap(map);
    }

    private static boolean a(Map<Integer, byte[]> map, Map<Integer, byte[]> map2) {
        if (map == null && map2 != null) {
            return false;
        }
        if (map != null && map2 == null) {
            return false;
        }
        if (map == map2) {
            return true;
        }
        if (!map.keySet().equals(map2.keySet())) {
            return false;
        }
        for (Map.Entry<Integer, byte[]> entry : map.entrySet()) {
            Integer key = entry.getKey();
            key.intValue();
            if (!Arrays.equals(entry.getValue(), map2.get(key))) {
                return false;
            }
        }
        return true;
    }

    public SortedMap<Integer, byte[]> b() {
        return new TreeMap((SortedMap) this.f128498a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return a(this.f128498a, ((i) obj).f128498a);
        }
        return false;
    }

    public int hashCode() {
        SortedMap<Integer, byte[]> sortedMap = this.f128498a;
        return 31 + (sortedMap == null ? 0 : sortedMap.hashCode());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("StandardBiometricHeader [");
        boolean z11 = true;
        for (Map.Entry<Integer, byte[]> entry : this.f128498a.entrySet()) {
            if (z11) {
                z11 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(Integer.toHexString(entry.getKey().intValue()));
            sb2.append(" -> ");
            sb2.append(bp0.a.b(entry.getValue()));
        }
        sb2.append("]");
        return sb2.toString();
    }
}
