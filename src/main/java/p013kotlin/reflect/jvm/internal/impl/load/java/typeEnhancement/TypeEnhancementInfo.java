package p013kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
public final class TypeEnhancementInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Integer, JavaTypeQualifiers> f87454a;

    public TypeEnhancementInfo(Map<Integer, JavaTypeQualifiers> map) {
        s.k(map, "map");
        this.f87454a = map;
    }

    public final TypeEnhancementInfo copyForWarnings() {
        Map<Integer, JavaTypeQualifiers> map = this.f87454a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(v0.e(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), JavaTypeQualifiers.copy$default((JavaTypeQualifiers) entry.getValue(), null, null, false, true, 7, null));
        }
        return new TypeEnhancementInfo(linkedHashMap);
    }

    public final Map<Integer, JavaTypeQualifiers> getMap() {
        return this.f87454a;
    }
}
