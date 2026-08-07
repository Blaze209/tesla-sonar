package qz;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Map<h, Set<f>> f106260a;

    static {
        HashMap map = new HashMap();
        map.put(h.f106257b, new HashSet(Arrays.asList(f.SIGN, f.VERIFY)));
        map.put(h.f106258c, new HashSet(Arrays.asList(f.ENCRYPT, f.DECRYPT, f.WRAP_KEY, f.UNWRAP_KEY)));
        f106260a = Collections.unmodifiableMap(map);
    }

    static boolean a(h hVar, Set<f> set) {
        if (hVar != null && set != null) {
            Map<h, Set<f>> map = f106260a;
            if (map.containsKey(hVar) && !map.get(hVar).containsAll(set)) {
                return false;
            }
        }
        return true;
    }
}
