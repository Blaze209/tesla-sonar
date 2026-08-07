package com.google.common.cache;

import com.google.common.util.concurrent.s;
import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public abstract class CacheLoader<K, V> {

    public static final class InvalidCacheLoadException extends RuntimeException {
        public InvalidCacheLoadException(String str) {
            super(str);
        }
    }

    public static final class UnsupportedLoadingOperationException extends UnsupportedOperationException {
        UnsupportedLoadingOperationException() {
        }
    }

    private static final class a<K, V> extends CacheLoader<K, V> implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ou.h<K, V> f43342a;

        a(ou.h<K, V> hVar) {
            this.f43342a = (ou.h) ou.p.m(hVar);
        }

        @Override // com.google.common.cache.CacheLoader
        public V b(K k11) {
            return this.f43342a.apply((K) ou.p.m(k11));
        }
    }

    protected CacheLoader() {
    }

    public static <K, V> CacheLoader<K, V> a(ou.h<K, V> hVar) {
        return new a(hVar);
    }

    public abstract V b(K k11);

    public s<V> c(K k11, V v11) {
        ou.p.m(k11);
        ou.p.m(v11);
        return com.google.common.util.concurrent.m.d(b(k11));
    }
}
