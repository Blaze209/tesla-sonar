package lb;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p013kotlin.Metadata;
import sb.WorkGenerationalId;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013¨\u0006\u0015"}, d2 = {"Llb/z;", "Llb/y;", "<init>", "()V", "Lsb/z;", "id", "Llb/x;", "b", "(Lsb/z;)Llb/x;", "a", "", "workSpecId", "", "remove", "(Ljava/lang/String;)Ljava/util/List;", "", "e", "(Lsb/z;)Z", "", "Ljava/util/Map;", "runs", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class z implements y {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<WorkGenerationalId, x> runs = new LinkedHashMap();

    @Override // lb.y
    public x a(WorkGenerationalId id2) {
        p013kotlin.jvm.internal.s.k(id2, "id");
        return this.runs.remove(id2);
    }

    @Override // lb.y
    public x b(WorkGenerationalId id2) {
        p013kotlin.jvm.internal.s.k(id2, "id");
        Map<WorkGenerationalId, x> map = this.runs;
        x xVar = map.get(id2);
        if (xVar == null) {
            xVar = new x(id2);
            map.put(id2, xVar);
        }
        return xVar;
    }

    @Override // lb.y
    public boolean e(WorkGenerationalId id2) {
        p013kotlin.jvm.internal.s.k(id2, "id");
        return this.runs.containsKey(id2);
    }

    @Override // lb.y
    public List<x> remove(String workSpecId) {
        p013kotlin.jvm.internal.s.k(workSpecId, "workSpecId");
        Map<WorkGenerationalId, x> map = this.runs;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<WorkGenerationalId, x> entry : map.entrySet()) {
            if (p013kotlin.jvm.internal.s.f(entry.getKey().getWorkSpecId(), workSpecId)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            this.runs.remove((WorkGenerationalId) it.next());
        }
        return p013kotlin.collections.v.m1(linkedHashMap.values());
    }
}
