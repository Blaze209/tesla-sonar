package com.wix.reactnativenotifications;

import android.app.Activity;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.wix.reactnativenotifications.core.notification.IPushNotification;

/* JADX INFO: loaded from: classes8.dex */
public class RNNotificationsModule extends ReactContextBaseJavaModule implements ActivityEventListener {
    private final com.tesla.logging.g logger;

    public RNNotificationsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.logger = com.tesla.logging.g.h("ReactNativeNotifs");
        if (gj0.c.a() instanceof gj0.g) {
            ((gj0.g) gj0.c.a()).i(reactApplicationContext);
        }
        reactApplicationContext.addActivityEventListener(this);
    }

    public void cancelDeliveredNotification(String str, int i11) {
        ij0.c.g(getReactApplicationContext().getApplicationContext()).e(str, i11);
    }

    @ReactMethod
    public void cancelLocalNotification(int i11) {
        ij0.c.g(getReactApplicationContext().getApplicationContext()).b(i11);
    }

    @ReactMethod
    public void getInitialNotification(Promise promise) {
        try {
            com.wix.reactnativenotifications.core.notification.b bVarB = gj0.d.c().b();
            if (bVarB == null) {
                promise.resolve(null);
            } else {
                gj0.d.c().a();
                promise.resolve(Arguments.fromBundle(gj0.e.a(bVarB.a())));
            }
        } catch (Throwable th2) {
            promise.resolve(null);
            throw th2;
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNBridgeModule";
    }

    @ReactMethod
    public void getOemDeviceInfo(Promise promise) {
        promise.resolve(k.g(getReactApplicationContext()));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        startPushIntentService("isAppInit");
        ij0.c.g(getReactApplicationContext().getApplicationContext()).d();
    }

    @ReactMethod
    public void isRegisteredForRemoteNotifications(Promise promise) {
        promise.resolve(new Boolean(b.a(getReactApplicationContext()).a()));
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i11, int i12, Intent intent) {
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
        if (gj0.f.a(intent)) {
            IPushNotification iPushNotificationL = com.wix.reactnativenotifications.core.notification.a.l(getReactApplicationContext().getApplicationContext(), gj0.f.c(intent));
            if (iPushNotificationL != null) {
                iPushNotificationL.c();
            }
        }
    }

    @ReactMethod
    public void postLocalNotification(ReadableMap readableMap, int i11) {
        com.wix.reactnativenotifications.core.notification.a.l(getReactApplicationContext().getApplicationContext(), Arguments.toBundle(readableMap)).b(Integer.valueOf(i11));
    }

    @ReactMethod
    public void pushServiceStatus(Promise promise) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        writableNativeMap.putBoolean("isAutoLaunchAllowed", k.i());
        writableNativeMap.putBoolean("isRunningLimitedPushService", k.j(reactApplicationContext));
        promise.resolve(writableNativeMap);
    }

    @ReactMethod
    public void refreshToken() {
        startPushIntentService("doManualRefresh");
    }

    @ReactMethod
    void removeAllDeliveredNotifications() {
        ij0.c.g(getReactApplicationContext().getApplicationContext()).f();
    }

    @ReactMethod
    void revokePushToken() {
        k.k(getReactApplicationContext());
    }

    @ReactMethod
    public void setCategories(ReadableArray readableArray) {
    }

    @ReactMethod
    void setNotificationChannel(ReadableMap readableMap) {
        hj0.d.d(getReactApplicationContext().getApplicationContext(), Arguments.toBundle(readableMap)).a();
    }

    protected void startPushIntentService(@NonNull String str) {
        k.r(getReactApplicationContext().getApplicationContext(), str);
    }

    @ReactMethod
    void updateAutoLaunchPermission(boolean z11) {
        k.s(z11);
    }
}
