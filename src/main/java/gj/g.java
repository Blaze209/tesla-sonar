package gj;

import ch.qos.logback.core.CoreConstants;
import gj.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class g<K extends l, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a<K, V> f68963a = new a<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<K, a<K, V>> f68964b = new HashMap();

    private static class a<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final K f68965a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<V> f68966b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        a<K, V> f68967c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        a<K, V> f68968d;

        a() {
            this(null);
        }

        public void a(V v11) {
            if (this.f68966b == null) {
                this.f68966b = new ArrayList();
            }
            this.f68966b.add(v11);
        }

        public V b() {
            int iC = c();
            if (iC > 0) {
                return this.f68966b.remove(iC - 1);
            }
            return null;
        }

        public int c() {
            List<V> list = this.f68966b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        a(K k11) {
            this.f68968d = this;
            this.f68967c = this;
            this.f68965a = k11;
        }
    }

    g() {
    }

    private void b(a<K, V> aVar) {
        e(aVar);
        a<K, V> aVar2 = this.f68963a;
        aVar.f68968d = aVar2;
        aVar.f68967c = aVar2.f68967c;
        g(aVar);
    }

    private void c(a<K, V> aVar) {
        e(aVar);
        a<K, V> aVar2 = this.f68963a;
        aVar.f68968d = aVar2.f68968d;
        aVar.f68967c = aVar2;
        g(aVar);
    }

    private static <K, V> void e(a<K, V> aVar) {
        a<K, V> aVar2 = aVar.f68968d;
        aVar2.f68967c = aVar.f68967c;
        aVar.f68967c.f68968d = aVar2;
    }

    private static <K, V> void g(a<K, V> aVar) {
        aVar.f68967c.f68968d = aVar;
        aVar.f68968d.f68967c = aVar;
    }

    public V a(K k11) {
        a<K, V> aVar = this.f68964b.get(k11);
        if (aVar == null) {
            aVar = new a<>(k11);
            this.f68964b.put(k11, aVar);
        } else {
            k11.a();
        }
        b(aVar);
        return aVar.b();
    }

    public void d(K k11, V v11) {
        a<K, V> aVar = this.f68964b.get(k11);
        if (aVar == null) {
            aVar = new a<>(k11);
            c(aVar);
            this.f68964b.put(k11, aVar);
        } else {
            k11.a();
        }
        aVar.a(v11);
    }

    public V f() {
        for (a aVar = this.f68963a.f68968d; !aVar.equals(this.f68963a); aVar = aVar.f68968d) {
            V v11 = (V) aVar.b();
            if (v11 != null) {
                return v11;
            }
            e(aVar);
            this.f68964b.remove(aVar.f68965a);
            ((l) aVar.f68965a).a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("GroupedLinkedMap( ");
        a aVar = this.f68963a.f68967c;
        boolean z11 = false;
        while (!aVar.equals(this.f68963a)) {
            sb2.append(CoreConstants.CURLY_LEFT);
            sb2.append(aVar.f68965a);
            sb2.append(CoreConstants.COLON_CHAR);
            sb2.append(aVar.c());
            sb2.append("}, ");
            aVar = aVar.f68967c;
            z11 = true;
        }
        if (z11) {
            sb2.delete(sb2.length() - 2, sb2.length());
        }
        sb2.append(" )");
        return sb2.toString();
    }
}
