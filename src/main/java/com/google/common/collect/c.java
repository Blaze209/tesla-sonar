package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
abstract class c<K, V> extends d<K, V> implements e0<K, V> {
    protected c(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // com.google.common.collect.d, com.google.common.collect.k0
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public List<V> get(K k11) {
        return (List) super.get(k11);
    }

    @Override // com.google.common.collect.f, com.google.common.collect.k0
    public Map<K, Collection<V>> asMap() {
        return super.asMap();
    }

    @Override // com.google.common.collect.f
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.d, com.google.common.collect.k0
    public boolean put(K k11, V v11) {
        return super.put(k11, v11);
    }

    @Override // com.google.common.collect.d
    <E> Collection<E> y(Collection<E> collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // com.google.common.collect.d
    Collection<V> z(K k11, Collection<V> collection) {
        return A(k11, (List) collection, null);
    }
}
