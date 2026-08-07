package p024x1;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import z3.j1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00020\u000e2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\"\u0010\u0015\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014¨\u0006\u0016"}, d2 = {"Lx1/v;", "Lz3/j1;", "Lx1/r;", "factory", "<init>", "(Lx1/r;)V", "Lz3/j1$a;", "slotIds", "Ljn0/h0;", "a", "(Lz3/j1$a;)V", "", "slotId", "reusableSlotId", "", "b", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "Lx1/r;", "", "", "Ljava/util/Map;", "countPerType", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class v implements j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final r factory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<Object, Integer> countPerType = new LinkedHashMap();

    public v(r rVar) {
        this.factory = rVar;
    }

    @Override // z3.j1
    public void a(j1.a slotIds) {
        this.countPerType.clear();
        Iterator<Object> it = slotIds.iterator();
        while (it.hasNext()) {
            Object objC = this.factory.c(it.next());
            Integer num = this.countPerType.get(objC);
            int iIntValue = num != null ? num.intValue() : 0;
            if (iIntValue == 7) {
                it.remove();
            } else {
                this.countPerType.put(objC, Integer.valueOf(iIntValue + 1));
            }
        }
    }

    @Override // z3.j1
    public boolean b(Object slotId, Object reusableSlotId) {
        return s.f(this.factory.c(slotId), this.factory.c(reusableSlotId));
    }
}
