package s00;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Ls00/f;", "", "a", "react-native-compressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ReactApplicationContext f109322b;

    /* JADX INFO: renamed from: s00.f$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0011J!\u0010\u0014\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0019\u0010\u001aR$\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006\""}, d2 = {"Ls00/f$a;", "", "<init>", "()V", "", "eventName", "params", "Ljn0/h0;", "f", "(Ljava/lang/String;Ljava/lang/Object;)V", "backgroundId", "a", "(Ljava/lang/String;)V", "", ReactProgressBarViewManager.PROP_PROGRESS, "uuid", DateTokenConverter.CONVERTER_KEY, "(DLjava/lang/String;)V", "b", AnalyticsAttribute.Error, "c", "(Ljava/lang/String;Ljava/lang/String;)V", "", "numBytes", "totalBytes", "g", "(JJLjava/lang/String;)V", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "e", "()Lcom/facebook/react/bridge/ReactApplicationContext;", "h", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "react-native-compressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void f(String eventName, Object params) {
            DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter;
            ReactApplicationContext reactApplicationContextE = e();
            if (reactApplicationContextE == null || (rCTDeviceEventEmitter = (DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContextE.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)) == null) {
                return;
            }
            rCTDeviceEventEmitter.emit(eventName, params);
        }

        public final void a(String backgroundId) {
            f("backgroundTaskExpired", backgroundId);
        }

        public final void b(double progress, String uuid) {
            s.k(uuid, "uuid");
            WritableMap writableMapCreateMap = Arguments.createMap();
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            writableMapCreateMap.putString("uuid", uuid);
            writableMapCreateMap2.putDouble(ReactProgressBarViewManager.PROP_PROGRESS, progress);
            writableMapCreateMap.putMap("data", writableMapCreateMap2);
            f("downloadProgress", writableMapCreateMap);
        }

        public final void c(String uuid, String error) {
            if (uuid == null || error == null) {
                return;
            }
            WritableMap writableMapCreateMap = Arguments.createMap();
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            writableMapCreateMap.putString("uuid", uuid);
            writableMapCreateMap.putString(AnalyticsAttribute.Error, error);
            writableMapCreateMap.putMap("data", writableMapCreateMap2);
            f("downloadProgressError", writableMapCreateMap);
        }

        public final void d(double progress, String uuid) {
            s.k(uuid, "uuid");
            WritableMap writableMapCreateMap = Arguments.createMap();
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            writableMapCreateMap.putString("uuid", uuid);
            writableMapCreateMap2.putDouble(ReactProgressBarViewManager.PROP_PROGRESS, progress);
            writableMapCreateMap.putMap("data", writableMapCreateMap2);
            f("videoCompressProgress", writableMapCreateMap);
        }

        public final ReactApplicationContext e() {
            return f.f109322b;
        }

        public final void g(long numBytes, long totalBytes, String uuid) {
            if (uuid != null) {
                WritableMap writableMapCreateMap = Arguments.createMap();
                WritableMap writableMapCreateMap2 = Arguments.createMap();
                writableMapCreateMap.putString("uuid", uuid);
                writableMapCreateMap2.putDouble("written", numBytes);
                writableMapCreateMap2.putDouble("total", totalBytes);
                writableMapCreateMap.putMap("data", writableMapCreateMap2);
                f("uploadProgress", writableMapCreateMap);
            }
        }

        public final void h(ReactApplicationContext reactApplicationContext) {
            f.f109322b = reactApplicationContext;
        }

        private Companion() {
        }
    }
}
