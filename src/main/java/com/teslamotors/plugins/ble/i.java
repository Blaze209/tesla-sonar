package com.teslamotors.plugins.ble;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Base64;
import android.util.Pair;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.teslamotors.plugins.ble.messages.ClearPeripheralInfo;
import com.teslamotors.plugins.ble.messages.NfcSwipeStatus;
import com.teslamotors.plugins.ble.messages.NonUserFeedback;
import hf0.BLESharedFleetFilteredPeripherals;
import hf0.BLESharedFleetPeripheral;
import hf0.JsBridgeEvent;
import hf0.PhoneKeyLog;
import hf0.VehicleStatusWithUpdateFlag;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
import org.spongycastle.jce.provider.BouncyCastleProvider;
import vc0.g2;

/* JADX INFO: loaded from: classes8.dex */
public class i {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static volatile i f56885w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final com.tesla.logging.g f56886x = com.tesla.logging.g.h("BLEModuleHelper");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final ConcurrentHashMap<String, xc0.b> f56887y = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f56889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final he0.b f56890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Messenger f56891d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Messenger f56892e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f56893f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Promise f56894g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Promise f56895h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<Integer, Promise> f56896i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Handler f56897j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private BluetoothManager f56899l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private BluetoothAdapter f56900m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f56901n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final BlockingQueue<Message> f56902o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f56903p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final rb0.a f56904q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f56905r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f56906s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f56907t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BroadcastReceiver f56888a = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicInteger f56898k = new AtomicInteger(1);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    final wm0.e<Pair<String, VehicleStatusWithUpdateFlag>> f56908u = wm0.b.d0().b0();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final ServiceConnection f56909v = new b();

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            i.f56886x.j("Received action: " + action);
            action.getClass();
            if (action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
                if (intExtra == 10) {
                    i.f56886x.j("Bluetooth adapter action is STATE_OFF");
                    ef0.k.f62906a.c();
                    i.this.F(null, null);
                } else {
                    if (intExtra != 12) {
                        return;
                    }
                    i.f56886x.j("Bluetooth adapter action is STATE_ON");
                    ef0.k.f62906a.d();
                    i.this.F(null, null);
                }
            }
        }
    }

    class b implements ServiceConnection {
        b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            i.this.f56891d = new Messenger(iBinder);
            i.this.f56893f = true;
            Message messageObtain = Message.obtain();
            messageObtain.what = hf0.f.Register.getWhat();
            i.this.q0(messageObtain);
            while (true) {
                Message message = (Message) i.this.f56902o.poll();
                if (message == null) {
                    break;
                } else {
                    i.this.q0(message);
                }
            }
            i iVar = i.this;
            iVar.S(iVar.f56901n);
            if (i.this.f56901n) {
                return;
            }
            i.R("BLEService was bound when event subscriptions weren't ready");
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            i.R("onServiceDisconnected");
            i.this.f56893f = false;
            i.this.f56891d = null;
        }
    }

    static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f56912a;

        static {
            int[] iArr = new int[hf0.f.values().length];
            f56912a = iArr;
            try {
                iArr[hf0.f.ClearPeripheralsResult.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f56912a[hf0.f.ScanForPeripheralsResult.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f56912a[hf0.f.VehicleStatusMessage.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f56912a[hf0.f.SendJsBridgeEvent.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f56912a[hf0.f.SwitchProductMessage.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f56912a[hf0.f.VehicleEventMessage.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f56912a[hf0.f.NonUserFeedback.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f56912a[hf0.f.VehicleNfcSwipeStatusMessage.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f56912a[hf0.f.RegisterComplete.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f56912a[hf0.f.ReceiveCommandResponse.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f56912a[hf0.f.SendSharedFleetPeripheralsScanResult.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f56912a[hf0.f.PhoneKeyLog.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    class d extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Bundle data = message.getData();
            data.setClassLoader(getClass().getClassLoader());
            hf0.f fVar = hf0.f.get(message.what);
            i.f56886x.j("handle message " + fVar.name());
            switch (c.f56912a[fVar.ordinal()]) {
                case 1:
                    i.this.Y((hf0.c) data.getParcelable(hf0.f.ClearPeripheralsResult.getKey()));
                    break;
                case 2:
                    i.this.b0((hf0.l) data.getParcelable(hf0.f.ScanForPeripheralsResult.getKey()));
                    break;
                case 3:
                    i.this.f0((VehicleStatusWithUpdateFlag) data.getParcelable(hf0.f.VehicleStatusMessage.getKey()));
                    break;
                case 4:
                    i.this.p0((JsBridgeEvent) data.getParcelable(hf0.f.SendJsBridgeEvent.getKey()));
                    break;
                case 5:
                    i.this.a0((hf0.j) data.getParcelable(hf0.f.SwitchProductMessage.getKey()));
                    break;
                case 6:
                    i.this.d0((hf0.k) data.getParcelable(hf0.f.VehicleEventMessage.getKey()));
                    break;
                case 7:
                    i.this.Z((NonUserFeedback) data.getParcelable(hf0.f.NonUserFeedback.getKey()));
                    break;
                case 8:
                    i.this.e0((NfcSwipeStatus) data.getParcelable(hf0.f.VehicleNfcSwipeStatusMessage.getKey()));
                    break;
                case 9:
                    i.this.F(null, null);
                    break;
                case 10:
                    x.b(data.getByteArray(hf0.f.ReceiveCommandResponse.getKey()));
                    break;
                case 11:
                    i.this.c0((BLESharedFleetFilteredPeripherals) data.getParcelable(hf0.f.SendSharedFleetPeripheralsScanResult.getKey()));
                    break;
                case 12:
                    ff0.i.b((PhoneKeyLog) data.getParcelable(hf0.f.PhoneKeyLog.getKey()));
                    break;
                default:
                    super.handleMessage(message);
                    break;
            }
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f56914a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f56915b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f56916c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f56917d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f56918e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f56919f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f56920g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Boolean f56921h;

        public e(boolean z11, String str, boolean z12, String str2, String str3, boolean z13, boolean z14, Boolean bool) {
            this.f56914a = z11;
            this.f56915b = str;
            this.f56916c = z12;
            this.f56917d = str2;
            this.f56918e = str3;
            this.f56919f = z13;
            this.f56920g = z14;
            this.f56921h = bool;
        }
    }

    private i(Context context, String str) throws Throwable {
        Context applicationContext = context.getApplicationContext();
        this.f56889b = applicationContext;
        this.f56890c = he0.b.m(applicationContext);
        Looper mainLooper = applicationContext.getMainLooper();
        this.f56892e = new Messenger(new d(mainLooper));
        this.f56896i = new ConcurrentHashMap();
        this.f56897j = new Handler(mainLooper);
        this.f56902o = new ArrayBlockingQueue(100);
        this.f56904q = rb0.a.l();
        H(context, str);
    }

    private boolean A0(String str, String str2) {
        ArrayList<String> arrayList = new ArrayList<>(this.f56890c.v());
        String str3 = arrayList.size() > 0 ? arrayList.get(0) : "";
        boolean zB = ie0.c0.b(this.f56889b);
        if (str3.isEmpty() || !zB || !z0.e(this.f56889b, str3, str)) {
            return false;
        }
        z0(str3, str, this.f56890c.y(str3), arrayList, str2);
        return true;
    }

    public static i B(Context context, String str) {
        if (f56885w == null) {
            synchronized (i.class) {
                try {
                    if (f56885w == null) {
                        f56885w = new i(context, str);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f56885w;
    }

    private WritableMap C(hf0.g gVar) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (gVar != null) {
            WritableNativeMap writableNativeMap2 = new WritableNativeMap();
            writableNativeMap2.putString("name", gVar.f72653a);
            writableNativeMap2.putBoolean("connected", gVar.f72654b);
            writableNativeMap2.putString("identifier", gVar.f72655c);
            writableNativeMap2.putInt("rssi", gVar.f72656d);
            writableNativeMap.putMap("C", writableNativeMap2);
        }
        return writableNativeMap;
    }

    private void C0() {
        if (this.f56893f) {
            Message messageObtain = Message.obtain();
            messageObtain.what = hf0.f.Unregister.getWhat();
            q0(messageObtain);
            this.f56889b.unbindService(this.f56909v);
            this.f56893f = false;
        }
        w.b(this.f56889b);
        w.a(this.f56889b);
        this.f56889b.stopService(new Intent(this.f56889b, (Class<?>) BLEService.class));
    }

    private e D() {
        boolean zJ = J();
        String str = this.f56900m == null ? "not_determined" : "authorized";
        String str2 = this.f56905r;
        return new e(zJ, str, str2 != null, str2 != null ? this.f56906s : null, str2 != null ? this.f56907t : null, jf0.d.e(this.f56889b), ie0.c0.d(this.f56889b), jf0.f.a(this.f56889b) ? jf0.d.c() : Boolean.TRUE);
    }

    private WritableMap E() {
        e eVarD = D();
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putBoolean("bluetooth_enabled", eVarD.f56914a);
        writableNativeMap.putString("bluetooth_authorization", eVarD.f56915b);
        writableNativeMap.putBoolean("local_key_pair", eVarD.f56916c);
        writableNativeMap.putString("public_key_id", eVarD.f56917d);
        writableNativeMap.putString("public_key", eVarD.f56918e);
        writableNativeMap.putBoolean("uwb_available", eVarD.f56919f);
        writableNativeMap.putBoolean("uwb_permission", eVarD.f56920g);
        Boolean bool = eVarD.f56921h;
        if (bool != null) {
            writableNativeMap.putBoolean("uwb_capability", bool.booleanValue());
        }
        return writableNativeMap;
    }

    private void E0() {
        j0 j0VarA = k0.f56924a.a("BLEModuleHelper");
        if (j0VarA != null) {
            j0VarA.withdrawAllCard(this.f56889b);
        }
        ef0.p.a();
    }

    private void I() {
        if (this.f56899l == null) {
            BluetoothManager bluetoothManager = (BluetoothManager) this.f56889b.getSystemService("bluetooth");
            this.f56899l = bluetoothManager;
            if (bluetoothManager == null) {
                R("Unable to initialize BluetoothManager.");
            }
        }
        BluetoothAdapter adapter = this.f56899l.getAdapter();
        this.f56900m = adapter;
        if (adapter == null) {
            R("Unable to obtain a BluetoothAdapter.");
        } else {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
            this.f56889b.registerReceiver(this.f56888a, intentFilter);
        }
        ef0.k.f62906a.b(this.f56900m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M(int i11) {
        if (this.f56896i.containsKey(Integer.valueOf(i11))) {
            x(i11, "PHONE_KEY_COMMAND_TIMEOUT", this.f56896i.remove(Integer.valueOf(i11)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N(String str, String str2, String str3, ReadableArray readableArray, Promise promise) {
        f56886x.j("BLEService should be stopped, restarting it");
        y0(str, str2, str3, readableArray, promise);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object O(byte[] bArr) {
        try {
            new wd0.g(this.f56889b.getApplicationContext()).d(qc0.a.f105338d.decode(bArr));
        } catch (IOException e11) {
            f56886x.d("Error decoding ReportRequest", e11);
        }
        return new Object();
    }

    private static void Q(String str, Exception exc) {
        f56886x.d(String.format("[TMBLE Module Error] %s", str), exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void R(String str) {
        f56886x.j(String.format("[TMBLE Module] %s", str));
    }

    private int T() {
        return this.f56898k.getAndAdd(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y(hf0.c cVar) {
        if (this.f56895h != null) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putBoolean("success", cVar.f72646a == df0.b.OK);
            this.f56895h.resolve(writableNativeMap);
            this.f56895h = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z(NonUserFeedback nonUserFeedback) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("comment", nonUserFeedback.getComment());
        com.tesla.logging.a.b(com.tesla.logging.a.EnumC1131a.SUBMIT_NON_USER_REPORT, writableNativeMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0(hf0.j jVar) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("vin", jVar.a());
        com.tesla.logging.a.b(com.tesla.logging.a.EnumC1131a.BLE_PRODUCT_SWITCH, writableNativeMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(hf0.l lVar) {
        if (this.f56894g != null) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putInt("total_found", lVar.f72666c);
            writableNativeMap.putString(AnalyticsAttribute.Error, lVar.f72665b);
            writableNativeMap.putBoolean("success", lVar.f72664a);
            writableNativeMap.putMap("peripherals", C(lVar.f72667d));
            this.f56894g.resolve(writableNativeMap);
            this.f56894g = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(BLESharedFleetFilteredPeripherals bLESharedFleetFilteredPeripherals) {
        Context context = this.f56889b;
        if (context == null || !ie0.e0.f(context)) {
            return;
        }
        WritableArray writableArrayCreateArray = Arguments.createArray();
        for (BLESharedFleetPeripheral bLESharedFleetPeripheral : bLESharedFleetFilteredPeripherals.a()) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putInt("rssi", bLESharedFleetPeripheral.getRssi());
            writableNativeMap.putString("localName", bLESharedFleetPeripheral.getLocalName());
            writableArrayCreateArray.pushMap(writableNativeMap);
        }
        WritableNativeMap writableNativeMap2 = new WritableNativeMap();
        writableNativeMap2.putArray("filteredPeripherals", writableArrayCreateArray);
        com.tesla.logging.a.b(com.tesla.logging.a.EnumC1131a.BLE_SHARED_FLEET_PERIPHERALS, writableNativeMap2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(hf0.k kVar) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("vin", kVar.f72663b);
        writableNativeMap.putString("event_name", kVar.f72662a);
        com.tesla.logging.a.b(com.tesla.logging.a.EnumC1131a.BLE_VEHICLE_EVENT, writableNativeMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(NfcSwipeStatus nfcSwipeStatus) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("vin", nfcSwipeStatus.getVin());
        writableNativeMap.putString("key_id", nfcSwipeStatus.getKeyID());
        writableNativeMap.putString("public_key", nfcSwipeStatus.getPublicKey());
        writableNativeMap.putInt("nfc_presence", nfcSwipeStatus.getNfcPresence().getValue());
        writableNativeMap.putInt("ble_presence", nfcSwipeStatus.getBlePresence().getValue());
        writableNativeMap.putBoolean("unknown", nfcSwipeStatus.getUnknown());
        com.tesla.logging.a.b(com.tesla.logging.a.EnumC1131a.BLE_VEHICLE_NFC_SWIPE, writableNativeMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(VehicleStatusWithUpdateFlag vehicleStatusWithUpdateFlag) {
        hf0.m status = vehicleStatusWithUpdateFlag.getStatus();
        Context context = this.f56889b;
        if (context != null && ie0.e0.f(context)) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            WritableNativeMap writableNativeMap2 = new WritableNativeMap();
            Integer num = status.f72668a;
            boolean z11 = false;
            writableNativeMap2.putInt("df", num == null ? 0 : num.intValue());
            Integer num2 = status.f72670c;
            writableNativeMap2.putInt("dr", num2 == null ? 0 : num2.intValue());
            Integer num3 = status.f72669b;
            writableNativeMap2.putInt("pf", num3 == null ? 0 : num3.intValue());
            Integer num4 = status.f72671d;
            writableNativeMap2.putInt("pr", num4 == null ? 0 : num4.intValue());
            Integer num5 = status.f72672e;
            writableNativeMap2.putInt("tonneau", num5 == null ? 0 : num5.intValue());
            Integer num6 = status.f72673f;
            writableNativeMap2.putInt("tonneauPercentOpen", num6 == null ? 0 : num6.intValue());
            Boolean bool = status.f72674g;
            writableNativeMap2.putBoolean("ft", bool != null && bool.booleanValue());
            Boolean bool2 = status.f72675h;
            writableNativeMap2.putBoolean("rt", bool2 != null && bool2.booleanValue());
            Boolean bool3 = status.f72676i;
            if (bool3 != null && bool3.booleanValue()) {
                z11 = true;
            }
            writableNativeMap2.putBoolean("cp", z11);
            WritableNativeArray writableNativeArray = new WritableNativeArray();
            Iterator<String> it = status.f72691x.iterator();
            while (it.hasNext()) {
                writableNativeArray.pushString(it.next());
            }
            writableNativeMap2.putBoolean("locked", status.f72678k);
            writableNativeMap2.putBoolean("internalLocked", status.f72679l);
            writableNativeMap2.putBoolean("phoneKeyCloseToCenterConsole", status.f72680m);
            Boolean bool4 = status.f72692y;
            if (bool4 != null) {
                writableNativeMap2.putBoolean("userPresent", bool4.booleanValue());
            }
            writableNativeMap.putMap("peripherals", C(status.f72690w));
            writableNativeMap.putBoolean("is_connected", status.f72689v);
            writableNativeMap.putMap("closure_state", writableNativeMap2);
            writableNativeMap.putInt("permissions", status.f72685r);
            writableNativeMap.putString("vin", status.f72682o);
            writableNativeMap.putDouble("timestamp", status.f72686s);
            writableNativeMap.putArray("whitelist_keys", writableNativeArray);
            writableNativeMap.putBoolean("whitelist_has_key", status.f72683p);
            writableNativeMap.putDouble("whitelist_timestamp", status.f72687t);
            writableNativeMap.putInt("session_counter", (int) status.f72684q);
            Boolean bool5 = status.A;
            if (bool5 != null) {
                writableNativeMap.putBoolean("stay_connected_when_unauthorized", bool5.booleanValue());
            }
            com.tesla.logging.a.b(com.tesla.logging.a.EnumC1131a.BLE_VEHICLE_STATUS, writableNativeMap);
        } else if (this.f56889b == null) {
            f56886x.j("not sending BLE_VEHICLE_STATUS to JS because context is null");
        } else {
            f56886x.j("not sending BLE_VEHICLE_STATUS to JS because main activity is not alive");
        }
        xc0.b bVarG = ef0.g.g(status);
        String str = status.f72682o;
        if (str != null) {
            f56887y.put(str, bVarG);
            this.f56908u.onNext(new Pair<>(str, vehicleStatusWithUpdateFlag));
        }
    }

    private static ArrayList<String> g0(ReadableArray readableArray) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(readableArray.toArrayList());
        return arrayList;
    }

    private void l0() {
        try {
            A0(this.f56890c.g(), "from onAppForegrounded: service not bound");
        } catch (Exception e11) {
            Q("Failed to restart BLE service from onAppForegrounded", e11);
        }
    }

    private y.a.TransmissionError.b n0(Message message) {
        Messenger messenger;
        boolean z11 = this.f56893f;
        if (z11 && (messenger = this.f56891d) != null) {
            try {
                message.replyTo = this.f56892e;
                messenger.send(message);
                return null;
            } catch (RemoteException unused) {
                return y.a.TransmissionError.b.SERVICE_REMOTE_EXCEPTION;
            }
        }
        if (!z11) {
            return y.a.TransmissionError.b.SERVICE_NOT_BOUND;
        }
        if (this.f56891d == null) {
            return y.a.TransmissionError.b.SERVICE_NULL;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p0(JsBridgeEvent jsBridgeEvent) {
        try {
            com.tesla.logging.a.b(jsBridgeEvent.getEvent(), ie0.v.b(new JSONObject(jsBridgeEvent.getJsonObjectString())));
        } catch (JSONException e11) {
            f56886x.d("sendJsBridgeEvent", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean q0(Message message) {
        Messenger messenger;
        if (!this.f56893f || (messenger = this.f56891d) == null) {
            return false;
        }
        try {
            message.replyTo = this.f56892e;
            messenger.send(message);
            return true;
        } catch (RemoteException unused) {
            return false;
        }
    }

    private void t(final int i11) {
        this.f56897j.removeCallbacksAndMessages(Integer.valueOf(i11));
        this.f56897j.postAtTime(new Runnable() { // from class: com.teslamotors.plugins.ble.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f56875a.M(i11);
            }
        }, Integer.valueOf(i11), SystemClock.uptimeMillis() + 6000);
    }

    private void v(String str) throws Throwable {
        if (str == null || str.length() == 0) {
            this.f56905r = null;
            this.f56907t = null;
            this.f56906s = null;
            qb0.a.q().Y("");
            E0();
            return;
        }
        if (str.equals(this.f56905r)) {
            return;
        }
        this.f56905r = null;
        this.f56907t = null;
        this.f56906s = null;
        try {
            KeyPair keyPairN = this.f56904q.n(str, this.f56889b);
            if (keyPairN == null) {
                R("Generating key pair for ");
                try {
                    keyPairN = rb0.a.k();
                    if (!this.f56904q.v(keyPairN, str, this.f56889b)) {
                        R("[TMBLE] Unable to store local key pair");
                        keyPairN = null;
                    }
                } catch (Exception e11) {
                    Q("Unrecoverable failure trying to generate local key pair", e11);
                    return;
                }
            } else {
                R("Found key pair");
            }
            if (keyPairN == null) {
                this.f56905r = null;
                return;
            }
            this.f56907t = ie0.q0.b(rb0.a.t(keyPairN.getPublic()));
            String strB = ie0.q0.b(rb0.a.q(keyPairN.getPublic(), 20));
            if (strB.length() >= 8) {
                qb0.a.q().Y(strB);
                this.f56906s = strB.substring(0, 8);
            }
            this.f56905r = str;
        } catch (Exception e12) {
            Q("Unrecoverable failure trying to get local key pair", e12);
        }
    }

    private void x(int i11, String str, Promise promise) {
        if (promise == null) {
            return;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt("id", i11);
        writableNativeMap.putBoolean("success", false);
        writableNativeMap.putString(AnalyticsAttribute.Error, str);
        promise.resolve(writableNativeMap);
    }

    @SuppressLint({"MissingPermission"})
    public String A() {
        BluetoothAdapter bluetoothAdapter = this.f56900m;
        return bluetoothAdapter != null ? bluetoothAdapter.getName() : "unknown";
    }

    @ReactMethod
    public void B0() {
        Message messageObtain = Message.obtain();
        messageObtain.what = hf0.f.StopScanPeripheralsInSharedFleet.getWhat();
        q0(messageObtain);
    }

    @ReactMethod
    public void D0(String str, String str2, String str3, Promise promise) throws Throwable {
        String strReplace = str2.replaceAll("\\n", "").replaceAll("\\r", "").replace("-----BEGIN PRIVATE KEY-----", "").replace("-----END PRIVATE KEY-----", "");
        String strReplace2 = str.replaceAll("\\n", "").replaceAll("\\r", "").replace("-----BEGIN PUBLIC KEY-----", "").replace("-----END PUBLIC KEY-----", "");
        try {
            KeyFactory keyFactory = KeyFactory.getInstance("RSA", new BouncyCastleProvider());
            boolean zW = this.f56904q.w(new KeyPair((RSAPublicKey) keyFactory.generatePublic(new X509EncodedKeySpec(Base64.decode(strReplace2, 2))), keyFactory.generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(strReplace, 2)))), str3, this.f56889b);
            R("[TMCRYPTO] Stored RSA keypair: " + zW);
            if (!zW) {
                str = "";
                str2 = str;
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("privateKey", str2);
            writableNativeMap.putString("publicKey", str);
            promise.resolve(writableNativeMap);
        } catch (Exception e11) {
            f56886x.d("Failed to decode RSA keys", e11);
            promise.reject(new Throwable("Failed to decode RSA keys", e11));
        }
    }

    @ReactMethod
    public void F(String str, Promise promise) {
        Message messageObtain = Message.obtain();
        hf0.f fVar = hf0.f.GetStatus;
        messageObtain.what = fVar.getWhat();
        Bundle bundle = new Bundle();
        bundle.putString(fVar.getKey(), str);
        messageObtain.setData(bundle);
        q0(messageObtain);
        WritableMap writableMapE = E();
        com.tesla.logging.a.b(com.tesla.logging.a.EnumC1131a.BLE_SYSTEM_STATUS, writableMapE.copy());
        if (promise != null) {
            promise.resolve(writableMapE);
        }
    }

    public void F0(boolean z11) {
        td0.m.j().u("svc-background-permission", String.valueOf(z11));
        Message messageObtain = Message.obtain();
        messageObtain.what = hf0.f.UpdateBackgroundServicePermission.getWhat();
        Bundle bundle = new Bundle();
        bundle.putBoolean("svc-background-permission", z11);
        messageObtain.setData(bundle);
        q0(messageObtain);
    }

    @ReactMethod
    public void G(String str, Promise promise) {
        Message messageObtain = Message.obtain();
        hf0.f fVar = hf0.f.GetTokenForKey;
        messageObtain.what = fVar.getWhat();
        messageObtain.arg1 = T();
        Bundle bundle = new Bundle();
        bundle.putString(fVar.getKey(), str);
        messageObtain.setData(bundle);
        q0(messageObtain);
        this.f56896i.put(Integer.valueOf(messageObtain.arg1), promise);
        t(messageObtain.arg1);
    }

    public void H(Context context, String str) throws Throwable {
        I();
        String strG = this.f56890c.g();
        v(strG);
        String strX = this.f56890c.x();
        try {
            A0(strG, "from BLEModuleHelper#initialize: reason: " + str);
        } catch (Exception e11) {
            String str2 = String.format("PRE-LAUNCH: [TMBLE Module] initialize(), Not Starting service - vin: %s account: %s, exception: %s", ie0.q0.f(strX), ie0.q0.e(strG), e11.getMessage());
            this.f56903p = str2;
            f56886x.c(str2);
        }
    }

    public boolean J() {
        return ef0.k.f62906a.a(this.f56900m);
    }

    public boolean K() {
        return this.f56891d != null && this.f56893f;
    }

    public boolean L() {
        return this.f56891d != null;
    }

    @ReactMethod
    public void P(String str, Promise promise) throws Throwable {
        try {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            KeyPair keyPairO = this.f56904q.o(str, this.f56889b);
            if (keyPairO == null) {
                writableNativeMap.putString("privateKey", "");
                writableNativeMap.putString("publicKey", "");
                promise.resolve(writableNativeMap);
                return;
            }
            PrivateKey privateKey = keyPairO.getPrivate();
            RSAPublicKey rSAPublicKey = (RSAPublicKey) keyPairO.getPublic();
            String strEncodeToString = Base64.encodeToString(privateKey.getEncoded(), 2);
            String str2 = "-----BEGIN PUBLIC KEY-----\n\r" + Base64.encodeToString(rSAPublicKey.getEncoded(), 2) + "\n\r-----END PUBLIC KEY-----\n\r";
            writableNativeMap.putString("privateKey", "-----BEGIN PRIVATE KEY-----\n\r" + strEncodeToString + "\n\r-----END PRIVATE KEY-----\n\r");
            writableNativeMap.putString("publicKey", str2);
            promise.resolve(writableNativeMap);
        } catch (Exception e11) {
            f56886x.d("Failed to load RSA keys", e11);
            promise.reject(new Throwable("Failed to load RSA keys", e11));
        }
    }

    @ReactMethod
    public void S(boolean z11) {
        String str;
        this.f56901n = z11;
        if (z11 && (str = this.f56903p) != null) {
            R(str);
            this.f56903p = null;
        }
        Message messageObtain = Message.obtain();
        hf0.f fVar = hf0.f.SetEventSubscriptionsReady;
        messageObtain.what = fVar.getWhat();
        Bundle bundle = new Bundle();
        bundle.putBoolean(fVar.getKey(), this.f56901n);
        messageObtain.setData(bundle);
        if (q0(messageObtain) || !z11) {
            return;
        }
        R("Failed to notify service that event subscriptions were ready");
    }

    public void U(String str, boolean z11) {
        Message messageObtain = Message.obtain();
        hf0.f fVar = hf0.f.PhoneKeySettingChanged;
        messageObtain.what = fVar.getWhat();
        Bundle bundle = new Bundle();
        bundle.putString(fVar.getKey(), str);
        bundle.putBoolean(fVar.getKey2(), z11);
        messageObtain.setData(bundle);
        q0(messageObtain);
    }

    public void V() {
        if (this.f56893f) {
            Message messageObtain = Message.obtain();
            messageObtain.what = hf0.f.AppBackgrounded.getWhat();
            q0(messageObtain);
        }
    }

    public void W() {
        Message messageObtain = Message.obtain();
        messageObtain.what = hf0.f.AppForegrounded.getWhat();
        if (this.f56893f) {
            q0(messageObtain);
        } else {
            this.f56902o.offer(messageObtain);
            l0();
        }
    }

    public void X() {
        if (this.f56893f) {
            Message messageObtain = Message.obtain();
            messageObtain.what = hf0.f.Unregister.getWhat();
            q0(messageObtain);
            this.f56889b.unbindService(this.f56909v);
            this.f56893f = false;
        }
        this.f56889b.unregisterReceiver(this.f56888a);
    }

    @ReactMethod
    public void h0(Promise promise) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        Iterator<String> it = this.f56890c.v().iterator();
        while (it.hasNext()) {
            writableArrayCreateArray.pushString(it.next());
        }
        promise.resolve(writableArrayCreateArray);
    }

    @ReactMethod
    public void i0() {
        Message messageObtain = Message.obtain();
        messageObtain.what = hf0.f.RequestMTU.getWhat();
        q0(messageObtain);
    }

    @ReactMethod
    public void j0() {
        Message messageObtain = Message.obtain();
        messageObtain.what = hf0.f.ResetPeripheral.getWhat();
        q0(messageObtain);
    }

    public void k0(final String str, final String str2, final String str3, final ReadableArray readableArray, final Promise promise) {
        com.tesla.logging.g gVar = f56886x;
        gVar.j("Restarting BLEService");
        gVar.j("Try to stop service to restart");
        C0();
        this.f56897j.postDelayed(new Runnable() { // from class: com.teslamotors.plugins.ble.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f56839a.N(str, str2, str3, readableArray, promise);
            }
        }, 100L);
    }

    @ReactMethod
    public void m0(String str, boolean z11, int i11, boolean z12, Promise promise) throws Throwable {
        this.f56894g = promise;
        Message messageObtain = Message.obtain();
        hf0.f fVar = hf0.f.ScanForPeripherals;
        messageObtain.what = fVar.getWhat();
        Bundle bundle = new Bundle();
        bundle.putString(fVar.getKey(), str);
        bundle.putBoolean(fVar.getKey2(), z12);
        messageObtain.setData(bundle);
        messageObtain.arg1 = z11 ? 1 : 0;
        messageObtain.arg2 = i11;
        if (q0(messageObtain) || this.f56894g == null) {
            return;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt("total_found", 0);
        writableNativeMap.putBoolean("success", false);
        writableNativeMap.putString(AnalyticsAttribute.Error, "scanning_failure");
        writableNativeMap.putMap("peripherals", new WritableNativeMap());
        this.f56894g.resolve(writableNativeMap);
        this.f56894g = null;
        H(this.f56889b, "from BLEModuleHelper#scanForPeripeherals");
    }

    public y.a.TransmissionError.b o0(ic0.e eVar) {
        byte[] bArrEncode = ic0.e.f77490w.encode(eVar);
        Message messageObtain = Message.obtain();
        hf0.f fVar = hf0.f.SendCommandRequest;
        messageObtain.what = fVar.getWhat();
        Bundle bundle = new Bundle();
        bundle.putByteArray(fVar.getKey(), bArrEncode);
        messageObtain.setData(bundle);
        return n0(messageObtain);
    }

    public void r0(final byte[] bArr) {
        Message messageObtain = Message.obtain();
        hf0.f fVar = hf0.f.SendReportServiceRequest;
        messageObtain.what = fVar.getWhat();
        Bundle bundle = new Bundle();
        bundle.putByteArray(fVar.getKey(), bArr);
        messageObtain.setData(bundle);
        if (q0(messageObtain)) {
            return;
        }
        io.reactivex.rxjava3.core.b.f(new Callable() { // from class: com.teslamotors.plugins.ble.g
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f56872a.O(bArr);
            }
        }).k(vm0.a.c()).g();
    }

    public y.a.TransmissionError.b s0(String str, byte[] bArr) {
        Message messageObtain = Message.obtain();
        hf0.f fVar = hf0.f.SendRoutableData;
        messageObtain.what = fVar.getWhat();
        Bundle bundle = new Bundle();
        bundle.putString("vin", str);
        bundle.putByteArray(fVar.getKey(), bArr);
        messageObtain.setData(bundle);
        return n0(messageObtain);
    }

    @ReactMethod
    public void t0(String str) throws Throwable {
        v(str);
        he0.b.m(this.f56889b).E(str);
        if (this.f56893f) {
            Message messageObtain = Message.obtain();
            hf0.f fVar = hf0.f.SetAccountEmail;
            messageObtain.what = fVar.getWhat();
            Bundle bundle = new Bundle();
            bundle.putString(fVar.getKey(), str);
            messageObtain.setData(bundle);
            q0(messageObtain);
        }
    }

    @ReactMethod
    public void u(String str, String str2, Promise promise) {
        Message messageObtain = Message.obtain();
        hf0.f fVar = hf0.f.ClearPeripheral;
        messageObtain.what = fVar.getWhat();
        Bundle bundle = new Bundle();
        bundle.putParcelable(fVar.getKey(), new ClearPeripheralInfo(str, str2));
        messageObtain.setData(bundle);
        boolean zQ0 = q0(messageObtain);
        this.f56895h = promise;
        if (zQ0) {
            return;
        }
        he0.b bVarM = he0.b.m(this.f56889b);
        bVarM.H(str, bVarM.g(), null);
        if (this.f56895h != null) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putBoolean("success", true);
            this.f56895h.resolve(writableNativeMap);
            this.f56895h = null;
        }
        ud0.a.a(com.teslamotors.plugins.ble.e.a(new Map.Entry[]{new AbstractMap.SimpleEntry("type", "mobile-app-clear-peripherals"), new AbstractMap.SimpleEntry("v", 1), new AbstractMap.SimpleEntry(AnalyticsAttribute.Reason, str2)}), false, str);
    }

    @ReactMethod
    public void u0(String str, String str2, ReadableArray readableArray) {
        String strG = he0.b.m(this.f56889b).g();
        if (!this.f56893f) {
            z0(str, strG, str2, g0(readableArray), "from ReactMethod: BLEModuleHelper#setSelectedVin");
            return;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(str);
        arrayList.add(str2);
        Message messageObtain = Message.obtain();
        hf0.f fVar = hf0.f.SetVin;
        messageObtain.what = fVar.getWhat();
        Bundle bundle = new Bundle();
        bundle.putStringArrayList(fVar.getKey(), arrayList);
        bundle.putStringArrayList(fVar.getKey2(), g0(readableArray));
        messageObtain.setData(bundle);
        q0(messageObtain);
    }

    @ReactMethod
    public void v0(String str, boolean z11) {
        Message messageObtain = Message.obtain();
        hf0.f fVar = hf0.f.SetConnectionBehaviorWhenUnauthorized;
        messageObtain.what = fVar.getWhat();
        messageObtain.arg1 = z11 ? 1 : 0;
        Bundle bundle = new Bundle();
        bundle.putString(fVar.getKey(), str);
        messageObtain.setData(bundle);
        q0(messageObtain);
    }

    @ReactMethod
    public void w(String str, Promise promise) {
        try {
            promise.resolve(Boolean.valueOf(this.f56904q.e(str, this.f56889b)));
        } catch (Exception e11) {
            f56886x.d("Failed to delete RSA keys", e11);
            promise.resolve(Boolean.FALSE);
        }
    }

    public void w0(String str, kb0.g.c cVar) {
        if (this.f56893f) {
            Message messageObtain = Message.obtain();
            messageObtain.what = hf0.f.UpdateVehicleConnectivityState.getWhat();
            Bundle bundle = new Bundle();
            hf0.f fVar = hf0.f.SetVin;
            bundle.putString(fVar.getKey(), str);
            bundle.putString(fVar.getKey2(), cVar.name());
            messageObtain.setData(bundle);
            q0(messageObtain);
        }
    }

    @ReactMethod
    public void x0() {
        Message messageObtain = Message.obtain();
        messageObtain.what = hf0.f.StartScanPeripheralsInSharedFleet.getWhat();
        q0(messageObtain);
    }

    public void y(String str) {
        Message messageObtain = Message.obtain();
        hf0.f fVar = hf0.f.PhoneKeyLog;
        messageObtain.what = fVar.getWhat();
        Bundle bundle = new Bundle();
        bundle.putString(fVar.getKey(), str);
        messageObtain.setData(bundle);
        if (this.f56893f) {
            q0(messageObtain);
        } else {
            this.f56902o.offer(messageObtain);
        }
    }

    @ReactMethod
    public void y0(String str, String str2, String str3, ReadableArray readableArray, Promise promise) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putBoolean("success", z0(str, str2, str3, g0(readableArray), "from ReactMethod: BLEModuleHelper#startService"));
        promise.resolve(writableNativeMap);
    }

    public void z() {
        R("Fetching BLE status for widget");
        Message messageObtain = Message.obtain();
        messageObtain.what = hf0.f.WidgetFetchStatus.getWhat();
        q0(messageObtain);
    }

    public boolean z0(String str, String str2, String str3, ArrayList<String> arrayList, String str4) {
        f56886x.j("BLEModuleHelper#startService called with reason: " + str4);
        if (!ie0.c0.b(this.f56889b)) {
            R("BLUETOOTH_CONNECT or BLUETOOTH_SCAN wasn't granted, skip startService");
            return false;
        }
        Intent intent = new Intent(this.f56889b, (Class<?>) BLEService.class);
        intent.putStringArrayListExtra("VINS", arrayList);
        intent.putExtra("SELECTED_VIN", str);
        intent.putExtra("ACCOUNT_EMAIL", str2);
        intent.putExtra("VEHICLE_NAME", str3);
        intent.putExtra("START_REASON", g2.e.SERVICE_START_REASON_JS.getValue());
        ArrayList arrayList2 = new ArrayList(this.f56890c.v());
        ArrayList arrayList3 = new ArrayList();
        for (String str5 : arrayList) {
            if (arrayList2.contains(str5)) {
                arrayList3.add(str5);
            }
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26 || !z0.d(this.f56889b, arrayList3, str2, false)) {
            if (!ie0.e0.d(this.f56889b)) {
                return false;
            }
            f56886x.j("Starting BLE service (not foreground service) because app is in foreground.");
            this.f56889b.startService(intent);
            return this.f56889b.bindService(intent, this.f56909v, 1);
        }
        if (!ie0.r.a() && i11 >= 31 && !ie0.e0.d(this.f56889b)) {
            f56886x.j("NOT Starting BLE as foreground service from background on API 31+");
            return false;
        }
        f56886x.j("Starting BLE as foreground service");
        intent.putExtra("SERVICE_IN_FOREGROUND", true);
        this.f56889b.startForegroundService(intent);
        return this.f56889b.bindService(intent, this.f56909v, 1);
    }
}
