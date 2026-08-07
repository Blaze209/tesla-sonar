package x90;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/facebook/react/bridge/ReactContext;", "Lcom/facebook/react/uimanager/events/d;", "event", "Ljn0/h0;", "a", "(Lcom/facebook/react/bridge/ReactContext;Lcom/facebook/react/uimanager/events/d;)V", "react-native-gesture-handler_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class h {
    public static final void a(ReactContext reactContext, com.facebook.react.uimanager.events.d<?> event) throws Exception {
        s.k(reactContext, "<this>");
        s.k(event, "event");
        try {
            NativeModule nativeModule = reactContext.getNativeModule((Class<NativeModule>) UIManagerModule.class);
            s.h(nativeModule);
            ((UIManagerModule) nativeModule).getEventDispatcher().h(event);
        } catch (NullPointerException e11) {
            throw new Exception("Couldn't get an instance of UIManagerModule. Gesture Handler is unable to send an event.", e11);
        }
    }
}
