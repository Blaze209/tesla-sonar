package com.tesla.TeslaV4.reactnative.module;

import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/tesla/TeslaV4/reactnative/module/MapUtilsModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/bridge/ReadableMap;", "fromLocationDictionary", "toLocationDictionary", "mapType", "", "forceWalkingMode", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Ljn0/h0;", "openMapsWithDirections", "(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;ZLcom/facebook/react/bridge/Promise;)V", "(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MapUtilsModule extends ReactContextBaseJavaModule {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapUtilsModule(ReactApplicationContext context) {
        super(context);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "MapUtilsModule";
    }

    @ReactMethod
    public final void openMapsWithDirections(ReadableMap fromLocationDictionary, ReadableMap toLocationDictionary, String mapType, boolean forceWalkingMode, Promise promise) {
        p013kotlin.jvm.internal.s.k(fromLocationDictionary, "fromLocationDictionary");
        p013kotlin.jvm.internal.s.k(toLocationDictionary, "toLocationDictionary");
        p013kotlin.jvm.internal.s.k(mapType, "mapType");
        p013kotlin.jvm.internal.s.k(promise, "promise");
        h hVar = h.f55694a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        p013kotlin.jvm.internal.s.j(reactApplicationContext, "getReactApplicationContext(...)");
        hVar.a(reactApplicationContext, fromLocationDictionary, toLocationDictionary, mapType, forceWalkingMode, promise);
    }

    @ReactMethod
    public final void openMapsWithDirections(ReadableMap fromLocationDictionary, ReadableMap toLocationDictionary, String mapType, Promise promise) {
        p013kotlin.jvm.internal.s.k(fromLocationDictionary, "fromLocationDictionary");
        p013kotlin.jvm.internal.s.k(toLocationDictionary, "toLocationDictionary");
        p013kotlin.jvm.internal.s.k(mapType, "mapType");
        p013kotlin.jvm.internal.s.k(promise, "promise");
        openMapsWithDirections(fromLocationDictionary, toLocationDictionary, mapType, false, promise);
    }
}
