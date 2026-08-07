package jn;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class c {

    public static final class a<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Map f84012a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f84013b;

        public Map<K, V> a() {
            if (!this.f84013b) {
                throw new IllegalStateException("Underlying map has already been built");
            }
            this.f84013b = false;
            return this.f84012a;
        }

        public a<K, V> b(K k11, V v11) {
            if (!this.f84013b) {
                throw new IllegalStateException("Underlying map has already been built");
            }
            this.f84012a.put(k11, v11);
            return this;
        }

        private a() {
            this.f84012a = c.b();
            this.f84013b = true;
        }
    }

    public static <K, V> a<K, V> a() {
        return new a<>();
    }

    public static <K, V> HashMap<K, V> b() {
        return new HashMap<>();
    }

    public static <K, V> Map<K, V> c() {
        return b();
    }

    public static <K, V> Map<K, V> d(K k11, V v11) {
        Map<K, V> mapC = c();
        mapC.put(k11, v11);
        return mapC;
    }

    public static <K, V> Map<K, V> e(K k11, V v11, K k12, V v12) {
        Map<K, V> mapC = c();
        mapC.put(k11, v11);
        mapC.put(k12, v12);
        return mapC;
    }

    public static <K, V> Map<K, V> f(K k11, V v11, K k12, V v12, K k13, V v13) {
        Map<K, V> mapC = c();
        mapC.put(k11, v11);
        mapC.put(k12, v12);
        mapC.put(k13, v13);
        return mapC;
    }

    public static <K, V> Map<K, V> g(K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14) {
        Map<K, V> mapC = c();
        mapC.put(k11, v11);
        mapC.put(k12, v12);
        mapC.put(k13, v13);
        mapC.put(k14, v14);
        return mapC;
    }

    public static <K, V> Map<K, V> h(K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15) {
        Map<K, V> mapC = c();
        mapC.put(k11, v11);
        mapC.put(k12, v12);
        mapC.put(k13, v13);
        mapC.put(k14, v14);
        mapC.put(k15, v15);
        return mapC;
    }

    public static <K, V> Map<K, V> i(K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16) {
        Map<K, V> mapC = c();
        mapC.put(k11, v11);
        mapC.put(k12, v12);
        mapC.put(k13, v13);
        mapC.put(k14, v14);
        mapC.put(k15, v15);
        mapC.put(k16, v16);
        return mapC;
    }

    public static <K, V> Map<K, V> j(K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17) {
        Map<K, V> mapC = c();
        mapC.put(k11, v11);
        mapC.put(k12, v12);
        mapC.put(k13, v13);
        mapC.put(k14, v14);
        mapC.put(k15, v15);
        mapC.put(k16, v16);
        mapC.put(k17, v17);
        return mapC;
    }
}
