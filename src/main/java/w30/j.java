package w30;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0005\u001a\u00020\u0001*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "Lkotlinx/serialization/json/JsonElement;", "b", "(Ljava/util/List;)Lkotlinx/serialization/json/JsonElement;", "", "c", "(Ljava/util/Map;)Lkotlinx/serialization/json/JsonElement;", "stripe-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class j {
    private static final JsonElement b(List<?> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : p013kotlin.collections.v.l0(list)) {
            if (obj instanceof Map) {
                arrayList.add(c((Map) obj));
            } else if (obj instanceof List) {
                arrayList.add(b((List) obj));
            } else {
                arrayList.add(wo0.j.c(obj.toString()));
            }
        }
        return new JsonArray(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonElement c(Map<?, ?> map) {
        Object value;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            String str = key instanceof String ? (String) key : null;
            if (str != null && (value = entry.getValue()) != null) {
                if (value instanceof Map) {
                    linkedHashMap.put(str, c((Map) value));
                } else if (value instanceof List) {
                    linkedHashMap.put(str, b((List) value));
                } else {
                    linkedHashMap.put(str, wo0.j.c(value.toString()));
                }
            }
        }
        return new JsonObject(linkedHashMap);
    }
}
