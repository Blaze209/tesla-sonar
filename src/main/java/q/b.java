package q;

import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    c<K, V> f104111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c<K, V> f104112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakHashMap<f<K, V>, Boolean> f104113c = new WeakHashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f104114d = 0;

    static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // q.b.e
        c<K, V> b(c<K, V> cVar) {
            return cVar.f104118d;
        }

        @Override // q.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f104117c;
        }
    }

    /* JADX INFO: renamed from: q.b$b, reason: collision with other inner class name */
    private static class C2204b<K, V> extends e<K, V> {
        C2204b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // q.b.e
        c<K, V> b(c<K, V> cVar) {
            return cVar.f104117c;
        }

        @Override // q.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f104118d;
        }
    }

    static class c<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        final K f104115a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        final V f104116b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        c<K, V> f104117c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        c<K, V> f104118d;

        c(@NonNull K k11, @NonNull V v11) {
            this.f104115a = k11;
            this.f104116b = v11;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f104115a.equals(cVar.f104115a) && this.f104116b.equals(cVar.f104116b);
        }

        @Override // java.util.Map.Entry
        @NonNull
        public K getKey() {
            return this.f104115a;
        }

        @Override // java.util.Map.Entry
        @NonNull
        public V getValue() {
            return this.f104116b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f104115a.hashCode() ^ this.f104116b.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v11) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f104115a + "=" + this.f104116b;
        }
    }

    public class d extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private c<K, V> f104119a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f104120b = true;

        d() {
        }

        @Override // q.b.f
        void a(@NonNull c<K, V> cVar) {
            c<K, V> cVar2 = this.f104119a;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f104118d;
                this.f104119a = cVar3;
                this.f104120b = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (this.f104120b) {
                this.f104120b = false;
                this.f104119a = b.this.f104111a;
            } else {
                c<K, V> cVar = this.f104119a;
                this.f104119a = cVar != null ? cVar.f104117c : null;
            }
            return this.f104119a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f104120b) {
                return b.this.f104111a != null;
            }
            c<K, V> cVar = this.f104119a;
            return (cVar == null || cVar.f104117c == null) ? false : true;
        }
    }

    private static abstract class e<K, V> extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        c<K, V> f104122a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        c<K, V> f104123b;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.f104122a = cVar2;
            this.f104123b = cVar;
        }

        private c<K, V> e() {
            c<K, V> cVar = this.f104123b;
            c<K, V> cVar2 = this.f104122a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return c(cVar);
        }

        @Override // q.b.f
        public void a(@NonNull c<K, V> cVar) {
            if (this.f104122a == cVar && cVar == this.f104123b) {
                this.f104123b = null;
                this.f104122a = null;
            }
            c<K, V> cVar2 = this.f104122a;
            if (cVar2 == cVar) {
                this.f104122a = b(cVar2);
            }
            if (this.f104123b == cVar) {
                this.f104123b = e();
            }
        }

        abstract c<K, V> b(c<K, V> cVar);

        abstract c<K, V> c(c<K, V> cVar);

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f104123b;
            this.f104123b = e();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f104123b != null;
        }
    }

    public static abstract class f<K, V> {
        abstract void a(@NonNull c<K, V> cVar);
    }

    public Map.Entry<K, V> a() {
        return this.f104111a;
    }

    protected c<K, V> b(K k11) {
        c<K, V> cVar = this.f104111a;
        while (cVar != null && !cVar.f104115a.equals(k11)) {
            cVar = cVar.f104117c;
        }
        return cVar;
    }

    @NonNull
    public b<K, V>.d d() {
        b<K, V>.d dVar = new d();
        this.f104113c.put(dVar, Boolean.FALSE);
        return dVar;
    }

    @NonNull
    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C2204b c2204b = new C2204b(this.f104112b, this.f104111a);
        this.f104113c.put(c2204b, Boolean.FALSE);
        return c2204b;
    }

    public Map.Entry<K, V> e() {
        return this.f104112b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    c<K, V> f(@NonNull K k11, @NonNull V v11) {
        c<K, V> cVar = new c<>(k11, v11);
        this.f104114d++;
        c<K, V> cVar2 = this.f104112b;
        if (cVar2 == null) {
            this.f104111a = cVar;
            this.f104112b = cVar;
            return cVar;
        }
        cVar2.f104117c = cVar;
        cVar.f104118d = cVar2;
        this.f104112b = cVar;
        return cVar;
    }

    public V g(@NonNull K k11, @NonNull V v11) {
        c<K, V> cVarB = b(k11);
        if (cVarB != null) {
            return cVarB.f104116b;
        }
        f(k11, v11);
        return null;
    }

    public V h(@NonNull K k11) {
        c<K, V> cVarB = b(k11);
        if (cVarB == null) {
            return null;
        }
        this.f104114d--;
        if (!this.f104113c.isEmpty()) {
            Iterator<f<K, V>> it = this.f104113c.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(cVarB);
            }
        }
        c<K, V> cVar = cVarB.f104118d;
        if (cVar != null) {
            cVar.f104117c = cVarB.f104117c;
        } else {
            this.f104111a = cVarB.f104117c;
        }
        c<K, V> cVar2 = cVarB.f104117c;
        if (cVar2 != null) {
            cVar2.f104118d = cVar;
        } else {
            this.f104112b = cVar;
        }
        cVarB.f104117c = null;
        cVarB.f104118d = null;
        return cVarB.f104116b;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += it.next().hashCode();
        }
        return iHashCode;
    }

    @Override // java.lang.Iterable
    @NonNull
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f104111a, this.f104112b);
        this.f104113c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public int size() {
        return this.f104114d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb2.append(it.next().toString());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
