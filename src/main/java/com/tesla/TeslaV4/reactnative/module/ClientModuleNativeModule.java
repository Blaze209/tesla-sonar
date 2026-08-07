package com.tesla.TeslaV4.reactnative.module;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.tesla.TeslaV4.MainApplication;
import com.tesla.logging.TeslaLog;

/* JADX INFO: loaded from: classes7.dex */
public class ClientModuleNativeModule extends ReactContextBaseJavaModule {
    private static final String REACT_CLASS = "TMClient";

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f55604a;

        a(Activity activity) {
            this.f55604a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f55604a.getWindow().addFlags(128);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f55606a;

        b(Activity activity) {
            this.f55606a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f55606a.getWindow().clearFlags(128);
        }
    }

    public ClientModuleNativeModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public void activateKeepAwake() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.runOnUiThread(new a(currentActivity));
        }
    }

    @ReactMethod
    public void deactivateKeepAwake() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.runOnUiThread(new b(currentActivity));
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return REACT_CLASS;
    }

    @ReactMethod
    public void isHuaweiDevice(Promise promise) {
        promise.resolve(Boolean.valueOf(ie0.y.f77624a.d()));
    }

    @ReactMethod
    public void onJsBridgeReady() {
        TeslaLog.INSTANCE.i("ClientModule", "JS Bridge notified ready!", true, false);
        com.tesla.logging.a.f((MainApplication) getReactApplicationContext().getApplicationContext());
    }

    @ReactMethod
    public void openLocationServicesSettings() {
        he0.b.m(getReactApplicationContext()).D(getCurrentActivity());
    }

    @ReactMethod
    public void sendLogToNative(String str) {
        TeslaLog.INSTANCE.i("JS", str, false, false);
    }
}
