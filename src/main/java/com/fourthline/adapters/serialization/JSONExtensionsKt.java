package com.fourthline.adapters.serialization;

import ch.qos.logback.core.joran.action.Action;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\r\u001a7\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\"\u0004\b\u0000\u0010\u000e*\u00020\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\u0010H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a/\u0010\u001a\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0015*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00012\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001c"}, d2 = {"Lorg/json/JSONObject;", "", "name", "getAndroidOptString", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;", "", "getOptInt", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;", "", "getOptDouble", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Double;", "", "getOptBoolean", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Boolean;", "R", "Lorg/json/JSONArray;", "Lkotlin/Function1;", "transform", "", "map", "(Lorg/json/JSONArray;Lwn0/l;)Ljava/util/List;", "T", Action.KEY_ATTRIBUTE, "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "acceptNullString", "(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Object;", "fourthline-adapters-json_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class JSONExtensionsKt {
    private static final <T> T acceptNullString(JSONObject jSONObject, String str, Exception exc) throws Exception {
        if (jSONObject.isNull(str)) {
            return null;
        }
        throw exc;
    }

    public static final String getAndroidOptString(JSONObject jSONObject, String name) {
        s.k(jSONObject, "<this>");
        s.k(name, "name");
        if (!jSONObject.has(name)) {
            return null;
        }
        try {
            if (jSONObject.isNull(name)) {
                return null;
            }
            return jSONObject.getString(name);
        } catch (Exception e11) {
            return (String) acceptNullString(jSONObject, name, e11);
        }
    }

    public static final Boolean getOptBoolean(JSONObject jSONObject, String name) {
        s.k(jSONObject, "<this>");
        s.k(name, "name");
        if (!jSONObject.has(name)) {
            return null;
        }
        try {
            return Boolean.valueOf(jSONObject.getBoolean(name));
        } catch (Exception e11) {
            return (Boolean) acceptNullString(jSONObject, name, e11);
        }
    }

    public static final Double getOptDouble(JSONObject jSONObject, String name) {
        s.k(jSONObject, "<this>");
        s.k(name, "name");
        if (!jSONObject.has(name)) {
            return null;
        }
        try {
            return Double.valueOf(jSONObject.getDouble(name));
        } catch (Exception e11) {
            return (Double) acceptNullString(jSONObject, name, e11);
        }
    }

    public static final Integer getOptInt(JSONObject jSONObject, String name) {
        s.k(jSONObject, "<this>");
        s.k(name, "name");
        if (!jSONObject.has(name)) {
            return null;
        }
        try {
            return Integer.valueOf(jSONObject.getInt(name));
        } catch (Exception e11) {
            return (Integer) acceptNullString(jSONObject, name, e11);
        }
    }

    public static final <R> List<R> map(JSONArray jSONArray, l<? super JSONObject, ? extends R> transform) throws JSONException {
        s.k(jSONArray, "<this>");
        s.k(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i11);
            s.j(jSONObject, "getJSONObject(...)");
            arrayList.add(transform.invoke(jSONObject));
        }
        return arrayList;
    }
}
