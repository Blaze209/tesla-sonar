package nm;

/* JADX INFO: loaded from: classes3.dex */
public class u<K, V> implements x<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x<K, V> f95186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z f95187b;

    public u(x<K, V> xVar, z zVar) {
        this.f95186a = xVar;
        this.f95187b = zVar;
    }

    @Override // nm.x
    public void b(K k11) {
        this.f95186a.b(k11);
    }

    @Override // nm.x
    public tk.a<V> c(K k11, tk.a<V> aVar) {
        this.f95187b.c(k11);
        return this.f95186a.c(k11, aVar);
    }

    @Override // nm.x
    public int e(pk.l<K> lVar) {
        return this.f95186a.e(lVar);
    }

    @Override // nm.x
    public boolean f(pk.l<K> lVar) {
        return this.f95186a.f(lVar);
    }

    @Override // nm.x
    public tk.a<V> get(K k11) {
        tk.a<V> aVar = this.f95186a.get(k11);
        if (aVar == null) {
            this.f95187b.b(k11);
            return aVar;
        }
        this.f95187b.a(k11);
        return aVar;
    }
}
