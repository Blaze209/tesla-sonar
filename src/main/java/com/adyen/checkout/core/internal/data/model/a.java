package com.adyen.checkout.core.internal.data.model;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0005\u001a\u001d\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001d\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u001d\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000e\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a#\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a#\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0010*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0013\u0010\u0012\u001a)\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0014*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001f\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0014*\u00020\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lorg/json/JSONObject;", "", Action.KEY_ATTRIBUTE, "e", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;", "", "a", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Boolean;", "", "b", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;", "", "c", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Long;", IntegerTokenConverter.CONVERTER_KEY, "(Lorg/json/JSONObject;)Ljava/lang/String;", "", "g", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;", "f", "", DateTokenConverter.CONVERTER_KEY, "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/Map;", "h", "(Lorg/json/JSONObject;)Ljava/util/Map;", "checkout-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class a {
    public static final Boolean a(JSONObject jSONObject, String key) {
        s.k(jSONObject, "<this>");
        s.k(key, "key");
        if (jSONObject.isNull(key)) {
            return null;
        }
        return Boolean.valueOf(jSONObject.getBoolean(key));
    }

    public static final Integer b(JSONObject jSONObject, String key) {
        s.k(jSONObject, "<this>");
        s.k(key, "key");
        if (jSONObject.isNull(key)) {
            return null;
        }
        return Integer.valueOf(jSONObject.getInt(key));
    }

    public static final Long c(JSONObject jSONObject, String key) {
        s.k(jSONObject, "<this>");
        s.k(key, "key");
        if (jSONObject.isNull(key)) {
            return null;
        }
        return Long.valueOf(jSONObject.getLong(key));
    }

    public static final Map<String, String> d(JSONObject jSONObject, String key) throws JSONException {
        s.k(jSONObject, "<this>");
        s.k(key, "key");
        if (jSONObject.isNull(key)) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(key);
        s.j(jSONObject2, "getJSONObject(...)");
        return h(jSONObject2);
    }

    public static final String e(JSONObject jSONObject, String key) {
        s.k(jSONObject, "<this>");
        s.k(key, "key");
        if (jSONObject.isNull(key)) {
            return null;
        }
        return jSONObject.getString(key);
    }

    public static final List<Integer> f(JSONObject jSONObject, String key) {
        s.k(jSONObject, "<this>");
        s.k(key, "key");
        return oe.a.a(jSONObject.optJSONArray(key));
    }

    public static final List<String> g(JSONObject jSONObject, String key) {
        s.k(jSONObject, "<this>");
        s.k(key, "key");
        return oe.a.b(jSONObject.optJSONArray(key));
    }

    private static final Map<String, String> h(JSONObject jSONObject) throws JSONException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof String) {
                s.h(next);
                linkedHashMap.put(next, obj);
            }
        }
        return linkedHashMap;
    }

    public static final String i(JSONObject jSONObject) {
        s.k(jSONObject, "<this>");
        try {
            String string = jSONObject.toString(4);
            s.h(string);
            return string;
        } catch (JSONException unused) {
            return "PARSING_ERROR";
        }
    }
}
