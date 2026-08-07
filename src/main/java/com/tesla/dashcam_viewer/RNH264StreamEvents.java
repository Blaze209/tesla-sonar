package com.tesla.dashcam_viewer;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0015\u0010\u0003J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010!\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0004H\u0007¢\u0006\u0004\b!\u0010\"J\u001d\u0010&\u001a\u00020\b2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#H\u0007¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\bH\u0007¢\u0006\u0004\b(\u0010\u0003J\u0017\u0010*\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020)H\u0007¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\b2\u0006\u0010,\u001a\u00020\u0004H\u0007¢\u0006\u0004\b-\u0010.J)\u00102\u001a\u00020\b2\u0006\u00100\u001a\u00020/2\u0006\u0010 \u001a\u00020\u00042\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b2\u00103J)\u00105\u001a\u00020\b2\u0006\u00100\u001a\u0002042\u0006\u0010 \u001a\u00020\u00042\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b5\u00106R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u00107¨\u00068"}, d2 = {"Lcom/tesla/dashcam_viewer/RNH264StreamEvents;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "<init>", "()V", "", "eventName", "", "params", "Ljn0/h0;", "sendEvent", "(Ljava/lang/String;Ljava/lang/Object;)V", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "initialize", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "supportedEvents", "(Lcom/facebook/react/bridge/Promise;)V", "sendListEvents", "Lcom/facebook/react/bridge/ReadableArray;", "eventPaths", "requestEventMetadata", "(Lcom/facebook/react/bridge/ReadableArray;)V", "Lcom/tesla/dashcam_viewer/j;", "eventList", "eventListChanged", "(Lcom/tesla/dashcam_viewer/j;)V", "Lcom/tesla/dashcam_viewer/n;", PermissionsResponse.STATUS_KEY, "vin", "dashcamViewerStatusChanged", "(Lcom/tesla/dashcam_viewer/n;Ljava/lang/String;)V", "", "Lcom/tesla/dashcam_viewer/l;", "metadatas", "receivedEventMetadatas", "(Ljava/util/List;)V", "videoPlayerCreated", "Lcom/tesla/dashcam_viewer/m;", "saveClipStateChanged", "(Lcom/tesla/dashcam_viewer/m;)V", "request", "sendPhotoBoothRequest", "(Ljava/lang/String;)V", "Lcom/tesla/dashcam_viewer/a0;", "response", "filePath", "receivePhotoBoothResponse", "(Lcom/tesla/dashcam_viewer/a0;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/tesla/dashcam_viewer/k1;", "receiveSketchpadResponse", "(Lcom/tesla/dashcam_viewer/k1;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/facebook/react/bridge/ReactApplicationContext;", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RNH264StreamEvents extends ReactContextBaseJavaModule {
    public static final RNH264StreamEvents INSTANCE = new RNH264StreamEvents();
    private static ReactApplicationContext reactContext;

    private RNH264StreamEvents() {
        super(null);
    }

    public static /* synthetic */ void receivePhotoBoothResponse$default(RNH264StreamEvents rNH264StreamEvents, a0 a0Var, String str, String str2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        rNH264StreamEvents.receivePhotoBoothResponse(a0Var, str, str2);
    }

    public static /* synthetic */ void receiveSketchpadResponse$default(RNH264StreamEvents rNH264StreamEvents, k1 k1Var, String str, String str2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        rNH264StreamEvents.receiveSketchpadResponse(k1Var, str, str2);
    }

    private final void sendEvent(String eventName, Object params) {
        DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter;
        ReactApplicationContext reactApplicationContext = reactContext;
        if (reactApplicationContext == null || (rCTDeviceEventEmitter = (DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)) == null) {
            return;
        }
        rCTDeviceEventEmitter.emit(eventName, params);
    }

    @ReactMethod
    public final void dashcamViewerStatusChanged(n status, String vin) {
        p013kotlin.jvm.internal.s.k(status, "status");
        p013kotlin.jvm.internal.s.k(vin, "vin");
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString(PermissionsResponse.STATUS_KEY, status.getValue());
        writableMapCreateMap.putString("vin", vin);
        sendEvent("onStatusChanged", writableMapCreateMap);
    }

    @ReactMethod
    public final void eventListChanged(DashcamViewerEventList eventList) {
        p013kotlin.jvm.internal.s.k(eventList, "eventList");
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putMap("events", o.n(eventList));
        sendEvent("onEventListChanged", writableMapCreateMap);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNH264StreamEvents";
    }

    public final void initialize(ReactApplicationContext reactContext2) {
        p013kotlin.jvm.internal.s.k(reactContext2, "reactContext");
        reactContext = reactContext2;
    }

    public final void receivePhotoBoothResponse(a0 response, String vin, String filePath) {
        p013kotlin.jvm.internal.s.k(response, "response");
        p013kotlin.jvm.internal.s.k(vin, "vin");
        WritableMap writableMapS = o.s(response);
        writableMapS.putString("vin", vin);
        if (filePath != null) {
            writableMapS.putString("Path", filePath);
        }
        sendEvent("onPhotoBoothResponse", writableMapS);
    }

    public final void receiveSketchpadResponse(k1 response, String vin, String filePath) {
        p013kotlin.jvm.internal.s.k(response, "response");
        p013kotlin.jvm.internal.s.k(vin, "vin");
        WritableMap writableMapT = o.t(response);
        writableMapT.putString("vin", vin);
        if (filePath != null) {
            writableMapT.putString("Path", filePath);
        }
        sendEvent("onSketchpadResponse", writableMapT);
    }

    @ReactMethod
    public final void receivedEventMetadatas(List<DashcamViewerEventMetadataForJS> metadatas) {
        p013kotlin.jvm.internal.s.k(metadatas, "metadatas");
        if (metadatas.isEmpty()) {
            return;
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putArray("metadatas", o.l(metadatas));
        sendEvent("onReceivedEventMetadata", writableMapCreateMap);
    }

    @ReactMethod
    public final void requestEventMetadata(ReadableArray eventPaths) {
        p013kotlin.jvm.internal.s.k(eventPaths, "eventPaths");
        ArrayList<Object> arrayList = eventPaths.toArrayList();
        ArrayList arrayList2 = new ArrayList(p013kotlin.collections.v.y(arrayList, 10));
        for (Object obj : arrayList) {
            p013kotlin.jvm.internal.s.i(obj, "null cannot be cast to non-null type kotlin.String");
            arrayList2.add((String) obj);
        }
        o1.f55932a.q(arrayList2);
    }

    @ReactMethod
    public final void saveClipStateChanged(DashcamViewerSaveClipStatus status) {
        p013kotlin.jvm.internal.s.k(status, "status");
        if (status.getStatus().length() == 0) {
            return;
        }
        sendEvent("onDownloadPercentageChanged", o.q(status));
    }

    @ReactMethod
    public final void sendListEvents() {
        f1 f1Var = f1.f55840a;
        byte[] bytes = "list_events\n".getBytes(p013kotlin.text.d.UTF_8);
        p013kotlin.jvm.internal.s.j(bytes, "getBytes(...)");
        f1Var.n0(bytes);
    }

    @ReactMethod
    public final void sendPhotoBoothRequest(String request) {
        p013kotlin.jvm.internal.s.k(request, "request");
        f1 f1Var = f1.f55840a;
        byte[] bytes = request.getBytes(p013kotlin.text.d.UTF_8);
        p013kotlin.jvm.internal.s.j(bytes, "getBytes(...)");
        f1Var.n0(bytes);
    }

    @ReactMethod
    public final void supportedEvents(Promise promise) {
        p013kotlin.jvm.internal.s.k(promise, "promise");
        try {
            promise.resolve(p013kotlin.collections.v.p("onEventListChanged", "onReceivedEventMetadata", "onVideoPlayerCreated", "onDownloadPercentageChanged", "onStatusChanged", "onPhotoBoothResponse", "onSketchpadResponse"));
        } catch (Exception e11) {
            promise.reject("supportedEvents error", e11);
        }
    }

    @ReactMethod
    public final void videoPlayerCreated() {
        sendEvent("onVideoPlayerCreated", Arguments.createMap());
    }
}
