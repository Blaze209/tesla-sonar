package c10;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.b1;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.v0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\u001a'\u0010\u0006\u001a\u00020\u0005*\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\u000b\u001a\u00020\u0005*\u0004\u0018\u00010\u00002\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\r\u001a\u00020\u0005*\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\u000e\"\u0017\u0010\u0011\u001a\u00020\b*\u0004\u0018\u00010\u00008F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/facebook/react/uimanager/v0;", "", "viewId", "Lcom/facebook/react/uimanager/events/d;", "event", "Ljn0/h0;", "a", "(Lcom/facebook/react/uimanager/v0;ILcom/facebook/react/uimanager/events/d;)V", "", "Lcom/facebook/react/bridge/WritableMap;", "params", "b", "(Lcom/facebook/react/uimanager/v0;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V", DateTokenConverter.CONVERTER_KEY, "(Lcom/facebook/react/uimanager/v0;I)V", "c", "(Lcom/facebook/react/uimanager/v0;)Ljava/lang/String;", "appearance", "react-native-keyboard-controller_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class g {
    public static final void a(v0 v0Var, int i11, com.facebook.react.uimanager.events.d<?> event) {
        s.k(event, "event");
        s.i(v0Var, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        EventDispatcher eventDispatcherC = b1.c(v0Var, i11);
        if (eventDispatcherC != null) {
            eventDispatcherC.h(event);
        }
    }

    public static final void b(v0 v0Var, String event, WritableMap params) {
        ReactApplicationContext reactApplicationContextB;
        DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter;
        s.k(event, "event");
        s.k(params, "params");
        if (v0Var != null && (reactApplicationContextB = v0Var.b()) != null && (rCTDeviceEventEmitter = (DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContextB.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)) != null) {
            rCTDeviceEventEmitter.emit(event, params);
        }
        g10.a.b(g10.a.f67023a, "ThemedReactContext", event, null, 4, null);
    }

    public static final String c(v0 v0Var) {
        return (v0Var != null && a.c(v0Var)) ? "dark" : "light";
    }

    public static final void d(v0 v0Var, int i11) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        writableArrayCreateArray.pushInt(new int[]{i11}[0]);
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putArray("tags", writableArrayCreateArray);
        s.h(writableMapCreateMap);
        b(v0Var, "onUserDrivenAnimationEnded", writableMapCreateMap);
    }
}
