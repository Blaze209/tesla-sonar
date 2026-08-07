package io.sentry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class w implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Throwable, Object> f81560a = Collections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q7 f81561b;

    public w(q7 q7Var) {
        this.f81561b = (q7) io.sentry.util.y.c(q7Var, "options are required");
    }

    private static List<Throwable> a(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        while (th2.getCause() != null) {
            arrayList.add(th2.getCause());
            th2 = th2.getCause();
        }
        return arrayList;
    }

    private static <T> boolean b(Map<T, Object> map, List<T> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (map.containsKey(it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // io.sentry.c0
    public r6 n(r6 r6Var, h0 h0Var) {
        if (!this.f81561b.isEnableDeduplication()) {
            this.f81561b.getLogger().c(b7.DEBUG, "Event deduplication is disabled.", new Object[0]);
            return r6Var;
        }
        Throwable thO = r6Var.O();
        if (thO == null) {
            return r6Var;
        }
        if (this.f81560a.containsKey(thO) || b(this.f81560a, a(thO))) {
            this.f81561b.getLogger().c(b7.DEBUG, "Duplicate Exception detected. Event %s will be discarded.", r6Var.G());
            return null;
        }
        this.f81560a.put(thO, null);
        return r6Var;
    }
}
