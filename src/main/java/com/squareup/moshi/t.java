package com.squareup.moshi;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
final class t<K, V> extends h<Map<K, V>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h.e f49498c = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h<K> f49499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h<V> f49500b;

    class a implements h.e {
        a() {
        }

        @Override // com.squareup.moshi.h.e
        public h<?> create(Type type, Set<? extends Annotation> set, u uVar) {
            Class<?> clsG;
            if (!set.isEmpty() || (clsG = y.g(type)) != Map.class) {
                return null;
            }
            Type[] typeArrI = y.i(type, clsG);
            return new t(uVar, typeArrI[0], typeArrI[1]).nullSafe();
        }
    }

    t(u uVar, Type type, Type type2) {
        this.f49499a = uVar.d(type);
        this.f49500b = uVar.d(type2);
    }

    @Override // com.squareup.moshi.h
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map<K, V> fromJson(k kVar) {
        s sVar = new s();
        kVar.h();
        while (kVar.hasNext()) {
            kVar.H();
            K kFromJson = this.f49499a.fromJson(kVar);
            V vFromJson = this.f49500b.fromJson(kVar);
            V vPut = sVar.put(kFromJson, vFromJson);
            if (vPut != null) {
                throw new JsonDataException("Map key '" + kFromJson + "' has multiple values at path " + kVar.getPath() + ": " + vPut + " and " + vFromJson);
            }
        }
        kVar.j();
        return sVar;
    }

    @Override // com.squareup.moshi.h
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(r rVar, Map<K, V> map) {
        rVar.o();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (entry.getKey() == null) {
                throw new JsonDataException("Map key is null at " + rVar.getPath());
            }
            rVar.n0();
            this.f49499a.toJson(rVar, entry.getKey());
            this.f49500b.toJson(rVar, entry.getValue());
        }
        rVar.C();
    }

    public String toString() {
        return "JsonAdapter(" + this.f49499a + "=" + this.f49500b + ")";
    }
}
