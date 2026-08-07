package yy;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R$\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lyy/j;", "Lyy/g;", "", "minFrequency", "maxFrequency", "", "barCount", "Lio0/b;", "interval", "Lcom/facebook/react/bridge/ReactContext;", "reactContext", "<init>", "(FFIJLcom/facebook/react/bridge/ReactContext;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "magnitudes", "Ljn0/h0;", "f", "([F)V", "g", "Lcom/facebook/react/bridge/ReactContext;", "", "h", "Ljava/lang/String;", "getReactTag", "()Ljava/lang/String;", "j", "(Ljava/lang/String;)V", "reactTag", "livekit_react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j extends g {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ReactContext reactContext;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private String reactTag;

    public /* synthetic */ j(float f11, float f12, int i11, long j11, ReactContext reactContext, DefaultConstructorMarker defaultConstructorMarker) {
        this(f11, f12, i11, j11, reactContext);
    }

    @Override // yy.g
    public void f(float[] magnitudes) {
        s.k(magnitudes, "magnitudes");
        String str = this.reactTag;
        if (str == null) {
            return;
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putArray("magnitudes", Arguments.fromArray(magnitudes));
        writableMapCreateMap.putString("id", str);
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("LK_MULTIBAND_PROCESSED", writableMapCreateMap);
    }

    public final void j(String str) {
        this.reactTag = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private j(float f11, float f12, int i11, long j11, ReactContext reactContext) {
        super(f11, f12, i11, j11, null);
        s.k(reactContext, "reactContext");
        this.reactContext = reactContext;
    }
}
