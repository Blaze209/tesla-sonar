package q;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class a<K, V> extends b<K, V> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashMap<K, b.c<K, V>> f104110e = new HashMap<>();

    @Override // q.b
    protected b.c<K, V> b(K k11) {
        return this.f104110e.get(k11);
    }

    public boolean contains(K k11) {
        return this.f104110e.containsKey(k11);
    }

    @Override // q.b
    public V g(@NonNull K k11, @NonNull V v11) {
        b.c<K, V> cVarB = b(k11);
        if (cVarB != null) {
            return cVarB.f104116b;
        }
        this.f104110e.put(k11, f(k11, v11));
        return null;
    }

    @Override // q.b
    public V h(@NonNull K k11) {
        V v11 = (V) super.h(k11);
        this.f104110e.remove(k11);
        return v11;
    }

    public Map.Entry<K, V> i(K k11) {
        if (contains(k11)) {
            return this.f104110e.get(k11).f104118d;
        }
        return null;
    }
}
