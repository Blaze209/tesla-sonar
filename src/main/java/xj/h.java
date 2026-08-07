package xj;

import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class h<T, Y> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<T, a<Y>> f123604a = new LinkedHashMap(100, 0.75f, true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f123605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f123606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f123607d;

    static final class a<Y> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Y f123608a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f123609b;

        a(Y y11, int i11) {
            this.f123608a = y11;
            this.f123609b = i11;
        }
    }

    public h(long j11) {
        this.f123605b = j11;
        this.f123606c = j11;
    }

    private void f() {
        m(this.f123606c);
    }

    public void b() {
        m(0L);
    }

    public synchronized Y g(@NonNull T t11) {
        a<Y> aVar;
        aVar = this.f123604a.get(t11);
        return aVar != null ? aVar.f123608a : null;
    }

    public synchronized long h() {
        return this.f123606c;
    }

    protected int i(Y y11) {
        return 1;
    }

    public synchronized Y k(@NonNull T t11, Y y11) {
        int i11 = i(y11);
        long j11 = i11;
        if (j11 >= this.f123606c) {
            j(t11, y11);
            return null;
        }
        if (y11 != null) {
            this.f123607d += j11;
        }
        a<Y> aVarPut = this.f123604a.put(t11, y11 == null ? null : new a<>(y11, i11));
        if (aVarPut != null) {
            this.f123607d -= (long) aVarPut.f123609b;
            if (!aVarPut.f123608a.equals(y11)) {
                j(t11, aVarPut.f123608a);
            }
        }
        f();
        return aVarPut != null ? aVarPut.f123608a : null;
    }

    public synchronized Y l(@NonNull T t11) {
        a<Y> aVarRemove = this.f123604a.remove(t11);
        if (aVarRemove == null) {
            return null;
        }
        this.f123607d -= (long) aVarRemove.f123609b;
        return aVarRemove.f123608a;
    }

    protected synchronized void m(long j11) {
        while (this.f123607d > j11) {
            Iterator<Map.Entry<T, a<Y>>> it = this.f123604a.entrySet().iterator();
            Map.Entry<T, a<Y>> next = it.next();
            a<Y> value = next.getValue();
            this.f123607d -= (long) value.f123609b;
            T key = next.getKey();
            it.remove();
            j(key, value.f123608a);
        }
    }

    protected void j(@NonNull T t11, Y y11) {
    }
}
