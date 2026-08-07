package androidx.datastore.preferences.protobuf;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
class h1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<h1<K, V>.d> f8102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<K, V> f8103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f8104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile h1<K, V>.f f8105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<K, V> f8106e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile h1<K, V>.c f8107f;

    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    class a<FieldDescriptorType> extends h1<FieldDescriptorType, Object> {
        a() {
            super(null);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.u((Comparable) obj, obj2);
        }

        @Override // androidx.datastore.preferences.protobuf.h1
        public void s() {
            if (!r()) {
                for (int i11 = 0; i11 < n(); i11++) {
                    Map.Entry<FieldDescriptorType, Object> entryM = m(i11);
                    if (((s.b) entryM.getKey()).isRepeated()) {
                        entryM.setValue(Collections.unmodifiableList((List) entryM.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : p()) {
                    if (((s.b) entry.getKey()).isRepeated()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.s();
        }
    }

    private class c extends h1<K, V>.f {
        private c() {
            super(h1.this, null);
        }

        @Override // androidx.datastore.preferences.protobuf.h1.f, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new b(h1.this, null);
        }

        /* synthetic */ c(h1 h1Var, a aVar) {
            this();
        }
    }

    private class d implements Map.Entry<K, V>, Comparable<h1<K, V>.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final K f8112a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private V f8113b;

        d(h1 h1Var, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        private boolean b(Object obj, Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            return obj.equals(obj2);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(h1<K, V>.d dVar) {
            return getKey().compareTo(dVar.getKey());
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public K getKey() {
            return this.f8112a;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return b(this.f8112a, entry.getKey()) && b(this.f8113b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f8113b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k11 = this.f8112a;
            int iHashCode = k11 == null ? 0 : k11.hashCode();
            V v11 = this.f8113b;
            return iHashCode ^ (v11 != null ? v11.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v11) {
            h1.this.j();
            V v12 = this.f8113b;
            this.f8113b = v11;
            return v12;
        }

        public String toString() {
            return this.f8112a + "=" + this.f8113b;
        }

        d(K k11, V v11) {
            this.f8112a = k11;
            this.f8113b = v11;
        }
    }

    private class f extends AbstractSet<Map.Entry<K, V>> {
        private f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            h1.this.u(entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            h1.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = h1.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new e(h1.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            h1.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return h1.this.size();
        }

        /* synthetic */ f(h1 h1Var, a aVar) {
            this();
        }
    }

    /* synthetic */ h1(a aVar) {
        this();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003c A[SYNTHETIC] */
    private int i(K k11) {
        int i11;
        int i12;
        int i13;
        int iCompareTo;
        int size = this.f8102a.size();
        int i14 = size - 1;
        if (i14 < 0) {
            i11 = 0;
            while (i11 <= i14) {
                i13 = (i11 + i14) / 2;
                iCompareTo = k11.compareTo(this.f8102a.get(i13).getKey());
                if (iCompareTo < 0) {
                    i14 = i13 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i13;
                    }
                    i11 = i13 + 1;
                }
            }
            i12 = i11 + 1;
        } else {
            int iCompareTo2 = k11.compareTo(this.f8102a.get(i14).getKey());
            if (iCompareTo2 > 0) {
                i12 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i14;
                }
                i11 = 0;
                while (i11 <= i14) {
                    i13 = (i11 + i14) / 2;
                    iCompareTo = k11.compareTo(this.f8102a.get(i13).getKey());
                    if (iCompareTo < 0) {
                        i14 = i13 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i13;
                        }
                        i11 = i13 + 1;
                    }
                }
                i12 = i11 + 1;
            }
        }
        return -i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (this.f8104c) {
            throw new UnsupportedOperationException();
        }
    }

    private void l() {
        j();
        if (!this.f8102a.isEmpty() || (this.f8102a instanceof ArrayList)) {
            return;
        }
        this.f8102a = new ArrayList(16);
    }

    private SortedMap<K, V> q() {
        j();
        if (this.f8103b.isEmpty() && !(this.f8103b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f8103b = treeMap;
            this.f8106e = treeMap.descendingMap();
        }
        return (SortedMap) this.f8103b;
    }

    static <FieldDescriptorType extends s.b<FieldDescriptorType>> h1<FieldDescriptorType, Object> t() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V v(int i11) {
        j();
        V value = this.f8102a.remove(i11).getValue();
        if (!this.f8103b.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = q().entrySet().iterator();
            this.f8102a.add(new d(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        j();
        if (!this.f8102a.isEmpty()) {
            this.f8102a.clear();
        }
        if (this.f8103b.isEmpty()) {
            return;
        }
        this.f8103b.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return i(comparable) >= 0 || this.f8103b.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f8105d == null) {
            this.f8105d = new f(this, null);
        }
        return this.f8105d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return super.equals(obj);
        }
        h1 h1Var = (h1) obj;
        int size = size();
        if (size != h1Var.size()) {
            return false;
        }
        int iN = n();
        if (iN != h1Var.n()) {
            return entrySet().equals(h1Var.entrySet());
        }
        for (int i11 = 0; i11 < iN; i11++) {
            if (!m(i11).equals(h1Var.m(i11))) {
                return false;
            }
        }
        if (iN != size) {
            return this.f8103b.equals(h1Var.f8103b);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int i11 = i(comparable);
        return i11 >= 0 ? this.f8102a.get(i11).getValue() : this.f8103b.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iN = n();
        int iHashCode = 0;
        for (int i11 = 0; i11 < iN; i11++) {
            iHashCode += this.f8102a.get(i11).hashCode();
        }
        return o() > 0 ? iHashCode + this.f8103b.hashCode() : iHashCode;
    }

    Set<Map.Entry<K, V>> k() {
        if (this.f8107f == null) {
            this.f8107f = new c(this, null);
        }
        return this.f8107f;
    }

    public Map.Entry<K, V> m(int i11) {
        return this.f8102a.get(i11);
    }

    public int n() {
        return this.f8102a.size();
    }

    public int o() {
        return this.f8103b.size();
    }

    public Iterable<Map.Entry<K, V>> p() {
        return this.f8103b.isEmpty() ? Collections.EMPTY_SET : this.f8103b.entrySet();
    }

    public boolean r() {
        return this.f8104c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        j();
        Comparable comparable = (Comparable) obj;
        int i11 = i(comparable);
        if (i11 >= 0) {
            return v(i11);
        }
        if (this.f8103b.isEmpty()) {
            return null;
        }
        return this.f8103b.remove(comparable);
    }

    public void s() {
        if (this.f8104c) {
            return;
        }
        this.f8103b = this.f8103b.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f8103b);
        this.f8106e = this.f8106e.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f8106e);
        this.f8104c = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f8102a.size() + this.f8103b.size();
    }

    public V u(K k11, V v11) {
        j();
        int i11 = i(k11);
        if (i11 >= 0) {
            return this.f8102a.get(i11).setValue(v11);
        }
        l();
        int i12 = -(i11 + 1);
        if (i12 >= 16) {
            return q().put(k11, v11);
        }
        if (this.f8102a.size() == 16) {
            h1<K, V>.d dVarRemove = this.f8102a.remove(15);
            q().put(dVarRemove.getKey(), dVarRemove.getValue());
        }
        this.f8102a.add(i12, new d(k11, v11));
        return null;
    }

    private class b implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f8108a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f8109b;

        private b() {
            this.f8108a = h1.this.f8102a.size();
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.f8109b == null) {
                this.f8109b = h1.this.f8106e.entrySet().iterator();
            }
            return this.f8109b;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (a().hasNext()) {
                return a().next();
            }
            List list = h1.this.f8102a;
            int i11 = this.f8108a - 1;
            this.f8108a = i11;
            return (Map.Entry) list.get(i11);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i11 = this.f8108a;
            return (i11 > 0 && i11 <= h1.this.f8102a.size()) || a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* synthetic */ b(h1 h1Var, a aVar) {
            this();
        }
    }

    private class e implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f8115a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f8116b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f8117c;

        private e() {
            this.f8115a = -1;
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.f8117c == null) {
                this.f8117c = h1.this.f8103b.entrySet().iterator();
            }
            return this.f8117c;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            this.f8116b = true;
            int i11 = this.f8115a + 1;
            this.f8115a = i11;
            return i11 < h1.this.f8102a.size() ? (Map.Entry) h1.this.f8102a.get(this.f8115a) : a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f8115a + 1 < h1.this.f8102a.size() || (!h1.this.f8103b.isEmpty() && a().hasNext());
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f8116b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f8116b = false;
            h1.this.j();
            if (this.f8115a >= h1.this.f8102a.size()) {
                a().remove();
                return;
            }
            h1 h1Var = h1.this;
            int i11 = this.f8115a;
            this.f8115a = i11 - 1;
            h1Var.v(i11);
        }

        /* synthetic */ e(h1 h1Var, a aVar) {
            this();
        }
    }

    private h1() {
        this.f8102a = Collections.EMPTY_LIST;
        Map<K, V> map = Collections.EMPTY_MAP;
        this.f8103b = map;
        this.f8106e = map;
    }
}
