package xj;

import androidx.collection.x0;

/* JADX INFO: loaded from: classes3.dex */
public final class b<K, V> extends androidx.collection.a<K, V> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f123593g;

    @Override // androidx.collection.x0, java.util.Map
    public void clear() {
        this.f123593g = 0;
        super.clear();
    }

    @Override // androidx.collection.x0, java.util.Map
    public int hashCode() {
        if (this.f123593g == 0) {
            this.f123593g = super.hashCode();
        }
        return this.f123593g;
    }

    @Override // androidx.collection.x0
    public void j(x0<? extends K, ? extends V> x0Var) {
        this.f123593g = 0;
        super.j(x0Var);
    }

    @Override // androidx.collection.x0
    public V k(int i11) {
        this.f123593g = 0;
        return (V) super.k(i11);
    }

    @Override // androidx.collection.x0
    public V l(int i11, V v11) {
        this.f123593g = 0;
        return (V) super.l(i11, v11);
    }

    @Override // androidx.collection.x0, java.util.Map
    public V put(K k11, V v11) {
        this.f123593g = 0;
        return (V) super.put(k11, v11);
    }
}
