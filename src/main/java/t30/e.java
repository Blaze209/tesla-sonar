package t30;

import bo0.j;
import bo0.n;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.Address;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jn0.x;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.collections.s0;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u000e\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ#\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\tJ\u001f\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u0019\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0019\u0010\tJ/\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u001a2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b \u0010!J#\u0010#\u001a\u0004\u0018\u00010\u00042\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u0003\u0018\u00010\u001a¢\u0006\u0004\b#\u0010$J\u0019\u0010&\u001a\u0004\u0018\u00010\u00062\b\u0010%\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b&\u0010'¨\u0006("}, d2 = {"Lt30/e;", "", "<init>", "()V", "Lorg/json/JSONObject;", "jsonObject", "", "fieldName", "l", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;", "h", "", "values", "Lorg/json/JSONArray;", "c", "(Ljava/util/List;)Lorg/json/JSONArray;", "", "f", "(Lorg/json/JSONObject;Ljava/lang/String;)Z", "", IntegerTokenConverter.CONVERTER_KEY, "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;", "", "j", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Long;", "g", "", "k", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/Map;", "b", "(Lorg/json/JSONObject;)Ljava/util/Map;", "jsonArray", "a", "(Lorg/json/JSONArray;)Ljava/util/List;", "mapObject", DateTokenConverter.CONVERTER_KEY, "(Ljava/util/Map;)Lorg/json/JSONObject;", "possibleNull", "e", "(Ljava/lang/String;)Ljava/lang/String;", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f112281a = new e();

    private e() {
    }

    private final JSONArray c(List<?> values) {
        if (values == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (Object objValueOf : values) {
            if (objValueOf instanceof Map) {
                objValueOf = f112281a.d((Map) objValueOf);
            } else if (objValueOf instanceof List) {
                objValueOf = f112281a.c((List) objValueOf);
            } else if (!(objValueOf instanceof Number) && !(objValueOf instanceof Boolean)) {
                objValueOf = String.valueOf(objValueOf);
            }
            jSONArray.put(objValueOf);
        }
        return jSONArray;
    }

    public static final String h(JSONObject jsonObject, String fieldName) {
        s.k(jsonObject, "jsonObject");
        s.k(fieldName, "fieldName");
        String strE = f112281a.e(jsonObject.optString(fieldName));
        if (strE == null || strE.length() != 3) {
            return null;
        }
        return strE;
    }

    public static final String l(JSONObject jsonObject, String fieldName) {
        s.k(fieldName, "fieldName");
        return f112281a.e(jsonObject != null ? jsonObject.optString(fieldName) : null);
    }

    public final /* synthetic */ List a(JSONArray jsonArray) {
        if (jsonArray == null) {
            return null;
        }
        j jVarW = n.w(0, jsonArray.length());
        ArrayList arrayList = new ArrayList(v.y(jVarW, 10));
        Iterator<Integer> it = jVarW.iterator();
        while (it.hasNext()) {
            arrayList.add(jsonArray.get(((s0) it).nextInt()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object objB : arrayList) {
            if (objB instanceof JSONArray) {
                objB = f112281a.a((JSONArray) objB);
            } else if (objB instanceof JSONObject) {
                objB = f112281a.b((JSONObject) objB);
            } else if (s.f(objB, Address.ADDRESS_NULL_PLACEHOLDER)) {
                objB = null;
            }
            if (objB != null) {
                arrayList2.add(objB);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0084  */
    public final /* synthetic */ Map b(JSONObject jsonObject) {
        Map mapF;
        if (jsonObject == null) {
            return null;
        }
        JSONArray jSONArrayNames = jsonObject.names();
        if (jSONArrayNames == null) {
            jSONArrayNames = new JSONArray();
        }
        j jVarW = n.w(0, jSONArrayNames.length());
        ArrayList<String> arrayList = new ArrayList(v.y(jVarW, 10));
        Iterator<Integer> it = jVarW.iterator();
        while (it.hasNext()) {
            arrayList.add(jSONArrayNames.getString(((s0) it).nextInt()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str : arrayList) {
            Object objOpt = jsonObject.opt(str);
            if (objOpt != null) {
                s.h(objOpt);
                if (s.f(objOpt, Address.ADDRESS_NULL_PLACEHOLDER)) {
                    mapF = null;
                } else {
                    if (objOpt instanceof JSONObject) {
                        objOpt = f112281a.b((JSONObject) objOpt);
                    } else if (objOpt instanceof JSONArray) {
                        objOpt = f112281a.a((JSONArray) objOpt);
                    }
                    mapF = v0.f(x.a(str, objOpt));
                }
            } else {
                mapF = null;
            }
            if (mapF != null) {
                arrayList2.add(mapF);
            }
        }
        Map mapI = v0.i();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            mapI = v0.r(mapI, (Map) it2.next());
        }
        return mapI;
    }

    public final JSONObject d(Map<String, ?> mapObject) {
        if (mapObject == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (String str : mapObject.keySet()) {
            Object obj = mapObject.get(str);
            if (obj != null) {
                try {
                    if (obj instanceof Map) {
                        jSONObject.put(str, d((Map) obj));
                    } else if (obj instanceof List) {
                        jSONObject.put(str, c((List) obj));
                    } else if ((obj instanceof Number) || (obj instanceof Boolean)) {
                        jSONObject.put(str, obj);
                    } else {
                        jSONObject.put(str, obj.toString());
                    }
                } catch (ClassCastException | JSONException unused) {
                }
            }
        }
        return jSONObject;
    }

    public final /* synthetic */ String e(String possibleNull) {
        if (possibleNull == null || s.f(Address.ADDRESS_NULL_PLACEHOLDER, possibleNull) || possibleNull.length() == 0) {
            return null;
        }
        return possibleNull;
    }

    public final /* synthetic */ boolean f(JSONObject jsonObject, String fieldName) {
        s.k(jsonObject, "jsonObject");
        s.k(fieldName, "fieldName");
        return jsonObject.has(fieldName) && jsonObject.optBoolean(fieldName, false);
    }

    public final /* synthetic */ String g(JSONObject jsonObject, String fieldName) {
        s.k(jsonObject, "jsonObject");
        s.k(fieldName, "fieldName");
        String strE = e(jsonObject.optString(fieldName));
        if (strE == null || strE.length() != 2) {
            return null;
        }
        return strE;
    }

    public final /* synthetic */ Integer i(JSONObject jsonObject, String fieldName) {
        s.k(jsonObject, "jsonObject");
        s.k(fieldName, "fieldName");
        if (jsonObject.has(fieldName)) {
            return Integer.valueOf(jsonObject.optInt(fieldName));
        }
        return null;
    }

    public final /* synthetic */ Long j(JSONObject jsonObject, String fieldName) {
        s.k(jsonObject, "jsonObject");
        s.k(fieldName, "fieldName");
        if (jsonObject.has(fieldName)) {
            return Long.valueOf(jsonObject.optLong(fieldName));
        }
        return null;
    }

    public final /* synthetic */ Map k(JSONObject jsonObject, String fieldName) {
        s.k(jsonObject, "jsonObject");
        s.k(fieldName, "fieldName");
        JSONObject jSONObjectOptJSONObject = jsonObject.optJSONObject(fieldName);
        if (jSONObjectOptJSONObject != null) {
            return f112281a.b(jSONObjectOptJSONObject);
        }
        return null;
    }
}
