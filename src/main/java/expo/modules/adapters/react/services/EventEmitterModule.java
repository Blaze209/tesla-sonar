package expo.modules.adapters.react.services;

import android.os.Bundle;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.b1;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.d;
import expo.modules.adapters.react.views.ViewManagerAdapterUtils;
import expo.modules.core.interfaces.InternalModule;
import expo.modules.core.interfaces.services.EventEmitter;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class EventEmitterModule implements EventEmitter, InternalModule {
    private ReactContext mReactContext;

    public EventEmitterModule(ReactContext reactContext) {
        this.mReactContext = reactContext;
    }

    private static d getReactEventFromEvent(final int i11, final EventEmitter.Event event) {
        return new d(i11) { // from class: expo.modules.adapters.react.services.EventEmitterModule.2
            @Override // com.facebook.react.uimanager.events.d
            public boolean canCoalesce() {
                return event.canCoalesce();
            }

            @Override // com.facebook.react.uimanager.events.d
            public void dispatch(RCTEventEmitter rCTEventEmitter) {
                rCTEventEmitter.receiveEvent(i11, getEventName(), Arguments.fromBundle(event.getEventBody()));
            }

            @Override // com.facebook.react.uimanager.events.d
            public short getCoalescingKey() {
                return event.getCoalescingKey();
            }

            @Override // com.facebook.react.uimanager.events.d
            public String getEventName() {
                return ViewManagerAdapterUtils.normalizeEventName(event.getEventName());
            }
        };
    }

    @Override // expo.modules.core.interfaces.services.EventEmitter
    public void emit(String str, Bundle bundle) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.mReactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, Arguments.fromBundle(bundle));
    }

    @Override // expo.modules.core.interfaces.InternalModule
    public List<Class> getExportedInterfaces() {
        return Collections.singletonList(EventEmitter.class);
    }

    @Override // expo.modules.core.interfaces.services.EventEmitter
    public void emit(int i11, EventEmitter.Event event) {
        b1.c(this.mReactContext, i11).h(getReactEventFromEvent(i11, event));
    }

    @Override // expo.modules.core.interfaces.services.EventEmitter
    public void emit(final int i11, final String str, final Bundle bundle) {
        b1.c(this.mReactContext, i11).h(new d(i11) { // from class: expo.modules.adapters.react.services.EventEmitterModule.1
            @Override // com.facebook.react.uimanager.events.d
            public boolean canCoalesce() {
                return false;
            }

            @Override // com.facebook.react.uimanager.events.d
            public void dispatch(RCTEventEmitter rCTEventEmitter) {
                int i12 = i11;
                String eventName = getEventName();
                Bundle bundle2 = bundle;
                rCTEventEmitter.receiveEvent(i12, eventName, bundle2 != null ? Arguments.fromBundle(bundle2) : null);
            }

            @Override // com.facebook.react.uimanager.events.d
            public short getCoalescingKey() {
                return (short) 0;
            }

            @Override // com.facebook.react.uimanager.events.d
            public String getEventName() {
                return ViewManagerAdapterUtils.normalizeEventName(str);
            }
        });
    }
}
