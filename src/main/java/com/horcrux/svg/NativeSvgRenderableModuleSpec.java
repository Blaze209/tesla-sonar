package com.horcrux.svg;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* JADX INFO: loaded from: classes6.dex */
public abstract class NativeSvgRenderableModuleSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public static final String NAME = "RNSVGRenderableModule";

    public NativeSvgRenderableModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    @in.a
    public abstract WritableMap getBBox(Double d11, ReadableMap readableMap);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @in.a
    public abstract WritableMap getCTM(Double d11);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNSVGRenderableModule";
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    @in.a
    public abstract WritableMap getPointAtLength(Double d11, ReadableMap readableMap);

    @ReactMethod
    @in.a
    public abstract void getRawResource(String str, Promise promise);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @in.a
    public abstract WritableMap getScreenCTM(Double d11);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @in.a
    public abstract double getTotalLength(Double d11);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @in.a
    public abstract boolean isPointInFill(Double d11, ReadableMap readableMap);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @in.a
    public abstract boolean isPointInStroke(Double d11, ReadableMap readableMap);
}
