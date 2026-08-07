package com.teslamotors.plugins.ble;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import ch.qos.logback.classic.spi.CallerData;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.tesla.features.FeaturesConfig;
import com.teslamotors.plugins.ble.messages.ClearPeripheralInfo;
import com.teslamotors.plugins.ble.messages.NfcSwipeStatus;
import com.teslamotors.plugins.ble.messages.NonUserFeedback;
import df0.ToVCSECMessageResult;
import ef0.VehicleMessage;
import j$.util.stream.Stream$EL;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import lf0.FiraSessionResult;
import p013kotlin.Pair;
import vc0.c2;
import vc0.c3;
import vc0.e3;
import vc0.h3;
import vc0.i3;
import vc0.j2;
import vc0.o3;
import vc0.p3;
import vc0.v2;
import vc0.y2;

/* JADX INFO: loaded from: classes8.dex */
public class q1 implements g0 {
    private static final com.tesla.logging.g C = com.tesla.logging.g.h("BLEVehicleController");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BLEService f56955a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f56957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private h0 f56958d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Context f56962h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final BluetoothAdapter f56963i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f56964j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final df0.e f56965k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private volatile Handler f56967m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f56968n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private BluetoothLeScanner f56969o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f56971q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f56972r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f56974t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final ye0.n f56976v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final ef0.j f56977w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    if0.c f56978x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    mf0.i f56979y;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set<Peripheral> f56960f = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f56966l = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Long f56975u = 0L;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private WeakReference<h1> f56980z = null;
    private final ScanCallback A = new c();
    private boolean B = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private byte[] f56970p = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f56973s = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile boolean f56961g = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Peripheral f56959e = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ye0.b f56956b = new ye0.b();

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Peripheral f56981a;

        a(Peripheral peripheral) {
            this.f56981a = peripheral;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            boolean zC = q1.this.f56977w.c();
            q1.this.f56977w.e();
            q1.this.C0(this.f56981a, zC);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean zIsOffloadedFilteringSupported;
            if (q1.this.f56955a.o0() || q1.this.f56968n || !z0.e(q1.this.f56962h, q1.this.f56957c, q1.this.f56964j)) {
                return;
            }
            q1 q1Var = q1.this;
            q1Var.f56969o = q1Var.f56963i == null ? null : q1.this.f56963i.getBluetoothLeScanner();
            if (q1.this.f56969o == null) {
                q1.this.E("Failed to BG Scan - Unable to obtain a Bluetooth LE Scanner/Adapter/Manager");
                return;
            }
            if (q1.this.m0()) {
                q1.this.E("Skipping BG Scan - already has connected peripheral");
                return;
            }
            if (!q1.this.l0()) {
                q1.this.E("Skipping BG Scan - adapter not enabled");
                return;
            }
            if (q1.this.f56966l != null) {
                try {
                    zIsOffloadedFilteringSupported = q1.this.f56963i.isOffloadedFilteringSupported();
                } catch (Exception unused) {
                    zIsOffloadedFilteringSupported = false;
                }
                if (!zIsOffloadedFilteringSupported) {
                    q1.this.E("Skipping BG Scan - offloaded filtering NOT supported");
                    return;
                }
                ScanSettings scanSettingsBuild = new ScanSettings.Builder().setScanMode(0).build();
                ArrayList arrayList = new ArrayList();
                if (q1.this.f56966l != null) {
                    arrayList.add(new ScanFilter.Builder().setDeviceAddress(q1.this.f56966l).build());
                }
                q1.this.E(String.format("Starting BG Scan for %s address(es)", Integer.valueOf(arrayList.size())));
                try {
                    if (ie0.c0.c(q1.this.f56962h)) {
                        q1.this.f56969o.startScan(arrayList, scanSettingsBuild, q1.this.A);
                        q1.this.f56968n = true;
                    } else {
                        q1.this.E("BLUETOOTH_SCAN permission is not granted, cannot start background scan");
                    }
                } catch (Exception e11) {
                    q1.this.p("BG Scan failed", e11);
                }
                w.e(q1.this.f56962h);
            }
        }
    }

    class c extends ScanCallback {
        c() {
        }

        private void a(ScanResult scanResult) {
            BluetoothDevice device;
            if ((Build.VERSION.SDK_INT >= 26 && !scanResult.isConnectable()) || scanResult == null || (device = scanResult.getDevice()) == null || q1.this.f56959e == null || !device.getAddress().equals(q1.this.f56959e.getIdentifier()) || q1.this.f56959e.isConnected()) {
                return;
            }
            if (!q1.this.f56959e.shouldTryBackgroundScanConnect() || scanResult.getRssi() <= -95) {
                q1 q1Var = q1.this;
                q1Var.E(String.format("BG Scan; NOT re-initializing connection to %s - last connection occurred %s seconds ago / RSSI: %s", q1Var.f56959e, Long.valueOf(q1.this.f56959e.secondsSinceConnect()), Integer.valueOf(scanResult.getRssi())));
            } else {
                q1 q1Var2 = q1.this;
                q1Var2.E(String.format("BG Scan; making direct connection to %s with RSSI %s", q1Var2.f56959e, Integer.valueOf(scanResult.getRssi())));
                q1 q1Var3 = q1.this;
                q1Var3.D0(q1Var3.f56959e);
            }
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanFailed(int i11) {
            q1.this.E(String.format("BG Scan failed with error %s", ie0.q0.h(i11)));
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanResult(int i11, ScanResult scanResult) {
            a(scanResult);
        }
    }

    class d implements mf0.k {
        d() {
        }

        @Override // mf0.k
        public void a(@NonNull List<Integer> list) {
            q1.this.L0(list);
        }

        @Override // mf0.k
        public void b(@NonNull FiraSessionResult firaSessionResult) {
            q1.this.K0(firaSessionResult.getResponse());
        }

        @Override // mf0.k
        public void c(@NonNull vc0.n0 n0Var) {
            q1.this.J0(n0Var);
        }
    }

    static /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f56986a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f56987b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f56988c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final /* synthetic */ int[] f56989d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final /* synthetic */ int[] f56990e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final /* synthetic */ int[] f56991f;

        static {
            int[] iArr = new int[vc0.a0.values().length];
            f56991f = iArr;
            try {
                iArr[vc0.a0.CPD_NOTIFICATION_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f56991f[vc0.a0.CPD_NOTIFICATION_INITIAL_WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f56991f[vc0.a0.CPD_NOTIFICATION_ESCALATED_WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[o3.values().length];
            f56990e = iArr2;
            try {
                iArr2[o3.WHITELISTOPERATION_INFORMATION_KEYFOB_SLOTS_FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f56990e[o3.WHITELISTOPERATION_INFORMATION_WHITELIST_FULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f56990e[o3.WHITELISTOPERATION_INFORMATION_KEYCHAIN_WHILE_FS_FULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f56990e[o3.WHITELISTOPERATION_INFORMATION_NO_PERMISSION_TO_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[vc0.g.values().length];
            f56989d = iArr3;
            try {
                iArr3[vc0.g.APP_DEVICE_INFO_REQUEST_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f56989d[vc0.g.APP_DEVICE_INFO_REQUEST_GET_MODEL_NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f56989d[vc0.g.APP_DEVICE_INFO_REQUEST_ONCHANGE_BATTERY_STATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            int[] iArr4 = new int[h3.values().length];
            f56988c = iArr4;
            try {
                iArr4[h3.VEHICLE_SLEEP_STATUS_AWAKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f56988c[h3.VEHICLE_SLEEP_STATUS_ASLEEP.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            int[] iArr5 = new int[v2.values().length];
            f56987b = iArr5;
            try {
                iArr5[v2.SIGNATURE_TYPE_AES_GCM.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f56987b[v2.SIGNATURE_TYPE_AES_GCM_TOKEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f56987b[v2.SIGNATURE_TYPE_PRESENT_KEY.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f56987b[v2.SIGNATURE_TYPE_UNSIGNED.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            int[] iArr6 = new int[hf0.f.values().length];
            f56986a = iArr6;
            try {
                iArr6[hf0.f.ClearPeripheral.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f56986a[hf0.f.RequestMTU.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f56986a[hf0.f.ResetPeripheral.ordinal()] = 3;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f56986a[hf0.f.SetConnectionBehaviorWhenUnauthorized.ordinal()] = 4;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f56986a[hf0.f.ResendDeviceInfoResponse.ordinal()] = 5;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f56986a[hf0.f.PhoneKeyLog.ordinal()] = 6;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f56986a[hf0.f.PhoneKeySettingChanged.ordinal()] = 7;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f56986a[hf0.f.LockCar.ordinal()] = 8;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f56986a[hf0.f.UnlockCar.ordinal()] = 9;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f56986a[hf0.f.OpenTrunk.ordinal()] = 10;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f56986a[hf0.f.OpenFrunk.ordinal()] = 11;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    public q1(@NonNull String str, ye0.n nVar, String str2, Context context, BluetoothAdapter bluetoothAdapter, BLEService bLEService, FeaturesConfig featuresConfig) {
        this.f56957c = str;
        this.f56976v = nVar;
        this.f56964j = str2;
        this.f56963i = bluetoothAdapter;
        this.f56962h = context;
        this.f56977w = new ef0.j(context, "tesla:ble-reconnect");
        h0 h0VarJ = h0.j(this, str, str2, context, nVar);
        this.f56958d = h0VarJ;
        h0VarJ.start();
        df0.e eVar = new df0.e();
        this.f56965k = eVar;
        this.f56955a = bLEService;
        this.f56972r = he0.b.m(context).W(str, str2);
        eVar.h(he0.b.m(context).T(str, str2));
        eVar.f(1.0d);
        this.f56967m = new Handler(Looper.getMainLooper());
        if (o0() && this.f56978x == null) {
            N0();
        }
        f();
        s();
    }

    private void G0(String[] strArr) {
        if (this.f56955a.I == null || !this.f56958d.getOnWhitelist()) {
            return;
        }
        final Pair<vc0.r, wn0.a<jn0.h0>> pairD = this.f56955a.I.d(this.f56957c, vc0.m.AUTHENTICATION_LEVEL_DRIVE, strArr);
        vc0.r rVarE = pairD.e();
        Peripheral peripheral = this.f56959e;
        if (peripheral != null) {
            peripheral.getTimelineTracker().i();
        }
        this.f56976v.h(rVarE, System.currentTimeMillis(), new ce0.d() { // from class: com.teslamotors.plugins.ble.p1
            @Override // ce0.d
            public final void a(ic0.g gVar) {
                this.f56950a.u0(pairD, gVar);
            }
        });
    }

    public static /* synthetic */ void I(ic0.g gVar) {
    }

    private void N0() {
        E("setup UWB");
        this.f56979y = new mf0.d(this.f56962h, this.f56957c, new d());
        this.f56978x = new if0.c(this.f56962h, this.f56957c, new Runnable() { // from class: com.teslamotors.plugins.ble.i1
            @Override // java.lang.Runnable
            public final void run() {
                this.f56922a.v0();
            }
        }, this.f56979y);
    }

    private String a0(String str) {
        if (Build.VERSION.SDK_INT > 26 || str == null || (ie0.q0.a(str.split(":")[0])[0] & 192) == 128) {
            return null;
        }
        return str;
    }

    private void c0() {
        Peripheral peripheral = this.f56959e;
        if (peripheral != null) {
            cf0.e timelineTracker = peripheral.getTimelineTracker();
            timelineTracker.j();
            timelineTracker.g(this.f56957c);
            timelineTracker.q();
        }
    }

    private void f0() {
        E("Disabling battery monitoring for VIN");
        ef0.f.INSTANCE.a().m(this.f56962h, this.f56957c);
    }

    private void g0() {
        this.f56977w.e();
        if (this.f56959e != null) {
            E(String.format("disconnecting peripheral %s", this.f56959e));
            this.f56959e.disconnect();
            this.f56959e = null;
        }
        this.f56966l = null;
        f0();
        i(true);
    }

    private void h0() {
        E("Enabling battery monitoring for VIN");
        ef0.f.INSTANCE.a().n(this.f56962h, this.f56957c, new wn0.r() { // from class: com.teslamotors.plugins.ble.k1
            @Override // wn0.r
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return this.f56927a.s0((Integer) obj, (vc0.v) obj2, (j2) obj3, (Boolean) obj4);
            }
        });
    }

    private HandlePulledWithoutAuthDiagnosisInfo i0() {
        boolean z11 = this.f56959e != null && r();
        boolean zL0 = l0();
        long jLongValue = this.f56975u.longValue();
        Long connectedTimestamp = z11 ? this.f56959e.getConnectedTimestamp() : null;
        Long disconnectedTimestamp = z11 ? this.f56959e.getDisconnectedTimestamp() : null;
        Long createdTimestamp = z11 ? this.f56959e.getCreatedTimestamp() : null;
        BLEService bLEService = this.f56955a;
        return new HandlePulledWithoutAuthDiagnosisInfo(zL0, jLongValue, connectedTimestamp, disconnectedTimestamp, createdTimestamp, bLEService != null ? bLEService.a0() : null);
    }

    private u5.d<String, String> j0() {
        String strR = he0.b.m(this.f56962h).r(this.f56957c, this.f56964j);
        if (strR == null) {
            return null;
        }
        String[] strArrSplit = strR.split("-");
        if (strArrSplit.length == 2) {
            return new u5.d<>(strArrSplit[0], strArrSplit[1]);
        }
        return null;
    }

    private h1 k0() {
        WeakReference<h1> weakReference = this.f56980z;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    private boolean o0() {
        return jf0.d.e(this.f56962h) && jf0.d.i(this.f56957c);
    }

    private boolean p0() {
        return o0() && this.f56978x != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q0() {
        i(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r0() {
        E("sendDeviceInfoResponse after connectionEstablished");
        this.f56976v.j(this.f56962h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ jn0.h0 s0(Integer num, vc0.v vVar, j2 j2Var, Boolean bool) {
        C.a(String.format("[%s] Battery changed: %d%%, state: %s, thermal: %s, lowPower: %s", ie0.q0.f(this.f56957c), num, vVar, j2Var, bool));
        this.f56976v.k(this.f56962h, num.intValue(), vVar, j2Var, bool.booleanValue());
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t0(Pair pair, ic0.g gVar) {
        if (gVar.getResult() == ic0.h.RESULT_SUCCESS) {
            ((wn0.a) pair.f()).invoke();
            c0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u0(Pair pair, ic0.g gVar) {
        if (gVar.getResult() == ic0.h.RESULT_SUCCESS) {
            ((wn0.a) pair.f()).invoke();
            c0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v0() {
        this.f56955a.u0("UWB session prepare");
    }

    private void w0() {
        q1 q1Var;
        E("loadPeripherals() called. Resetting connection flag!");
        this.f56961g = false;
        u5.d<String, String> dVarJ0 = j0();
        if (dVarJ0 != null) {
            q1Var = this;
            Peripheral peripheral = new Peripheral(dVarJ0.f115407a, q(), this.f56963i.getRemoteDevice(dVarJ0.f115408b), null, q1Var, this.f56963i, null, this.f56962h);
            peripheral.setConnectedListener(k0());
            q1Var.f56959e = peripheral;
        } else {
            q1Var = this;
        }
        q1Var.f56966l = q1Var.f56959e == null ? null : a0(q1Var.f56959e.getIdentifier());
    }

    private void x0(byte[] bArr, String str) {
        String strB = ie0.q0.b(bArr);
        VehicleMessage vehicleMessageB = ef0.o.b(bArr);
        y.a.TransmissionError.b bVar = str.equals("PHONE_KEY_NOT_CONNECTED") ? y.a.TransmissionError.b.NOT_CONNECTED : y.a.TransmissionError.b.TRANSMISSION_ERROR;
        if (vehicleMessageB.getRoutableMessage() != null) {
            ye0.j.E(new y.a.TransmissionError(id0.d.a(vehicleMessageB.getRoutableMessage(), C, false), this.f56957c, bVar, y.a.TransmissionError.EnumC1153a.ROUTABLE_MESSAGE));
            return;
        }
        if (vehicleMessageB.getFromVCSECMessage() != null) {
            Long lB = this.f56956b.b(bArr);
            if (lB == null) {
                C.c(String.format("message %s not found in message manager", strB));
            } else {
                ye0.j.E(new y.a.TransmissionError(lB.toString(), this.f56957c, bVar, y.a.TransmissionError.EnumC1153a.TO_VCSEC_MESSAGE));
            }
        }
    }

    private void y0(byte[] bArr) {
        String strB = ie0.q0.b(bArr);
        if (ef0.o.b(bArr).getFromVCSECMessage() == null || !this.f56956b.a(bArr)) {
            return;
        }
        Long lB = this.f56956b.b(bArr);
        if (lB == null) {
            C.c(String.format("message %s not found in message manager", strB));
        } else {
            ye0.j.E(new y.ReceivedLegacyCommandResult(lB.toString(), this.f56957c, df0.b.OK, null));
        }
    }

    @SuppressLint({"DefaultLocale"})
    private boolean z0(vc0.p pVar, long j11) {
        boolean z11;
        String[] strArrA = ve0.a.a(pVar.c());
        boolean z12 = true;
        if (strArrA.length > 0) {
            this.f56965k.f60532d = strArrA;
            z11 = true;
        } else {
            z11 = false;
        }
        E(String.format("Received auth request with level %s. auth reasons: '%s'. Trying to reply", pVar.getRequestedLevel(), Arrays.toString(this.f56965k.f60532d)));
        vc0.q sessionInfo = pVar.getSessionInfo();
        boolean z13 = sessionInfo != null && sessionInfo.getToken().D() == 20;
        if (z13 && this.f56972r < 1) {
            he0.b.m(this.f56962h).Q(this.f56957c, this.f56964j, 1L);
            this.f56972r = 1L;
        }
        vc0.m requestedLevel = pVar.getRequestedLevel();
        vc0.m mVar = vc0.m.AUTHENTICATION_LEVEL_NONE;
        if (requestedLevel != mVar && this.f56972r >= 1 && !z13) {
            z12 = false;
        }
        if (this.f56958d.getOnWhitelist()) {
            if (z12) {
                if (sessionInfo != null) {
                    E(String.format("has token of size %d", Integer.valueOf(sessionInfo.getToken().D())));
                }
                rd0.h hVar = this.f56955a.I;
                if (hVar != null) {
                    final Pair<vc0.r, wn0.a<jn0.h0>> pairD = hVar.d(this.f56957c, pVar.getRequestedLevel(), strArrA);
                    vc0.r rVarE = pairD.e();
                    Peripheral peripheral = this.f56959e;
                    if (peripheral != null) {
                        peripheral.getTimelineTracker().i();
                    }
                    this.f56976v.h(rVarE, j11, new ce0.d() { // from class: com.teslamotors.plugins.ble.m1
                        @Override // ce0.d
                        public final void a(ic0.g gVar) {
                            this.f56936a.t0(pairD, gVar);
                        }
                    });
                    return z11;
                }
            } else {
                E("replying to token-less auth challenge with null auth");
                this.f56976v.h(new vc0.r(mVar, 0, vc0.o.AUTHENTICATIONREJECTION_NO_TOKEN, okio.k.f97943e), j11, new ce0.d() { // from class: com.teslamotors.plugins.ble.n1
                    @Override // ce0.d
                    public final void a(ic0.g gVar) {
                        q1.I(gVar);
                    }
                });
            }
        }
        return z11;
    }

    @Override // com.teslamotors.plugins.ble.g0
    public void A() {
        this.f56958d.getType();
        h0.d dVar = h0.d.LEGACY;
    }

    public void A0(vc0.i0 i0Var, Peripheral peripheral, long j11) {
        y2 signedMessageStatus = i0Var.getSignedMessageStatus();
        if (signedMessageStatus == null) {
            E("message status is null");
            return;
        }
        ff0.g.e(this.f56957c, new ff0.m.d());
        int iC = signedMessageStatus.getCounter();
        Integer numValueOf = Integer.valueOf(iC);
        if (this.f56956b.c(iC) != null) {
            ye0.j.E(new y.ReceivedLegacyCommandResult(numValueOf.toString(), this.f56957c, df0.b.fromOperationStatus(i0Var.getOperationStatus()), Long.valueOf(j11)));
        } else {
            E(String.format("%d not found in message manager", numValueOf));
        }
        if (i0Var.getOperationStatus().equals(c2.OPERATIONSTATUS_OK)) {
            this.f56960f.remove(peripheral);
        }
    }

    @Override // com.teslamotors.plugins.ble.g0
    public void B(hf0.f fVar, ic0.f fVar2) {
        switch (e.f56986a[fVar.ordinal()]) {
            case 8:
                this.f56976v.p(fVar2);
                break;
            case 9:
                this.f56976v.u(fVar2);
                break;
            case 10:
                this.f56976v.s(fVar2);
                break;
            case 11:
                this.f56976v.r(fVar2);
                break;
            default:
                E(String.format("Unsupported message type for command center: %s", fVar.name()));
                break;
        }
    }

    @SuppressLint({"DefaultLocale"})
    public void B0(vc0.w0 w0Var, Peripheral peripheral, boolean z11, long j11) {
        boolean z12;
        vc0.z zVar;
        NfcSwipeStatus nfcSwipeStatusD;
        vc0.m1 m1VarB;
        NfcSwipeStatus nfcSwipeStatusC;
        p3 whitelistOperationStatus;
        vc0.e alertHandlePulledWithoutAuth;
        this.f56958d.f(w0Var, peripheral, j11);
        if (this.f56958d.getOnWhitelist() && !this.B) {
            this.B = true;
            this.f56955a.u0("device found on whitelist for " + q());
        }
        if (w0Var.getWhitelistInfo() != null) {
            double dCurrentTimeMillis = System.currentTimeMillis() / 1000.0d;
            he0.b.m(this.f56962h).N(this.f56957c, this.f56964j, Math.round(dCurrentTimeMillis));
            this.f56965k.h(dCurrentTimeMillis);
        }
        i3 vehicleStatus = w0Var.getVehicleStatus();
        String strQ = q();
        if (vehicleStatus != null) {
            this.f56965k.f(System.currentTimeMillis());
            this.f56965k.g(vehicleStatus);
            if (strQ != null) {
                rd0.h hVar = this.f56955a.I;
                if (hVar != null) {
                    hVar.g(strQ, vehicleStatus.getUserPresence());
                }
                int i11 = e.f56988c[vehicleStatus.getVehicleSleepStatus().ordinal()];
                if (i11 == 1) {
                    kb0.g.f85866a.z(strQ, kb0.g.c.ONLINE);
                } else if (i11 == 2) {
                    kb0.g.f85866a.z(strQ, kb0.g.c.OFFLINE);
                }
            }
            df0.e eVar = this.f56965k;
            E(String.format("Got vehicle status: %s - %s", eVar, eVar.i()));
            z12 = true;
        } else {
            z12 = false;
        }
        vc0.p authenticationRequest = w0Var.getAuthenticationRequest();
        if (authenticationRequest != null) {
            z12 = z0(authenticationRequest, j11) || z12;
        }
        if (w0Var.getGenealogyRequest() == vc0.z0.GENEALOGYREQUEST_READ && this.f56958d.getOnWhitelist()) {
            this.f56976v.q();
        }
        vc0.g appDeviceInfoRequest = w0Var.getAppDeviceInfoRequest();
        if (appDeviceInfoRequest != null) {
            int i12 = e.f56989d[appDeviceInfoRequest.ordinal()];
            if (i12 == 2) {
                this.f56976v.j(this.f56962h);
            } else if (i12 == 3) {
                E("Received Battery State Monitoring request");
                h0();
            }
        }
        if (w0Var.getAlert() != null && (alertHandlePulledWithoutAuth = w0Var.getAlert().getAlertHandlePulledWithoutAuth()) != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Peripheral peripheral2 = this.f56959e;
            if (peripheral2 != null) {
                peripheral2.getTimelineTracker().n();
            }
            f0.s(this.f56955a, this.f56976v, this.f56957c, jCurrentTimeMillis, i0(), false, alertHandlePulledWithoutAuth);
            StringBuilder sb2 = new StringBuilder("Failed Handle Pull handle: " + alertHandlePulledWithoutAuth.getHandlePulled());
            sb2.append(" timeSince(ms): ");
            sb2.append(alertHandlePulledWithoutAuth.getTimeSinceAlertSet_ms());
            sb2.append(" connectionCount: ");
            sb2.append(alertHandlePulledWithoutAuth.getConnectionCount());
            sb2.append(" unknown device present: ");
            sb2.append(alertHandlePulledWithoutAuth.getUnknownDevicePresent());
            sb2.append(" devices: ");
            for (vc0.c1 c1Var : alertHandlePulledWithoutAuth.e()) {
                sb2.append(" keyChannel: ");
                sb2.append(c1Var.getKeyChannel());
                sb2.append(" authenticationLevel: ");
                sb2.append(c1Var.getAuthenticationLevel());
                sb2.append(" present: ");
                sb2.append(c1Var.getPresent());
                sb2.append(" left: ");
                sb2.append(c1Var.getRSSILeft());
                sb2.append(" right: ");
                sb2.append(c1Var.getRSSIRight());
                sb2.append(" rear: ");
                sb2.append(c1Var.getRSSIRear());
                sb2.append(" center: ");
                sb2.append(c1Var.getRSSICenter());
                sb2.append(" front: ");
                sb2.append(c1Var.getRSSIFront());
                sb2.append(" secondary: ");
                sb2.append(c1Var.getRSSISecondary());
                sb2.append(" nFCCradle: ");
                sb2.append(c1Var.getRSSINFCCradle());
                sb2.append(" rearLeft: ");
                sb2.append(c1Var.getRSSIRearLeft());
                sb2.append(" rearRight: ");
                sb2.append(c1Var.getRSSIRearRight());
                sb2.append(" highThreshLeftPresent: ");
                sb2.append(c1Var.getHighThreshCenterPresent());
                sb2.append(" highThreshRightPresent: ");
                sb2.append(c1Var.getHighThreshRightPresent());
                sb2.append(" highThreshCenterPresent: ");
                sb2.append(c1Var.getHighThreshCenterPresent());
                sb2.append(" highThreshFrontPresent: ");
                sb2.append(c1Var.getHighThreshFrontPresent());
                sb2.append(" highThreshRearPresent: ");
                sb2.append(c1Var.getHighThreshRearPresent());
                sb2.append(" highThreshRearLeftPresent: ");
                sb2.append(c1Var.getHighThreshRearLeftPresent());
                sb2.append(" highThreshRearRightPresent: ");
                sb2.append(c1Var.getHighThreshRearRightPresent());
                sb2.append(" highThreshSecondaryPresent: ");
                sb2.append(c1Var.getHighThreshSecondaryPresent());
                sb2.append(" highThreshNFCPresent: ");
                sb2.append(c1Var.getHighThreshNFCPresent());
                sb2.append(" sortedDeltaBayesLeftPresent: ");
                sb2.append(c1Var.getSortedDeltaBayesLeftPresent());
                sb2.append(" sortedDeltaBayesRightPresent: ");
                sb2.append(c1Var.getSortedDeltaBayesRightPresent());
                sb2.append(" rawDeltaBayesLeftPresent: ");
                sb2.append(c1Var.getRawDeltaBayesLeftPresent());
                sb2.append(" rawDeltaBayesRightPresent: ");
                sb2.append(c1Var.getRawDeltaBayesRightPresent());
            }
            E(sb2.toString());
            I0("handle_pulled_without_auth", true);
            if (com.tesla.features.a.a().getAutoDrivenotes().getHandlePulledWithoutAuth()) {
                this.f56955a.M0(new NonUserFeedback("HandlePulled Alert for vin:" + this.f56957c + " " + new Date(jCurrentTimeMillis - ((long) alertHandlePulledWithoutAuth.getTimeSinceAlertSet_ms()))));
            }
        }
        vc0.i0 commandStatus = w0Var.getCommandStatus();
        if (commandStatus != null && (whitelistOperationStatus = commandStatus.getWhitelistOperationStatus()) != null) {
            o3 whitelistOperationInformation = whitelistOperationStatus.getWhitelistOperationInformation();
            if (whitelistOperationInformation != o3.WHITELISTOPERATION_INFORMATION_NONE) {
                HashMap map = new HashMap();
                map.put("type", "mobile-app-whitelist-operation-failure");
                map.put("information", whitelistOperationInformation.name());
                ud0.a.a(map, false, null);
            }
            int i13 = e.f56990e[whitelistOperationInformation.ordinal()];
            if (i13 == 1 || i13 == 2 || i13 == 3) {
                H0("whitelist_is_full");
            } else if (i13 == 4) {
                H0("no_permission_to_add");
            }
        }
        vc0.n1 keyStatusInfo = w0Var.getKeyStatusInfo();
        if (this.f56955a != null && keyStatusInfo != null && (m1VarB = ef0.g.b(keyStatusInfo)) != null && (nfcSwipeStatusC = ef0.g.c(m1VarB, this.f56958d.h(), this.f56957c)) != null) {
            this.f56955a.L0(nfcSwipeStatusC);
        }
        c3 unknownKeyInfo = w0Var.getUnknownKeyInfo();
        if (this.f56955a != null && unknownKeyInfo != null && (nfcSwipeStatusD = ef0.g.d(unknownKeyInfo, this.f56958d.h(), this.f56957c)) != null) {
            this.f56955a.L0(nfcSwipeStatusD);
        }
        vc0.y vCSEC_CPDMessage = w0Var.getVCSEC_CPDMessage();
        if (vCSEC_CPDMessage != null) {
            vc0.a0 cPDNotification = vCSEC_CPDMessage.getCPDNotification();
            int[] iArr = e.f56991f;
            int i14 = iArr[cPDNotification.ordinal()];
            if (i14 == 2 || i14 == 3) {
                y0.l(this.f56962h);
            }
            int i15 = iArr[cPDNotification.ordinal()];
            if (i15 == 1) {
                zVar = vc0.z.CPD_NOTIFICATION_RESPONSE_ERROR;
            } else if (i15 == 2) {
                zVar = vc0.z.CPD_NOTIFICATION_RESPONSE_INITIAL_WARNING_RECEIVED;
            } else {
                if (i15 != 3) {
                    throw new IncompatibleClassChangeError();
                }
                zVar = vc0.z.CPD_NOTIFICATION_RESPONSE_ESCALATED_WARNING_RECEIVED;
            }
            this.f56976v.i(zVar);
        }
        vc0.q0 vCSEC_FiraRequest = w0Var.getVCSEC_FiraRequest();
        if (vCSEC_FiraRequest != null && jf0.d.e(this.f56962h)) {
            if (ie0.c0.d(this.f56962h)) {
                jf0.d.j(this.f56957c, true);
                if (this.f56978x == null) {
                    N0();
                    this.f56978x.i();
                }
                if (!this.f56978x.h()) {
                    this.f56979y.b(vCSEC_FiraRequest);
                }
            } else {
                y0.n(this.f56962h, this.f56957c);
            }
        }
        if (p0()) {
            vc0.y1 vCSEC_NISessionStop = w0Var.getVCSEC_NISessionStop();
            if (vCSEC_NISessionStop != null) {
                this.f56979y.d(Stream$EL.toList(vCSEC_NISessionStop.c().stream().map(new Function() { // from class: com.teslamotors.plugins.ble.j1
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return Integer.valueOf(((vc0.t) obj).getValue());
                    }
                })), mf0.j.STOP_REASON_VEHICLE_FIRA_STOP_EVENT);
            }
            if (w0Var.getCapabilities() != null) {
                this.f56979y.h();
            }
        }
        i(z12);
    }

    @Override // com.teslamotors.plugins.ble.g0
    public void C() {
        if (this.f56959e != null) {
            this.f56959e.recreateGattIfNull();
        }
    }

    synchronized void C0(Peripheral peripheral, boolean z11) throws Throwable {
        try {
            try {
                if (this.f56973s) {
                    this.f56973s = false;
                    E(String.format("%s [resetPeripheral] reconnecting now", peripheral));
                    long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f56974t;
                    Peripheral peripheral2 = new Peripheral(peripheral.getPosition(), q(), this.f56963i.getRemoteDevice(peripheral.getIdentifier()), null, this, this.f56963i, null, this.f56962h);
                    peripheral2.getTimelineTracker().resetPeripheralDelayMs = jElapsedRealtime;
                    peripheral2.getTimelineTracker().resetPeripheralWakeLockHeld = z11;
                    peripheral2.setConnectedListener(k0());
                    this.f56959e = peripheral2;
                    e0(peripheral2);
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // com.teslamotors.plugins.ble.g0
    public boolean D() {
        return this.f56970p != null;
    }

    public void D0(Peripheral peripheral) {
        if (peripheral == null || peripheral.isConnected() || this.f56973s) {
            return;
        }
        l(peripheral, "reinitialization");
    }

    @Override // com.teslamotors.plugins.ble.g0
    public void E(String str) {
        C.j(String.format("[%s] (%s) %s", ie0.q0.f(this.f56957c), Integer.valueOf(hashCode()), str));
    }

    public void E0() {
        if (this.f56959e == null || !this.f56961g) {
            return;
        }
        this.f56959e.requestMtuDebug();
    }

    @Override // com.teslamotors.plugins.ble.g0
    public void F(Peripheral peripheral) {
        this.f56966l = this.f56959e == null ? null : a0(this.f56959e.getIdentifier());
        String str = peripheral != null ? String.format("%s%s%s", peripheral.getPosition(), "-", peripheral.getIdentifier()) : null;
        E(String.format("Setting stored device address to %s", str));
        he0.b.m(this.f56962h).H(this.f56957c, this.f56964j, str);
        if (str == null) {
            w.b(this.f56962h);
        } else {
            w.f(this.f56962h);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("checking descriptors is empty: ");
        boolean z11 = false;
        sb2.append(str == null);
        E(sb2.toString());
        E("checking isUserAllowBackgroundServiceRunning: " + this.f56955a.p0());
        StringBuilder sb3 = new StringBuilder();
        sb3.append("resetting boot receiver flag to ");
        sb3.append(str != null && this.f56955a.p0());
        sb3.append(" in vehicle controller");
        E(sb3.toString());
        BLEService bLEService = this.f56955a;
        if (str != null && bLEService.p0()) {
            z11 = true;
        }
        bLEService.j1(z11);
    }

    public void F0(String str) {
        if (this.f56959e != null) {
            l(this.f56959e, str);
        }
    }

    public void H0(String str) {
        I0(str, false);
    }

    public void I0(String str, boolean z11) {
        this.f56955a.E0(str, z11);
    }

    public void J0(vc0.n0 n0Var) {
        C.j("sending uwb fira capabilities");
        this.f56976v.m(ic0.f.SOURCE_APP_NATIVE, n0Var);
    }

    public void K0(vc0.v0 v0Var) {
        com.tesla.logging.g gVar = C;
        gVar.j("sending uwb fira response");
        ArrayList arrayList = new ArrayList();
        arrayList.add(v0Var);
        vc0.r0 r0Var = new vc0.r0(arrayList, okio.k.f97943e);
        gVar.j(r0Var.toString());
        this.f56976v.n(ic0.f.SOURCE_APP_NATIVE, r0Var);
    }

    public void L0(List<Integer> list) {
        C.j("sending uwb session stopped");
        this.f56976v.t(ic0.f.SOURCE_APP_NATIVE, list);
    }

    public void M0(h1 h1Var) {
        this.f56980z = new WeakReference<>(h1Var);
        if (this.f56959e != null) {
            this.f56959e.setConnectedListener(h1Var);
        }
    }

    @Override // com.teslamotors.plugins.ble.g0
    public hf0.d a(byte[] bArr, byte[] bArr2) {
        byte[] bArrA = this.f56958d.a(bArr, bArr2);
        if (bArrA == null) {
            return null;
        }
        return new hf0.d(bArrA);
    }

    @Override // com.teslamotors.plugins.ble.g0
    public void b(Peripheral peripheral) {
        List<Integer> listF;
        this.f56961g = false;
        if (p0() && (listF = this.f56978x.f()) != null) {
            this.f56979y.d(listF, mf0.j.STOP_REASON_BLE_DISCONNECTED);
        }
        E(String.format("connection to %s peripheral lost", peripheral));
        this.f56960f.remove(peripheral);
        this.f56958d.b(peripheral);
    }

    public void b0(String str) {
        E(String.format("clearPeripheral called with reason %s", str));
        HashMap map = new HashMap();
        map.put("type", "mobile-app-clear-peripherals");
        map.put("v", 1);
        map.put(AnalyticsAttribute.Reason, str);
        ud0.a.a(map, false, null);
        this.f56961g = false;
        F(null);
        g0();
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        he0.b.m(this.f56962h).N(this.f56957c, this.f56964j, jCurrentTimeMillis);
        this.f56965k.h(jCurrentTimeMillis);
        this.B = false;
        w.b(this.f56962h);
        this.f56958d.l(new h0.c() { // from class: com.teslamotors.plugins.ble.l1
            @Override // com.teslamotors.plugins.ble.h0.c
            public final void onReset() {
                this.f56931a.q0();
            }
        });
        this.f56955a.H0(hf0.f.ClearPeripheralsResult, new hf0.c(df0.b.OK, "", -1));
        this.f56955a.Y("from clearPeripherals");
        i(true);
        this.f56955a.u0("from clearPeripherals");
    }

    @Override // com.teslamotors.plugins.ble.g0
    public void c(Peripheral peripheral) {
        this.f56958d.c(peripheral);
    }

    @Override // com.teslamotors.plugins.ble.g0
    public void d() {
        this.f56955a.m1();
    }

    public void d0() {
        if (this.f56959e != null && this.f56959e.isConnected() && this.f56959e.getServiceConnected()) {
            E(String.format("%s - connectToPeripheral", this.f56959e));
            this.f56959e.requestIndications();
        }
    }

    @Override // com.teslamotors.plugins.ble.g0
    public void destroy() {
        this.f56977w.e();
        f0();
        if (this.f56967m != null) {
            this.f56967m.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.teslamotors.plugins.ble.g0
    public void disconnect() {
        if (p0()) {
            this.f56978x.j();
        }
        g0();
    }

    @Override // com.teslamotors.plugins.ble.g0
    public void e(Peripheral peripheral, int i11) {
        if (i11 == 2) {
            ef0.k.f62906a.d();
        }
        i(true);
        if (m0()) {
            t();
        } else {
            s();
        }
    }

    public void e0(Peripheral peripheral) {
        if (p0()) {
            this.f56978x.i();
        }
        if (!l0()) {
            E("Cannot create connection - adapter is not enabled");
            return;
        }
        if (peripheral == null) {
            E("Cannot create connection - peripheral is null");
        } else if (peripheral.getIdentifier() == null) {
            E("Cannot create connection - mac is null");
        } else {
            peripheral.createInitialConnection();
        }
    }

    @Override // com.teslamotors.plugins.ble.g0
    public void f() {
        w0();
        if (this.f56959e != null) {
            e0(this.f56959e);
        }
    }

    @Override // com.teslamotors.plugins.ble.g0
    public void g() {
        if (this.f56959e != null) {
            if (this.f56959e != null && !this.f56959e.isConnected() && !this.f56973s) {
                this.f56959e.disconnect();
                Peripheral peripheral = new Peripheral(this.f56959e.getPosition(), q(), this.f56963i.getRemoteDevice(this.f56959e.getIdentifier()), null, this, this.f56963i, null, this.f56962h);
                peripheral.setConnectedListener(k0());
                this.f56959e = peripheral;
                e0(peripheral);
            }
            i(true);
        }
        f();
        i(true);
    }

    @Override // com.teslamotors.plugins.ble.g0
    public hf0.i h() {
        return new hf0.i(this.f56958d.h(), this.f56958d.getPublicKey());
    }

    @Override // com.teslamotors.plugins.ble.g0
    public void i(boolean z11) {
        this.f56955a.Q0(z11, this.f56957c);
    }

    @Override // com.teslamotors.plugins.ble.g0
    public synchronized void j(Peripheral peripheral) {
        if (peripheral != null) {
            try {
                if (this.f56959e != null) {
                    this.f56961g = true;
                    E(String.format("%s - connectionEstablished() called", peripheral));
                    if (this.f56955a.g0() != null) {
                        this.f56955a.g0().a(this.f56957c, ic0.q.TRANSPORT_BLUETOOTH);
                    }
                    this.f56958d.e();
                    this.f56975u = Long.valueOf(System.currentTimeMillis());
                    if (this.f56958d.getOnWhitelist()) {
                        G0(new String[]{"connectionEstablished"});
                        this.f56967m.postDelayed(new Runnable() { // from class: com.teslamotors.plugins.ble.o1
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f56945a.r0();
                            }
                        }, 1000L);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.teslamotors.plugins.ble.g0
    public ToVCSECMessageResult k(e3 e3Var, v2 v2Var, byte[] bArr) {
        byte[] bArrEncode;
        long jD;
        if (e3Var == null) {
            return new ToVCSECMessageResult(ic0.h.RESULT_INTERNAL_ERROR, null);
        }
        int i11 = e.f56987b[v2Var.ordinal()];
        if (i11 == 1 || i11 == 2) {
            df0.a aVarK = this.f56958d.k(e3Var, bArr);
            if (aVarK == null) {
                return new ToVCSECMessageResult(ic0.h.RESULT_INTERNAL_ERROR, null);
            }
            byte[] bArrEncode2 = aVarK.b().encode();
            long jD2 = this.f56956b.d(bArrEncode2, Long.valueOf(aVarK.a()));
            bArrEncode = bArrEncode2;
            jD = jD2;
        } else if (i11 == 3) {
            bArrEncode = z.b(z.a(v2Var, e3Var.encode(), null, -1L, null)).encode();
            jD = this.f56956b.d(bArrEncode, null);
        } else {
            if (i11 != 4) {
                return new ToVCSECMessageResult(ic0.h.RESULT_INVALID_COMMAND_REQUEST, null);
            }
            bArrEncode = z.c(e3Var).encode();
            jD = this.f56956b.d(bArrEncode, null);
        }
        ic0.h hVarV = v(String.valueOf(jD), bArrEncode);
        return new ToVCSECMessageResult(hVarV, hVarV == ic0.h.RESULT_SUCCESS ? Long.valueOf(jD) : null);
    }

    @Override // com.teslamotors.plugins.ble.g0
    public synchronized void l(Peripheral peripheral, String str) {
        E(String.format("%s - resetPeripheral with reason: %s", peripheral, str));
        if (peripheral != null && peripheral.getIdentifier() != null && !peripheral.isFinished()) {
            E(String.format("%s - [resetPeripheral] disconnecting, reconnecting upon clean disconnect or %ss timeout", peripheral, 3));
            this.f56973s = true;
            this.f56974t = SystemClock.elapsedRealtime();
            peripheral.disconnect();
            this.f56977w.b(4500L);
            this.f56967m.postDelayed(new a(peripheral), 3500L);
        }
    }

    public boolean l0() {
        return ef0.k.f62906a.a(this.f56963i);
    }

    @Override // com.teslamotors.plugins.ble.g0
    public boolean m() {
        return this.f56971q;
    }

    public boolean m0() {
        return this.f56959e != null && this.f56959e.isConnected();
    }

    @Override // com.teslamotors.plugins.ble.g0
    public boolean n() {
        return this.f56965k.e();
    }

    public boolean n0() {
        return this.f56959e != null && this.f56959e.isConnected() && this.f56959e.getServiceConnected();
    }

    @Override // com.teslamotors.plugins.ble.g0
    public void o(byte[] bArr) {
        this.f56970p = bArr;
    }

    @Override // com.teslamotors.plugins.ble.g0
    public void p(String str, @NonNull Throwable th2) {
        C.d(String.format("[%s] (%s) %s", ie0.q0.f(this.f56957c), Integer.valueOf(hashCode()), str), th2);
    }

    @Override // com.teslamotors.plugins.ble.g0
    public String q() {
        return this.f56957c;
    }

    @Override // com.teslamotors.plugins.ble.g0
    public boolean r() {
        return this.f56961g;
    }

    @Override // com.teslamotors.plugins.ble.g0
    public void s() {
        if (this.f56966l == null) {
            return;
        }
        this.f56967m.postDelayed(new b(), 2000L);
    }

    @Override // com.teslamotors.plugins.ble.g0
    public void t() {
        if (this.f56968n) {
            if (!ie0.c0.c(this.f56962h)) {
                E("BLUETOOTH_SCAN permission is not granted, cannot stop background scan");
                return;
            }
            w.a(this.f56962h);
            this.f56968n = false;
            if (this.f56969o == null || !this.f56963i.isEnabled()) {
                return;
            }
            E("Stopping BG Scan");
            this.f56969o.stopScan(this.A);
        }
    }

    @Override // com.teslamotors.plugins.ble.g0
    public void u(Message message) {
        switch (e.f56986a[hf0.f.get(message.what).ordinal()]) {
            case 1:
                b0(((ClearPeripheralInfo) message.getData().getParcelable(hf0.f.ClearPeripheral.getKey())).getReason());
                break;
            case 2:
                E0();
                break;
            case 3:
                F0("UI Button");
                break;
            case 4:
                this.f56971q = message.arg1 > 0;
                break;
            case 5:
                this.f56976v.j(this.f56962h);
                break;
            case 6:
                f0.t(this.f56955a, this.f56957c, System.currentTimeMillis(), i0(), true, null);
                break;
            case 7:
                boolean z11 = message.getData().getBoolean(hf0.f.PhoneKeySettingChanged.getKey2());
                if (ie0.y.f77624a.g()) {
                    if (!z11) {
                        disconnect();
                    } else {
                        g();
                    }
                }
                break;
        }
    }

    @Override // com.teslamotors.plugins.ble.g0
    public ic0.h v(@NonNull String str, byte[] bArr) {
        if (bArr == null) {
            return ic0.h.RESULT_MESSAGE_BUILD_FAILURE;
        }
        if (this.f56959e != null && this.f56959e.isConnected() && r()) {
            return this.f56959e.enqueue(ef0.g.a(bArr), str) ? ic0.h.RESULT_SUCCESS : ic0.h.RESULT_TRANSMISSION_FAILURE;
        }
        return ic0.h.RESULT_NOT_CONNECTED;
    }

    @Override // com.teslamotors.plugins.ble.g0
    public void w(hf0.m mVar, boolean z11) {
        this.f56965k.k(mVar);
        mVar.f72691x = this.f56958d.d();
        mVar.f72683p = this.f56958d.getOnWhitelist();
        mVar.f72684q = this.f56958d.g();
        mVar.f72689v = this.f56959e != null && this.f56959e.getServiceConnected() && r();
        df0.e eVar = this.f56965k;
        mVar.f72677j = eVar.f60532d;
        mVar.f72686s = eVar.c();
        mVar.f72687t = this.f56965k.d();
        mVar.f72682o = this.f56957c;
        if (this.f56959e != null) {
            mVar.f72690w = new hf0.g(this.f56959e);
        } else {
            u5.d<String, String> dVarJ0 = j0();
            if (dVarJ0 != null) {
                mVar.f72690w = new hf0.g(CallerData.NA, false, dVarJ0.f115408b, -1000);
            }
        }
        mVar.A = Boolean.valueOf(this.f56971q);
    }

    @Override // com.teslamotors.plugins.ble.g0
    public void x(boolean z11, String str, String str2, Peripheral peripheral) {
        byte[] bArrF = ef0.g.f(ie0.q0.a(str2));
        if (bArrF == null) {
            return;
        }
        if (!z11 && str.equals("PHONE_KEY_TRANSMISSION_FAILURE")) {
            l(peripheral, "notifyCommandResult: transmission failure");
        }
        if (z11) {
            y0(bArrF);
        } else {
            x0(bArrF, str);
        }
    }

    @Override // com.teslamotors.plugins.ble.g0
    public void y(VehicleMessage vehicleMessage, Peripheral peripheral) {
        q1 q1Var;
        long receivedBytesTimestamp = vehicleMessage.getReceivedBytesTimestamp();
        if (vehicleMessage.getFromVCSECMessage() != null) {
            E("processing FromVCSECMessage");
            q1Var = this;
            q1Var.B0(vehicleMessage.getFromVCSECMessage(), peripheral, vehicleMessage.getRoutableMessage() != null, receivedBytesTimestamp);
            ff0.g.e(q1Var.f56957c, new ff0.m.c());
        } else {
            q1Var = this;
        }
        if (vehicleMessage.getRoutableMessage() != null) {
            try {
                E("processing RoutableMessage");
                ye0.j.E(new y.ReceivedData(vehicleMessage.getRoutableMessage(), receivedBytesTimestamp));
                ff0.g.e(q1Var.f56957c, new ff0.m.d());
            } catch (Exception e11) {
                p("Error sending encoded routable message", e11);
            }
        }
        if (vehicleMessage.getFromVCSECMessage() == null && vehicleMessage.getRoutableMessage() == null) {
            E("Parse message error!");
        }
    }

    @Override // com.teslamotors.plugins.ble.g0
    public df0.c z() {
        if (this.f56959e == null) {
            return df0.c.DISCONNECTED;
        }
        if (this.f56959e.isConnected()) {
            return r() ? df0.c.CONNECTED : df0.c.DISCONNECTED;
        }
        return df0.c.DISCONNECTED;
    }
}
