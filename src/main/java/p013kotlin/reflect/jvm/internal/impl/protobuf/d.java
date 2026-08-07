package p013kotlin.reflect.jvm.internal.impl.protobuf;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes9.dex */
class d<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f88349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<d<K, V>.c> f88350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<K, V> f88351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f88352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile d<K, V>.e f88353e;

    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    static class a<FieldDescriptorType> extends d<FieldDescriptorType, Object> {
        a(int i11) {
            super(i11, null);
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.d
        public void p() {
            if (!o()) {
                for (int i11 = 0; i11 < l(); i11++) {
                    Map.Entry<FieldDescriptorType, Object> entryK = k(i11);
                    if (((FieldSet.FieldDescriptorLite) entryK.getKey()).isRepeated()) {
                        entryK.setValue(Collections.unmodifiableList((List) entryK.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : m()) {
                    if (((FieldSet.FieldDescriptorLite) entry.getKey()).isRepeated()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.p();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.r((FieldSet.FieldDescriptorLite) obj, obj2);
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Iterator<Object> f88354a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Iterable<Object> f88355b = new C1869b();

        static class a implements Iterator<Object> {
            a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.d$b$b, reason: collision with other inner class name */
        static class C1869b implements Iterable<Object> {
            C1869b() {
            }

            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return b.f88354a;
            }
        }

        static <T> Iterable<T> b() {
            return (Iterable<T>) f88355b;
        }
    }

    private class c implements Comparable<d<K, V>.c>, Map.Entry<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final K f88356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private V f88357b;

        c(d dVar, Map.Entry<K, V> entry) {
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
        public int compareTo(d<K, V>.c cVar) {
            return getKey().compareTo(cVar.getKey());
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public K getKey() {
            return this.f88356a;
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
            return b(this.f88356a, entry.getKey()) && b(this.f88357b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f88357b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k11 = this.f88356a;
            int iHashCode = k11 == null ? 0 : k11.hashCode();
            V v11 = this.f88357b;
            return iHashCode ^ (v11 != null ? v11.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v11) {
            d.this.i();
            V v12 = this.f88357b;
            this.f88357b = v11;
            return v12;
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f88356a);
            String strValueOf2 = String.valueOf(this.f88357b);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
            sb2.append(strValueOf);
            sb2.append("=");
            sb2.append(strValueOf2);
            return sb2.toString();
        }

        c(K k11, V v11) {
            this.f88356a = k11;
            this.f88357b = v11;
        }
    }

    private class e extends AbstractSet<Map.Entry<K, V>> {
        private e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            d.this.r(entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            d.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = d.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new C1870d(d.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            d.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return d.this.size();
        }

        /* synthetic */ e(d dVar, a aVar) {
            this();
        }
    }

    /* synthetic */ d(int i11, a aVar) {
        this(i11);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003c A[SYNTHETIC] */
    private int h(K k11) {
        int i11;
        int i12;
        int i13;
        int iCompareTo;
        int size = this.f88350b.size();
        int i14 = size - 1;
        if (i14 < 0) {
            i11 = 0;
            while (i11 <= i14) {
                i13 = (i11 + i14) / 2;
                iCompareTo = k11.compareTo(this.f88350b.get(i13).getKey());
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
            int iCompareTo2 = k11.compareTo(this.f88350b.get(i14).getKey());
            if (iCompareTo2 > 0) {
                i12 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i14;
                }
                i11 = 0;
                while (i11 <= i14) {
                    i13 = (i11 + i14) / 2;
                    iCompareTo = k11.compareTo(this.f88350b.get(i13).getKey());
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
    public void i() {
        if (this.f88352d) {
            throw new UnsupportedOperationException();
        }
    }

    private void j() {
        i();
        if (!this.f88350b.isEmpty() || (this.f88350b instanceof ArrayList)) {
            return;
        }
        this.f88350b = new ArrayList(this.f88349a);
    }

    private SortedMap<K, V> n() {
        i();
        if (this.f88351c.isEmpty() && !(this.f88351c instanceof TreeMap)) {
            this.f88351c = new TreeMap();
        }
        return (SortedMap) this.f88351c;
    }

    static <FieldDescriptorType extends FieldSet.FieldDescriptorLite<FieldDescriptorType>> d<FieldDescriptorType, Object> q(int i11) {
        return new a(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V s(int i11) {
        i();
        V value = this.f88350b.remove(i11).getValue();
        if (!this.f88351c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = n().entrySet().iterator();
            this.f88350b.add(new c(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        i();
        if (!this.f88350b.isEmpty()) {
            this.f88350b.clear();
        }
        if (this.f88351c.isEmpty()) {
            return;
        }
        this.f88351c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return h(comparable) >= 0 || this.f88351c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f88353e == null) {
            this.f88353e = new e(this, null);
        }
        return this.f88353e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iH = h(comparable);
        return iH >= 0 ? this.f88350b.get(iH).getValue() : this.f88351c.get(comparable);
    }

    public Map.Entry<K, V> k(int i11) {
        return this.f88350b.get(i11);
    }

    public int l() {
        return this.f88350b.size();
    }

    public Iterable<Map.Entry<K, V>> m() {
        return this.f88351c.isEmpty() ? b.b() : this.f88351c.entrySet();
    }

    public boolean o() {
        return this.f88352d;
    }

    public void p() {
        if (this.f88352d) {
            return;
        }
        this.f88351c = this.f88351c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f88351c);
        this.f88352d = true;
    }

    public V r(K k11, V v11) {
        i();
        int iH = h(k11);
        if (iH >= 0) {
            return this.f88350b.get(iH).setValue(v11);
        }
        j();
        int i11 = -(iH + 1);
        if (i11 >= this.f88349a) {
            return n().put(k11, v11);
        }
        int size = this.f88350b.size();
        int i12 = this.f88349a;
        if (size == i12) {
            d<K, V>.c cVarRemove = this.f88350b.remove(i12 - 1);
            n().put(cVarRemove.getKey(), cVarRemove.getValue());
        }
        this.f88350b.add(i11, new c(k11, v11));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        i();
        Comparable comparable = (Comparable) obj;
        int iH = h(comparable);
        if (iH >= 0) {
            return s(iH);
        }
        if (this.f88351c.isEmpty()) {
            return null;
        }
        return this.f88351c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f88350b.size() + this.f88351c.size();
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.d$d, reason: collision with other inner class name */
    private class C1870d implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f88359a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f88360b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f88361c;

        private C1870d() {
            this.f88359a = -1;
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.f88361c == null) {
                this.f88361c = d.this.f88351c.entrySet().iterator();
            }
            return this.f88361c;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            this.f88360b = true;
            int i11 = this.f88359a + 1;
            this.f88359a = i11;
            return i11 < d.this.f88350b.size() ? (Map.Entry) d.this.f88350b.get(this.f88359a) : a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f88359a + 1 < d.this.f88350b.size() || a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f88360b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f88360b = false;
            d.this.i();
            if (this.f88359a >= d.this.f88350b.size()) {
                a().remove();
                return;
            }
            d dVar = d.this;
            int i11 = this.f88359a;
            this.f88359a = i11 - 1;
            dVar.s(i11);
        }

        /* synthetic */ C1870d(d dVar, a aVar) {
            this();
        }
    }

    private d(int i11) {
        this.f88349a = i11;
        this.f88350b = Collections.EMPTY_LIST;
        this.f88351c = Collections.EMPTY_MAP;
    }
}
