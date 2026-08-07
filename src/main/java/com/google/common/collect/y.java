package com.google.common.collect;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class y<K, V> extends a0<K, V> implements e0<K, V> {

    public static final class a<K, V> extends a0.c<K, V> {
        public y<K, V> e() {
            return (y) super.a();
        }

        public a<K, V> f(K k11, V v11) {
            super.d(k11, v11);
            return this;
        }
    }

    y(z<K, x<V>> zVar, int i11) {
        super(zVar, i11);
    }

    public static <K, V> a<K, V> u() {
        return new a<>();
    }

    static <K, V> y<K, V> v(Collection<? extends Map.Entry<K, w.b<V>>> collection, Comparator<? super V> comparator) {
        if (collection.isEmpty()) {
            return x();
        }
        z.a aVar = new z.a(collection.size());
        int size = 0;
        for (Map.Entry<K, w.b<V>> entry : collection) {
            K key = entry.getKey();
            x.a aVar2 = (x.a) entry.getValue();
            x xVarK = comparator == null ? aVar2.k() : aVar2.l(comparator);
            aVar.f(key, xVarK);
            size += xVarK.size();
        }
        return new y<>(aVar.c(), size);
    }

    public static <K, V> y<K, V> x() {
        return r.f43684g;
    }

    @Override // com.google.common.collect.k0
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public x<V> get(K k11) {
        x<V> xVar = (x) this.f43506e.get(k11);
        return xVar == null ? x.r() : xVar;
    }
}
