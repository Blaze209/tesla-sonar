package com.fourthline.orca.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.xg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4032xg implements ro0.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f36720b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f36721c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final to0.f f36722a = to0.m.e("GenericMap", new to0.f[0], null, 4, null);

    /* JADX INFO: renamed from: com.fourthline.orca.internal.xg$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Override // ro0.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map deserialize(uo0.e decoder) {
        p013kotlin.jvm.internal.s.k(decoder, "decoder");
        wo0.h hVar = decoder instanceof wo0.h ? (wo0.h) decoder : null;
        if (hVar == null) {
            throw new SerializationException("Can only deserialize Json content to generic Map");
        }
        JsonElement jsonElementY = hVar.y();
        if (jsonElementY instanceof JsonObject) {
            return a((JsonObject) jsonElementY);
        }
        throw new SerializationException("Cannot deserialize Json content to generic Map");
    }

    @Override // ro0.d, ro0.q, ro0.c
    public to0.f getDescriptor() {
        return this.f36722a;
    }

    private final JsonElement a(Object obj) {
        if (obj == null) {
            return JsonNull.INSTANCE;
        }
        if (obj instanceof String) {
            return wo0.j.c((String) obj);
        }
        if (obj instanceof Number) {
            return wo0.j.b((Number) obj);
        }
        if (obj instanceof Boolean) {
            return wo0.j.a((Boolean) obj);
        }
        if (obj instanceof Map) {
            return a((Map) obj);
        }
        if (obj instanceof Iterable) {
            return a((Iterable) obj);
        }
        return obj instanceof JsonElement ? (JsonElement) obj : wo0.j.c(obj.toString());
    }

    private final JsonObject a(Map map) {
        Set<Map.Entry> setEntrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(bo0.n.f(p013kotlin.collections.v0.e(p013kotlin.collections.v.y(setEntrySet, 10)), 16));
        for (Map.Entry entry : setEntrySet) {
            Pair pairA = jn0.x.a(String.valueOf(entry.getKey()), a(entry.getValue()));
            linkedHashMap.put(pairA.e(), pairA.f());
        }
        return new JsonObject(linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object a(JsonElement jsonElement) {
        if (jsonElement instanceof JsonPrimitive) {
            return a((JsonPrimitive) jsonElement);
        }
        if (jsonElement instanceof JsonObject) {
            return a((JsonObject) jsonElement);
        }
        if (jsonElement instanceof JsonArray) {
            return p013kotlin.collections.v.m1((Iterable) jsonElement);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final Map a(JsonObject jsonObject) {
        Pair pairA;
        Set<Map.Entry<String, JsonElement>> setEntrySet = jsonObject.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(bo0.n.f(p013kotlin.collections.v0.e(p013kotlin.collections.v.y(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            JsonElement jsonElement = (JsonElement) entry.getValue();
            if (jsonElement instanceof JsonPrimitive) {
                pairA = jn0.x.a(entry.getKey(), a((JsonPrimitive) jsonElement));
            } else if (jsonElement instanceof JsonObject) {
                pairA = jn0.x.a(entry.getKey(), a((JsonObject) jsonElement));
            } else {
                if (!(jsonElement instanceof JsonArray)) {
                    throw new NoWhenBranchMatchedException();
                }
                pairA = jn0.x.a(entry.getKey(), a((JsonArray) jsonElement));
            }
            linkedHashMap.put(pairA.e(), pairA.f());
        }
        return linkedHashMap;
    }

    private final Object a(JsonPrimitive jsonPrimitive) {
        if (jsonPrimitive instanceof JsonNull) {
            return null;
        }
        return jsonPrimitive.getIsString() ? jsonPrimitive.getContent() : p013kotlin.collections.v.q0(p013kotlin.collections.v.r(wo0.j.g(jsonPrimitive), wo0.j.s(jsonPrimitive), wo0.j.j(jsonPrimitive)));
    }

    @Override // ro0.q
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void serialize(uo0.f encoder, Map value) {
        p013kotlin.jvm.internal.s.k(encoder, "encoder");
        p013kotlin.jvm.internal.s.k(value, "value");
        LinkedHashMap linkedHashMap = new LinkedHashMap(p013kotlin.collections.v0.e(value.size()));
        for (Map.Entry entry : value.entrySet()) {
            linkedHashMap.put(entry.getKey(), a(entry.getValue()));
        }
        JsonObject jsonObject = new JsonObject(linkedHashMap);
        encoder.getSerializersModule();
        JsonObject.INSTANCE.serializer().serialize(encoder, jsonObject);
    }

    private final JsonArray a(Iterable iterable) {
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(a(it.next()));
        }
        return new JsonArray(arrayList);
    }

    private final List a(JsonArray jsonArray) {
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(jsonArray, 10));
        Iterator<JsonElement> it = jsonArray.iterator();
        while (it.hasNext()) {
            arrayList.add(a(it.next()));
        }
        return arrayList;
    }
}
