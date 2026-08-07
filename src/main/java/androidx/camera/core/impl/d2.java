package androidx.camera.core.impl;

import android.util.ArrayMap;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class d2 extends i2 implements c2 {

    @NonNull
    private static final x0.c N = x0.c.OPTIONAL;

    private d2(TreeMap<x0.a<?>, Map<x0.c, Object>> treeMap) {
        super(treeMap);
    }

    @NonNull
    public static d2 c0() {
        return new d2(new TreeMap(i2.L));
    }

    @NonNull
    public static d2 d0(@NonNull x0 x0Var) {
        TreeMap treeMap = new TreeMap(i2.L);
        for (x0.a<?> aVar : x0Var.g()) {
            Set<x0.c> setC = x0Var.c(aVar);
            ArrayMap arrayMap = new ArrayMap();
            for (x0.c cVar : setC) {
                arrayMap.put(cVar, x0Var.f(aVar, cVar));
            }
            treeMap.put(aVar, arrayMap);
        }
        return new d2(treeMap);
    }

    @Override // androidx.camera.core.impl.c2
    public <ValueT> void K(@NonNull x0.a<ValueT> aVar, ValueT valuet) {
        m(aVar, N, valuet);
    }

    public <ValueT> ValueT e0(@NonNull x0.a<ValueT> aVar) {
        return (ValueT) this.K.remove(aVar);
    }

    @Override // androidx.camera.core.impl.c2
    public <ValueT> void m(@NonNull x0.a<ValueT> aVar, @NonNull x0.c cVar, ValueT valuet) {
        Map<x0.c, Object> map = this.K.get(aVar);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            this.K.put(aVar, arrayMap);
            arrayMap.put(cVar, valuet);
            return;
        }
        x0.c cVar2 = (x0.c) Collections.min(map.keySet());
        if (Objects.equals(map.get(cVar2), valuet) || !x0.Q(cVar2, cVar)) {
            map.put(cVar, valuet);
            return;
        }
        throw new IllegalArgumentException("Option values conflicts: " + aVar.c() + ", existing value (" + cVar2 + ")=" + map.get(cVar2) + ", conflicting (" + cVar + ")=" + valuet);
    }
}
