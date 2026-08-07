package com.google.common.collect;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public abstract class v<K, V> extends z<K, V> implements Map {

    public static final class a<K, V> extends z.a<K, V> {
        @Override // com.google.common.collect.z.a
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public v<K, V> a() {
            return c();
        }

        @Override // com.google.common.collect.z.a
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public v<K, V> c() {
            int i11 = this.f43732c;
            if (i11 == 0) {
                return v.u();
            }
            if (this.f43730a != null) {
                if (this.f43733d) {
                    this.f43731b = Arrays.copyOf(this.f43731b, i11 * 2);
                }
                z.a.j(this.f43731b, this.f43732c, this.f43730a);
            }
            this.f43733d = true;
            return new t0(this.f43731b, this.f43732c);
        }

        @Override // com.google.common.collect.z.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public a<K, V> f(K k11, V v11) {
            super.f(k11, v11);
            return this;
        }

        @Override // com.google.common.collect.z.a
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public a<K, V> g(Map.Entry<? extends K, ? extends V> entry) {
            super.g(entry);
            return this;
        }

        @Override // com.google.common.collect.z.a
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public a<K, V> h(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.h(iterable);
            return this;
        }

        @Override // com.google.common.collect.z.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public a<K, V> i(Map<? extends K, ? extends V> map) {
            super.i(map);
            return this;
        }
    }

    v() {
    }

    public static <K, V> a<K, V> r() {
        return new a<>();
    }

    public static <K, V> v<K, V> u() {
        return t0.f43685j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.z
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final b0<V> i() {
        throw new AssertionError("should never be called");
    }

    public abstract v<V, K> t();

    @Override // com.google.common.collect.z, java.util.Map
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public b0<V> values() {
        return t().keySet();
    }
}
