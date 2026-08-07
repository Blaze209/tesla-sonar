package yy;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR$\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\r\u0010\u0011¨\u0006\u0013"}, d2 = {"Lyy/e;", "Lyy/f;", "Lcom/facebook/react/bridge/ReactContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactContext;)V", "", "byteArray", "Ljn0/h0;", "a", "([B)V", "Lcom/facebook/react/bridge/ReactContext;", "", "b", "Ljava/lang/String;", "getReactTag", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "reactTag", "livekit_react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ReactContext reactContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private String reactTag;

    public e(ReactContext reactContext) {
        s.k(reactContext, "reactContext");
        this.reactContext = reactContext;
    }

    @Override // yy.f
    public void a(byte[] byteArray) {
        s.k(byteArray, "byteArray");
        String str = this.reactTag;
        if (str == null) {
            return;
        }
        String strM = tn0.a.m(tn0.a.INSTANCE, byteArray, 0, 0, 6, null);
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("data", strM);
        writableMapCreateMap.putString("id", str);
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("LK_AUDIO_DATA", writableMapCreateMap);
    }

    public final void b(String str) {
        this.reactTag = str;
    }
}
