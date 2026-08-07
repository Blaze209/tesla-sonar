package com.rncamerakit;

import android.view.View;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.uimanager.b1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0012\u0010\u0011J+\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/rncamerakit/RNCameraKitModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "getName", "()Ljava/lang/String;", "", "", "getConstants", "()Ljava/util/Map;", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Ljn0/h0;", "requestDeviceCameraAuthorization", "(Lcom/facebook/react/bridge/Promise;)V", "checkDeviceCameraAuthorizationStatus", "Lcom/facebook/react/bridge/ReadableMap;", "options", "", "tag", "capture", "(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/Double;Lcom/facebook/react/bridge/Promise;)V", "Lcom/facebook/react/bridge/ReactApplicationContext;", "Companion", "a", "react-native-camera-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RNCameraKitModule extends ReactContextBaseJavaModule {
    public static final int LANDSCAPE_LEFT = 1;
    public static final int LANDSCAPE_RIGHT = 3;
    public static final int PORTRAIT = 0;
    public static final int PORTRAIT_UPSIDE_DOWN = 2;
    public static final String REACT_CLASS = "RNCameraKitModule";
    private final ReactApplicationContext reactContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNCameraKitModule(ReactApplicationContext reactContext) {
        super(reactContext);
        s.k(reactContext, "reactContext");
        this.reactContext = reactContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void capture$lambda$2(UIManager uIManager, Integer num, ReadableMap readableMap, Promise promise) throws IOException {
        View viewResolveView = uIManager != null ? uIManager.resolveView(num.intValue()) : null;
        s.i(viewResolveView, "null cannot be cast to non-null type com.rncamerakit.CKCamera");
        e eVar = (e) viewResolveView;
        HashMap<String, Object> hashMap = readableMap.toHashMap();
        LinkedHashMap linkedHashMap = new LinkedHashMap(v0.e(hashMap.size()));
        Iterator<T> it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof ReadableMap) {
                value = ((ReadableMap) value).toHashMap();
            } else if (value instanceof ReadableArray) {
                value = ((ReadableArray) value).toArrayList();
            }
            linkedHashMap.put(key, value);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            String str = (String) entry2.getKey();
            Object value2 = entry2.getValue();
            Pair pairA = value2 != null ? x.a(str, value2) : null;
            if (pairA != null) {
                arrayList.add(pairA);
            }
        }
        eVar.v(v0.y(arrayList), promise);
    }

    @ReactMethod
    public final void capture(final ReadableMap options, Double tag, final Promise promise) {
        s.k(promise, "promise");
        final Integer numValueOf = tag != null ? Integer.valueOf((int) tag.doubleValue()) : null;
        if (numValueOf != null && options != null) {
            final UIManager uIManagerI = b1.i(this.reactContext, numValueOf.intValue());
            this.reactContext.runOnUiQueueThread(new Runnable() { // from class: com.rncamerakit.l
                @Override // java.lang.Runnable
                public final void run() throws IOException {
                    RNCameraKitModule.capture$lambda$2(uIManagerI, numValueOf, options, promise);
                }
            });
            return;
        }
        promise.reject("E_CAPTURE_FAILED", "options or/and tag arguments are null, options: " + options + ", tag: " + numValueOf);
    }

    public final void checkDeviceCameraAuthorizationStatus(Promise promise) {
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return v0.k(x.a("PORTRAIT", 0), x.a("PORTRAIT_UPSIDE_DOWN", 2), x.a("LANDSCAPE_LEFT", 1), x.a("LANDSCAPE_RIGHT", 3));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    public final void requestDeviceCameraAuthorization(Promise promise) {
    }
}
