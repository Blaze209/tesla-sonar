package nm;

/* JADX INFO: loaded from: classes3.dex */
public interface n<K, V> extends x<K, V>, sk.c {

    public static class a<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final K f95173a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final tk.a<V> f95174b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final b<K> f95177e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f95179g;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f95175c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f95176d = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f95178f = 0;

        private a(K k11, tk.a<V> aVar, b<K> bVar, int i11) {
            this.f95173a = (K) pk.k.g(k11);
            this.f95174b = (tk.a) pk.k.g(tk.a.t(aVar));
            this.f95177e = bVar;
            this.f95179g = i11;
        }

        public static <K, V> a<K, V> a(K k11, tk.a<V> aVar, int i11, b<K> bVar) {
            return new a<>(k11, aVar, bVar, i11);
        }

        public static <K, V> a<K, V> b(K k11, tk.a<V> aVar, b<K> bVar) {
            return a(k11, aVar, -1, bVar);
        }
    }

    public interface b<K> {
        void a(K k11, boolean z11);
    }

    tk.a<V> d(K k11);

    tk.a<V> g(K k11, tk.a<V> aVar, b<K> bVar);
}
