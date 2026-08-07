package ie0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0002\b\u0003\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lie0/v;", "", "<init>", "()V", "", "values", "Lorg/json/JSONArray;", "c", "(Ljava/util/List;)Lorg/json/JSONArray;", "Lorg/json/JSONObject;", "jsonObject", "Lcom/facebook/react/bridge/WritableMap;", "b", "(Lorg/json/JSONObject;)Lcom/facebook/react/bridge/WritableMap;", "", "", DateTokenConverter.CONVERTER_KEY, "(Ljava/util/Map;)Lorg/json/JSONObject;", "jsonArray", "Lcom/facebook/react/bridge/WritableArray;", "a", "(Lorg/json/JSONArray;)Lcom/facebook/react/bridge/WritableArray;", "utils_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f77621a = new v();

    private v() {
    }

    public static final WritableMap b(JSONObject jsonObject) throws JSONException {
        p013kotlin.jvm.internal.s.k(jsonObject, "jsonObject");
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        Iterator<String> itKeys = jsonObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jsonObject.get(next);
            if (obj instanceof JSONObject) {
                p013kotlin.jvm.internal.s.h(next);
                writableNativeMap.putMap(next, b((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                p013kotlin.jvm.internal.s.h(next);
                writableNativeMap.putArray(next, f77621a.a((JSONArray) obj));
            } else if (obj instanceof Boolean) {
                p013kotlin.jvm.internal.s.h(next);
                writableNativeMap.putBoolean(next, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                p013kotlin.jvm.internal.s.h(next);
                writableNativeMap.putInt(next, ((Number) obj).intValue());
            } else if (obj instanceof Double) {
                p013kotlin.jvm.internal.s.h(next);
                writableNativeMap.putDouble(next, ((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                p013kotlin.jvm.internal.s.h(next);
                writableNativeMap.putString(next, (String) obj);
            } else {
                p013kotlin.jvm.internal.s.h(next);
                writableNativeMap.putString(next, obj.toString());
            }
        }
        return writableNativeMap;
    }

    private final JSONArray c(List<?> values) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : values) {
            if (obj instanceof Integer) {
                jSONArray.put(((Number) obj).intValue());
            } else if (obj instanceof Boolean) {
                jSONArray.put(((Boolean) obj).booleanValue());
            } else if (obj instanceof Long) {
                jSONArray.put(((Number) obj).longValue());
            } else if (obj instanceof Double) {
                jSONArray.put(((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                jSONArray.put(obj);
            } else if (obj instanceof List) {
                jSONArray.put(f77621a.c((List) obj));
            } else if (obj instanceof Map) {
                v vVar = f77621a;
                p013kotlin.jvm.internal.s.i(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, *>");
                jSONArray.put(vVar.d((Map) obj));
            } else {
                jSONArray.put(obj);
            }
        }
        return jSONArray;
    }

    public final WritableArray a(JSONArray jsonArray) throws JSONException {
        p013kotlin.jvm.internal.s.k(jsonArray, "jsonArray");
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        int length = jsonArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            Object obj = jsonArray.get(i11);
            p013kotlin.jvm.internal.s.j(obj, "get(...)");
            if (obj instanceof JSONObject) {
                writableNativeArray.pushMap(b((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                writableNativeArray.pushArray(a((JSONArray) obj));
            } else if (obj instanceof Boolean) {
                writableNativeArray.pushBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                writableNativeArray.pushInt(((Number) obj).intValue());
            } else if (obj instanceof Double) {
                writableNativeArray.pushDouble(((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                writableNativeArray.pushString((String) obj);
            } else {
                writableNativeArray.pushString(obj.toString());
            }
        }
        return writableNativeArray;
    }

    public final JSONObject d(Map<String, ?> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            for (Map.Entry<String, ?> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof List) {
                    jSONObject.put(key, f77621a.c((List) value));
                } else if (value instanceof Map) {
                    v vVar = f77621a;
                    p013kotlin.jvm.internal.s.i(value, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, *>");
                    jSONObject.put(key, vVar.d((Map) value));
                } else {
                    jSONObject.put(key, value);
                }
            }
        }
        return jSONObject;
    }
}
