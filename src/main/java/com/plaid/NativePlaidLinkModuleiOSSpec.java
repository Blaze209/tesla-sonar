package com.plaid;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* JADX INFO: loaded from: classes6.dex */
public abstract class NativePlaidLinkModuleiOSSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RNLinksdk";

    public NativePlaidLinkModuleiOSSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @in.a
    public abstract void addListener(String str);

    @ReactMethod
    @in.a
    public abstract void createPlaidLink(String str, boolean z11);

    @ReactMethod
    @in.a
    public abstract void dismiss();

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    @in.a
    public abstract void open(boolean z11, Callback callback, Callback callback2);

    @ReactMethod
    @in.a
    public abstract void removeListeners(int i11);

    @ReactMethod
    @in.a
    public abstract void submit(String str);
}
