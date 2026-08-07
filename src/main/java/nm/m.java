package nm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class m<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0<V> f95170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LinkedHashMap<K, V> f95171b = new LinkedHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f95172c = 0;

    public m(d0<V> d0Var) {
        this.f95170a = d0Var;
    }

    private int g(V v11) {
        if (v11 == null) {
            return 0;
        }
        return this.f95170a.a(v11);
    }

    public synchronized boolean a(K k11) {
        return this.f95171b.containsKey(k11);
    }

    public synchronized V b(K k11) {
        return this.f95171b.get(k11);
    }

    public synchronized int c() {
        return this.f95171b.size();
    }

    public synchronized K d() {
        return this.f95171b.isEmpty() ? null : this.f95171b.keySet().iterator().next();
    }

    public synchronized ArrayList<Map.Entry<K, V>> e(pk.l<K> lVar) {
        ArrayList<Map.Entry<K, V>> arrayList;
        try {
            arrayList = new ArrayList<>(this.f95171b.entrySet().size());
            for (Map.Entry<K, V> entry : this.f95171b.entrySet()) {
                if (lVar == null || lVar.apply(entry.getKey())) {
                    arrayList.add(entry);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    public synchronized int f() {
        return this.f95172c;
    }

    public synchronized V h(K k11, V v11) {
        V vRemove;
        vRemove = this.f95171b.remove(k11);
        this.f95172c -= g(vRemove);
        this.f95171b.put(k11, v11);
        this.f95172c += g(v11);
        return vRemove;
    }

    public synchronized V i(K k11) {
        V vRemove;
        vRemove = this.f95171b.remove(k11);
        this.f95172c -= g(vRemove);
        return vRemove;
    }

    public synchronized ArrayList<V> j(pk.l<K> lVar) {
        ArrayList<V> arrayList;
        try {
            arrayList = new ArrayList<>();
            Iterator<Map.Entry<K, V>> it = this.f95171b.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (lVar == null || lVar.apply(next.getKey())) {
                    arrayList.add(next.getValue());
                    this.f95172c -= g(next.getValue());
                    it.remove();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    public synchronized void k() {
        if (this.f95171b.isEmpty()) {
            this.f95172c = 0;
        }
    }
}
