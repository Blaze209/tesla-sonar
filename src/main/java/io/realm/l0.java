package io.realm;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public abstract class l0<K, V> implements Map<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final b<K, V> f79147a = new c();

    static abstract class b<K, V> implements Map<K, V> {
        b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        protected void b(K k11) {
            if (k11 == 0) {
                throw new NullPointerException("Null keys are not allowed.");
            }
            if (k11.getClass() == String.class) {
                String str = (String) k11;
                if (str.contains(".") || str.contains("$")) {
                    throw new IllegalArgumentException("Keys containing dots ('.') or dollar signs ('$') are not allowed.");
                }
            }
        }

        abstract V c(K k11, V v11);

        @Override // java.util.Map
        public V put(K k11, V v11) {
            b(k11);
            return c(k11, v11);
        }
    }

    private static class c<K, V> extends b<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<K, V> f79148a;

        private c() {
            this.f79148a = new HashMap();
        }

        @Override // io.realm.l0.b
        protected V c(K k11, V v11) {
            return this.f79148a.put(k11, v11);
        }

        @Override // java.util.Map
        public void clear() {
            this.f79148a.clear();
        }

        @Override // java.util.Map
        public boolean containsKey(Object obj) {
            return this.f79148a.containsKey(obj);
        }

        @Override // java.util.Map
        public boolean containsValue(Object obj) {
            return this.f79148a.containsValue(obj);
        }

        @Override // java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            return this.f79148a.entrySet();
        }

        @Override // java.util.Map
        public V get(Object obj) {
            return this.f79148a.get(obj);
        }

        @Override // java.util.Map
        public boolean isEmpty() {
            return this.f79148a.isEmpty();
        }

        @Override // java.util.Map
        public Set<K> keySet() {
            return this.f79148a.keySet();
        }

        @Override // java.util.Map
        public void putAll(Map<? extends K, ? extends V> map) {
            this.f79148a.putAll(map);
        }

        @Override // java.util.Map
        public V remove(Object obj) {
            return this.f79148a.remove(obj);
        }

        @Override // java.util.Map
        public int size() {
            return this.f79148a.size();
        }

        @Override // java.util.Map
        public Collection<V> values() {
            return this.f79148a.values();
        }
    }

    protected l0() {
    }

    @Override // java.util.Map
    public void clear() {
        this.f79147a.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f79147a.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.f79147a.containsValue(obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return this.f79147a.entrySet();
    }

    @Override // java.util.Map
    public V get(Object obj) {
        return this.f79147a.get(obj);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f79147a.isEmpty();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return this.f79147a.keySet();
    }

    @Override // java.util.Map
    public V put(K k11, V v11) {
        return this.f79147a.put(k11, v11);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        this.f79147a.putAll(map);
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        return this.f79147a.remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return this.f79147a.size();
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return this.f79147a.values();
    }
}
