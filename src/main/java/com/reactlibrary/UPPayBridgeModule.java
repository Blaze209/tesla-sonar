package com.reactlibrary;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class UPPayBridgeModule extends ReactContextBaseJavaModule implements ActivityEventListener {
    private static final int START_UPPAY_REQUEST_CODE = 10;
    private static final String UPPAY_PAYMENT_CANCELLED_CODE = "cancel";
    private static final String UPPAY_PAYMENT_FAILED_CODE = "fail";
    private static final ArrayList<UPPayBridgeModule> modules = new ArrayList<>();
    private Promise originalPromise;
    private final ReactApplicationContext reactContext;

    public UPPayBridgeModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
        reactApplicationContext.addActivityEventListener(this);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "UPPayBridge";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        modules.add(this);
    }

    @ReactMethod
    public void isUnionPayAppInstalled(String str, String str2, Callback callback) {
        try {
            callback.invoke(null, Boolean.valueOf(vf0.a.u(getReactApplicationContext(), str, str2)));
        } catch (Exception e11) {
            Log.e("UPPayBridgeModule", "Failed to checkWalletInstalled", e11);
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i11, int i12, Intent intent) {
        Bundle extras;
        String string;
        Promise promise;
        if (i11 != 10 || intent == null || (extras = intent.getExtras()) == null || (string = extras.getString("pay_result")) == null) {
            return;
        }
        if ((string.equalsIgnoreCase(UPPAY_PAYMENT_FAILED_CODE) || string.equalsIgnoreCase(UPPAY_PAYMENT_CANCELLED_CODE)) && (promise = this.originalPromise) != null) {
            promise.reject(String.valueOf(i12), "The payment was rejected, result = " + string);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        modules.remove(this);
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }

    @ReactMethod
    public void startUPPay(String str, String str2, String str3, Promise promise) {
        this.originalPromise = promise;
        try {
            vf0.a.K(getCurrentActivity(), null, null, str, str2);
        } catch (Exception e11) {
            Log.e("UPPayBridgeModule", "Failed to startUPPay", e11);
        }
    }
}
