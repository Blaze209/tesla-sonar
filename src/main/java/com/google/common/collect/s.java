package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public abstract class s<K, V> extends t implements Map<K, V> {
    protected s() {
    }

    @Override // java.util.Map
    public void clear() {
        d().clear();
    }

    public boolean containsKey(Object obj) {
        return d().containsKey(obj);
    }

    protected abstract Map<K, V> d();

    protected boolean e(Object obj) {
        return j0.b(this, obj);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return d().entrySet();
    }

    public V get(Object obj) {
        return d().get(obj);
    }

    protected boolean h(Object obj) {
        return j0.c(this, obj);
    }

    protected int i() {
        return z0.d(entrySet());
    }

    public boolean isEmpty() {
        return d().isEmpty();
    }

    public Set<K> keySet() {
        return d().keySet();
    }

    @Override // java.util.Map
    public V put(K k11, V v11) {
        return d().put(k11, v11);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        d().putAll(map);
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        return d().remove(obj);
    }

    public int size() {
        return d().size();
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return d().values();
    }
}
