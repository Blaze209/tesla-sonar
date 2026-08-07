package qj0;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class g<K, V> extends qj0.a<K, V, V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final i<Map<Object, Object>> f105607b = f.a(Collections.EMPTY_MAP);

    public static final class b<K, V> extends qj0.a.AbstractC2240a<K, V, V> {
        public g<K, V> b() {
            return new g<>(this.f105600a);
        }

        public b<K, V> c(K k11, i<V> iVar) {
            super.a(k11, iVar);
            return this;
        }

        private b(int i11) {
            super(i11);
        }
    }

    public static <K, V> b<K, V> b(int i11) {
        return new b<>(i11);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Map<K, V> get() {
        LinkedHashMap linkedHashMapC = qj0.b.c(a().size());
        for (Map.Entry<K, i<V>> entry : a().entrySet()) {
            linkedHashMapC.put(entry.getKey(), entry.getValue().get());
        }
        return Collections.unmodifiableMap(linkedHashMapC);
    }

    private g(Map<K, i<V>> map) {
        super(map);
    }
}
