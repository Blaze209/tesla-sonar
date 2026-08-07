package com.swmansion.gesturehandler;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import in.a;

/* JADX INFO: loaded from: classes7.dex */
public abstract class NativeRNGestureHandlerModuleSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public static final String NAME = "RNGestureHandlerModule";

    public NativeRNGestureHandlerModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @a
    public abstract void attachGestureHandler(double d11, double d12, double d13);

    @ReactMethod
    @a
    public abstract void createGestureHandler(String str, double d11, ReadableMap readableMap);

    @ReactMethod
    @a
    public abstract void dropGestureHandler(double d11);

    @ReactMethod
    @a
    public abstract void flushOperations();

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNGestureHandlerModule";
    }

    @ReactMethod
    @a
    public abstract void handleClearJSResponder();

    @ReactMethod
    @a
    public abstract void handleSetJSResponder(double d11, boolean z11);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @a
    public abstract boolean install();

    @ReactMethod
    @a
    public abstract void updateGestureHandler(double d11, ReadableMap readableMap);
}
