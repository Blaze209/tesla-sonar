package je0;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelUuid;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.bridge.ReactApplicationContext;
import ie0.c0;
import java.util.Arrays;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.l0;
import p013kotlin.jvm.internal.n0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.t0;
import p013kotlin.text.t;
import wn0.p;
import wn0.q;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 &2\u00020\u0001:\u0001\u0013B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007JG\u0010\u0011\u001a\u00020\u000e2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2 \u0010\u0010\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u000e0\fj\u0002`\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR<\u0010%\u001a(\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\"\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u000e\u0018\u00010!j\u0004\u0018\u0001`#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010$¨\u0006'"}, d2 = {"Lje0/k;", "", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "Landroid/bluetooth/BluetoothAdapter;", "bluetoothAdapter", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Landroid/bluetooth/BluetoothAdapter;)V", "", "expectedDeviceName", "", "quickScan", "Lkotlin/Function2;", "Landroid/bluetooth/BluetoothDevice;", "Ljn0/h0;", "Lcom/tesla/utils/energy/OnScanCallback;", "onResult", "e", "(Ljava/lang/String;ZLwn0/p;)V", "a", "Landroid/bluetooth/BluetoothAdapter;", "Landroid/content/Context;", "b", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/bluetooth/le/BluetoothLeScanner;", "c", "Landroid/bluetooth/le/BluetoothLeScanner;", "bluetoothLeScanner", "Landroid/bluetooth/BluetoothManager;", DateTokenConverter.CONVERTER_KEY, "Landroid/bluetooth/BluetoothManager;", "bluetoothManager", "Lkotlin/Function3;", "Landroid/bluetooth/le/ScanCallback;", "Lcom/tesla/utils/energy/OnScanPeripheralCallback;", "Lwn0/q;", "onScanCallback", "f", "utils_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final BluetoothAdapter bluetoothAdapter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final BluetoothLeScanner bluetoothLeScanner;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final BluetoothManager bluetoothManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private q<? super BluetoothDevice, ? super ScanCallback, ? super String, h0> onScanCallback;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"je0/k$b", "Landroid/bluetooth/le/ScanCallback;", "", "callbackType", "Landroid/bluetooth/le/ScanResult;", "result", "Ljn0/h0;", "onScanResult", "(ILandroid/bluetooth/le/ScanResult;)V", "utils_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends ScanCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f83649b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f83650c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ n0<BluetoothDevice> f83651d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ l0 f83652e;

        b(String str, boolean z11, n0<BluetoothDevice> n0Var, l0 l0Var) {
            this.f83649b = str;
            this.f83650c = z11;
            this.f83651d = n0Var;
            this.f83652e = l0Var;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [T, android.bluetooth.BluetoothDevice] */
        /* JADX WARN: Type inference failed for: r0v6, types: [T, android.bluetooth.BluetoothDevice] */
        @Override // android.bluetooth.le.ScanCallback
        public void onScanResult(int callbackType, ScanResult result) {
            q qVar;
            s.k(result, "result");
            if (!c0.c(k.this.context)) {
                q qVar2 = k.this.onScanCallback;
                if (qVar2 != null) {
                    qVar2.invoke(null, this, "ERROR_MISSING_PERMISSION");
                    return;
                }
                return;
            }
            BluetoothDevice device = result.getDevice();
            String strA = device != null ? l.a(device) : null;
            if (strA != null) {
                com.tesla.logging.g gVarB = l.b();
                t0 t0Var = t0.f86535a;
                String str = String.format("Found device: %s", Arrays.copyOf(new Object[]{strA}, 1));
                s.j(str, "format(...)");
                gVarB.j(str);
                String str2 = this.f83649b;
                if (str2 != null && str2.length() != 0) {
                    if (!s.f(strA, this.f83649b) || (qVar = k.this.onScanCallback) == null) {
                        return;
                    }
                    qVar.invoke(result.getDevice(), this, null);
                    return;
                }
                if (t.h0(strA, "--", false, 2, null) || (!this.f83650c && s.f(strA, "Tesla Powerwall 3"))) {
                    com.tesla.logging.g gVarB2 = l.b();
                    String str3 = String.format("Found candidate device: %s with rssi: %s", Arrays.copyOf(new Object[]{strA, Integer.valueOf(result.getRssi())}, 2));
                    s.j(str3, "format(...)");
                    gVarB2.j(str3);
                    if (this.f83650c) {
                        q qVar3 = k.this.onScanCallback;
                        if (qVar3 != null) {
                            qVar3.invoke(result.getDevice(), this, null);
                            return;
                        }
                        return;
                    }
                    if (this.f83651d.f86529a == null) {
                        l.b().j("Initializing strongest BLE device");
                        this.f83651d.f86529a = result.getDevice();
                        this.f83652e.f86527a = result.getRssi();
                    } else if (result.getRssi() > this.f83652e.f86527a) {
                        l.b().j("Found a stronger BLE device");
                        this.f83651d.f86529a = result.getDevice();
                        this.f83652e.f86527a = result.getRssi();
                    }
                }
            }
        }
    }

    public k(ReactApplicationContext reactContext, BluetoothAdapter bluetoothAdapter) {
        s.k(reactContext, "reactContext");
        this.bluetoothAdapter = bluetoothAdapter;
        Context applicationContext = reactContext.getApplicationContext();
        s.j(applicationContext, "getApplicationContext(...)");
        this.context = applicationContext;
        this.bluetoothLeScanner = bluetoothAdapter != null ? bluetoothAdapter.getBluetoothLeScanner() : null;
        this.bluetoothManager = (BluetoothManager) reactContext.getSystemService("bluetooth");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 f(p pVar, k kVar, BluetoothAdapter bluetoothAdapter, BluetoothDevice bluetoothDevice, ScanCallback scanCallback, String str) {
        BluetoothLeScanner bluetoothLeScanner;
        pVar.invoke(bluetoothDevice, str);
        kVar.onScanCallback = null;
        if (bluetoothAdapter.isDiscovering()) {
            bluetoothAdapter.cancelDiscovery();
        }
        if (scanCallback != null && (bluetoothLeScanner = kVar.bluetoothLeScanner) != null) {
            bluetoothLeScanner.stopScan(scanCallback);
        }
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(n0 n0Var, k kVar, ScanCallback scanCallback) {
        Object obj = n0Var.f86529a;
        if (obj == null) {
            q<? super BluetoothDevice, ? super ScanCallback, ? super String, h0> qVar = kVar.onScanCallback;
            if (qVar != null) {
                qVar.invoke(null, scanCallback, "ERROR_SCAN_TIMEOUT");
                return;
            }
            return;
        }
        q<? super BluetoothDevice, ? super ScanCallback, ? super String, h0> qVar2 = kVar.onScanCallback;
        if (qVar2 != null) {
            qVar2.invoke(obj, scanCallback, null);
        }
    }

    @SuppressLint({"MissingPermission"})
    public final void e(String expectedDeviceName, boolean quickScan, final p<? super BluetoothDevice, ? super String, h0> onResult) {
        s.k(onResult, "onResult");
        l.b().j("Start scanning for " + expectedDeviceName + ", quickScan " + quickScan);
        if (!c0.c(this.context) || !c0.b(this.context)) {
            onResult.invoke(null, "ERROR_MISSING_PERMISSION");
            return;
        }
        final BluetoothAdapter bluetoothAdapter = this.bluetoothAdapter;
        if (bluetoothAdapter == null) {
            onResult.invoke(null, "ERROR_NO_BLUETOOTH_ADAPTER");
            return;
        }
        BluetoothManager bluetoothManager = this.bluetoothManager;
        if (bluetoothManager == null) {
            onResult.invoke(null, "ERROR_NO_BLUETOOTH_MANAGER");
            return;
        }
        if (!bluetoothAdapter.isDiscovering()) {
            bluetoothAdapter.startDiscovery();
        }
        this.onScanCallback = new q() { // from class: je0.i
            @Override // wn0.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return k.f(onResult, this, bluetoothAdapter, (BluetoothDevice) obj, (ScanCallback) obj2, (String) obj3);
            }
        };
        for (BluetoothDevice bluetoothDevice : bluetoothManager.getConnectedDevices(8)) {
            if (expectedDeviceName == null || expectedDeviceName.length() == 0) {
                ParcelUuid[] uuids = bluetoothDevice.getUuids();
                if (uuids != null) {
                    for (ParcelUuid parcelUuid : uuids) {
                        if (s.f(parcelUuid.toString(), "11110001-877a-45e8-b807-29775c6a0bb3")) {
                            l.b().j("Found already connected PW3 device");
                            q<? super BluetoothDevice, ? super ScanCallback, ? super String, h0> qVar = this.onScanCallback;
                            if (qVar != null) {
                                qVar.invoke(bluetoothDevice, null, null);
                                return;
                            }
                            return;
                        }
                    }
                } else {
                    continue;
                }
            } else {
                s.h(bluetoothDevice);
                if (s.f(expectedDeviceName, l.a(bluetoothDevice))) {
                    l.b().j("Found already connected PW3 device with specific name");
                    q<? super BluetoothDevice, ? super ScanCallback, ? super String, h0> qVar2 = this.onScanCallback;
                    if (qVar2 != null) {
                        qVar2.invoke(bluetoothDevice, null, null);
                        return;
                    }
                    return;
                }
            }
        }
        final n0 n0Var = new n0();
        l0 l0Var = new l0();
        l0Var.f86527a = Integer.MIN_VALUE;
        final b bVar = new b(expectedDeviceName, quickScan, n0Var, l0Var);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: je0.j
            @Override // java.lang.Runnable
            public final void run() {
                k.g(n0Var, this, bVar);
            }
        }, 10000L);
        ScanFilter scanFilterBuild = new ScanFilter.Builder().setServiceUuid(ParcelUuid.fromString("11110001-877a-45e8-b807-29775c6a0bb3")).build();
        ScanSettings scanSettingsBuild = new ScanSettings.Builder().setScanMode(2).build();
        BluetoothLeScanner bluetoothLeScanner = this.bluetoothLeScanner;
        if (bluetoothLeScanner != null) {
            bluetoothLeScanner.startScan(v.s(scanFilterBuild), scanSettingsBuild, bVar);
        }
    }
}
