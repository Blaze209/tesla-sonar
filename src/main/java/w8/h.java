package w8;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Long, g> f121315a = new LinkedHashMap();

    public void a(g gVar) {
        long[] jArr = gVar.f121313e;
        if (jArr.length <= 0 || this.f121315a.containsKey(Long.valueOf(jArr[0]))) {
            return;
        }
        this.f121315a.put(Long.valueOf(gVar.f121313e[0]), gVar);
    }

    public g b() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (g gVar : this.f121315a.values()) {
            arrayList.add(gVar.f121310b);
            arrayList2.add(gVar.f121311c);
            arrayList3.add(gVar.f121312d);
            arrayList4.add(gVar.f121313e);
        }
        return new g(ru.f.f((int[][]) arrayList.toArray(new int[arrayList.size()][])), ru.h.b((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), ru.h.b((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), ru.h.b((long[][]) arrayList4.toArray(new long[arrayList4.size()][])));
    }

    public int c() {
        return this.f121315a.size();
    }
}
