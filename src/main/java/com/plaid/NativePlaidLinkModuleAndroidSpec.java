package com.plaid;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* JADX INFO: loaded from: classes6.dex */
public abstract class NativePlaidLinkModuleAndroidSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "PlaidAndroid";

    public NativePlaidLinkModuleAndroidSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @in.a
    public abstract void addListener(String str);

    @ReactMethod
    @in.a
    public abstract void createPlaidLink(String str, boolean z11, String str2);

    @ReactMethod
    @in.a
    public abstract void destroy(Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "PlaidAndroid";
    }

    @ReactMethod
    @in.a
    public abstract void open(Callback callback, Callback callback2);

    @ReactMethod
    @in.a
    public abstract void removeListeners(double d11);

    @ReactMethod
    @in.a
    public abstract void startLinkActivityForResult(String str, boolean z11, String str2, Callback callback, Callback callback2);

    @ReactMethod
    @in.a
    public abstract void submit(String str, String str2);
}
