package com.teslamotors.plugins.ble;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.ParcelUuid;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.tesla.features.FeaturesConfig;
import com.tesla.widget.WidgetBleUpdateReceiver;
import com.teslamotors.plugins.ble.messages.ClearPeripheralInfo;
import com.teslamotors.plugins.ble.messages.NfcSwipeStatus;
import com.teslamotors.plugins.ble.messages.NonUserFeedback;
import df0.ToVCSECMessageResult;
import hf0.BLESharedFleetFilteredPeripherals;
import hf0.BLESharedFleetPeripheral;
import hf0.JsBridgeEvent;
import hf0.PhoneKeyLog;
import hf0.VehicleStatusWithUpdateFlag;
import j$.util.stream.Stream$EL;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;
import vc0.d2;
import vc0.e3;
import vc0.f2;
import vc0.g2;
import vc0.v2;

/* JADX INFO: loaded from: classes8.dex */
public class BLEService extends Service implements SensorEventListener {
    private static final com.tesla.logging.g Z = com.tesla.logging.g.h("BLEService");

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final ScanSettings f56636a0 = new ScanSettings.Builder().setScanMode(2).build();

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final ScanSettings f56637b0 = new ScanSettings.Builder().setCallbackType(1).setReportDelay(100).setScanMode(2).build();
    private boolean A;
    private boolean B;
    private boolean C;
    private mb0.a M;
    private a0.b O;
    private PendingIntent X;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private BluetoothManager f56643f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private BluetoothAdapter f56644g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile k f56645h;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f56653p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private hf0.m f56654q;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Peripheral f56658u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f56659v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f56660w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private ParcelUuid f56661x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f56662y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private BluetoothLeScanner f56663z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f56638a = new AtomicBoolean();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f56639b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f56640c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f56641d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f56642e = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private g0 f56646i = new s1();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map<String, g0> f56647j = new HashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f56648k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List<String> f56649l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f56650m = "";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private FeaturesConfig f56651n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f56652o = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ee0.a f56655r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final HashSet<String> f56656s = new HashSet<>();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final HashSet<String> f56657t = new HashSet<>();
    private HashMap<String, Integer> D = new HashMap<>();
    private int E = -120;
    private int F = 10;
    private List<BLESharedFleetPeripheral> G = new ArrayList();
    private Timer H = new Timer();
    protected rd0.h I = null;
    private final List<Messenger> J = Collections.synchronizedList(new ArrayList());
    private final List<j> K = Collections.synchronizedList(new ArrayList());
    final Messenger L = new Messenger(new i());
    private Long N = 0L;
    private final BroadcastReceiver P = new a();
    private am0.b Q = null;
    public h1 R = null;
    private final Runnable S = new c();
    private final Runnable T = new d();
    private final Runnable U = new e();
    private Runnable V = null;
    private final ScanCallback W = new f();
    private final ScanCallback Y = new g();

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            BLEService.Z.j("Received action: " + action);
            if (action == null) {
                BLEService.Z.c("Received null intent action!");
            }
            switch (action) {
                case "android.intent.action.SCREEN_OFF":
                    ff0.g.c(context);
                    break;
                case "android.bluetooth.adapter.action.STATE_CHANGED":
                    int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
                    BLEService.this.f56645h.removeCallbacks(BLEService.this.T);
                    HashMap map = new HashMap();
                    switch (intExtra) {
                        case 10:
                            map.put("value", "OFF");
                            break;
                        case 11:
                            map.put("value", "TURNING_ON");
                            break;
                        case 12:
                            map.put("value", "ON");
                            break;
                        case 13:
                            map.put("value", "TURNING_OFF");
                            break;
                    }
                    map.put("type", "mobile-telemetry-bluetooth-adapter-state-change");
                    map.put("state", String.valueOf(intExtra));
                    ud0.a.a(map, false, null);
                    switch (intExtra) {
                        case 10:
                            BLEService.this.N = 0L;
                            ef0.k.f62906a.c();
                            BLEService.this.f56645h.postDelayed(BLEService.this.T, DeviceOrientationRequest.OUTPUT_PERIOD_FAST);
                            for (String str : BLEService.this.f56649l) {
                                ff0.g.e(str, new ff0.m.a(d2.PERIPHERALSTATE_SNA));
                                ff0.g.e(str, new ff0.m.b(0));
                            }
                            break;
                        case 11:
                            BLEService.Z.j("Bluetooth adapter is turning ON");
                            break;
                        case 12:
                            BLEService.Z.j("Bluetooth adapter is ON");
                            BLEService.this.N = Long.valueOf(System.currentTimeMillis());
                            ef0.k.f62906a.d();
                            BLEService.this.z0(new a1(Boolean.TRUE));
                            BLEService.this.f56645h.postDelayed(BLEService.this.T, 100L);
                            break;
                    }
                    BLEService.Z.j(String.format("Bluetooth adapter is %sOFF", intExtra == 10 ? "" : "turning "));
                    BLEService.this.f1(false, "bluetooth_unavailable");
                    BLEService.this.A = false;
                    BLEService.this.z0(new c1());
                    break;
                case "android.intent.action.SCREEN_ON":
                    ff0.g.d(new ff0.k.d());
                    BLEService.this.v0();
                    break;
            }
        }
    }

    class b extends TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            BLEService.this.P0();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BLEService.Z.j(String.format("Timeout fired - stopping scan and %s results", BLEService.this.f56659v ? "saving" : "NOT saving"));
            BLEService bLEService = BLEService.this;
            bLEService.f1(bLEService.f56659v, null);
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Context applicationContext = BLEService.this.getApplicationContext();
            if (BLEService.this.f56644g != null && !BLEService.this.n0()) {
                BLEService bLEService = BLEService.this;
                if (z0.d(bLEService, bLEService.f56649l, BLEService.this.f56650m, BLEService.this.B)) {
                    if (BLEService.this.f56653p) {
                        BLEService.Z.j("BLE Service is in foreground. Notification Omitted");
                        return;
                    } else {
                        y0.k(applicationContext);
                        return;
                    }
                }
            }
            try {
                y0.a(applicationContext);
            } catch (Exception e11) {
                BLEService.Z.d("Failed to cancel BLE disabled notification", e11);
            }
        }
    }

    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - BLEService.this.f56642e <= 108000000) {
                return;
            }
            BLEService.this.f56642e = jCurrentTimeMillis;
            Context applicationContext = BLEService.this.getApplicationContext();
            BLEService.Z.j("Warn about bluetooth should cycle");
            if (BLEService.this.f56644g != null) {
                BLEService bLEService = BLEService.this;
                if (z0.d(bLEService, bLEService.f56649l, BLEService.this.f56650m, BLEService.this.B)) {
                    y0.m(applicationContext);
                    return;
                }
            }
            try {
                y0.b(applicationContext);
            } catch (Exception e11) {
                BLEService.Z.d("Failed to cancel cycle bluetooth warning notification", e11);
            }
        }
    }

    class f extends ScanCallback {
        f() {
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanFailed(int i11) {
            BLEService.Z.j(String.format("Scan Failed: %s", ie0.q0.h(i11)));
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanResult(int i11, ScanResult scanResult) {
            BLEService.this.i0(scanResult);
        }
    }

    class g extends ScanCallback {
        g() {
        }

        public static /* synthetic */ BLESharedFleetPeripheral a(Map.Entry entry) {
            return new BLESharedFleetPeripheral(((Integer) entry.getValue()).intValue(), (String) entry.getKey());
        }

        public static /* synthetic */ int b(BLESharedFleetPeripheral bLESharedFleetPeripheral, BLESharedFleetPeripheral bLESharedFleetPeripheral2) {
            return bLESharedFleetPeripheral2.getRssi() - bLESharedFleetPeripheral.getRssi();
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanFailed(int i11) {
            super.onScanFailed(i11);
            BLEService.Z.j(String.format("[Shared Fleet BT Scan] Scan Failed: %s", ie0.q0.h(i11)));
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanResult(int i11, ScanResult scanResult) {
            List<ParcelUuid> serviceUuids;
            super.onScanResult(i11, scanResult);
            if (BLEService.this.C) {
                BluetoothDevice device = scanResult.getDevice();
                ScanRecord scanRecord = scanResult.getScanRecord();
                if (scanRecord == null || (serviceUuids = scanRecord.getServiceUuids()) == null || !serviceUuids.contains(com.teslamotors.plugins.ble.a.f56699c)) {
                    return;
                }
                try {
                    if (!ie0.c0.a(BLEService.this)) {
                        BLEService.Z.j("[Shared Fleet BT Scan] BLUETOOTH_CONNECT permission is not granted, can not process scan result");
                        return;
                    }
                    int rssi = scanResult.getRssi();
                    String name = device.getName();
                    if (name != null && !name.isEmpty()) {
                        BLEService.Z.j("[Shared Fleet BT Scan] onScanResult localName: " + name + " rssi: " + rssi);
                        if (BLEService.this.D.containsKey(name)) {
                            Integer num = (Integer) BLEService.this.D.get(name);
                            if (num == null) {
                                BLEService.Z.c("[Shared Fleet BT Scan] peripheral already exists, but oldRSSI is null for " + name);
                                return;
                            }
                            if (Math.abs(num.intValue() - rssi) >= BLEService.this.F) {
                                if (rssi >= BLEService.this.E) {
                                    BLEService.this.D.put(name, Integer.valueOf(rssi));
                                } else {
                                    BLEService.this.D.remove(name);
                                }
                            }
                        } else if (rssi >= BLEService.this.E) {
                            BLEService.this.D.put(name, Integer.valueOf(rssi));
                        }
                        BLEService bLEService = BLEService.this;
                        bLEService.G = Stream$EL.toList(bLEService.D.entrySet().stream().map(new Function() { // from class: com.teslamotors.plugins.ble.q
                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return BLEService.g.a((Map.Entry) obj);
                            }
                        }).sorted(new Comparator() { // from class: com.teslamotors.plugins.ble.r
                            @Override // java.util.Comparator
                            public final int compare(Object obj, Object obj2) {
                                return BLEService.g.b((BLESharedFleetPeripheral) obj, (BLESharedFleetPeripheral) obj2);
                            }
                        }).limit(10L));
                        BLEService.Z.j("[Shared Fleet BT Scan] filteredPeripherals: " + BLEService.this.G);
                        return;
                    }
                    BLEService.Z.j("[Shared Fleet BT Scan] onScanResult localName is null or empty, skipping peripheral");
                } catch (Throwable th2) {
                    BLEService.Z.d("[Shared Fleet BT Scan] error happens when add peripheral", th2);
                }
            }
        }
    }

    static /* synthetic */ class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f56671a;

        static {
            int[] iArr = new int[hf0.f.values().length];
            f56671a = iArr;
            try {
                iArr[hf0.f.ScanForPeripherals.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f56671a[hf0.f.GetStatus.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f56671a[hf0.f.SetVin.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f56671a[hf0.f.SetAccountEmail.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f56671a[hf0.f.Register.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f56671a[hf0.f.Unregister.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f56671a[hf0.f.SetEventSubscriptionsReady.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f56671a[hf0.f.AppForegrounded.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f56671a[hf0.f.AppBackgrounded.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f56671a[hf0.f.NFCGetPublicKeyBytes.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f56671a[hf0.f.NFCEncryptWithSharedSecret.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f56671a[hf0.f.NFCProtoMessage.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f56671a[hf0.f.ClearPeripheral.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f56671a[hf0.f.SetConnectionBehaviorWhenUnauthorized.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f56671a[hf0.f.ResetPeripheral.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f56671a[hf0.f.RequestMTU.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f56671a[hf0.f.GetTokenForKey.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f56671a[hf0.f.WidgetFetchStatus.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f56671a[hf0.f.UpdateBackgroundServicePermission.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f56671a[hf0.f.SendRoutableData.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f56671a[hf0.f.SendReportServiceRequest.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f56671a[hf0.f.SendCommandRequest.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f56671a[hf0.f.StartScanPeripheralsInSharedFleet.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f56671a[hf0.f.StopScanPeripheralsInSharedFleet.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f56671a[hf0.f.UpdateVehicleConnectivityState.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f56671a[hf0.f.PhoneKeyLog.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f56671a[hf0.f.PhoneKeySettingChanged.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    class i extends Handler {
        i() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(ic0.g gVar) {
            BLEService.this.J0(hf0.f.ReceiveCommandResponse, gVar.encode());
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int iMyUid = Process.myUid();
            int i11 = message.sendingUid;
            if (i11 != iMyUid) {
                BLEService.Z.n("Rejecting Messenger IPC from foreign uid=" + i11 + " (expected " + iMyUid + "), what=" + message.what);
                return;
            }
            Bundle data = message.getData();
            data.setClassLoader(getClass().getClassLoader());
            vc0.w0 w0VarDecode = null;
            switch (h.f56671a[hf0.f.get(message.what).ordinal()]) {
                case 1:
                    hf0.f fVar = hf0.f.ScanForPeripherals;
                    boolean z11 = data.getBoolean(fVar.getKey2());
                    String str = (String) data.get(fVar.getKey());
                    if (z11 && BLEService.this.A && !BLEService.this.f56660w.equals(str)) {
                        BLEService.this.f1(false, null);
                    }
                    BLEService.this.A0(str, message.arg1 > 0, z11);
                    return;
                case 2:
                    BLEService.this.Q0(true, data.getString(hf0.f.GetStatus.getKey()));
                    return;
                case 3:
                    hf0.f fVar2 = hf0.f.SetVin;
                    ArrayList<String> stringArrayList = data.getStringArrayList(fVar2.getKey());
                    BLEService.this.V0(stringArrayList.get(0), stringArrayList.get(1), data.getStringArrayList(fVar2.getKey2()));
                    return;
                case 4:
                    BLEService.this.T0(data.getString(hf0.f.SetAccountEmail.getKey()));
                    return;
                case 5:
                    BLEService.this.w0(message.replyTo);
                    return;
                case 6:
                    BLEService.this.h1(message.replyTo);
                    return;
                case 7:
                    BLEService.this.U0(Boolean.valueOf(data.getBoolean(hf0.f.SetEventSubscriptionsReady.getKey())));
                    return;
                case 8:
                    BLEService.Z.j("APPLICATION FOREGROUNDED");
                    ie0.c.f77575a.f(BLEService.this);
                    if (!jf0.f.a(BLEService.this) && jf0.d.e(BLEService.this)) {
                        jf0.g.i(BLEService.this);
                    }
                    rd0.h hVar = BLEService.this.I;
                    if (hVar != null) {
                        hVar.f();
                        return;
                    }
                    return;
                case 9:
                    BLEService.Z.j("APPLICATION BACKGROUNDED");
                    ie0.c.f77575a.g(BLEService.this);
                    rd0.h hVar2 = BLEService.this.I;
                    if (hVar2 != null) {
                        hVar2.a();
                        return;
                    }
                    return;
                case 10:
                    Message messageObtain = Message.obtain();
                    hf0.f fVar3 = hf0.f.NFCGetPublicKeyBytesInfo;
                    messageObtain.what = fVar3.getWhat();
                    Bundle bundle = new Bundle();
                    hf0.i iVarH = BLEService.this.f56646i.h();
                    if (iVarH != null) {
                        bundle.putParcelable(fVar3.getKey(), iVarH);
                    } else {
                        BLEService.Z.j("on receiving NFCGetPublicKeyBytes, Pubkey is not ready yet");
                    }
                    messageObtain.setData(bundle);
                    try {
                        message.replyTo.send(messageObtain);
                        return;
                    } catch (RemoteException unused) {
                        BLEService.Z.j("Failed to send message to NFC client");
                        return;
                    }
                case 11:
                    ArrayList<String> stringArrayList2 = data.getStringArrayList(hf0.f.NFCEncryptWithSharedSecret.getKey());
                    byte[] bArrA = ie0.q0.a(stringArrayList2.get(0));
                    String str2 = stringArrayList2.get(1);
                    byte[] bArrA2 = ie0.q0.a(str2);
                    BLEService.Z.j("NFCEncryptWithSharedSecret vehiclePublicKey: " + str2);
                    Message messageObtain2 = Message.obtain();
                    hf0.f fVar4 = hf0.f.NFCEncryptWithSharedSecretResponse;
                    messageObtain2.what = fVar4.getWhat();
                    Bundle bundle2 = new Bundle();
                    hf0.d dVarA = BLEService.this.f56646i.a(bArrA, bArrA2);
                    if (dVarA != null) {
                        bundle2.putParcelable(fVar4.getKey(), dVarA);
                    } else {
                        BLEService.Z.j("on receiving NFCEncryptWithSharedSecret, shared secret is not ready yet");
                    }
                    messageObtain2.setData(bundle2);
                    try {
                        message.replyTo.send(messageObtain2);
                        break;
                    } catch (RemoteException unused2) {
                        BLEService.Z.j("Failed to send message to client; main app likely not running");
                    }
                    he0.b bVarM = he0.b.m(BLEService.this.getApplicationContext());
                    String strZ = bVarM.z(BLEService.this.f56648k);
                    if (strZ != null) {
                        BLEService.Z.j("Currently Selected VIN : " + ie0.q0.f(BLEService.this.f56648k));
                        if (strZ.equalsIgnoreCase(str2)) {
                            BLEService.Z.j("Not switching VIN");
                            return;
                        }
                    }
                    List<Pair<String, String>> listI = bVarM.i();
                    if (listI != null) {
                        BLEService.Z.j("Looking for the key: " + str2);
                        BLEService.Z.j("Vehicles Public key Found ::::");
                        for (int i12 = 0; i12 < listI.size(); i12++) {
                            String str3 = TextUtils.split((String) listI.get(i12).first, "VEHICLE_BLE_PUBLIC_KEY_")[1];
                            BLEService.Z.j("VIN: " + ie0.q0.f(str3));
                            if (Arrays.equals(ie0.q0.a((String) listI.get(i12).second), bArrA2)) {
                                BLEService.Z.j("Matching vehicle Found" + ie0.q0.f(str3));
                                BLEService.this.B0(str3);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                case 12:
                    try {
                        w0VarDecode = vc0.w0.f118956z.decode(data.getByteArray(hf0.f.NFCProtoMessage.getKey()));
                    } catch (IOException e11) {
                        BLEService.Z.j(String.format("Failed to deserialize message: %s", e11));
                    }
                    if (w0VarDecode != null) {
                        f2 f2VarN = w0VarDecode.getPersonalizationInformation();
                        if (f2VarN.getVIN().D() > 0) {
                            String strF = f2VarN.getVIN().F(StandardCharsets.UTF_8);
                            BLEService.Z.j("VIN through NFC Proto message: " + ie0.q0.f(strF));
                            BLEService.Z.j("Currently Selected VIN : " + ie0.q0.f(BLEService.this.f56648k));
                            if (BLEService.this.f56648k.equalsIgnoreCase(strF)) {
                                BLEService.Z.j("Proto message ignored, Not Switching VIN");
                                return;
                            } else {
                                BLEService.Z.j("Using Proto message to switch VIN");
                                BLEService.this.B0(strF);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                case 13:
                    BLEService.this.f1(false, null);
                    g0 g0Var = (g0) BLEService.this.f56647j.get(((ClearPeripheralInfo) data.getParcelable(hf0.f.ClearPeripheral.getKey())).getVin());
                    if (g0Var == null) {
                        BLEService.this.H0(hf0.f.ClearPeripheralsResult, new hf0.c(df0.b.ERROR, "VEHICLE_CONTROLLER_NOT_FOUND", -1));
                        return;
                    } else {
                        g0Var.u(message);
                        return;
                    }
                case 14:
                    String string = data.getString(hf0.f.SetConnectionBehaviorWhenUnauthorized.getKey());
                    if (string == null) {
                        BLEService.this.f56646i.u(message);
                        return;
                    }
                    g0 g0Var2 = (g0) BLEService.this.f56647j.get(string);
                    if (g0Var2 != null) {
                        g0Var2.u(message);
                        return;
                    } else {
                        BLEService.Z.c("try to set stayConnectedWhenUnauthorized on non-existing vehicle");
                        return;
                    }
                case 15:
                case 16:
                case 17:
                    BLEService.this.f56646i.u(message);
                    return;
                case 18:
                    BLEService.this.C0();
                    return;
                case 19:
                    boolean z12 = data.getBoolean("svc-background-permission", !ie0.r.a());
                    BLEService.this.f56638a.set(z12);
                    BLEService.Z.j("received UpdateBackgroundServicePermission message, resetting permission to " + z12);
                    BLEService.this.j1(z12);
                    return;
                case 20:
                    String string2 = data.getString("vin");
                    byte[] byteArray = data.getByteArray(hf0.f.SendRoutableData.getKey());
                    if (string2 == null || byteArray == null) {
                        BLEService.Z.n("SendRoutableData: missing vin or payload, dropping message");
                        return;
                    }
                    ic0.h hVarD0 = BLEService.this.D0(string2, "upkeep-auth", byteArray);
                    BLEService.Z.j("SendRoutableData: result=" + hVarD0);
                    return;
                case 21:
                    try {
                        new wd0.g(BLEService.this.getApplicationContext()).d(qc0.a.f105338d.decode(data.getByteArray(hf0.f.SendReportServiceRequest.getKey())));
                        return;
                    } catch (IOException e12) {
                        BLEService.Z.j(String.format("Failed to deserialize message: %s", e12));
                        e12.printStackTrace();
                        return;
                    }
                case 22:
                    try {
                        BLEService.this.M.a(ic0.e.f77490w.decode(data.getByteArray(hf0.f.SendCommandRequest.getKey())), new ce0.d() { // from class: com.teslamotors.plugins.ble.s
                            @Override // ce0.d
                            public final void a(ic0.g gVar) {
                                this.f56996a.b(gVar);
                            }
                        });
                        return;
                    } catch (IOException e13) {
                        BLEService.Z.c(String.format("Failed to deserialize command request message: %s", e13));
                        e13.printStackTrace();
                        return;
                    }
                case 23:
                    BLEService.this.b1();
                    return;
                case 24:
                    BLEService.this.g1();
                    return;
                case 25:
                    hf0.f fVar5 = hf0.f.UpdateVehicleConnectivityState;
                    String string3 = data.getString(fVar5.getKey());
                    String string4 = data.getString(fVar5.getKey2());
                    BLEService.Z.j(String.format("UpdateVehicleConnectivityState %s state: %s", string3, string4));
                    if (string3 == null || string4 == null) {
                        return;
                    }
                    try {
                        kb0.g.f85866a.z(string3, kb0.g.c.valueOf(string4.toUpperCase()));
                        return;
                    } catch (Exception e14) {
                        BLEService.Z.c(String.format("Failed to update BLE vehicle connectivity state: %s", e14));
                        return;
                    }
                case 26:
                    g0 g0Var3 = (g0) BLEService.this.f56647j.get(message.getData().getString(hf0.f.PhoneKeyLog.getKey()));
                    if (g0Var3 != null) {
                        g0Var3.u(message);
                        return;
                    }
                    return;
                case 27:
                    g0 g0Var4 = (g0) BLEService.this.f56647j.get(data.getString(hf0.f.PhoneKeySettingChanged.getKey()));
                    if (g0Var4 != null) {
                        g0Var4.u(message);
                        return;
                    }
                    return;
                default:
                    super.handleMessage(message);
                    throw new RuntimeException(String.format("Unsupported message: %s", hf0.f.get(message.what)));
            }
        }
    }

    private static final class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final hf0.f f56673a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Bundle f56674b;

        private j(hf0.f fVar, Bundle bundle) {
            this.f56673a = fVar;
            this.f56674b = bundle;
        }
    }

    private static final class k extends Handler {
        public k(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            BLEService.Z.j("Handling msg:" + message);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0(String str, boolean z11, boolean z12) {
        this.f56660w = str;
        this.f56661x = z0.a(str);
        this.f56662y = b0(str);
        this.f56656s.clear();
        this.f56657t.clear();
        this.f56659v = z11;
        this.f56658u = null;
        String str2 = androidx.core.content.b.checkSelfPermission(this, "android.permission.ACCESS_FINE_LOCATION") != 0 ? "scanning_missing_permissions" : null;
        if (!ie0.c0.c(this)) {
            str2 = "scanning_missing_permissions_nearby_devices";
        }
        k0();
        String str3 = "bluetooth_unsupported";
        if (this.f56643f == null) {
            Z.j("Unable to obtain a BluetoothManager.");
            str2 = "bluetooth_unsupported";
        }
        BluetoothAdapter adapter = this.f56643f.getAdapter();
        if (adapter == null) {
            Z.j("Unable to obtain a BluetoothAdapter.");
            str2 = "bluetooth_unsupported";
        } else if (!n0()) {
            str2 = "bluetooth_unavailable";
        }
        if (adapter != null) {
            BluetoothLeScanner bluetoothLeScanner = adapter.getBluetoothLeScanner();
            this.f56663z = bluetoothLeScanner;
            if (bluetoothLeScanner == null) {
                Z.j("Unable to obtain a Bluetooth LE Scanner.");
            } else {
                str3 = str2;
            }
            str2 = this.A ? "already_scanning" : str3;
            if (str2 == null) {
                com.tesla.logging.g gVar = Z;
                gVar.j("Starting Scan");
                try {
                    this.A = true;
                    if (z12) {
                        this.B = true;
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new ScanFilter.Builder().setServiceUuid(this.f56661x).build());
                        arrayList.add(new ScanFilter.Builder().setServiceUuid(com.teslamotors.plugins.ble.a.f56699c).build());
                        if (Build.VERSION.SDK_INT >= 26) {
                            a1();
                            this.f56663z.startScan(arrayList, f56637b0, f0());
                        } else {
                            this.f56663z.startScan(arrayList, f56636a0, this.W);
                        }
                        u0("from scanForPeripherals: scanforever is true");
                        gVar.j(String.format("Scanning forever: %s", ie0.q0.f(str)));
                    } else {
                        this.f56663z.startScan((List<ScanFilter>) null, f56636a0, this.W);
                        this.f56645h.postDelayed(this.S, 10000L);
                    }
                } catch (Exception e11) {
                    this.A = false;
                    this.B = false;
                    e1();
                    Z.d("Failed to start scan", e11);
                    str2 = "scanning_failure";
                }
            }
        }
        if (str2 != null) {
            O0(str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B0(String str) {
        he0.b bVarM = he0.b.m(getApplicationContext());
        if (!bVarM.M(str)) {
            Z.j("VIN Not found in the Product list.");
            return;
        }
        V0(str, bVarM.y(str), this.f56649l);
        H0(hf0.f.SwitchProductMessage, new hf0.j(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C0() {
        for (g0 g0Var : this.f56647j.values()) {
            if (g0Var instanceof q1) {
                hf0.m mVar = new hf0.m();
                mVar.f72688u = n0();
                g0Var.w(mVar, false);
                if (mVar.f72690w != null) {
                    try {
                        int i11 = WidgetBleUpdateReceiver.f56598b;
                        Intent intent = new Intent(this, (Class<?>) WidgetBleUpdateReceiver.class);
                        intent.putExtra("com.teslamotors.tesla.action.ACTION_VEHICLE_BLE_UPDATE_KEY", mVar);
                        intent.setAction("com.teslamotors.tesla.action.ACTION_VEHICLE_BLE_UPDATE");
                        intent.setPackage(getPackageName());
                        sendBroadcast(intent);
                    } catch (ClassNotFoundException e11) {
                        e11.printStackTrace();
                    }
                }
            }
        }
    }

    private void G0(hf0.f fVar, Bundle bundle, boolean z11) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!z11) {
            R0(fVar, bundle);
            return;
        }
        synchronized (this.K) {
            try {
                if (!R0(fVar, bundle)) {
                    U(fVar, bundle);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void O0(String str) {
        H0(hf0.f.ScanForPeripheralsResult, new hf0.l(str == null, str, this.f56656s.size(), t0(this.f56658u)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void P0() {
        if (this.G.isEmpty()) {
            return;
        }
        Z.j("[Shared Fleet BT Scan] sendSharedFleetScanResultToJS filteredPeripherals size: " + this.G.size());
        H0(hf0.f.SendSharedFleetPeripheralsScanResult, new BLESharedFleetFilteredPeripherals(this.G));
    }

    private boolean R0(hf0.f fVar, Bundle bundle) {
        boolean z11 = false;
        for (int size = this.J.size() - 1; size >= 0; size--) {
            Message messageObtain = Message.obtain();
            messageObtain.what = fVar.getWhat();
            messageObtain.setData(bundle);
            try {
                this.J.get(size).send(messageObtain);
                z11 = true;
            } catch (RemoteException unused) {
                Z.j("Failed to send message to client. Main app likely not running");
                if (this.J.size() > size) {
                    try {
                        this.J.remove(size);
                    } catch (Exception e11) {
                        Z.d("Exception thrown removing messenger from clients", e11);
                    }
                }
            }
        }
        return z11;
    }

    private boolean T(ScanResult scanResult) {
        String str;
        if (scanResult.getScanRecord() != null && scanResult.getScanRecord().getDeviceName() != null) {
            String deviceName = scanResult.getScanRecord().getDeviceName();
            if (deviceName.startsWith("S") && (str = this.f56662y) != null && deviceName.contains(str) && "C".equalsIgnoreCase(d0(deviceName))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T0(String str) {
        if (str == null) {
            str = "";
        }
        String str2 = this.f56650m;
        if (str2 == null || !str2.equals(str)) {
            com.tesla.logging.g gVar = Z;
            gVar.j(String.format("Changing email from %s to %s", ie0.q0.e(this.f56650m), ie0.q0.e(str)));
            if (!str.equalsIgnoreCase(this.f56650m)) {
                z0(new c1());
                this.f56652o = 0L;
                this.f56650m = str;
            }
            if (!z0.d(this, this.f56649l, this.f56650m, this.B)) {
                gVar.j("No VIN, non-applicable VIN, or no user - stopping BLE Service");
                X0("setAccountEmail", y0.g(this));
                Y("from setAccountEmail: shouldRunInForeground returned false");
                stopSelf();
            }
            m0();
        }
    }

    private void U(hf0.f fVar, Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        if (this.K.size() >= 20) {
            int size = this.K.size() - 19;
            this.K.subList(0, size).clear();
            Z.n("Dropped " + size + " cached messages due to max capacity");
        }
        this.K.add(new j(fVar, bundle2));
        Z.j("Cached message for type: " + fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U0(Boolean bool) {
        boolean z11 = !this.f56639b && bool.booleanValue();
        this.f56639b = bool.booleanValue();
        if (z11) {
            Q0(true, null);
        }
    }

    private boolean V(boolean z11) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j11 = jCurrentTimeMillis - this.f56641d;
        if (ie0.e0.f(this) || this.f56641d == 0 || j11 >= 10000) {
            this.f56641d = jCurrentTimeMillis;
            v0();
            return false;
        }
        Z.j(String.format("Time interval of two start commands is too close within %d ms", Long.valueOf(j11)));
        d1("onStartCommand gate");
        if (!z11) {
            return true;
        }
        X0("from onStartCommand: Intent extra: `EXTRA_SERVICE_IN_FOREGROUND` was true. Service was started as foreground service.", null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V0(String str, String str2, List<String> list) {
        if (str == null) {
            str = "";
        }
        he0.b bVarM = he0.b.m(getApplicationContext());
        l1(str, list);
        if (str.equals(this.f56648k) && this.f56646i.q().equals(str)) {
            Z.j(String.format("early return from setSelectedVIN due to vin equals mVin, vin: ", ie0.q0.f(this.f56648k)));
            if (str2 == null || str2.equals(bVarM.y(str))) {
                return;
            }
            bVarM.O(str, str2);
            k1();
            return;
        }
        Z.j(String.format("Setting VIN from %s to %s", ie0.q0.f(this.f56648k), ie0.q0.f(str)));
        bVarM.O(str, str2);
        if (str.length() > 0) {
            m0();
            this.f56646i.i(true);
        } else {
            this.f56648k = null;
            this.f56646i = new s1();
        }
    }

    private boolean W() {
        if (ie0.c0.b(this)) {
            return true;
        }
        Z.j("onStartCommand: BLUETOOTH_CONNECT or BLUETOOTH_SCAN permission is not granted. Destroying service");
        X0("checkPermission", y0.g(this));
        c1(true, "checkPermission");
        stopSelf();
        return false;
    }

    private void W0() {
        if (this.R != null) {
            Z.c("VehicleConnectivityListener already setup!");
        }
        am0.b bVar = this.Q;
        if (bVar != null) {
            bVar.dispose();
        }
        this.R = new h1(getApplicationContext());
        Z.j("Listening for vehicle connection events...");
        this.Q = this.R.b().L(new cm0.j() { // from class: com.teslamotors.plugins.ble.m
            @Override // cm0.j
            public final boolean test(Object obj) {
                return BLEService.d((Boolean) obj);
            }
        }).j().O(new cm0.f() { // from class: com.teslamotors.plugins.ble.n
            @Override // cm0.f
            public final void accept(Object obj) {
                this.f56938a.r0((Boolean) obj);
            }
        }, new cm0.f() { // from class: com.teslamotors.plugins.ble.o
            @Override // cm0.f
            public final void accept(Object obj) {
                BLEService.Z.d("vehicle connection listener error thrown", (Throwable) obj);
            }
        });
    }

    private void X0(String str, Notification notification) {
        if (str == null) {
            str = "call startForeground along with Service.startForegroundService";
        }
        Z.j("Promoting service to foreground with reason: " + str);
        if (notification == null) {
            try {
                notification = c0();
            } catch (Exception e11) {
                Z.c("Stopping service caused by: " + e11.getMessage());
                stopSelf();
                return;
            }
        }
        startForeground(333, notification);
        this.f56653p = true;
        ff0.g.d(new ff0.k.f(g2.d.SERVICERUNNINGSTATE_FOREGROUND));
    }

    private void Y0() {
        Z.j("sending BLEService heartbeat");
        ze0.b.f128127a.l(this, this.f56648k);
    }

    private void Z(Messenger messenger) {
        synchronized (this.K) {
            try {
                if (this.K.isEmpty()) {
                    return;
                }
                Iterator<j> it = this.K.iterator();
                while (it.hasNext()) {
                    j next = it.next();
                    Message messageObtain = Message.obtain();
                    messageObtain.what = next.f56673a.getWhat();
                    messageObtain.setData(new Bundle(next.f56674b));
                    try {
                        messenger.send(messageObtain);
                        it.remove();
                    } catch (RemoteException unused) {
                        Z.j("Failed to send queued message to client. Main app likely not running");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void Z0() {
        kd0.e.f().l(nc0.l.ANDROID_BLESERVICE_LAUNCH_TIME, Collections.EMPTY_LIST);
    }

    private void a1() {
        a0.b bVar = new a0.b() { // from class: com.teslamotors.plugins.ble.p
            @Override // com.teslamotors.plugins.ble.a0.b
            public final void a(List list) {
                this.f56946a.s0(list);
            }
        };
        this.O = bVar;
        if (Build.VERSION.SDK_INT >= 26) {
            a0.e(bVar);
        }
    }

    private String b0(String str) {
        if (str != null && str.length() != 0) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                messageDigest.update(str.getBytes());
                return ie0.q0.b(messageDigest.digest()).substring(0, 16);
            } catch (Exception e11) {
                Z.d("Failed to get VIN identifier", e11);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b1() {
        com.tesla.logging.g gVar = Z;
        gVar.j("[Shared Fleet BT Scan] startScanPeripheralsInSharedFleet.");
        String str = androidx.core.content.b.checkSelfPermission(this, "android.permission.ACCESS_FINE_LOCATION") != 0 ? "scanning_missing_permissions" : null;
        if (!ie0.c0.c(this)) {
            str = "scanning_missing_permissions_nearby_devices";
        }
        k0();
        String str2 = "bluetooth_unsupported";
        if (this.f56643f == null) {
            gVar.j("[Shared Fleet BT Scan] Unable to obtain a BluetoothManager.");
            str = "bluetooth_unsupported";
        }
        BluetoothAdapter adapter = this.f56643f.getAdapter();
        if (adapter == null) {
            gVar.j("[Shared Fleet BT Scan] Unable to obtain a BluetoothAdapter.");
            str = "bluetooth_unsupported";
        } else if (!n0()) {
            str = "bluetooth_unavailable";
        }
        if (adapter != null) {
            BluetoothLeScanner bluetoothLeScanner = adapter.getBluetoothLeScanner();
            this.f56663z = bluetoothLeScanner;
            if (bluetoothLeScanner == null) {
                gVar.j("[Shared Fleet BT Scan] Unable to obtain a Bluetooth LE Scanner.");
            } else {
                str2 = str;
            }
            if (str2 == null) {
                gVar.j("[Shared Fleet BT Scan] mBLEScanner start scan");
                try {
                    this.E = qb0.a.q().g();
                    this.F = qb0.a.q().r();
                    this.G = new ArrayList();
                    this.C = true;
                    this.f56663z.startScan((List<ScanFilter>) null, f56636a0, this.Y);
                    Timer timer = new Timer();
                    this.H = timer;
                    timer.schedule(new b(), 0L, 1000L);
                    str = str2;
                } catch (Exception e11) {
                    Z.d("[Shared Fleet BT Scan] exception caught: ", e11);
                    this.C = false;
                    str = "scanning_failure";
                }
            } else {
                str = str2;
            }
        }
        if (str != null) {
            Z.n("[Shared Fleet BT Scan] Failed to start scan, error: " + str);
        }
    }

    private Notification c0() {
        return y0.e(this, this.f56650m, this.f56648k, this.f56646i, this.f56647j, this.f56654q, this.f56649l, this.f56644g).c();
    }

    private void c1(boolean z11, String str) {
        Z.j("Demoting service to background with reason: " + str);
        stopForeground(z11);
        ff0.g.d(new ff0.k.f(g2.d.SERVICERUNNINGSTATE_BACKGROUND));
    }

    public static /* synthetic */ boolean d(Boolean bool) {
        return !bool.booleanValue();
    }

    private String d0(String str) {
        return (str == null || str.length() <= 0) ? "X" : str.substring(str.length() - 1);
    }

    private void d1(String str) {
        if (this.f56640c) {
            this.f56640c = false;
            ArrayList arrayList = new ArrayList();
            arrayList.add(kd0.a.c("action", str));
            kd0.e.f().k(nc0.l.ANDROID_BLESERVICE_LAUNCH_TIME, arrayList, Collections.EMPTY_LIST);
        }
    }

    private List<String> e0() {
        List<String> listV = he0.b.m(getApplicationContext()).v();
        if (!listV.isEmpty()) {
            return new ArrayList(listV);
        }
        String strX = he0.b.m(getApplicationContext()).x();
        List<String> listSingletonList = (strX == null || strX.isEmpty()) ? Collections.EMPTY_LIST : Collections.singletonList(strX);
        he0.b.m(getApplicationContext()).L(listSingletonList);
        return new ArrayList(listSingletonList);
    }

    private void e1() {
        if (Build.VERSION.SDK_INT >= 26) {
            a0.d();
        }
    }

    private PendingIntent f0() {
        if (this.X == null) {
            this.X = PendingIntent.getBroadcast(this, 888, new Intent(this, (Class<?>) a0.class), 167772160);
        }
        return this.X;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f1(boolean z11, String str) {
        g0 g0Var;
        this.f56645h.removeCallbacks(this.S);
        if (this.A) {
            boolean z12 = this.B;
            this.A = false;
            this.B = false;
            e1();
            if (this.f56663z != null && n0()) {
                com.tesla.logging.g gVar = Z;
                gVar.j(String.format("Stopping pairing scan with %d peripherals", Integer.valueOf(this.f56656s.size())));
                if (!ie0.c0.c(this)) {
                    gVar.j("BLUETOOTH_SCAN permission is not granted,failed to stop scan");
                } else if (!z12) {
                    this.f56663z.stopScan(this.W);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    this.f56663z.stopScan(f0());
                }
                if (z11 && this.f56656s.size() > 0 && (g0Var = this.f56647j.get(this.f56660w)) != null) {
                    g0Var.disconnect();
                    g0Var.F(this.f56658u);
                    g0Var.f();
                }
            }
            O0(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g1() {
        if (androidx.core.content.b.checkSelfPermission(this, "android.permission.ACCESS_FINE_LOCATION") == 0 && ie0.c0.c(this)) {
            if (this.f56663z == null || !n0()) {
                Z.c("[Shared Fleet BT Scan] mBLEScanner is null or bluetooth not enabled");
                return;
            }
            Z.j("[Shared Fleet BT Scan] stopScanPeripheralsInSharedFleet.");
            this.C = false;
            this.f56663z.stopScan(this.Y);
            Timer timer = this.H;
            if (timer != null) {
                timer.cancel();
                this.H = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h1(Messenger messenger) {
        Z.j("Unregistering " + messenger);
        this.J.remove(messenger);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(ScanResult scanResult) {
        Peripheral peripheral;
        BluetoothDevice device = scanResult.getDevice();
        String address = device.getAddress();
        if (!this.f56657t.contains(address)) {
            if (Build.VERSION.SDK_INT >= 26) {
                Z.j(String.format("Scan result: %s - %s, RSSI: %s, %s", scanResult.getScanRecord().getDeviceName(), scanResult.getDevice().getAddress(), Integer.valueOf(scanResult.getRssi()), scanResult.isConnectable() ? "connectable" : "non-connectable"));
            } else {
                Z.j(String.format("Scan result: %s - %s, RSSI: %s", scanResult.getScanRecord().getDeviceName(), scanResult.getDevice().getAddress(), Integer.valueOf(scanResult.getRssi())));
            }
        }
        if (this.f56657t.contains(address)) {
            return;
        }
        if (scanResult.getScanRecord() == null || scanResult.getScanRecord().getServiceUuids() == null) {
            this.f56657t.add(address);
            return;
        }
        this.f56657t.add(address);
        boolean zT = T(scanResult);
        for (ParcelUuid parcelUuid : scanResult.getScanRecord().getServiceUuids()) {
            boolean zEquals = parcelUuid.equals(this.f56661x);
            boolean zEquals2 = parcelUuid.equals(com.teslamotors.plugins.ble.a.f56699c);
            boolean z11 = zEquals || (zEquals2 && zT);
            com.tesla.logging.g gVar = Z;
            gVar.j(String.format("advertisedServicesBelongToVehicle: %s", Boolean.valueOf(zEquals)));
            gVar.j(String.format("isExpectedAdvertisingService: %s", Boolean.valueOf(zEquals2)));
            gVar.j(String.format("advertisedNameBelongsToVehicle: %s", Boolean.valueOf(zT)));
            gVar.j(String.format("belongsToVehicle: %s", Boolean.valueOf(z11)));
            if (z11) {
                try {
                    if (!ie0.c0.a(this)) {
                        gVar.j("BLUETOOTH_CONNECT permission is not granted, can not process scan result");
                        return;
                    }
                    gVar.j(String.format("Scan result service: %s %s %s", device.getName(), device.getAddress(), parcelUuid));
                    if (this.f56659v && ((peripheral = this.f56658u) == null || !peripheral.getIdentifier().equals(address))) {
                        this.f56656s.add(address);
                        if (Build.VERSION.SDK_INT >= 26 && !scanResult.isConnectable() && this.f56656s.size() >= 1) {
                            gVar.j("Peripheral is not connectable");
                            f1(false, "too_many_devices_connected");
                        }
                        this.f56658u = new Peripheral(d0(scanResult.getScanRecord().getDeviceName()), this.f56660w, scanResult.getDevice(), null, this.f56647j.get(this.f56660w), this.f56644g, Integer.valueOf(scanResult.getRssi()), getApplicationContext());
                        if (!this.f56656s.isEmpty()) {
                            gVar.j("Found all peripherals - stopping scan");
                            f1(true, null);
                        }
                    }
                } catch (Throwable th2) {
                    Z.d("error happens when add peripheral", th2);
                }
            }
        }
    }

    private void i1(@NonNull String str) {
        String strR;
        we0.a aVarA = we0.a.a();
        if (!aVarA.isSupported(this) || (strR = he0.b.m(this).r(str, this.f56650m)) == null) {
            return;
        }
        aVarA.b(strR.substring(2), str, this);
    }

    private void k0() {
        if (this.f56643f == null) {
            BluetoothManager bluetoothManager = (BluetoothManager) getSystemService("bluetooth");
            this.f56643f = bluetoothManager;
            if (bluetoothManager == null) {
                Z.j("Unable to initialize BluetoothManager.");
            }
        }
        BluetoothAdapter adapter = this.f56643f.getAdapter();
        this.f56644g = adapter;
        if (adapter == null) {
            Z.j("Unable to obtain a BluetoothAdapter.");
        }
        ef0.k.f62906a.b(this.f56644g);
    }

    private void k1() {
        if (com.teslamotors.plugins.ble.a.f56697a && z0.d(this, this.f56649l, this.f56650m, this.B) && this.f56653p) {
            ((NotificationManager) getSystemService("notification")).notify(333, c0());
            if (ef0.g.e(this.f56654q) && ef0.m.d(this.f56648k, this)) {
                y0.n(this, this.f56648k);
            }
        }
    }

    private void l0(Context context) {
        he0.b bVarM = he0.b.m(this);
        String strX = bVarM.x();
        ArrayList arrayList = new ArrayList(bVarM.v());
        String strG = bVarM.g();
        String strY = bVarM.y(strX);
        T0(strG);
        V0(strX, strY, arrayList);
        z0(new a1(Boolean.FALSE));
        j0 j0VarA = k0.f56924a.a("BLEService");
        if (j0VarA != null) {
            j0VarA.onBLEServiceInitialized(strX, this);
        }
    }

    private void l1(String str, List<String> list) {
        if (list == null) {
            return;
        }
        for (int size = this.f56649l.size() - 1; size >= 0; size--) {
            String str2 = this.f56649l.get(size);
            if (list.contains(str2)) {
                g0 g0Var = this.f56647j.get(str2);
                if (g0Var != null) {
                    g0Var.A();
                }
            } else {
                g0 g0VarRemove = this.f56647j.remove(str2);
                if (g0VarRemove != null) {
                    this.f56649l.remove(size);
                    i1(str2);
                    g0VarRemove.disconnect();
                }
            }
        }
        int iIndexOf = this.f56649l.indexOf(str);
        if (!str.equals("")) {
            if (iIndexOf == -1) {
                Z.j(String.format("Adding %s to top of recently selected VINs", ie0.q0.f(str)));
                this.f56649l.add(0, str);
            } else if (iIndexOf > 0) {
                Z.j(String.format("Promoting %s to top of recently selected VINs", ie0.q0.f(str)));
                this.f56649l.remove(iIndexOf);
                this.f56649l.add(0, str);
            }
        }
        if (this.f56649l.size() > 4) {
            List<String> list2 = this.f56649l;
            String strRemove = list2.remove(list2.size() - 1);
            g0 g0VarRemove2 = this.f56647j.remove(strRemove);
            if (g0VarRemove2 != null) {
                g0VarRemove2.disconnect();
            }
            Z.j(String.format("Removed %s from tail of recently selected VINs", ie0.q0.f(strRemove)));
        }
        Z.j(String.format("Updated recently selected VINs: %s", ie0.q0.g(this.f56649l)));
        he0.b.m(getApplicationContext()).L(this.f56649l);
    }

    private void m0() {
        boolean z11;
        this.f56649l = e0();
        String strG = he0.b.m(getApplicationContext()).g();
        this.f56650m = strG;
        boolean z12 = true;
        if (strG == null || strG.equals("")) {
            Z.j("Skipping initialization due to missing account email");
            z11 = true;
        } else {
            z11 = false;
        }
        List<String> list = this.f56649l;
        if (list == null || list.size() == 0) {
            Z.j("Skipping initialization due to missing vins");
        } else {
            z12 = z11;
        }
        if (z12) {
            this.f56646i = new s1();
            return;
        }
        String str = this.f56649l.get(0);
        this.f56648k = str;
        Z.j(String.format("Initializing with valid login and VIN %s", ie0.q0.f(str)));
        k0();
        for (String str2 : this.f56649l) {
            if (str2 != null) {
                if (this.f56647j.containsKey(str2)) {
                    Z.j(String.format("BLE controller already exists for %s", ie0.q0.f(str2)));
                } else {
                    Z.j(String.format("creating new ble controller for vin %s", ie0.q0.f(str2)));
                    ye0.n nVarC = ye0.n.c(this.M, str2);
                    q1 q1Var = new q1(str2, nVarC, this.f56650m, getApplicationContext(), this.f56644g, this, this.f56651n);
                    q1Var.M0(this.R);
                    this.f56647j.put(str2, q1Var);
                    ef0.m.c(nVarC, this);
                }
            }
        }
        Z.j(String.format("initializing with %d VINs", Integer.valueOf(this.f56649l.size())));
        if (this.f56649l.size() > 0) {
            this.f56646i = this.f56647j.get(this.f56649l.get(0));
        } else {
            this.f56646i = new s1();
        }
        if (!z0.d(this, this.f56649l, this.f56650m, this.B)) {
            Y("from initializePendingLogin: shouldRunInForeground returned false");
        } else {
            x0();
            u0("from initializePendingLogin: shouldRunInForeground returned true");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q0(String str) {
        Q0(false, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r0(Boolean bool) {
        if (this.I == null) {
            Z.c("auth engine not initialized, ignoring connection event!");
            return;
        }
        if (bool.booleanValue()) {
            Z.j("at least one peripheral is connected, registering device motion manager.");
            this.I.e();
            return;
        }
        com.tesla.logging.g gVar = Z;
        gVar.j("no peripherals connected, un-registering device motion manager.");
        this.I.b();
        Context applicationContext = getApplicationContext();
        if (!qb0.a.q().x()) {
            gVar.m("realm compaction process restart has not expired, doing nothing.");
            return;
        }
        boolean zH = ie0.e0.h(applicationContext);
        double dC = ef0.l.c(applicationContext);
        gVar.j("Realm: " + ef0.l.d(applicationContext) + " MB");
        gVar.j("Realm backup: " + ef0.l.b(applicationContext) + " MB");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("main process not running: ");
        sb2.append(zH);
        gVar.j(sb2.toString());
        gVar.j("main process state: " + ie0.e0.c(applicationContext, applicationContext.getPackageName()));
        if (!zH || dC <= 100.0d) {
            return;
        }
        gVar.j("restarting BLE process to compact Realm!");
        ef0.h.a(applicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s0(List list) {
        Z.j("Handling Scan results from pendingIntent callback");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i0((ScanResult) it.next());
        }
    }

    public static hf0.g t0(Peripheral peripheral) {
        if (peripheral == null) {
            return null;
        }
        return new hf0.g(peripheral);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w0(Messenger messenger) {
        this.J.add(messenger);
        Message messageObtain = Message.obtain();
        messageObtain.what = hf0.f.RegisterComplete.getWhat();
        try {
            messenger.send(messageObtain);
            Z.j("Registering " + messenger);
            Z(messenger);
        } catch (RemoteException unused) {
            Z.j("Failed to send message to client. Main app likely not running");
        }
    }

    private void x0() {
        we0.a aVarA = we0.a.a();
        if (aVarA.isSupported(this)) {
            he0.b bVarM = he0.b.m(this);
            for (String str : this.f56649l) {
                String strR = bVarM.r(str, this.f56650m);
                if (strR != null) {
                    aVarA.c(strR.substring(2), str, this);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> void z0(r1<T> r1Var) {
        Iterator<Map.Entry<String, g0>> it = this.f56647j.entrySet().iterator();
        while (it.hasNext()) {
            r1Var.a(it.next().getValue());
        }
    }

    public ic0.h D0(String str, String str2, byte[] bArr) {
        return !j0(str) ? ic0.h.RESULT_NO_PERIPHERALS : this.f56647j.get(str).v(str2, bArr);
    }

    public synchronized void E0(String str, boolean z11) {
        hf0.k kVar = new hf0.k();
        kVar.f72662a = str;
        kVar.f72663b = this.f56648k;
        I0(hf0.f.VehicleEventMessage, kVar, z11);
    }

    public synchronized void F0(JsBridgeEvent jsBridgeEvent) {
        H0(hf0.f.SendJsBridgeEvent, jsBridgeEvent);
    }

    protected void H0(hf0.f fVar, Parcelable parcelable) {
        I0(fVar, parcelable, false);
    }

    protected void I0(hf0.f fVar, Parcelable parcelable, boolean z11) {
        Bundle bundle = new Bundle();
        if (parcelable != null) {
            bundle.putParcelable(fVar.getKey(), parcelable);
        }
        G0(fVar, bundle, z11);
    }

    protected void J0(hf0.f fVar, byte[] bArr) {
        K0(fVar, bArr, false);
    }

    protected void K0(hf0.f fVar, byte[] bArr, boolean z11) {
        Bundle bundle = new Bundle();
        if (bArr != null) {
            bundle.putByteArray(fVar.getKey(), bArr);
        }
        G0(fVar, bundle, z11);
    }

    public synchronized void L0(NfcSwipeStatus nfcSwipeStatus) {
        H0(hf0.f.VehicleNfcSwipeStatusMessage, nfcSwipeStatus);
    }

    public synchronized void M0(NonUserFeedback nonUserFeedback) {
        I0(hf0.f.NonUserFeedback, nonUserFeedback, true);
    }

    public synchronized void N0(PhoneKeyLog phoneKeyLog) {
        H0(hf0.f.PhoneKeyLog, phoneKeyLog);
    }

    @SuppressLint({"MissingPermission"})
    public synchronized void Q0(boolean z11, final String str) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f56652o;
            if (!z11 && jCurrentTimeMillis < 500) {
                if (this.V != null) {
                    this.f56645h.removeCallbacks(this.V);
                }
                this.V = new Runnable() { // from class: com.teslamotors.plugins.ble.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f56928a.q0(str);
                    }
                };
                this.f56645h.postDelayed(this.V, 500 - jCurrentTimeMillis);
                return;
            }
            this.f56652o = System.currentTimeMillis();
            hf0.m mVar = new hf0.m();
            this.f56654q = mVar;
            mVar.f72688u = n0();
            if (str != null) {
                g0 g0Var = this.f56647j.get(str);
                if (g0Var != null) {
                    g0Var.w(this.f56654q, true);
                } else {
                    Z.n("Skipping vehicle controller status message because cannot find the controller");
                }
            } else {
                this.f56646i.w(this.f56654q, true);
            }
            k1();
            H0(hf0.f.VehicleStatusMessage, new VehicleStatusWithUpdateFlag(this.f56654q, true ^ this.f56646i.n()));
            C0();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public ToVCSECMessageResult S0(String str, e3 e3Var, v2 v2Var, byte[] bArr) {
        return !j0(str) ? new ToVCSECMessageResult(ic0.h.RESULT_NO_PERIPHERALS, null) : this.f56647j.get(str).k(e3Var, v2Var, bArr);
    }

    public void X(@NonNull String str, String str2) {
        g0 g0Var = this.f56647j.get(str);
        if (g0Var != null) {
            Message message = new Message();
            hf0.f fVar = hf0.f.ClearPeripheral;
            message.what = fVar.getWhat();
            Bundle bundle = new Bundle();
            bundle.putParcelable(fVar.getKey(), new ClearPeripheralInfo(str, str2));
            message.setData(bundle);
            g0Var.u(message);
        }
    }

    protected void Y(String str) {
        Z.j("demoteFromForeground called with reason:" + str + ", `isForegroundService`=" + this.f56653p);
        this.f56653p = false;
        c1(true, str);
    }

    public Long a0() {
        return this.N;
    }

    public ee0.a g0() {
        return this.f56655r;
    }

    public boolean h0(String str) {
        if (j0(str)) {
            return this.f56647j.get(str).m();
        }
        return false;
    }

    public boolean j0(String str) {
        if (!this.f56647j.containsKey(this.f56648k)) {
            Z.j(String.format("Selected vin: %s is not in mVehicleControllers!", ie0.q0.f(str)));
            this.f56647j.put(this.f56648k, this.f56646i);
        }
        return this.f56647j.containsKey(str);
    }

    public void j1(boolean z11) {
        Context applicationContext = getApplicationContext();
        int i11 = z11 ? 1 : 2;
        Z.j("resetting boot receiver flag to " + z11);
        applicationContext.getPackageManager().setComponentEnabledSetting(new ComponentName(applicationContext, (Class<?>) BLEBootReceiver.class), i11, 1);
    }

    public void m1() {
    }

    public boolean n0() {
        return ef0.k.f62906a.a(this.f56644g);
    }

    public boolean o0() {
        return this.A;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i11) {
        Z.j("Sensor Accuracy changed ! " + i11);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.L.getBinder();
    }

    @Override // android.app.Service
    public void onCreate() throws Throwable {
        byte[] bArrD;
        super.onCreate();
        if (W()) {
            Z0();
            ff0.g.f();
            ff0.g.c(this);
            td0.m mVarJ = td0.m.j();
            this.f56651n = com.tesla.features.a.a();
            this.f56638a.set(Boolean.parseBoolean(mVarJ.h("svc-background-permission")));
            nd0.k.b(this);
            Context applicationContext = getApplicationContext();
            he0.b bVarM = he0.b.m(applicationContext);
            bVarM.C();
            this.f56645h = new k(Looper.getMainLooper());
            this.f56650m = bVarM.g();
            Z.j("onCreate");
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
            registerReceiver(this.P, intentFilter);
            w.f(getApplicationContext());
            be0.e eVarP = be0.e.p();
            try {
                bArrD = rb0.e.f107486a.d(applicationContext);
            } catch (Exception e11) {
                Z.j("fail to get user public key " + e11.getMessage());
                bArrD = null;
            }
            ee0.a aVarK = ee0.a.k(new be0.b(td0.m.j()), bArrD, rb0.e.f107486a.e(applicationContext, be0.f.f17060a.f()));
            this.f56655r = aVarK;
            ce0.h hVarH = ce0.h.h(aVarK, ic0.q.TRANSPORT_BLUETOOTH);
            fd0.n nVarC = fd0.n.c(fd0.f.i(rb0.f.newInstance(applicationContext)), fd0.j.e(applicationContext));
            rd0.h hVarI = rd0.h.i(getApplicationContext(), td0.r.e(), eVarP, this.f56651n);
            this.I = hVarI;
            hVarI.start();
            W0();
            mb0.a aVarB = ye0.j.B(applicationContext, eVarP, hVarH, aVarK, nVarC, this, this.f56651n);
            this.M = aVarB;
            kb0.g.r(aVarB);
            if (jf0.d.e(this)) {
                if0.b.f77637a.b();
                jf0.g.g(this, new Runnable() { // from class: com.teslamotors.plugins.ble.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f56923a.y0();
                    }
                });
            }
            m0();
            Y0();
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        Z.j("onDestroy");
        rd0.h hVar = this.I;
        if (hVar != null) {
            hVar.destroy();
            this.I = null;
        }
        am0.b bVar = this.Q;
        if (bVar != null) {
            bVar.dispose();
        }
        this.R = null;
        try {
            unregisterReceiver(this.P);
        } catch (Exception unused) {
            Z.j("broadcast wasn't registered.");
        }
        this.f56646i.disconnect();
        this.f56646i.destroy();
        if (this.f56645h != null) {
            this.f56645h.removeCallbacksAndMessages(null);
        }
        Q0(true, null);
        ff0.g.i();
        e1();
        if (jf0.d.e(this)) {
            if0.b.f77637a.d();
        }
        super.onDestroy();
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 29) {
            Z.j("onSensorChanged: stationary detected !");
        }
        if (sensorEvent.sensor.getType() == 30) {
            Z.j("onSensorChanged: Motion detected !");
        }
        if (sensorEvent.sensor.getType() == 17) {
            Z.j("onSensorChanged: Significant motion detected !");
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i11, int i12) {
        int i13;
        String action;
        if (!W()) {
            d1("permission not granted");
            return 2;
        }
        Context applicationContext = getApplicationContext();
        if (ef0.h.b(intent)) {
            qb0.a.q().n();
            com.tesla.logging.g gVar = Z;
            gVar.j("BLE process was restarted by us!");
            gVar.j("Realm: " + ef0.l.d(applicationContext) + " MB");
            gVar.j("Realm backup: " + ef0.l.b(applicationContext) + " MB");
        }
        com.tesla.logging.g gVar2 = Z;
        gVar2.j("onStartCommand");
        boolean z11 = false;
        if (intent != null) {
            action = intent.getAction();
            boolean booleanExtra = intent.getBooleanExtra("SERVICE_IN_FOREGROUND", false);
            if ("com.teslamotors.plugins.ble.action.REINITIALIZE_CONNECTION".equalsIgnoreCase(action) || "com.teslamotors.plugins.ble.action.RESTART_PROCESS".equalsIgnoreCase(action) || "com.teslamotors.plugins.ble.action.RESTART_BG_SCAN".equalsIgnoreCase(action) || "com.teslamotors.plugins.ble.action.OEM_WAKE_UP_ON_CAR_FOUND".equalsIgnoreCase(action)) {
                i13 = 2;
            } else {
                if (intent.getIntExtra("StartType", 0) == 1) {
                    gVar2.j("[MiBeacon] MiBeacon start triggered");
                    ff0.g.d(new ff0.k.e(g2.e.SERVICE_START_REASON_MI_BEACON));
                    if (V(booleanExtra)) {
                        if (p0()) {
                            return super.onStartCommand(intent, i11, i12);
                        }
                        return 2;
                    }
                    l0(applicationContext);
                } else if (intent.getStringExtra("BleParamsOrigin") != null) {
                    gVar2.j("[HonorWallet] HonorWallet Ble wake up triggered");
                    ff0.g.d(new ff0.k.e(g2.e.SERVICE_START_REASON_HONOR_WALLET));
                    if (V(booleanExtra)) {
                        if (p0()) {
                            return super.onStartCommand(intent, i11, i12);
                        }
                        return 2;
                    }
                    l0(applicationContext);
                } else if (intent.getStringExtra("param_keyId") != null) {
                    gVar2.j("[SamsungWallet] Ble wake up triggered");
                    ff0.g.d(new ff0.k.e(g2.e.SERVICE_START_REASON_SNA));
                    if (V(booleanExtra)) {
                        if (p0()) {
                            return super.onStartCommand(intent, i11, i12);
                        }
                        return 2;
                    }
                    l0(applicationContext);
                } else {
                    int intExtra = intent.getIntExtra("START_REASON", -1);
                    g2.e eVarFromValue = intExtra != -1 ? g2.e.fromValue(intExtra) : null;
                    i13 = 2;
                    if (eVarFromValue != null) {
                        gVar2.j("ServiceStartReason:" + eVarFromValue.name());
                        ff0.g.d(new ff0.k.e(eVarFromValue));
                    }
                    ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("VINS");
                    String stringExtra = intent.getStringExtra("ACCOUNT_EMAIL");
                    String stringExtra2 = intent.getStringExtra("VEHICLE_NAME");
                    String stringExtra3 = intent.getStringExtra("SELECTED_VIN");
                    if ((stringExtra3 == null || stringExtra3.isEmpty()) && stringArrayListExtra != null && !stringArrayListExtra.isEmpty()) {
                        stringExtra3 = stringArrayListExtra.get(0);
                    }
                    V0(stringExtra3, stringExtra2, stringArrayListExtra);
                    T0(stringExtra);
                    v0();
                    int intExtra2 = intent.getIntExtra("command_id", -1);
                    if (intExtra2 != -1) {
                        if (v.b(intent.getStringExtra("internal_command_nonce"))) {
                            hf0.f fVar = hf0.f.get(intExtra2);
                            if (fVar == null) {
                                gVar2.n("Unknown commandId=" + intExtra2 + ", ignoring");
                            } else {
                                this.f56646i.B(fVar, ic0.f.SOURCE_NOTIFICATION);
                                gVar2.j("Executing notification command via internal nonce path, commandId=" + intExtra2);
                            }
                        } else {
                            gVar2.n("Ignoring command intent — invalid or missing internal nonce, commandId=" + intExtra2);
                        }
                    }
                }
                i13 = 2;
            }
            z11 = booleanExtra;
        } else {
            i13 = 2;
            action = null;
        }
        if ("com.teslamotors.plugins.ble.action.RESTART_PROCESS".equalsIgnoreCase(action) || "com.teslamotors.plugins.ble.action.REINITIALIZE_CONNECTION".equalsIgnoreCase(action) || "com.teslamotors.plugins.ble.action.OEM_WAKE_UP_ON_CAR_FOUND".equalsIgnoreCase(action)) {
            z0(new a1(Boolean.FALSE));
            w.f(applicationContext);
        } else if ("com.teslamotors.plugins.ble.action.RESTART_BG_SCAN".equalsIgnoreCase(action)) {
            z0(new b1());
        }
        Q0(true, null);
        if (intent == null) {
            action = "no-intent";
        } else if (action == null) {
            action = "no-action";
        }
        d1(action);
        if (z11) {
            X0("from onStartCommand: Intent extra: `EXTRA_SERVICE_IN_FOREGROUND` was true. Service was started as foreground service.", null);
        } else {
            ff0.g.d(new ff0.k.f(g2.d.SERVICERUNNINGSTATE_BACKGROUND));
            if (z0.d(this, this.f56649l, this.f56650m, this.B)) {
                u0("from onStartCommand: shouldRunInForeground returned true.");
            } else {
                Y("from onStartCommand: shouldRunInForeground returned false");
            }
        }
        return p0() ? super.onStartCommand(intent, i11, i12) : i13;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
        if (p0()) {
            return;
        }
        X0("onTaskRemoved", y0.g(this));
        c1(true, "onTaskRemoved");
        stopSelf();
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }

    public boolean p0() {
        if (ie0.r.a()) {
            return this.f56638a.get();
        }
        return true;
    }

    protected void u0(String str) {
        boolean zD = z0.d(this, this.f56649l, this.f56650m, this.B);
        com.tesla.logging.g gVar = Z;
        gVar.j("promoteToForegroundIfNeeded called with reason '" + str + "'. Should run in foreground? " + zD);
        boolean z11 = com.teslamotors.plugins.ble.a.f56697a;
        if (z11 && zD) {
            X0(str, null);
            return;
        }
        if (z11) {
            gVar.j("NOT promoting service to foreground because no recently selected VIN supports phone key OR does not contain persisted peripheral mapping");
        } else {
            gVar.j("NOT promoting service to foreground because SDK doesn't require foreground service.");
        }
        Y(str);
    }

    public void v0() {
        this.f56646i.C();
    }

    public void y0() {
        for (g0 g0Var : this.f56647j.values()) {
            if (g0Var.r()) {
                Message message = new Message();
                message.what = hf0.f.ResendDeviceInfoResponse.getWhat();
                g0Var.u(message);
            }
        }
    }
}
