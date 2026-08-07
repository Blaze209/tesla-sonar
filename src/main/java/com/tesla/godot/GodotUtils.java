package com.tesla.godot;

import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, d2 = {"Lcom/tesla/godot/GodotUtils;", "", "<init>", "()V", "convertJsonToMap", "Lcom/facebook/react/bridge/WritableMap;", "jsonObject", "Lorg/json/JSONObject;", "convertJsonToArray", "Lcom/facebook/react/bridge/WritableArray;", "jsonArray", "Lorg/json/JSONArray;", "godot_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GodotUtils {
    public static final GodotUtils INSTANCE = new GodotUtils();

    private GodotUtils() {
    }

    public static final WritableMap convertJsonToMap(JSONObject jsonObject) {
        s.k(jsonObject, "jsonObject");
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        Iterator<String> itKeys = jsonObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jsonObject.get(next);
            if (obj instanceof JSONObject) {
                s.h(next);
                writableNativeMap.putMap(next, convertJsonToMap((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                s.h(next);
                writableNativeMap.putArray(next, INSTANCE.convertJsonToArray((JSONArray) obj));
            } else if (obj instanceof Boolean) {
                s.h(next);
                writableNativeMap.putBoolean(next, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                s.h(next);
                writableNativeMap.putInt(next, ((Number) obj).intValue());
            } else if (obj instanceof Double) {
                s.h(next);
                writableNativeMap.putDouble(next, ((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                s.h(next);
                writableNativeMap.putString(next, (String) obj);
            } else {
                s.h(next);
                writableNativeMap.putString(next, obj.toString());
            }
        }
        return writableNativeMap;
    }

    public final WritableArray convertJsonToArray(JSONArray jsonArray) throws JSONException {
        s.k(jsonArray, "jsonArray");
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        int length = jsonArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            Object obj = jsonArray.get(i11);
            s.j(obj, "get(...)");
            if (obj instanceof JSONObject) {
                writableNativeArray.pushMap(convertJsonToMap((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                writableNativeArray.pushArray(convertJsonToArray((JSONArray) obj));
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
}
