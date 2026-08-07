package com.tesla.TeslaV4.reactnative.module;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.Intent;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseActivityEventListener;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.util.Arrays;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000]\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0006*\u0001)\u0018\u0000 ,2\u00020\u0001:\u0001-B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0013\u0010\rJ\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0014\u0010\rJ\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0015\u0010\rJ\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0016\u0010\rR\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R&\u0010'\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u000b\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006."}, d2 = {"Lcom/tesla/TeslaV4/reactnative/module/EnergyBleModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Ljn0/h0;", "enableBluetooth", "(Lcom/facebook/react/bridge/Promise;)V", "openBluetoothSettings", "()V", "din", "scanForEnergyPeripheral", "(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "quickScanForEnergyPeripheral", "connectToPeripheral", "readCharacteristicsForEnergyAccessPointCredentials", "disconnectFromPeripheral", "Landroid/bluetooth/BluetoothManager;", "bluetoothManager", "Landroid/bluetooth/BluetoothManager;", "Landroid/bluetooth/BluetoothAdapter;", "bluetoothAdapter", "Landroid/bluetooth/BluetoothAdapter;", "Lje0/k;", "deviceScanner", "Lje0/k;", "Lje0/g;", "deviceBleConnector", "Lje0/g;", "Landroid/bluetooth/BluetoothDevice;", "bluetoothDevice", "Landroid/bluetooth/BluetoothDevice;", "Lkotlin/Function1;", "bluetoothCallback", "Lwn0/l;", "com/tesla/TeslaV4/reactnative/module/EnergyBleModule$b", "activityEventListener", "Lcom/tesla/TeslaV4/reactnative/module/EnergyBleModule$b;", "Companion", "a", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EnergyBleModule extends ReactContextBaseJavaModule {
    public static final int BLUETOOTH_ADAPTER_CODE = 50;
    public static final int BLUETOOTH_SETTINGS_CODE = 51;
    public static final String ERROR_NO_PERIPHERAL_TO_CONNECT = "ERROR_NO_PERIPHERAL_TO_CONNECT";
    public static final String ERROR_USER_DENIED = "ERROR_USER_DENIED";
    private final b activityEventListener;
    private final BluetoothAdapter bluetoothAdapter;
    private wn0.l<? super String, jn0.h0> bluetoothCallback;
    private BluetoothDevice bluetoothDevice;
    private final BluetoothManager bluetoothManager;
    private final je0.g deviceBleConnector;
    private final je0.k deviceScanner;

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"com/tesla/TeslaV4/reactnative/module/EnergyBleModule$b", "Lcom/facebook/react/bridge/BaseActivityEventListener;", "Landroid/app/Activity;", "activity", "", "requestCode", StatusResponse.RESULT_CODE, "Landroid/content/Intent;", "data", "Ljn0/h0;", "onActivityResult", "(Landroid/app/Activity;IILandroid/content/Intent;)V", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends BaseActivityEventListener {
        b() {
        }

        @Override // com.facebook.react.bridge.BaseActivityEventListener, com.facebook.react.bridge.ActivityEventListener
        public void onActivityResult(Activity activity, int requestCode, int resultCode, Intent data) {
            if (requestCode == 50) {
                String str = resultCode != -1 ? EnergyBleModule.ERROR_USER_DENIED : null;
                com.tesla.logging.g gVarB = je0.l.b();
                t0 t0Var = t0.f86535a;
                String str2 = String.format("User %s bluetooth with result: %s", Arrays.copyOf(new Object[]{resultCode == -1 ? "accepted" : "denied", Integer.valueOf(resultCode)}, 2));
                p013kotlin.jvm.internal.s.j(str2, "format(...)");
                gVarB.j(str2);
                wn0.l lVar = EnergyBleModule.this.bluetoothCallback;
                if (lVar != null) {
                    lVar.invoke(str);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnergyBleModule(ReactApplicationContext reactContext) {
        super(reactContext);
        p013kotlin.jvm.internal.s.k(reactContext, "reactContext");
        BluetoothManager bluetoothManager = (BluetoothManager) reactContext.getSystemService("bluetooth");
        this.bluetoothManager = bluetoothManager;
        BluetoothAdapter adapter = bluetoothManager != null ? bluetoothManager.getAdapter() : null;
        this.bluetoothAdapter = adapter;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        p013kotlin.jvm.internal.s.j(reactApplicationContext, "getReactApplicationContext(...)");
        this.deviceScanner = new je0.k(reactApplicationContext, adapter);
        ReactApplicationContext reactApplicationContext2 = getReactApplicationContext();
        p013kotlin.jvm.internal.s.j(reactApplicationContext2, "getReactApplicationContext(...)");
        this.deviceBleConnector = new je0.g(reactApplicationContext2);
        b bVar = new b();
        this.activityEventListener = bVar;
        getReactApplicationContext().addActivityEventListener(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 connectToPeripheral$lambda$9$lambda$8(Promise promise, String str) {
        if (str != null && str.length() != 0) {
            com.tesla.logging.g gVarB = je0.l.b();
            t0 t0Var = t0.f86535a;
            String str2 = String.format("Connect to ble device, error: %s", Arrays.copyOf(new Object[]{str}, 1));
            p013kotlin.jvm.internal.s.j(str2, "format(...)");
            gVarB.n(str2);
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString(AnalyticsAttribute.Error, str);
        promise.resolve(writableMapCreateMap);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 disconnectFromPeripheral$lambda$15(Promise promise, String str) {
        if (str != null && str.length() != 0) {
            com.tesla.logging.g gVarB = je0.l.b();
            t0 t0Var = t0.f86535a;
            String str2 = String.format("Disconnecting from ble device, error: %s", Arrays.copyOf(new Object[]{str}, 1));
            p013kotlin.jvm.internal.s.j(str2, "format(...)");
            gVarB.n(str2);
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString(AnalyticsAttribute.Error, str);
        promise.resolve(writableMapCreateMap);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 enableBluetooth$lambda$1(Promise promise, String str) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString(AnalyticsAttribute.Error, str);
        promise.resolve(writableMapCreateMap);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 quickScanForEnergyPeripheral$lambda$6(EnergyBleModule energyBleModule, Promise promise, BluetoothDevice bluetoothDevice, String str) {
        String strA;
        energyBleModule.bluetoothDevice = bluetoothDevice;
        if (bluetoothDevice == null || (strA = je0.l.a(bluetoothDevice)) == null) {
            strA = "";
        }
        if (str != null && str.length() != 0) {
            com.tesla.logging.g gVarB = je0.l.b();
            t0 t0Var = t0.f86535a;
            String str2 = String.format("Quick scan for ble devices, error: %s", Arrays.copyOf(new Object[]{str}, 1));
            p013kotlin.jvm.internal.s.j(str2, "format(...)");
            gVarB.n(str2);
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("name", strA);
        writableMapCreateMap.putString(AnalyticsAttribute.Error, str);
        promise.resolve(writableMapCreateMap);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 readCharacteristicsForEnergyAccessPointCredentials$lambda$13(Promise promise, String str, String str2, String str3) {
        if (str3 != null && str3.length() != 0) {
            com.tesla.logging.g gVarB = je0.l.b();
            t0 t0Var = t0.f86535a;
            String str4 = String.format("Reading ble characteristics, error: %s", Arrays.copyOf(new Object[]{str3}, 1));
            p013kotlin.jvm.internal.s.j(str4, "format(...)");
            gVarB.n(str4);
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString(AnalyticsAttribute.Error, str3);
        writableMapCreateMap.putString("ssid", str);
        writableMapCreateMap.putString("password", str2);
        promise.resolve(writableMapCreateMap);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 scanForEnergyPeripheral$lambda$4(EnergyBleModule energyBleModule, Promise promise, BluetoothDevice bluetoothDevice, String str) {
        String strA;
        energyBleModule.bluetoothDevice = bluetoothDevice;
        if (bluetoothDevice == null || (strA = je0.l.a(bluetoothDevice)) == null) {
            strA = "";
        }
        if (str != null && str.length() != 0) {
            com.tesla.logging.g gVarB = je0.l.b();
            t0 t0Var = t0.f86535a;
            String str2 = String.format("Scanning for ble devices, error: %s", Arrays.copyOf(new Object[]{str}, 1));
            p013kotlin.jvm.internal.s.j(str2, "format(...)");
            gVarB.n(str2);
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("name", strA);
        writableMapCreateMap.putString(AnalyticsAttribute.Error, str);
        promise.resolve(writableMapCreateMap);
        return jn0.h0.f84049a;
    }

    @ReactMethod
    public final void connectToPeripheral(final Promise promise) {
        p013kotlin.jvm.internal.s.k(promise, "promise");
        BluetoothDevice bluetoothDevice = this.bluetoothDevice;
        if (bluetoothDevice != null) {
            this.deviceBleConnector.u(bluetoothDevice, new wn0.l() { // from class: com.tesla.TeslaV4.reactnative.module.d
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return EnergyBleModule.connectToPeripheral$lambda$9$lambda$8(promise, (String) obj);
                }
            });
            return;
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        com.tesla.logging.g gVarB = je0.l.b();
        t0 t0Var = t0.f86535a;
        String str = String.format("Connect to ble device, error: %s", Arrays.copyOf(new Object[]{ERROR_NO_PERIPHERAL_TO_CONNECT}, 1));
        p013kotlin.jvm.internal.s.j(str, "format(...)");
        gVarB.n(str);
        writableMapCreateMap.putString(AnalyticsAttribute.Error, ERROR_NO_PERIPHERAL_TO_CONNECT);
        promise.resolve(writableMapCreateMap);
    }

    @ReactMethod
    public final void disconnectFromPeripheral(final Promise promise) {
        p013kotlin.jvm.internal.s.k(promise, "promise");
        this.deviceBleConnector.x(new wn0.l() { // from class: com.tesla.TeslaV4.reactnative.module.g
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return EnergyBleModule.disconnectFromPeripheral$lambda$15(promise, (String) obj);
            }
        });
    }

    @ReactMethod
    public final void enableBluetooth(final Promise promise) {
        p013kotlin.jvm.internal.s.k(promise, "promise");
        this.bluetoothCallback = new wn0.l() { // from class: com.tesla.TeslaV4.reactnative.module.c
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return EnergyBleModule.enableBluetooth$lambda$1(promise, (String) obj);
            }
        };
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        p013kotlin.jvm.internal.s.j(reactApplicationContext, "getReactApplicationContext(...)");
        if (!ie0.c0.b(reactApplicationContext)) {
            wn0.l<? super String, jn0.h0> lVar = this.bluetoothCallback;
            if (lVar != null) {
                lVar.invoke("ERROR_MISSING_PERMISSION");
                return;
            }
            return;
        }
        BluetoothAdapter bluetoothAdapter = this.bluetoothAdapter;
        if (bluetoothAdapter == null || bluetoothAdapter.isEnabled()) {
            return;
        }
        getReactApplicationContext().startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 50, null);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "EnergyBleModule";
    }

    @ReactMethod
    public final void openBluetoothSettings() {
        getReactApplicationContext().startActivityForResult(new Intent("android.settings.BLUETOOTH_SETTINGS"), 51, null);
    }

    @ReactMethod
    public final void quickScanForEnergyPeripheral(final Promise promise) {
        p013kotlin.jvm.internal.s.k(promise, "promise");
        this.bluetoothDevice = null;
        this.deviceScanner.e("", true, new wn0.p() { // from class: com.tesla.TeslaV4.reactnative.module.f
            @Override // wn0.p
            public final Object invoke(Object obj, Object obj2) {
                return EnergyBleModule.quickScanForEnergyPeripheral$lambda$6(this.f55688a, promise, (BluetoothDevice) obj, (String) obj2);
            }
        });
    }

    @ReactMethod
    public final void readCharacteristicsForEnergyAccessPointCredentials(final Promise promise) {
        p013kotlin.jvm.internal.s.k(promise, "promise");
        this.deviceBleConnector.A(new wn0.q() { // from class: com.tesla.TeslaV4.reactnative.module.e
            @Override // wn0.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return EnergyBleModule.readCharacteristicsForEnergyAccessPointCredentials$lambda$13(promise, (String) obj, (String) obj2, (String) obj3);
            }
        });
    }

    @ReactMethod
    public final void scanForEnergyPeripheral(String din, final Promise promise) {
        p013kotlin.jvm.internal.s.k(promise, "promise");
        this.bluetoothDevice = null;
        this.deviceScanner.e(din, false, new wn0.p() { // from class: com.tesla.TeslaV4.reactnative.module.b
            @Override // wn0.p
            public final Object invoke(Object obj, Object obj2) {
                return EnergyBleModule.scanForEnergyPeripheral$lambda$4(this.f55671a, promise, (BluetoothDevice) obj, (String) obj2);
            }
        });
    }
}
