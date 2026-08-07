package iz;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import jn0.g;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a=\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "throwable", "Lcom/facebook/react/bridge/ReadableMap;", "a", "(Ljava/lang/Throwable;)Lcom/facebook/react/bridge/ReadableMap;", "", "code", "message", "Lcom/facebook/react/bridge/WritableMap;", "userInfo", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Lcom/facebook/react/bridge/WritableMap;)Lcom/facebook/react/bridge/ReadableMap;", "react-native-vision-camera_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class a {
    private static final ReadableMap a(Throwable th2) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("message", th2.getMessage());
        writableMapCreateMap.putString("stacktrace", g.b(th2));
        if (th2.getCause() != null) {
            Throwable cause = th2.getCause();
            s.h(cause);
            writableMapCreateMap.putMap("cause", a(cause));
        }
        s.h(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public static final ReadableMap b(String str, String str2, Throwable th2, WritableMap writableMap) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("code", str);
        writableMapCreateMap.putString("message", str2);
        writableMapCreateMap.putMap("cause", th2 != null ? a(th2) : null);
        writableMapCreateMap.putMap("userInfo", writableMap);
        s.h(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public static /* synthetic */ ReadableMap c(String str, String str2, Throwable th2, WritableMap writableMap, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        if ((i11 & 4) != 0) {
            th2 = null;
        }
        if ((i11 & 8) != 0) {
            writableMap = null;
        }
        return b(str, str2, th2, writableMap);
    }
}
