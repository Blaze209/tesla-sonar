package ie0;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.tesla.logging.TeslaLog;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class u {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f77620a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            f77620a = iArr;
            try {
                iArr[ReadableType.Null.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f77620a[ReadableType.Boolean.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f77620a[ReadableType.Number.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f77620a[ReadableType.String.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f77620a[ReadableType.Map.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f77620a[ReadableType.Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static JSONArray a(ReadableArray readableArray) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        if (readableArray == null) {
            return null;
        }
        for (int i11 = 0; i11 < readableArray.size(); i11++) {
            switch (a.f77620a[readableArray.getType(i11).ordinal()]) {
                case 1:
                    jSONArray.put((Object) null);
                    break;
                case 2:
                    jSONArray.put(readableArray.getBoolean(i11));
                    break;
                case 3:
                    int i12 = readableArray.getInt(i11);
                    double d11 = readableArray.getDouble(i11);
                    if (((double) i12) * 1.0d == d11) {
                        jSONArray.put(i12);
                    } else {
                        jSONArray.put(d11);
                    }
                    break;
                case 4:
                    jSONArray.put(readableArray.getString(i11));
                    break;
                case 5:
                    jSONArray.put(b(readableArray.getMap(i11)));
                    break;
                case 6:
                    jSONArray.put(a(readableArray.getArray(i11)));
                    break;
                default:
                    c("Failed to convert array to json array", new IllegalStateException("Failed to convert array to json array"));
                    break;
            }
        }
        return jSONArray;
    }

    public static JSONObject b(ReadableMap readableMap) {
        JSONObject jSONObject = new JSONObject();
        if (readableMap == null) {
            return null;
        }
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        if (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                try {
                    switch (a.f77620a[readableMap.getType(strNextKey).ordinal()]) {
                        case 1:
                            jSONObject.put(strNextKey, (Object) null);
                            break;
                        case 2:
                            jSONObject.put(strNextKey, readableMap.getBoolean(strNextKey));
                            break;
                        case 3:
                            int i11 = readableMap.getInt(strNextKey);
                            double d11 = readableMap.getDouble(strNextKey);
                            if (((double) i11) * 1.0d != d11) {
                                jSONObject.put(strNextKey, d11);
                            } else {
                                jSONObject.put(strNextKey, i11);
                            }
                            break;
                        case 4:
                            jSONObject.put(strNextKey, readableMap.getString(strNextKey));
                            break;
                        case 5:
                            jSONObject.put(strNextKey, b(readableMap.getMap(strNextKey)));
                            break;
                        case 6:
                            jSONObject.put(strNextKey, a(readableMap.getArray(strNextKey)));
                            break;
                        default:
                            c("Failed to convert map to json object", new IllegalStateException("Failed to convert map to json object"));
                            break;
                    }
                } catch (JSONException e11) {
                    c("Failed to convert map to json object", e11);
                }
            }
        }
        return jSONObject;
    }

    private static void c(String str, Exception exc) {
        TeslaLog.INSTANCE.d("JSONHelper", str);
    }
}
