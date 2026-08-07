package j$.time.format;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes2.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f82157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f82158b;

    public y(Map map) {
        this.f82157a = map;
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            HashMap map3 = new HashMap();
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                String str = (String) entry2.getValue();
                String str2 = (String) entry2.getValue();
                Long l11 = (Long) entry2.getKey();
                ConcurrentMap concurrentMap = z.f82159a;
                map3.put(str, new AbstractMap.SimpleImmutableEntry(str2, l11));
            }
            ArrayList arrayList2 = new ArrayList(map3.values());
            Collections.sort(arrayList2, z.f82160b);
            map2.put((e0) entry.getKey(), arrayList2);
            arrayList.addAll(arrayList2);
            map2.put(null, arrayList);
        }
        Collections.sort(arrayList, z.f82160b);
        this.f82158b = map2;
    }

    public final String a(long j11, e0 e0Var) {
        Map map = (Map) this.f82157a.get(e0Var);
        if (map != null) {
            return (String) map.get(Long.valueOf(j11));
        }
        return null;
    }
}
