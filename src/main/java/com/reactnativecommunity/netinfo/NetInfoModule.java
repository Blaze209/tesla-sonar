package com.reactnativecommunity.netinfo;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import n00.b;
import n00.f;

/* JADX INFO: loaded from: classes6.dex */
@xn.a(name = NetInfoModule.NAME)
public class NetInfoModule extends ReactContextBaseJavaModule implements a.InterfaceC0765a {
    public static final String NAME = "RNCNetInfo";
    private final a mAmazonConnectivityChecker;
    private final b mConnectivityReceiver;
    private int numberOfListeners;

    public NetInfoModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.numberOfListeners = 0;
        this.mConnectivityReceiver = new f(reactApplicationContext);
        this.mAmazonConnectivityChecker = new a(reactApplicationContext, this);
    }

    @ReactMethod
    public void addListener(String str) {
        this.numberOfListeners++;
        this.mConnectivityReceiver.f92635e = true;
    }

    @ReactMethod
    public void getCurrentState(String str, Promise promise) {
        this.mConnectivityReceiver.d(str, promise);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        this.mConnectivityReceiver.g();
        this.mAmazonConnectivityChecker.g();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        this.mAmazonConnectivityChecker.k();
        this.mConnectivityReceiver.j();
        this.mConnectivityReceiver.f92635e = false;
    }

    @Override // com.reactnativecommunity.netinfo.a.InterfaceC0765a
    public void onAmazonFireDeviceConnectivityChanged(boolean z11) {
        this.mConnectivityReceiver.i(z11);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        invalidate();
    }

    @ReactMethod
    public void removeListeners(Integer num) {
        int iIntValue = this.numberOfListeners - num.intValue();
        this.numberOfListeners = iIntValue;
        if (iIntValue == 0) {
            this.mConnectivityReceiver.f92635e = false;
        }
    }
}
