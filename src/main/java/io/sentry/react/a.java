package io.sentry.react;

import com.facebook.react.bridge.ReadableMap;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import io.sentry.b7;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class a {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:33:0x0099  */
    public static io.sentry.e a(ReadableMap readableMap) {
        io.sentry.e eVar = new io.sentry.e();
        if (readableMap.hasKey("message")) {
            eVar.x(readableMap.getString("message"));
        }
        if (readableMap.hasKey("type")) {
            eVar.z(readableMap.getString("type"));
        }
        if (readableMap.hasKey("category")) {
            eVar.u(readableMap.getString("category"));
        }
        if (readableMap.hasKey("origin")) {
            eVar.y(readableMap.getString("origin"));
        } else {
            eVar.y("react-native");
        }
        if (readableMap.hasKey("level")) {
            String string = readableMap.getString("level");
            switch (string.hashCode()) {
                case 3237038:
                    string.equals("info");
                    eVar.w(b7.INFO);
                    break;
                case 95458899:
                    if (string.equals("debug")) {
                        eVar.w(b7.DEBUG);
                    } else {
                        eVar.w(b7.INFO);
                    }
                    break;
                case 96784904:
                    if (string.equals(AnalyticsAttribute.Error)) {
                        eVar.w(b7.ERROR);
                    } else {
                        eVar.w(b7.INFO);
                    }
                    break;
                case 97203460:
                    if (string.equals("fatal")) {
                        eVar.w(b7.FATAL);
                    } else {
                        eVar.w(b7.INFO);
                    }
                    break;
                case 1124446108:
                    if (string.equals("warning")) {
                        eVar.w(b7.WARNING);
                    } else {
                        eVar.w(b7.INFO);
                    }
                    break;
                default:
                    eVar.w(b7.INFO);
                    break;
            }
        }
        if (readableMap.hasKey("data")) {
            for (Map.Entry<String, Object> entry : readableMap.getMap("data").toHashMap().entrySet()) {
                if (entry.getValue() != null) {
                    eVar.v(entry.getKey(), entry.getValue());
                }
            }
        }
        return eVar;
    }

    public static String b(ReadableMap readableMap) {
        String string = readableMap.hasKey("category") ? readableMap.getString("category") : null;
        if (string != null && "navigation".equals(string)) {
            ReadableMap map = readableMap.hasKey("data") ? readableMap.getMap("data") : null;
            if (map == null) {
                return null;
            }
            try {
                if (map.hasKey("to")) {
                    return map.getString("to");
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
