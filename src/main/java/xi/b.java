package xi;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u000e\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0016\u001a\u00020\u00152\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u0019\u001a\u00020\u00182\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010 \u001a\u00020\u00152\b\u0010\u001e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001f\u001a\u00020\u0015H\u0007¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"Lxi/b;", "", "<init>", "()V", "Lcom/facebook/react/bridge/ReadableMap;", "map", "", Action.KEY_ATTRIBUTE, "fallback", "h", "(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "g", "(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Ljava/lang/String;", "", "b", "(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;Z)Z", "f", "(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;", "Lcom/facebook/react/bridge/ReadableArray;", "a", "(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;", "", "e", "(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;I)I", "", "c", "(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;D)D", "", DateTokenConverter.CONVERTER_KEY, "(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;F)F", "value", "default", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;I)I", "react-native-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f123584a = new b();

    private b() {
    }

    public static final ReadableArray a(ReadableMap map, String key) {
        if (map == null) {
            return null;
        }
        s.h(key);
        if (!map.hasKey(key) || map.isNull(key)) {
            return null;
        }
        return map.getArray(key);
    }

    public static final boolean b(ReadableMap map, String key, boolean fallback) {
        if (map != null) {
            s.h(key);
            if (map.hasKey(key) && !map.isNull(key)) {
                return map.getBoolean(key);
            }
        }
        return fallback;
    }

    public static final double c(ReadableMap map, String key, double fallback) {
        if (map != null) {
            s.h(key);
            if (map.hasKey(key) && !map.isNull(key)) {
                return map.getDouble(key);
            }
        }
        return fallback;
    }

    public static final float d(ReadableMap map, String key, float fallback) {
        if (map != null) {
            s.h(key);
            if (map.hasKey(key) && !map.isNull(key)) {
                return (float) map.getDouble(key);
            }
        }
        return fallback;
    }

    public static final int e(ReadableMap map, String key, int fallback) {
        if (map != null) {
            s.h(key);
            if (map.hasKey(key) && !map.isNull(key)) {
                return map.getInt(key);
            }
        }
        return fallback;
    }

    public static final ReadableMap f(ReadableMap map, String key) {
        if (map == null) {
            return null;
        }
        s.h(key);
        if (!map.hasKey(key) || map.isNull(key)) {
            return null;
        }
        return map.getMap(key);
    }

    public static final String g(ReadableMap map, String key) {
        return h(map, key, null);
    }

    public static final String h(ReadableMap map, String key, String fallback) {
        if (map != null) {
            s.h(key);
            if (map.hasKey(key) && !map.isNull(key)) {
                return map.getString(key);
            }
        }
        return fallback;
    }

    public static final int i(String value, int i11) {
        if (value == null) {
            return i11;
        }
        try {
            return Integer.parseInt(value);
        } catch (Exception unused) {
            return i11;
        }
    }
}
