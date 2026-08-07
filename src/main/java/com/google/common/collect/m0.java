package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class m0 {

    private static final class a<K, V> extends c<K, V> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        transient ou.x<? extends List<V>> f43676g;

        a(Map<K, Collection<V>> map, ou.x<? extends List<V>> xVar) {
            super(map);
            this.f43676g = (ou.x) ou.p.m(xVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.d
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public List<V> s() {
            return this.f43676g.get();
        }

        @Override // com.google.common.collect.d, com.google.common.collect.f
        Map<K, Collection<V>> d() {
            return u();
        }

        @Override // com.google.common.collect.d, com.google.common.collect.f
        Set<K> f() {
            return v();
        }
    }

    static abstract class b<K, V> extends AbstractCollection<Map.Entry<K, V>> {
        b() {
        }

        abstract k0<K, V> a();

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return a().b(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return a().remove(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return a().size();
        }
    }

    static boolean a(k0<?, ?> k0Var, Object obj) {
        if (obj == k0Var) {
            return true;
        }
        if (obj instanceof k0) {
            return k0Var.asMap().equals(((k0) obj).asMap());
        }
        return false;
    }

    public static <K, V> e0<K, V> b(Map<K, Collection<V>> map, ou.x<? extends List<V>> xVar) {
        return new a(map, xVar);
    }
}
