package com.teslamotors.plugins.ble;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableNativeMap;

/* JADX INFO: loaded from: classes8.dex */
public class BLEModule extends ReactContextBaseJavaModule implements ActivityEventListener {
    private static final String TAG = "BLEModule";
    private static final com.tesla.logging.g logger = com.tesla.logging.g.h(TAG);
    private i bleModuleHelper;
    private final int bluetoothAdapterCode;
    private volatile Promise bluetoothPromise;
    private final Context context;

    public BLEModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.bluetoothAdapterCode = 9876;
        this.bluetoothPromise = null;
        this.context = reactApplicationContext.getApplicationContext();
        reactApplicationContext.addActivityEventListener(this);
    }

    @ReactMethod
    private void currentBLEBootReceiverState(Promise promise) {
        String str;
        int componentEnabledSetting = this.context.getPackageManager().getComponentEnabledSetting(new ComponentName(this.context, (Class<?>) BLEBootReceiver.class));
        if (componentEnabledSetting == 0) {
            str = "default";
        } else if (componentEnabledSetting == 1) {
            str = "enabled";
        } else if (componentEnabledSetting == 2) {
            str = "disabled";
        } else if (componentEnabledSetting != 3) {
            str = componentEnabledSetting != 4 ? "unknown" : "disabled until used";
        } else {
            str = "disabled user";
        }
        promise.resolve(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$actionInAppEnableBluetooth$0(Activity activity, Intent intent) {
        activity.startActivityForResult(intent, 9876);
    }

    @ReactMethod
    public void actionInAppEnableBluetooth(Promise promise) {
        if (!this.bleModuleHelper.J()) {
            this.bluetoothPromise = promise;
            final Intent intent = new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE");
            final Activity currentActivity = getReactApplicationContext().getCurrentActivity();
            currentActivity.runOnUiThread(new Runnable() { // from class: com.teslamotors.plugins.ble.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f56741a.lambda$actionInAppEnableBluetooth$0(currentActivity, intent);
                }
            });
            return;
        }
        if (ie0.c0.b(this.context)) {
            logger.j("Bluetooth already enabled and both BLUETOOTH_CONNECT/BLUETOOTH_SCAN have been granted");
            if (promise != null) {
                promise.resolve(Boolean.TRUE);
                return;
            }
            return;
        }
        logger.j("Bluetooth already enabled, but BLUETOOTH_CONNECT or BLUETOOTH_SCAN wasn't granted");
        if (promise != null) {
            promise.resolve(Boolean.FALSE);
        }
    }

    @ReactMethod
    public void actionToConnectionPreferences() {
        if (getCurrentActivity() != null) {
            ie0.j.f77587a.a(getCurrentActivity());
        }
    }

    @ReactMethod
    public void clearPeripherals(String str, String str2, Promise promise) {
        this.bleModuleHelper.u(str, str2, promise);
    }

    @ReactMethod
    public void deleteRSAKeyPair(String str, Promise promise) {
        this.bleModuleHelper.w(str, promise);
    }

    @ReactMethod
    public void getBTLocalName(Promise promise) {
        if (ie0.c0.a(this.context)) {
            promise.resolve(this.bleModuleHelper.A());
        }
        promise.reject("Permission Denied", "Can't get BTLocalName");
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "TMBLE";
    }

    @ReactMethod
    public void getPhoneKeySettingState(String str, Promise promise) {
        rd0.j jVarC = rd0.i.c(str);
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("state", jVarC.getValue());
        promise.resolve(writableNativeMap);
    }

    @ReactMethod
    public void getStatus(String str, Promise promise) {
        this.bleModuleHelper.F(str, promise);
    }

    @ReactMethod
    public void getTokenForKey(String str, Promise promise) {
        this.bleModuleHelper.G(str, promise);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        this.bleModuleHelper = i.B(getReactApplicationContext(), "from react module, BLEModule#initialize()");
    }

    @ReactMethod
    public void loadRSAKeyPair(String str, Promise promise) throws Throwable {
        this.bleModuleHelper.P(str, promise);
    }

    @ReactMethod
    public void markEventSubscriptionsReady(boolean z11) {
        this.bleModuleHelper.S(z11);
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i11, int i12, Intent intent) {
        if (i11 == 9876) {
            com.tesla.logging.g gVar = logger;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("enable bluetooth with result: ");
            sb2.append(i12 == -1 ? "successfully" : "failed");
            gVar.j(sb2.toString());
            if (this.bluetoothPromise == null) {
                return;
            }
            this.bluetoothPromise.resolve(Boolean.valueOf(i12 == -1));
            this.bluetoothPromise = null;
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.bleModuleHelper.X();
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }

    @ReactMethod
    public void recentlySelectedVINs(Promise promise) {
        this.bleModuleHelper.h0(promise);
    }

    @ReactMethod
    public void requestMTU() {
        this.bleModuleHelper.i0();
    }

    @ReactMethod
    public void resetCommandPeripheral() {
        this.bleModuleHelper.j0();
    }

    @ReactMethod
    public void restartService(String str, String str2, String str3, ReadableArray readableArray, Promise promise) {
        i.B(this.context, "from ReactMethod: BLEModule#restartService").k0(str, str2, str3, readableArray, promise);
    }

    @ReactMethod
    public void scanForPeripherals(String str, boolean z11, boolean z12, int i11, boolean z13, Promise promise) throws Throwable {
        this.bleModuleHelper.m0(str, z11, i11, z13, promise);
    }

    @ReactMethod
    public void sendUpkeepUsername(String str, String str2, Promise promise) {
        com.tesla.logging.g gVar = logger;
        gVar.j("sendUpkeepUsername called via BLEService");
        if (str == null || str.isEmpty()) {
            promise.reject("INVALID_VIN", "VIN is required");
            return;
        }
        if (str2 == null || str2.isEmpty()) {
            promise.reject("INVALID_USERNAME", "Username is required");
            return;
        }
        byte[] bArrA = g1.a(str2);
        if (bArrA == null) {
            promise.reject("MESSAGE_BUILD_ERROR", "Failed to build RoutableMessage");
            return;
        }
        xc0.b bVar = i.f56887y.get(str);
        if (bVar == null || !bVar.getPhone_key_connected()) {
            promise.reject("NOT_CONNECTED", "BLE not connected to vehicle");
            return;
        }
        gVar.j("sendUpkeepUsername: sending " + bArrA.length + " bytes for VIN " + str);
        y.a.TransmissionError.b bVarS0 = this.bleModuleHelper.s0(str, bArrA);
        if (bVarS0 == null) {
            gVar.j("sendUpkeepUsername: transmission succeeded");
            promise.resolve(Boolean.TRUE);
            return;
        }
        gVar.c("sendUpkeepUsername: transmission failed: " + bVarS0);
        promise.reject("TRANSMISSION_ERROR", "Failed to send: " + bVarS0);
    }

    @ReactMethod
    public void serviceBound(Promise promise) {
        promise.resolve(Boolean.valueOf(i.B(this.context, "from ReactMethod: BLEModule#serviceBound").K()));
    }

    @ReactMethod
    public void serviceStarted(Promise promise) {
        promise.resolve(Boolean.valueOf(i.B(this.context, "from ReactMethod: BLEModule#serviceStarted").L()));
    }

    @ReactMethod
    public void setAccountEmail(String str) throws Throwable {
        this.bleModuleHelper.t0(str);
    }

    @ReactMethod
    public void setPhoneKeySettingState(String str, String str2) {
        rd0.j jVarFrom = rd0.j.from(str2);
        rd0.i.f(str, jVarFrom);
        this.bleModuleHelper.U(str, jVarFrom == rd0.j.Enabled);
    }

    @ReactMethod
    public void setSelectedVIN(String str, String str2, ReadableArray readableArray) {
        this.bleModuleHelper.u0(str, str2, readableArray);
    }

    @ReactMethod
    public void setStayConnectedWhenUnauthorized(String str, boolean z11) {
        this.bleModuleHelper.v0(str, z11);
    }

    @ReactMethod
    public void startScanPeripheralsInSharedFleet() {
        this.bleModuleHelper.x0();
    }

    @ReactMethod
    public void startService(String str, String str2, String str3, ReadableArray readableArray, Promise promise) {
        this.bleModuleHelper.y0(str, str2, str3, readableArray, promise);
    }

    @ReactMethod
    public void stopScanPeripheralsInSharedFleet() {
        this.bleModuleHelper.B0();
    }

    @ReactMethod
    public void storeRSAKeyPair(String str, String str2, String str3, Promise promise) throws Throwable {
        this.bleModuleHelper.D0(str, str2, str3, promise);
    }

    @ReactMethod
    public void updateBackgroundPermission(boolean z11) {
        this.bleModuleHelper.F0(z11);
    }
}
