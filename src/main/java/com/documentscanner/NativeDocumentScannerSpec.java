package com.documentscanner;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import in.a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NativeDocumentScannerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "DocumentScanner";

    public NativeDocumentScannerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "DocumentScanner";
    }

    @ReactMethod
    @a
    public abstract void scanDocument(ReadableMap readableMap, Promise promise);
}
