package com.google.common.collect;

import ch.qos.logback.core.CoreConstants;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class j0 {

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    class a<K, V> extends b1<Map.Entry<K, V>, V> {
        a(Iterator it) {
            super(it);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.b1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public V a(Map.Entry<K, V> entry) {
            return entry.getValue();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static abstract class b implements ou.h<Map.Entry<?, ?>, Object> {
        public static final b KEY = new a("KEY", 0);
        public static final b VALUE = new C0684b("VALUE", 1);
        private static final /* synthetic */ b[] $VALUES = $values();

        final enum a extends b {
            a(String str, int i11) {
                super(str, i11, null);
            }

            @Override // com.google.common.collect.j0.b, ou.h
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.j0$b$b, reason: collision with other inner class name */
        final enum C0684b extends b {
            C0684b(String str, int i11) {
                super(str, i11, null);
            }

            @Override // com.google.common.collect.j0.b, ou.h
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }

        private static /* synthetic */ b[] $values() {
            return new b[]{KEY, VALUE};
        }

        private b(String str, int i11) {
            super(str, i11);
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        @Override // ou.h
        public abstract /* synthetic */ Object apply(Map.Entry<?, ?> entry);

        /* synthetic */ b(String str, int i11, i0 i0Var) {
            this(str, i11);
        }
    }

    static abstract class c<K, V> extends z0.e<Map.Entry<K, V>> {
        c() {
        }

        abstract Map<K, V> a();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public abstract boolean contains(Object obj);

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return a().isEmpty();
        }

        @Override // com.google.common.collect.z0.e, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) ou.p.m(collection));
            } catch (UnsupportedOperationException unused) {
                return z0.i(this, collection.iterator());
            }
        }

        @Override // com.google.common.collect.z0.e, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) ou.p.m(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetF = z0.f(collection.size());
                for (Object obj : collection) {
                    if (contains(obj) && (obj instanceof Map.Entry)) {
                        hashSetF.add(((Map.Entry) obj).getKey());
                    }
                }
                return a().keySet().retainAll(hashSetF);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return a().size();
        }
    }

    static class d<K, V> extends z0.e<K> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Map<K, V> f43642a;

        d(Map<K, V> map) {
            this.f43642a = (Map) ou.p.m(map);
        }

        Map<K, V> a() {
            return this.f43642a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return a().containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return a().size();
        }
    }

    static class e<K, V> extends AbstractCollection<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Map<K, V> f43643a;

        e(Map<K, V> map) {
            this.f43643a = (Map) ou.p.m(map);
        }

        final Map<K, V> a() {
            return this.f43643a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return a().containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return j0.m(a().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry<K, V> entry : a().entrySet()) {
                    if (Objects.equals(obj, entry.getValue())) {
                        a().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) ou.p.m(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet();
                for (Map.Entry<K, V> entry : a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSet.add(entry.getKey());
                    }
                }
                return a().keySet().removeAll(hashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) ou.p.m(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet();
                for (Map.Entry<K, V> entry : a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSet.add(entry.getKey());
                    }
                }
                return a().keySet().retainAll(hashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return a().size();
        }
    }

    static abstract class f<K, V> extends AbstractMap<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private transient Set<Map.Entry<K, V>> f43644a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private transient Collection<V> f43645b;

        f() {
        }

        abstract Set<Map.Entry<K, V>> b();

        Collection<V> c() {
            return new e(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f43644a;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> setB = b();
            this.f43644a = setB;
            return setB;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> values() {
            Collection<V> collection = this.f43645b;
            if (collection != null) {
                return collection;
            }
            Collection<V> collectionC = c();
            this.f43645b = collectionC;
            return collectionC;
        }
    }

    static int a(int i11) {
        if (i11 < 3) {
            k.b(i11, "expectedSize");
            return i11 + 1;
        }
        if (i11 < 1073741824) {
            return (int) Math.ceil(((double) i11) / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    static boolean b(Map<?, ?> map, Object obj) {
        return d0.d(m(map.entrySet().iterator()), obj);
    }

    static boolean c(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static <K, V> Map.Entry<K, V> d(K k11, V v11) {
        return new AbstractMap.SimpleImmutableEntry(k11, v11);
    }

    static <K> ou.h<Map.Entry<K, ?>, K> e() {
        return b.KEY;
    }

    public static <K, V> HashMap<K, V> f(int i11) {
        return new HashMap<>(a(i11));
    }

    public static <K, V> IdentityHashMap<K, V> g() {
        return new IdentityHashMap<>();
    }

    static boolean h(Map<?, ?> map, Object obj) {
        ou.p.m(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    static <V> V i(Map<?, V> map, Object obj) {
        ou.p.m(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static <V> V j(Map<?, V> map, Object obj) {
        ou.p.m(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static String k(Map<?, ?> map) {
        StringBuilder sbB = l.b(map.size());
        sbB.append(CoreConstants.CURLY_LEFT);
        boolean z11 = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!z11) {
                sbB.append(", ");
            }
            sbB.append(entry.getKey());
            sbB.append('=');
            sbB.append(entry.getValue());
            z11 = false;
        }
        sbB.append(CoreConstants.CURLY_RIGHT);
        return sbB.toString();
    }

    static <V> ou.h<Map.Entry<?, V>, V> l() {
        return b.VALUE;
    }

    static <K, V> Iterator<V> m(Iterator<Map.Entry<K, V>> it) {
        return new a(it);
    }
}
