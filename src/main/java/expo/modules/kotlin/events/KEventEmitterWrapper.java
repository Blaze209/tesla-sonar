package expo.modules.kotlin.events;

import android.os.Bundle;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.b1;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.d;
import expo.modules.kotlin.records.Record;
import expo.modules.kotlin.types.JSTypeConverter;
import java.lang.ref.WeakReference;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001)B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u000e\u0010\u0011J)\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0010\u0010\f\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u000e\u0010\u0013J3\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u000e\u0010\u0018J3\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u000e\u0010\u001bJ8\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\u000e\u0010\n\u001a\n \u001c*\u0004\u0018\u00010\t0\t2\u000e\u0010\f\u001a\n \u001c*\u0004\u0018\u00010\u001d0\u001dH\u0096\u0001¢\u0006\u0004\b\u000e\u0010\u001eJ0\u0010\u000e\u001a\u00020\r2\u000e\u0010\n\u001a\n \u001c*\u0004\u0018\u00010\t0\t2\u000e\u0010\f\u001a\n \u001c*\u0004\u0018\u00010\u001d0\u001dH\u0096\u0001¢\u0006\u0004\b\u000e\u0010\u001fJ(\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\u000e\u0010!\u001a\n \u001c*\u0004\u0018\u00010 0 H\u0096\u0001¢\u0006\u0004\b\u000e\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010$R\u0016\u0010(\u001a\u0004\u0018\u00010%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lexpo/modules/kotlin/events/KEventEmitterWrapper;", "Lexpo/modules/kotlin/events/EventEmitter;", "Lexpo/modules/core/interfaces/services/EventEmitter;", "legacyEventEmitter", "Ljava/lang/ref/WeakReference;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContextHolder", "<init>", "(Lexpo/modules/core/interfaces/services/EventEmitter;Ljava/lang/ref/WeakReference;)V", "", "eventName", "Lcom/facebook/react/bridge/WritableMap;", "eventBody", "Ljn0/h0;", "emit", "(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V", "Lexpo/modules/kotlin/records/Record;", "(Ljava/lang/String;Lexpo/modules/kotlin/records/Record;)V", "", "(Ljava/lang/String;Ljava/util/Map;)V", "", "viewId", "", "coalescingKey", "(ILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;Ljava/lang/Short;)V", "Landroid/view/View;", "view", "(Landroid/view/View;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;Ljava/lang/Short;)V", "kotlin.jvm.PlatformType", "Landroid/os/Bundle;", "(ILjava/lang/String;Landroid/os/Bundle;)V", "(Ljava/lang/String;Landroid/os/Bundle;)V", "Lexpo/modules/core/interfaces/services/EventEmitter$Event;", "event", "(ILexpo/modules/core/interfaces/services/EventEmitter$Event;)V", "Lexpo/modules/core/interfaces/services/EventEmitter;", "Ljava/lang/ref/WeakReference;", "Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;", "getDeviceEventEmitter", "()Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;", "deviceEventEmitter", "UIEvent", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class KEventEmitterWrapper implements EventEmitter, expo.modules.core.interfaces.services.EventEmitter {
    private final expo.modules.core.interfaces.services.EventEmitter legacyEventEmitter;
    private final WeakReference<ReactApplicationContext> reactContextHolder;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\n\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0017R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0018¨\u0006\u0019"}, d2 = {"Lexpo/modules/kotlin/events/KEventEmitterWrapper$UIEvent;", "Lcom/facebook/react/uimanager/events/d;", "", "surfaceId", "viewId", "", "eventName", "Lcom/facebook/react/bridge/WritableMap;", "eventBody", "", "coalescingKey", "<init>", "(IILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;Ljava/lang/Short;)V", "getEventName", "()Ljava/lang/String;", "", "canCoalesce", "()Z", "getCoalescingKey", "()S", "getEventData", "()Lcom/facebook/react/bridge/WritableMap;", "Ljava/lang/String;", "Lcom/facebook/react/bridge/WritableMap;", "Ljava/lang/Short;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class UIEvent extends d<UIEvent> {
        private final Short coalescingKey;
        private final WritableMap eventBody;
        private final String eventName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UIEvent(int i11, int i12, String eventName, WritableMap writableMap, Short sh2) {
            super(i11, i12);
            s.k(eventName, "eventName");
            this.eventName = eventName;
            this.eventBody = writableMap;
            this.coalescingKey = sh2;
        }

        @Override // com.facebook.react.uimanager.events.d
        public boolean canCoalesce() {
            return this.coalescingKey != null;
        }

        @Override // com.facebook.react.uimanager.events.d
        public short getCoalescingKey() {
            Short sh2 = this.coalescingKey;
            if (sh2 != null) {
                return sh2.shortValue();
            }
            return (short) 0;
        }

        @Override // com.facebook.react.uimanager.events.d
        /* JADX INFO: renamed from: getEventData */
        protected WritableMap getExtraData() {
            WritableMap writableMap = this.eventBody;
            if (writableMap != null) {
                return writableMap;
            }
            WritableMap writableMapCreateMap = Arguments.createMap();
            s.j(writableMapCreateMap, "createMap(...)");
            return writableMapCreateMap;
        }

        @Override // com.facebook.react.uimanager.events.d
        public String getEventName() {
            return KModuleEventEmitterWrapperKt.normalizeEventName(this.eventName);
        }
    }

    public KEventEmitterWrapper(expo.modules.core.interfaces.services.EventEmitter legacyEventEmitter, WeakReference<ReactApplicationContext> reactContextHolder) {
        s.k(legacyEventEmitter, "legacyEventEmitter");
        s.k(reactContextHolder, "reactContextHolder");
        this.legacyEventEmitter = legacyEventEmitter;
        this.reactContextHolder = reactContextHolder;
    }

    private final DeviceEventManagerModule.RCTDeviceEventEmitter getDeviceEventEmitter() {
        ReactApplicationContext reactApplicationContext = this.reactContextHolder.get();
        if (reactApplicationContext != null) {
            return (DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
        }
        return null;
    }

    @Override // expo.modules.core.interfaces.services.EventEmitter
    public void emit(int viewId, expo.modules.core.interfaces.services.EventEmitter.Event event) {
        this.legacyEventEmitter.emit(viewId, event);
    }

    @Override // expo.modules.core.interfaces.services.EventEmitter
    public void emit(int viewId, String eventName, Bundle eventBody) {
        this.legacyEventEmitter.emit(viewId, eventName, eventBody);
    }

    @Override // expo.modules.core.interfaces.services.EventEmitter
    public void emit(String eventName, Bundle eventBody) {
        this.legacyEventEmitter.emit(eventName, eventBody);
    }

    @Override // expo.modules.kotlin.events.EventEmitter
    public void emit(String eventName, WritableMap eventBody) {
        s.k(eventName, "eventName");
        DeviceEventManagerModule.RCTDeviceEventEmitter deviceEventEmitter = getDeviceEventEmitter();
        if (deviceEventEmitter != null) {
            deviceEventEmitter.emit(eventName, eventBody);
        }
    }

    @Override // expo.modules.kotlin.events.EventEmitter
    public void emit(String eventName, Record eventBody) {
        s.k(eventName, "eventName");
        DeviceEventManagerModule.RCTDeviceEventEmitter deviceEventEmitter = getDeviceEventEmitter();
        if (deviceEventEmitter != null) {
            deviceEventEmitter.emit(eventName, JSTypeConverter.legacyConvertToJSValue$default(JSTypeConverter.INSTANCE, eventBody, null, 2, null));
        }
    }

    @Override // expo.modules.kotlin.events.EventEmitter
    public void emit(String eventName, Map<?, ?> eventBody) {
        s.k(eventName, "eventName");
        DeviceEventManagerModule.RCTDeviceEventEmitter deviceEventEmitter = getDeviceEventEmitter();
        if (deviceEventEmitter != null) {
            deviceEventEmitter.emit(eventName, JSTypeConverter.legacyConvertToJSValue$default(JSTypeConverter.INSTANCE, eventBody, null, 2, null));
        }
    }

    @Override // expo.modules.kotlin.events.EventEmitter
    public void emit(int viewId, String eventName, WritableMap eventBody, Short coalescingKey) {
        EventDispatcher eventDispatcherC;
        s.k(eventName, "eventName");
        ReactApplicationContext reactApplicationContext = this.reactContextHolder.get();
        if (reactApplicationContext == null || (eventDispatcherC = b1.c(reactApplicationContext, viewId)) == null) {
            return;
        }
        eventDispatcherC.h(new UIEvent(-1, viewId, eventName, eventBody, coalescingKey));
    }

    @Override // expo.modules.kotlin.events.EventEmitter
    public void emit(View view, String eventName, WritableMap eventBody, Short coalescingKey) {
        s.k(view, "view");
        s.k(eventName, "eventName");
        ReactApplicationContext reactApplicationContext = this.reactContextHolder.get();
        if (reactApplicationContext == null) {
            return;
        }
        int iF = b1.f(view);
        int id2 = view.getId();
        EventDispatcher eventDispatcherC = b1.c(reactApplicationContext, view.getId());
        if (eventDispatcherC != null) {
            eventDispatcherC.h(new UIEvent(iF, id2, eventName, eventBody, coalescingKey));
        }
    }
}
