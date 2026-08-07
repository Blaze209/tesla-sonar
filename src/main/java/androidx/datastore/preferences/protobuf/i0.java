package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public class i0<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a<K, V> f8125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final K f8126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final V f8127c;

    static class a<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p1.b f8128a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final K f8129b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final p1.b f8130c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final V f8131d;

        public a(p1.b bVar, K k11, p1.b bVar2, V v11) {
            this.f8128a = bVar;
            this.f8129b = k11;
            this.f8130c = bVar2;
            this.f8131d = v11;
        }
    }

    private i0(p1.b bVar, K k11, p1.b bVar2, V v11) {
        this.f8125a = new a<>(bVar, k11, bVar2, v11);
        this.f8126b = k11;
        this.f8127c = v11;
    }

    static <K, V> int b(a<K, V> aVar, K k11, V v11) {
        return s.d(aVar.f8128a, 1, k11) + s.d(aVar.f8130c, 2, v11);
    }

    public static <K, V> i0<K, V> d(p1.b bVar, K k11, p1.b bVar2, V v11) {
        return new i0<>(bVar, k11, bVar2, v11);
    }

    static <K, V> void e(CodedOutputStream codedOutputStream, a<K, V> aVar, K k11, V v11) {
        s.A(codedOutputStream, aVar.f8128a, 1, k11);
        s.A(codedOutputStream, aVar.f8130c, 2, v11);
    }

    public int a(int i11, K k11, V v11) {
        return CodedOutputStream.U(i11) + CodedOutputStream.C(b(this.f8125a, k11, v11));
    }

    a<K, V> c() {
        return this.f8125a;
    }
}
