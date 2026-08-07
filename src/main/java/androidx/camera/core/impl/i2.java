package androidx.camera.core.impl;

import android.util.ArrayMap;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class i2 implements x0 {
    protected static final Comparator<x0.a<?>> L;
    private static final i2 M;
    protected final TreeMap<x0.a<?>, Map<x0.c, Object>> K;

    static {
        Comparator<x0.a<?>> comparator = new Comparator() { // from class: androidx.camera.core.impl.h2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((x0.a) obj).c().compareTo(((x0.a) obj2).c());
            }
        };
        L = comparator;
        M = new i2(new TreeMap(comparator));
    }

    i2(TreeMap<x0.a<?>, Map<x0.c, Object>> treeMap) {
        this.K = treeMap;
    }

    @NonNull
    public static i2 a0() {
        return M;
    }

    @NonNull
    public static i2 b0(@NonNull x0 x0Var) {
        if (i2.class.equals(x0Var.getClass())) {
            return (i2) x0Var;
        }
        TreeMap treeMap = new TreeMap(L);
        for (x0.a<?> aVar : x0Var.g()) {
            Set<x0.c> setC = x0Var.c(aVar);
            ArrayMap arrayMap = new ArrayMap();
            for (x0.c cVar : setC) {
                arrayMap.put(cVar, x0Var.f(aVar, cVar));
            }
            treeMap.put(aVar, arrayMap);
        }
        return new i2(treeMap);
    }

    @Override // androidx.camera.core.impl.x0
    public <ValueT> ValueT a(@NonNull x0.a<ValueT> aVar) {
        Map<x0.c, Object> map = this.K.get(aVar);
        if (map != null) {
            return (ValueT) map.get((x0.c) Collections.min(map.keySet()));
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }

    @Override // androidx.camera.core.impl.x0
    public void b(@NonNull String str, @NonNull x0.b bVar) {
        for (Map.Entry<x0.a<?>, Map<x0.c, Object>> entry : this.K.tailMap(x0.a.a(str, Void.class)).entrySet()) {
            if (!entry.getKey().c().startsWith(str) || !bVar.a(entry.getKey())) {
                return;
            }
        }
    }

    @Override // androidx.camera.core.impl.x0
    @NonNull
    public Set<x0.c> c(@NonNull x0.a<?> aVar) {
        Map<x0.c, Object> map = this.K.get(aVar);
        return map == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(map.keySet());
    }

    @Override // androidx.camera.core.impl.x0
    public <ValueT> ValueT d(@NonNull x0.a<ValueT> aVar, ValueT valuet) {
        try {
            return (ValueT) a(aVar);
        } catch (IllegalArgumentException unused) {
            return valuet;
        }
    }

    @Override // androidx.camera.core.impl.x0
    public boolean e(@NonNull x0.a<?> aVar) {
        return this.K.containsKey(aVar);
    }

    @Override // androidx.camera.core.impl.x0
    public <ValueT> ValueT f(@NonNull x0.a<ValueT> aVar, @NonNull x0.c cVar) {
        Map<x0.c, Object> map = this.K.get(aVar);
        if (map == null) {
            throw new IllegalArgumentException("Option does not exist: " + aVar);
        }
        if (map.containsKey(cVar)) {
            return (ValueT) map.get(cVar);
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar + " with priority=" + cVar);
    }

    @Override // androidx.camera.core.impl.x0
    @NonNull
    public Set<x0.a<?>> g() {
        return Collections.unmodifiableSet(this.K.keySet());
    }

    @Override // androidx.camera.core.impl.x0
    @NonNull
    public x0.c h(@NonNull x0.a<?> aVar) {
        Map<x0.c, Object> map = this.K.get(aVar);
        if (map != null) {
            return (x0.c) Collections.min(map.keySet());
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }
}
