package com.teslamotors.plugins.ble;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import cf0.GattPayload;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.plaid.internal.EnumC4419g;
import ef0.VehicleMessage;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import vc0.d2;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public class Peripheral {
    public static final int BACKGROUND_CONNECT_TIMEOUT_MS = 10000;
    private static final int COMMAND_QUEUE_SIZE = 30;
    public static final int COMMAND_TIMEOUT_DURATION_MS = 6000;
    public static final int DEFAULT_RSSI = -1000;
    private static final int DELAY_AFTER_ERROR = 2000;
    private static final int DELAY_AFTER_NORMAL_DISCONNECT = 500;
    private static final int DISCOVER_SERVICES_TIMEOUT_MS = 10000;
    private static final int MAX_INDICATION_RETRY_NUMBER = 5;
    private static final int MAX_RX_BUFFER_SIZE = 452;
    private static final int MAX_SERVICE_DISCOVER_RETRY_NUMBER = 5;
    public static final int PERIPHERAL_DISCONNECTION_TIMEOUT = 3500;
    public static final int RECONNECTION_TIMEOUT_MS = 5000;
    private static final int SET_MTU_TIMEOUT_MS = 3000;
    private final Long createdTimestamp;
    private final AtomicBoolean discoverServicesStarted;
    private ze0.a gattProfileRetryManager;
    private BluetoothGattService gattService;
    private String hashedId;
    private boolean mAutoConnect;
    private BluetoothAdapter mBluetoothAdapter;
    private final Context mContext;
    private final WeakReference<g0> mController;
    private BluetoothGatt mGatt;
    private final Handler mHandler;
    private final ef0.j mMtuWakeLock;
    private final String mPosition;
    private final ef0.j mReconnectWakeLock;
    private final ef0.j mServiceDiscoveryWakeLock;
    private final AtomicBoolean onServicesDiscovered;
    private final String originalAddress;
    private volatile int rssi;
    private final AtomicBoolean serviceConnected;
    private final cf0.e timelineTracker;
    private final String vin;
    private volatile long backgroundConnectTime = 0;
    private final byte[] rxBuffer = new byte[MAX_RX_BUFFER_SIZE];
    private int rxSoFar = 0;
    private int rxExpected = 0;
    private Long connectedTimestamp = 0L;
    private Long disconnectedTimestamp = 0L;
    private String connectionId = UUID.randomUUID().toString();
    private final Queue<u5.d<byte[], String>> mCommandQueue = new ArrayBlockingQueue(30);
    private WeakReference<b> connectedListener = null;
    private final BluetoothGattCallback mGattCallback = new a();
    private final AtomicBoolean mIsConnected = new AtomicBoolean(false);
    private final AtomicLong connectionStartTime = new AtomicLong(0);
    private final AtomicBoolean mBusy = new AtomicBoolean(false);
    private final AtomicBoolean mtuEstablished = new AtomicBoolean(false);
    private final AtomicBoolean mFinished = new AtomicBoolean(false);

    class a extends BluetoothGattCallback {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void k(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            g0 g0Var = (g0) Peripheral.this.mController.get();
            if (g0Var == null) {
                return;
            }
            try {
                byte[] value = bluetoothGattCharacteristic.getValue();
                Locale locale = Locale.US;
                String str = String.format(locale, "(%s)", Integer.valueOf(value != null ? value.length : -1));
                String str2 = "[complete]";
                if (Peripheral.this.rxSoFar > 0 && Peripheral.this.rxExpected > 0) {
                    str2 = String.format(locale, "[%d bytes remaining]", Integer.valueOf(Peripheral.this.rxExpected - Peripheral.this.rxSoFar));
                }
                if (value != null && value.length != 0) {
                    if (!g0Var.r()) {
                        Peripheral peripheral = Peripheral.this;
                        peripheral.logInfo(String.format(locale, "%s - got onCharacteristicChanged before onDescriptorWrite for indications! connection established", peripheral));
                        Peripheral.this.mBusy.set(false);
                        Peripheral.this.rxSoFar = 0;
                        Peripheral.this.rxExpected = 0;
                        Peripheral.this.timelineTracker.l();
                        g0Var.j(Peripheral.this);
                    }
                    Peripheral peripheral2 = Peripheral.this;
                    peripheral2.logInfo(String.format(locale, "%s - onCharacteristicChanged - %s - %s", peripheral2, str, str2));
                    Peripheral.this.onBytesReceived(value);
                    ef0.k kVar = ef0.k.f62906a;
                    if (!kVar.a(Peripheral.this.mBluetoothAdapter)) {
                        kVar.d();
                        g0Var.i(true);
                    }
                    Peripheral.this.sendCharacteristicChangedTelemetry(0, 0);
                    return;
                }
                Peripheral peripheral3 = Peripheral.this;
                peripheral3.logInfo(String.format(locale, "%s - onCharacteristicChanged - got empty data from VCSEC! ignoring %s", peripheral3, str));
            } catch (Exception e11) {
                Peripheral.this.logError("FAILED to parse incoming message", e11);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void l(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i11) {
            g0 g0Var = (g0) Peripheral.this.mController.get();
            if (g0Var == null) {
                return;
            }
            try {
                byte[] value = bluetoothGattCharacteristic.getValue();
                Locale locale = Locale.US;
                String str = String.format(locale, "(%s)", Integer.valueOf(value == null ? 0 : value.length));
                Peripheral peripheral = Peripheral.this;
                peripheral.logInfo(String.format(locale, "%s - onCharacteristicRead: %s - status 0x%02X", peripheral, str, Integer.valueOf(i11)));
                if (com.teslamotors.plugins.ble.a.f56702f.equals(bluetoothGattCharacteristic.getUuid())) {
                    byte[] value2 = bluetoothGattCharacteristic.getValue();
                    Peripheral peripheral2 = Peripheral.this;
                    peripheral2.logInfo(String.format(locale, "%s - Got serial port version: %s", peripheral2, ie0.q0.b(value2)));
                    Peripheral.this.timelineTracker.k();
                    g0Var.o(value2);
                    Peripheral.this.onServiceConnectedAndPeripheralFound(g0Var);
                }
                Peripheral.this.sendCharacteristicReadTelemetry(i11, 0);
            } catch (Exception e11) {
                Peripheral peripheral3 = Peripheral.this;
                peripheral3.logError(String.format(Locale.US, "%s - Peripheral characteristic read failed", peripheral3), e11);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void m(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i11) {
            g0 g0Var = (g0) Peripheral.this.mController.get();
            if (g0Var == null) {
                ld0.d.a(nc0.l.BLE_WRITE_CHARACTERISTIC);
                return;
            }
            try {
                String strB = ie0.q0.b(bluetoothGattCharacteristic.getValue());
                Peripheral.this.mBusy.set(false);
                Peripheral.this.checkCommandQueue();
                Locale locale = Locale.US;
                String str = String.format(locale, "(%s)", Integer.valueOf(strB.length() / 2));
                boolean z11 = i11 == 0;
                ArrayList arrayList = new ArrayList();
                arrayList.add(kd0.a.c("success", String.valueOf(z11)));
                ld0.d.c(nc0.l.BLE_WRITE_CHARACTERISTIC, arrayList);
                if (z11) {
                    Peripheral peripheral = Peripheral.this;
                    peripheral.logInfo(String.format(locale, "%s - onCharacteristicWrite: status 0x%02X, %s", peripheral, Integer.valueOf(i11), str));
                } else {
                    Peripheral peripheral2 = Peripheral.this;
                    peripheral2.logInfo(String.format(locale, "%s - onCharacteristicWrite TRANSMISSION FAILURE: status 0x%02X, %s", peripheral2, Integer.valueOf(i11), str));
                }
                Peripheral.this.sendCharacteristicWriteTelemetry(i11, 0);
                g0Var.x(z11, z11 ? null : "PHONE_KEY_TRANSMISSION_FAILURE", strB, Peripheral.this);
            } catch (Exception e11) {
                Peripheral.this.logError("Peripheral characteristic write failed", e11);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void n(int i11, int i12) {
            String str;
            g0 g0Var = (g0) Peripheral.this.mController.get();
            if (g0Var == null) {
                return;
            }
            if (i11 == 0) {
                ff0.g.e(Peripheral.this.vin, new ff0.m.a(d2.PERIPHERALSTATE_DISCONNECTED));
                str = "DISCONNECTED";
            } else if (i11 == 1) {
                ff0.g.e(Peripheral.this.vin, new ff0.m.a(d2.PERIPHERALSTATE_CONNECTING));
                str = "CONNECTING";
            } else if (i11 == 2) {
                ff0.g.e(Peripheral.this.vin, new ff0.m.a(d2.PERIPHERALSTATE_CONNECTED));
                str = "CONNECTED";
            } else if (i11 != 3) {
                str = "UNKNOWN";
            } else {
                ff0.g.e(Peripheral.this.vin, new ff0.m.a(d2.PERIPHERALSTATE_DISCONNECTING));
                str = "DISCONNECTING";
            }
            if (i11 == 0) {
                Peripheral peripheral = Peripheral.this;
                Locale locale = Locale.US;
                peripheral.logInfo(String.format(locale, "%s - onConnectionStateChange: %s status: 0x%02X (%s)", peripheral, str, Integer.valueOf(i12), af0.a.a(i12)));
                Peripheral.this.timelineTracker.f(Peripheral.this.vin, "disconnected", String.format(locale, "0x%02X", Integer.valueOf(i12)));
                Peripheral.this.onConnectionLost("BECAME_DISCONNECTED");
                Peripheral.this.clearConnectionStartTime();
                Peripheral.this.getHandler().removeCallbacksAndMessages(Peripheral.this.getIdentifier());
                if (i12 == 133) {
                    Peripheral.this.warnAboutBluetoothShouldCycle();
                }
                if (Peripheral.this.mFinished.get() || !ef0.k.f62906a.a(Peripheral.this.mBluetoothAdapter)) {
                    Peripheral peripheral2 = Peripheral.this;
                    peripheral2.logInfo(String.format(locale, "%s - Disconnected but adapter is not on; doing nothing", peripheral2));
                } else {
                    Peripheral.this.reconnect(i12);
                    Peripheral.this.sendDisconnectedTelemetry(i12, 0);
                }
            } else if (i11 == 2) {
                Peripheral peripheral3 = Peripheral.this;
                Locale locale2 = Locale.US;
                peripheral3.logInfo(String.format(locale2, "%s - onConnectionStateChange: %s status: 0x%02X", peripheral3, str, Integer.valueOf(i12)));
                if (Peripheral.this.mFinished.get()) {
                    String str2 = String.format(locale2, "Got CONNECTED callback for peripheral when 'finished' - %s", Peripheral.this);
                    Peripheral.this.logError(str2, new Throwable(str2));
                    return;
                } else if (i12 == 0 && !Peripheral.this.isConnected()) {
                    Peripheral.this.connectionId = UUID.randomUUID().toString();
                    Peripheral.this.timelineTracker.s(Peripheral.this.connectionId);
                    Peripheral.this.timelineTracker.m();
                    Peripheral.this.timelineTracker.u(Peripheral.this.rssi);
                    Peripheral.this.timelineTracker.t(Peripheral.this.mAutoConnect);
                    Peripheral.this.setConnected(true);
                    Peripheral.this.requestMtu();
                    Peripheral.this.sendConnectedTelemetry(i12, 0);
                }
            }
            g0Var.e(Peripheral.this, i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void o() {
            Peripheral.this.requestIndications();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void p(long j11) {
            Peripheral.this.getHandler().postAtTime(new Runnable() { // from class: com.teslamotors.plugins.ble.v0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f57009a.o();
                }
            }, Peripheral.this.getIdentifier(), SystemClock.uptimeMillis() + j11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void q(BluetoothGattDescriptor bluetoothGattDescriptor, int i11) {
            byte[] value = bluetoothGattDescriptor.getValue();
            boolean zEquals = Arrays.equals(value, BluetoothGattDescriptor.ENABLE_INDICATION_VALUE);
            int i12 = Peripheral.this.gattProfileRetryManager.a("TAG_REQUEST_INDICATION").get_counter();
            Peripheral peripheral = Peripheral.this;
            Locale locale = Locale.US;
            peripheral.logInfo(String.format(locale, "%s - onDescriptorWrite status: 0x%02X (%s), value: %s attempts: %d", peripheral, Integer.valueOf(i11), af0.b.a(i11), ie0.q0.b(value), Integer.valueOf(i12)));
            if (zEquals) {
                Peripheral.this.sendEnableIndicationTelemetry(i11, i12);
            }
            if (zEquals && i11 != 0) {
                bf0.e eVarA = Peripheral.this.gattProfileRetryManager.a("TAG_GATT_STATUS_" + af0.b.b(i11));
                if (eVarA == null) {
                    eVarA = Peripheral.this.gattProfileRetryManager.a("TAG_REQUEST_INDICATION");
                }
                final long jC = eVarA.c();
                eVarA.a(new Runnable() { // from class: com.teslamotors.plugins.ble.u0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f57004a.p(jC);
                    }
                });
                return;
            }
            g0 g0Var = (g0) Peripheral.this.mController.get();
            if (g0Var == null || !g0Var.r()) {
                Peripheral.this.mBusy.set(false);
            } else {
                Peripheral peripheral2 = Peripheral.this;
                peripheral2.logInfo(String.format(locale, "%s - onDescriptorWrite: skipping mBusy.set(false), connection already established", peripheral2));
            }
            if (g0Var == null) {
                return;
            }
            if (!g0Var.r() && zEquals) {
                Peripheral.this.rxSoFar = 0;
                Peripheral.this.rxExpected = 0;
                Peripheral.this.timelineTracker.l();
                g0Var.j(Peripheral.this);
            }
            if (zEquals) {
                Peripheral.this.sendConnectionCompleteTelemetry(System.currentTimeMillis(), 0);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void r(int i11, int i12, BluetoothGatt bluetoothGatt) {
            Peripheral peripheral = Peripheral.this;
            peripheral.logInfo(String.format(Locale.US, "%s - MTU Size changed to %s with status 0x%02X (%s)", peripheral, Integer.valueOf(i11), Integer.valueOf(i12), af0.b.a(i12)));
            Peripheral.this.timelineTracker.o(false);
            Peripheral.this.sendMTUChangedTelemetry(i12, 0);
            Peripheral.this.onMtuCompletion(bluetoothGatt);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void s(int i11, int i12) {
            g0 g0Var = (g0) Peripheral.this.mController.get();
            if (g0Var == null) {
                return;
            }
            if (i11 == 0) {
                Peripheral.this.setRssi(i12);
            } else {
                Peripheral peripheral = Peripheral.this;
                peripheral.logInfo(String.format(Locale.US, "%s - FAILED to get RSSI", peripheral));
                Peripheral.this.setRssi(-1000);
            }
            g0Var.i(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void t(int i11, BluetoothGatt bluetoothGatt) {
            Peripheral.this.mServiceDiscoveryWakeLock.e();
            Peripheral.this.onServicesDiscovered.set(true);
            Peripheral.this.mBusy.set(false);
            Peripheral peripheral = Peripheral.this;
            peripheral.sendServiceDiscoveredTelemetry(i11, peripheral.gattProfileRetryManager.a("TAG_SERVICE_DISCOVER").get_counter());
            if (i11 == 0) {
                Peripheral peripheral2 = Peripheral.this;
                peripheral2.logInfo(String.format(Locale.US, "%s - onServicesDiscovered Success - status: 0x%02X", peripheral2, Integer.valueOf(i11)));
                Peripheral.this.timelineTracker.p();
                Peripheral.this.handleService(bluetoothGatt.getService(com.teslamotors.plugins.ble.a.f56698b));
                return;
            }
            Peripheral peripheral3 = Peripheral.this;
            Locale locale = Locale.US;
            peripheral3.logInfo(String.format(locale, "%s - onServicesDiscovered FAILURE - status: 0x%02X (%s)", peripheral3, Integer.valueOf(i11), af0.b.a(i11)));
            Peripheral.this.timelineTracker.f(Peripheral.this.vin, "services_discovered", String.format(locale, "0x%02X", Integer.valueOf(i11)));
            Peripheral.this.scheduleReconnect(bf0.c.SERVICE_DISCOVERY_FAILURE);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, final BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            Peripheral.this.getHandler().post(new Runnable() { // from class: com.teslamotors.plugins.ble.s0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f56997a.k(bluetoothGattCharacteristic);
                }
            });
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicRead(BluetoothGatt bluetoothGatt, final BluetoothGattCharacteristic bluetoothGattCharacteristic, final int i11) {
            Peripheral.this.getHandler().post(new Runnable() { // from class: com.teslamotors.plugins.ble.o0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f56942a.l(bluetoothGattCharacteristic, i11);
                }
            });
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, final BluetoothGattCharacteristic bluetoothGattCharacteristic, final int i11) {
            Peripheral.this.getHandler().post(new Runnable() { // from class: com.teslamotors.plugins.ble.t0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f56999a.m(bluetoothGattCharacteristic, i11);
                }
            });
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, final int i11, final int i12) {
            Peripheral.this.mHandler.post(new Runnable() { // from class: com.teslamotors.plugins.ble.p0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f56947a.n(i12, i11);
                }
            });
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i11) {
            Peripheral peripheral = Peripheral.this;
            peripheral.logInfo(String.format(Locale.US, "%s onDescriptorRead - status: 0x%02X, value: %s", peripheral, Integer.valueOf(i11), ie0.q0.b(bluetoothGattDescriptor.getValue())));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, final BluetoothGattDescriptor bluetoothGattDescriptor, final int i11) {
            Peripheral.this.mHandler.post(new Runnable() { // from class: com.teslamotors.plugins.ble.r0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f56992a.q(bluetoothGattDescriptor, i11);
                }
            });
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onMtuChanged(final BluetoothGatt bluetoothGatt, final int i11, final int i12) {
            Peripheral.this.mHandler.post(new Runnable() { // from class: com.teslamotors.plugins.ble.m0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f56932a.r(i11, i12, bluetoothGatt);
                }
            });
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onPhyRead(BluetoothGatt bluetoothGatt, int i11, int i12, int i13) {
            Peripheral peripheral = Peripheral.this;
            peripheral.logInfo(String.format(Locale.US, "%s onPhyRead: txPhy %d rxPhy %d status: 0x%02X", peripheral, Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onPhyUpdate(BluetoothGatt bluetoothGatt, int i11, int i12, int i13) {
            Peripheral peripheral = Peripheral.this;
            peripheral.logInfo(String.format(Locale.US, "%s onPhyUpdate: txPhy %d rxPhy %d", peripheral, Integer.valueOf(i11), Integer.valueOf(i12)));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onReadRemoteRssi(BluetoothGatt bluetoothGatt, final int i11, final int i12) {
            Peripheral.this.mHandler.post(new Runnable() { // from class: com.teslamotors.plugins.ble.q0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f56952a.s(i12, i11);
                }
            });
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onReliableWriteCompleted(BluetoothGatt bluetoothGatt, int i11) {
            Peripheral peripheral = Peripheral.this;
            peripheral.logInfo(String.format(Locale.US, "%s onReliableWriteCompleted - status: 0x%02Xs", peripheral, Integer.valueOf(i11)));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(final BluetoothGatt bluetoothGatt, final int i11) {
            Peripheral.this.mHandler.post(new Runnable() { // from class: com.teslamotors.plugins.ble.n0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f56939a.t(i11, bluetoothGatt);
                }
            });
        }
    }

    public interface b {
        void a(String str);

        void onDisconnected(String str);
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Peripheral.this.mServiceDiscoveryWakeLock.e();
            if (Peripheral.this.onServicesDiscovered.get()) {
                return;
            }
            Peripheral peripheral = Peripheral.this;
            peripheral.logInfo(String.format(Locale.US, "%s - timed out waiting for onDiscoverServices - we're screwed, reset and try again.", peripheral));
            Peripheral.this.scheduleReconnect(bf0.c.SERVICE_DISCOVERY_TIMEOUT);
        }
    }

    class d implements Runnable {
        d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(bf0.e eVar) {
            Peripheral.this.mHandler.postAtTime(Peripheral.this.new d(), Peripheral.this.getIdentifier(), SystemClock.uptimeMillis() + eVar.c());
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((g0) Peripheral.this.mController.get()) == null) {
                return;
            }
            BluetoothGatt gatt = Peripheral.this.getGatt();
            if (gatt == null || !Peripheral.this.isConnected()) {
                Peripheral peripheral = Peripheral.this;
                peripheral.logInfo(String.format(Locale.US, "%s - Not connected to; cancelling service discovery", peripheral));
                return;
            }
            if (Peripheral.this.discoverServicesStarted.get()) {
                Peripheral peripheral2 = Peripheral.this;
                peripheral2.logInfo(String.format(Locale.US, "%s - already discovered services; skipping to prevent exception", peripheral2));
                return;
            }
            if (Peripheral.this.getServiceConnected()) {
                Peripheral peripheral3 = Peripheral.this;
                peripheral3.logInfo(String.format(Locale.US, "%s - already connected to services; skipping to prevent exception", peripheral3));
                return;
            }
            if (!ie0.c0.a(Peripheral.this.mContext)) {
                Peripheral.this.logInfo("BLUETOOTH_CONNECT permission is not granted, cannot discoverServices");
                return;
            }
            if (gatt.discoverServices()) {
                Peripheral.this.discoverServicesStarted.set(true);
                Peripheral peripheral4 = Peripheral.this;
                peripheral4.logInfo(String.format(Locale.US, "%s - looking for services", peripheral4));
                Peripheral.this.mBusy.set(true);
                Peripheral.this.mServiceDiscoveryWakeLock.b(11000L);
                Peripheral.this.getHandler().postAtTime(Peripheral.this.new c(), Peripheral.this.getIdentifier(), SystemClock.uptimeMillis() + 10000);
                return;
            }
            Peripheral peripheral5 = Peripheral.this;
            peripheral5.logInfo(String.format(Locale.US, "Failed to invoke discover services API on %s", peripheral5));
            final bf0.e eVarA = Peripheral.this.gattProfileRetryManager.a("TAG_SERVICE_DISCOVER");
            if (eVarA.b()) {
                eVarA.a(new Runnable() { // from class: com.teslamotors.plugins.ble.w0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f57011a.b(eVarA);
                    }
                });
            } else {
                Peripheral.this.scheduleReconnect(bf0.c.OS_DISCOVER_SERVICE_FAILURE);
            }
        }
    }

    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Peripheral.this.isNotMtuEstablished()) {
                Peripheral peripheral = Peripheral.this;
                peripheral.logInfo(String.format(Locale.US, "%s - timed out waiting for onMTUChanged - moving on", peripheral));
                Peripheral.this.timelineTracker.o(true);
                Peripheral.this.onMtuCompletion(Peripheral.this.getGatt());
            }
        }
    }

    public Peripheral(String str, String str2, BluetoothDevice bluetoothDevice, BluetoothGatt bluetoothGatt, g0 g0Var, BluetoothAdapter bluetoothAdapter, Integer num, Context context) {
        this.mAutoConnect = false;
        this.mPosition = str;
        this.vin = str2;
        this.mGatt = bluetoothGatt;
        this.mController = new WeakReference<>(g0Var);
        this.mBluetoothAdapter = bluetoothAdapter;
        this.mContext = context;
        this.timelineTracker = new cf0.e(this.connectionId, context, bluetoothAdapter);
        this.mMtuWakeLock = new ef0.j(context, "tesla:ble-mtu");
        this.mReconnectWakeLock = new ef0.j(context, "tesla:ble-peripheral-reconnect");
        this.mServiceDiscoveryWakeLock = new ef0.j(context, "tesla:ble-service-discovery");
        this.rssi = num != null ? num.intValue() : -1000;
        this.originalAddress = bluetoothDevice.getAddress();
        this.mHandler = new Handler(Looper.getMainLooper());
        this.createdTimestamp = Long.valueOf(System.currentTimeMillis());
        this.discoverServicesStarted = new AtomicBoolean(false);
        this.onServicesDiscovered = new AtomicBoolean(false);
        this.serviceConnected = new AtomicBoolean(false);
        registerRetryPolicy();
        if (Build.VERSION.SDK_INT >= 34) {
            this.mAutoConnect = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkCommandQueue() {
        if (this.mBusy.get()) {
            return;
        }
        this.mBusy.set(true);
        writeToCar(this.mCommandQueue.poll());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConnectionStartTime() {
        this.connectionStartTime.set(0L);
    }

    private void destroy() {
        this.mMtuWakeLock.e();
        this.mReconnectWakeLock.e();
        this.mServiceDiscoveryWakeLock.e();
        this.mGatt = null;
        this.mController.clear();
        this.mBluetoothAdapter = null;
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    private int getDelayDurationForStatus(int i11) {
        if (i11 != 0 && i11 != 8) {
            if (i11 == 19 || i11 == 22) {
                return DELAY_AFTER_ERROR;
            }
            if (i11 != 34) {
                if (i11 == 62 || i11 == 133 || i11 == 256) {
                    return DELAY_AFTER_ERROR;
                }
                logInfo(String.format(Locale.US, "%s - Got unknown status code: 0x%02X", this, Integer.valueOf(i11)));
                return DELAY_AFTER_NORMAL_DISCONNECT;
            }
        }
        return DELAY_AFTER_NORMAL_DISCONNECT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public BluetoothGatt getGatt() {
        return this.mGatt;
    }

    private BluetoothGattService getGattService() {
        return this.gattService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Handler getHandler() {
        return this.mHandler;
    }

    private VehicleMessage getMessageFromBytes(byte[] bArr) {
        VehicleMessage nVar = new VehicleMessage();
        int i11 = this.rxSoFar;
        if (i11 == 0 && this.rxExpected == 0) {
            int i12 = (bArr[0] << 8) | (bArr[1] & 255);
            if (i12 > MAX_RX_BUFFER_SIZE || i12 < 0) {
                logInfo(String.format(Locale.US, "%s - Got 'initial' message with length header of %d, ignoring", this, Integer.valueOf(i12)));
                return null;
            }
            this.rxExpected = i12;
            this.rxSoFar = bArr.length - 2;
            System.arraycopy(bArr, 2, this.rxBuffer, 0, bArr.length - 2);
        } else {
            if (bArr.length > this.rxExpected - i11) {
                logInfo(String.format(Locale.US, "%s - Failed to add data of length %s to buffer of size %s with %s remaining. Clearing buffer", this, Integer.valueOf(bArr.length), Integer.valueOf(this.rxExpected), Integer.valueOf(this.rxExpected - this.rxSoFar)));
                this.rxSoFar = 0;
                this.rxExpected = 0;
                return null;
            }
            System.arraycopy(bArr, 0, this.rxBuffer, i11, bArr.length);
            this.rxSoFar += bArr.length;
        }
        int i13 = this.rxSoFar;
        int i14 = this.rxExpected;
        if (i13 < i14) {
            return nVar;
        }
        Locale locale = Locale.US;
        String str = String.format(locale, "(%s bytes)", Integer.valueOf(i14));
        logInfo(String.format(locale, "%s - Received complete message: %s", this, str));
        VehicleMessage nVarB = ef0.o.b(Arrays.copyOfRange(this.rxBuffer, 0, this.rxExpected));
        if (nVarB.getFromVCSECMessage() == null && nVarB.getRoutableMessage() == null) {
            String str2 = String.format(locale, "%s - Failed to deserialize message: %s", this, str);
            logError(str2, new Throwable(str2));
        }
        this.rxExpected = 0;
        this.rxSoFar = 0;
        return nVarB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleService(BluetoothGattService bluetoothGattService) {
        g0 g0Var = this.mController.get();
        HashSet hashSet = new HashSet();
        hashSet.add(vc0.x0.GATTSERVICESBITMASK_PHONE_KEY_SERVICE);
        if (bluetoothGattService == null || !com.teslamotors.plugins.ble.a.f56698b.equals(bluetoothGattService.getUuid())) {
            logInfo(String.format(Locale.US, "%s - DID NOT discover service! expecting UUID: %s", this, com.teslamotors.plugins.ble.a.f56698b));
            this.timelineTracker.f(this.vin, "service_not_found", null);
            scheduleReconnect(bf0.c.SERVICE_DISCOVERY_FAILURE);
            return;
        }
        setGattService(bluetoothGattService);
        List<BluetoothGattCharacteristic> characteristics = bluetoothGattService.getCharacteristics();
        logInfo(String.format(Locale.US, "%s - tesla service found - %s characteristics", this, Integer.valueOf(characteristics.size())));
        if (g0Var == null) {
            return;
        }
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        for (BluetoothGattCharacteristic bluetoothGattCharacteristic : characteristics) {
            UUID uuid = bluetoothGattCharacteristic.getUuid();
            Locale locale = Locale.US;
            logInfo(String.format(locale, "%s - characteristic found - %s", this, uuid));
            if (com.teslamotors.plugins.ble.a.f56701e.equals(uuid)) {
                hashSet.add(vc0.x0.GATTSERVICESBITMASK_FROM_VEHICLE_CHAR);
                z11 = true;
            } else if (com.teslamotors.plugins.ble.a.f56700d.equals(uuid)) {
                hashSet.add(vc0.x0.GATTSERVICESBITMASK_TO_VEHICLE_CHAR);
                z12 = true;
            } else if (com.teslamotors.plugins.ble.a.f56702f.equals(uuid) && !g0Var.D()) {
                BluetoothGatt gatt = getGatt();
                if (ie0.c0.a(this.mContext)) {
                    z13 = gatt != null && gatt.readCharacteristic(bluetoothGattCharacteristic);
                    if (z13) {
                        hashSet.add(vc0.x0.GATTSERVICESBITMASK_VERSION_CHAR);
                    }
                } else {
                    logInfo("BLUETOOTH_CONNECT permission not granted, can't read version from characteristic!");
                }
            }
            ff0.g.e(this.vin, new ff0.m.b(ff0.a.a(hashSet).getBitmask()));
            if (z11 && z12) {
                logInfo(String.format(locale, "%s - found RX and TX characteristics, %s version", this, z13 ? "including" : "NOT including"));
                if (z13) {
                    return;
                }
                onServiceConnectedAndPeripheralFound(g0Var);
                return;
            }
        }
        logInfo(String.format(Locale.US, "%s - DID NOT find RX and TX characteristics!", this));
        this.timelineTracker.f(this.vin, "characteristic_not_found", null);
        scheduleReconnect(bf0.c.CHARACTERISTIC_NOT_FOUND);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$reconnect$0() {
        this.mReconnectWakeLock.e();
        boolean zIsConnected = isConnected();
        boolean zReconnectionInProgress = reconnectionInProgress();
        if (getIdentifier() == null || zIsConnected || zReconnectionInProgress) {
            logInfo(String.format(Locale.US, "%s - Unable to reconnect. isConnected: %s inProgress: %s", this, Boolean.valueOf(zIsConnected), Boolean.valueOf(zReconnectionInProgress)));
            return;
        }
        if (shouldGateConnection()) {
            logInfo("Phone key disabled on OHOS VM for " + this.vin + ", skip reconnect");
            return;
        }
        BluetoothGatt gatt = getGatt();
        if (getGatt() == null) {
            createInitialConnection();
            return;
        }
        if (!ie0.c0.a(this.mContext)) {
            logInfo("BLUETOOTH_CONNECT permission is not granted, cannot reconnect Gatt");
            return;
        }
        if (gatt.connect()) {
            logInfo(String.format(Locale.US, "%s - Setting up long connect via mGatt.connect()", this));
        } else {
            String str = String.format(Locale.US, "Failed to setting up long connect to %s via mGatt.connect()", this);
            logError(str, new Throwable(str));
        }
        setLastConnectionStartTime(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void logError(String str, @NonNull Throwable th2) {
        g0 g0Var = this.mController.get();
        if (g0Var != null) {
            g0Var.p(str, th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void logInfo(String str) {
        g0 g0Var = this.mController.get();
        if (g0Var != null) {
            g0Var.E(str);
        }
    }

    private void notifyConnectedListener(boolean z11) {
        WeakReference<b> weakReference = this.connectedListener;
        if (weakReference == null) {
            logError("No connected listener, can't notify of connected state!", new Exception("No connected listener, can't notify of connected state!"));
            return;
        }
        b bVar = weakReference.get();
        if (bVar == null) {
            logError("connected listener reference lost, can't notify of connected state!", new Exception("connected listener reference lost, can't notify of connected state!"));
        } else if (z11) {
            bVar.a(this.vin);
        } else {
            bVar.onDisconnected(this.vin);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onBytesReceived(byte[] bArr) {
        g0 g0Var;
        VehicleMessage messageFromBytes = getMessageFromBytes(bArr);
        if (messageFromBytes != null) {
            if ((messageFromBytes.getRoutableMessage() == null && messageFromBytes.getFromVCSECMessage() == null) || (g0Var = this.mController.get()) == null) {
                return;
            }
            g0Var.y(messageFromBytes, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onConnectionLost(String str) {
        logInfo(String.format(Locale.US, "%s - onConnectionLost %s", this, str));
        this.gattProfileRetryManager.c();
        setConnected(false);
        this.mtuEstablished.set(false);
        this.discoverServicesStarted.set(false);
        this.onServicesDiscovered.set(false);
        setServiceConnected(false);
        g0 g0Var = this.mController.get();
        if (g0Var != null) {
            g0Var.b(this);
            int i11 = 0;
            while (true) {
                u5.d<byte[], String> dVarPoll = this.mCommandQueue.poll();
                if (dVarPoll == null) {
                    break;
                }
                g0Var.x(false, "PHONE_KEY_NOT_CONNECTED", ie0.q0.b(dVarPoll.f115407a), this);
                i11++;
            }
            logInfo(String.format(Locale.US, "%s - dropped %d pending commands", this, Integer.valueOf(i11)));
        }
        if (this.mFinished.get()) {
            destroy();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onMtuCompletion(BluetoothGatt bluetoothGatt) {
        this.mMtuWakeLock.e();
        this.mtuEstablished.set(true);
        this.mBusy.set(false);
        if (bluetoothGatt == null) {
            return;
        }
        if (bluetoothGatt.getService(com.teslamotors.plugins.ble.a.f56698b) != null) {
            logInfo(String.format(Locale.US, "%s - Already know about services", this));
        }
        getHandler().postAtTime(new d(), getIdentifier(), SystemClock.uptimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onServiceConnectedAndPeripheralFound(@NonNull g0 g0Var) {
        this.mBusy.set(false);
        setServiceConnected(true);
        g0Var.c(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reconnect(int i11) {
        getHandler().removeCallbacksAndMessages(getIdentifier());
        int delayDurationForStatus = getDelayDurationForStatus(i11);
        this.mReconnectWakeLock.b(delayDurationForStatus + 1000);
        getHandler().postAtTime(new Runnable() { // from class: com.teslamotors.plugins.ble.l0
            @Override // java.lang.Runnable
            public final void run() {
                this.f56930a.lambda$reconnect$0();
            }
        }, getIdentifier(), ((long) delayDurationForStatus) + SystemClock.uptimeMillis());
    }

    private boolean reconnectionInProgress() {
        return this.connectionStartTime.get() + DeviceOrientationRequest.OUTPUT_PERIOD_FAST > SystemClock.elapsedRealtime();
    }

    private void registerRetryPolicy() {
        ze0.a aVar = new ze0.a();
        this.gattProfileRetryManager = aVar;
        aVar.b("TAG_SERVICE_DISCOVER", new bf0.f(5));
        this.gattProfileRetryManager.b("TAG_REQUEST_INDICATION", new bf0.b(5));
        this.gattProfileRetryManager.b("TAG_GATT_STATUS_132", new bf0.a(5));
        this.gattProfileRetryManager.b("TAG_GATT_STATUS_10", new bf0.a(5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scheduleReconnect(bf0.c cVar) {
        g0 g0Var = this.mController.get();
        if (g0Var == null) {
            logInfo(String.format("%s - scheduling resetPeripheral failed due to null controller", this));
        } else {
            g0Var.l(this, bf0.d.a(cVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendCharacteristicChangedTelemetry(int i11, int i12) {
        if (i11 != 0) {
            sendGattStatusTelemetry(af0.a.b(i11), cf0.f.CHARACTERISTIC_CHANGE, this.connectedTimestamp.longValue(), i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendCharacteristicReadTelemetry(int i11, int i12) {
        if (i11 != 0) {
            sendGattStatusTelemetry(af0.a.b(i11), cf0.f.CHARACTERISTIC_READ, this.connectedTimestamp.longValue(), i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendCharacteristicWriteTelemetry(int i11, int i12) {
        if (i11 != 0) {
            sendGattStatusTelemetry(af0.a.b(i11), cf0.f.CHARACTERISTIC_WRITE, this.connectedTimestamp.longValue(), i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendConnectedTelemetry(int i11, int i12) {
        if (i11 != 0) {
            sendGattStatusTelemetry(af0.a.b(i11), cf0.f.CONNECTED, this.disconnectedTimestamp.longValue(), i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendConnectionCompleteTelemetry(long j11, int i11) {
        sendGattStatusTelemetry(af0.a.b(0), cf0.f.CONNECTION_COMPLETE, j11, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendDisconnectedTelemetry(int i11, int i12) {
        if (i11 != 0) {
            sendGattStatusTelemetry(af0.a.b(i11), cf0.f.DISCONNECTED, this.connectedTimestamp.longValue(), i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendEnableIndicationTelemetry(int i11, int i12) {
        if (i11 != 0) {
            sendGattStatusTelemetry(af0.a.b(i11), cf0.f.DESCRIPTOR_WRITE, this.connectedTimestamp.longValue(), i12);
        }
    }

    private void sendGattStatusTelemetry(String str, cf0.f fVar, long j11, int i11) {
        cf0.h.a(this.mContext, new GattPayload(this.vin, str, fVar.description(), System.currentTimeMillis(), j11, ef0.k.f62906a.a(this.mBluetoothAdapter), i11, this.connectionId));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendMTUChangedTelemetry(int i11, int i12) {
        if (i11 != 0) {
            sendGattStatusTelemetry(af0.a.b(i11), cf0.f.MTU_CHANGED, this.connectedTimestamp.longValue(), i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendServiceDiscoveredTelemetry(int i11, int i12) {
        if (i11 != 0) {
            sendGattStatusTelemetry(af0.a.b(i11), cf0.f.SERVICES_DISCOVER, this.connectedTimestamp.longValue(), i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnected(boolean z11) {
        if (z11) {
            this.disconnectedTimestamp = 0L;
            this.connectedTimestamp = Long.valueOf(System.currentTimeMillis());
        } else {
            this.disconnectedTimestamp = Long.valueOf(System.currentTimeMillis());
        }
        this.mIsConnected.set(z11);
        notifyConnectedListener(z11);
    }

    private void setGatt(BluetoothGatt bluetoothGatt) {
        this.mGatt = bluetoothGatt;
    }

    private void setGattService(BluetoothGattService bluetoothGattService) {
        this.gattService = bluetoothGattService;
    }

    private void setLastBackgroundConnectTime() {
        this.backgroundConnectTime = SystemClock.elapsedRealtime();
    }

    private void setLastConnectionStartTime(boolean z11) {
        this.connectionStartTime.set(SystemClock.elapsedRealtime());
        if (z11) {
            setLastBackgroundConnectTime();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRssi(int i11) {
        this.rssi = i11;
    }

    private boolean shouldGateConnection() {
        return ie0.y.f77624a.g() && rd0.i.c(this.vin) != rd0.j.Enabled;
    }

    private void writeToCar(u5.d<byte[], String> dVar) {
        if (dVar == null) {
            this.mBusy.set(false);
            return;
        }
        if (this.mFinished.get()) {
            logInfo("SKIPPING Sending messages; this peripheral object is finished");
            return;
        }
        if (!ie0.c0.a(this.mContext)) {
            logInfo("BLUETOOTH_CONNECT permission is not granted, skip writeToCar");
            return;
        }
        g0 g0Var = this.mController.get();
        if (g0Var == null) {
            return;
        }
        BluetoothGatt gatt = getGatt();
        BluetoothGattService gattService = getGattService();
        byte[] bArr = dVar.f115407a;
        String strB = ie0.q0.b(bArr);
        Locale locale = Locale.US;
        String str = String.format(locale, "(%s)", Integer.valueOf(strB.length()));
        if (gatt == null || gattService == null) {
            logInfo(String.format(locale, "%s - FAILED to write to car - peripheral Gatt or Gatt Service was null!", this));
            this.mBusy.set(false);
            g0Var.x(false, "PHONE_KEY_TRANSMISSION_FAILURE", strB, this);
            return;
        }
        BluetoothGattCharacteristic characteristic = gattService.getCharacteristic(com.teslamotors.plugins.ble.a.f56700d);
        if (characteristic == null) {
            String str2 = String.format(locale, "%s - FAILED to write to car - empty TX characteristic!", this);
            logError(str2, new Throwable(str2));
            this.mBusy.set(false);
            g0Var.x(false, "PHONE_KEY_TRANSMISSION_FAILURE", strB, this);
            return;
        }
        String str3 = dVar.f115408b;
        try {
            characteristic.setWriteType(2);
            if (characteristic.setValue(bArr)) {
                nc0.l lVar = nc0.l.BLE_WRITE_CHARACTERISTIC;
                ld0.d.b(lVar);
                long jCurrentTimeMillis = System.currentTimeMillis();
                logInfo(String.format(locale, "%s - Sending %s: %s", this, str3, str));
                if (gatt.writeCharacteristic(characteristic)) {
                    x0.b(str3, bArr.length, jCurrentTimeMillis);
                    logInfo(String.format(locale, "%s - Sent %s: %s", this, str3, str));
                    return;
                } else {
                    ld0.d.a(lVar);
                    logInfo(String.format(locale, "%s - FAILED to WRITE CHARACTERISTIC %s: %s", this, str3, str));
                }
            } else {
                logInfo(String.format(locale, "%s - FAILED to SET VALUE %s: %s", this, str3, str));
            }
        } catch (Exception e11) {
            logError(String.format(Locale.US, "%s - EXCEPTION when sending %s: %s", this, str3, str), e11);
        }
        x0.a(str3);
        this.mBusy.set(false);
        g0Var.x(false, "PHONE_KEY_TRANSMISSION_FAILURE", strB, this);
    }

    public void createInitialConnection() {
        if (shouldGateConnection()) {
            logInfo("Phone key disabled on OHOS VM for " + this.vin + ", skip GATT connection");
            return;
        }
        String identifier = getIdentifier();
        if (!ie0.c0.a(this.mContext)) {
            logInfo("BLUETOOTH_CONNECT permission is not granted, skip createInitialConnection");
            return;
        }
        if (identifier == null || this.mBluetoothAdapter == null) {
            return;
        }
        logInfo(this + " - creating direct connection");
        BluetoothDevice remoteDevice = this.mBluetoothAdapter.getRemoteDevice(identifier);
        if (Build.VERSION.SDK_INT >= 26) {
            setGatt(remoteDevice.connectGatt(this.mContext, this.mAutoConnect, this.mGattCallback, 2, 1, this.mHandler));
        } else {
            setGatt(remoteDevice.connectGatt(this.mContext, this.mAutoConnect, this.mGattCallback));
        }
        if (this.mGatt != null) {
            setLastConnectionStartTime(true);
            return;
        }
        logInfo(this + " - create gatt failed");
    }

    public void disconnect() {
        if (this.mFinished.getAndSet(true)) {
            return;
        }
        this.mMtuWakeLock.e();
        this.mReconnectWakeLock.e();
        this.mServiceDiscoveryWakeLock.e();
        this.timelineTracker.f(this.vin, "intentional_disconnect", null);
        BluetoothGatt gatt = getGatt();
        if (gatt != null) {
            try {
                try {
                    if (ie0.c0.a(this.mContext)) {
                        logInfo(String.format(Locale.US, "%s - disconnecting and closing Gatt object", this));
                        gatt.disconnect();
                        ff0.g.e(this.vin, new ff0.m.a(d2.PERIPHERALSTATE_DISCONNECTED));
                        gatt.close();
                    } else {
                        logInfo("BLUETOOTH_CONNECT permission is not granted, failed to disconnect Gatt object");
                    }
                } catch (Exception e11) {
                    logError("Failed to disconnect Gatt object", e11);
                }
                setGatt(null);
            } catch (Throwable th2) {
                setGatt(null);
                throw th2;
            }
        } else {
            logInfo(String.format(Locale.US, "%s - Gatt object already null!", this));
        }
        onConnectionLost("SELF-DIRECTED");
    }

    public boolean enqueue(byte[] bArr, String str) {
        boolean zOffer = this.mCommandQueue.offer(new u5.d<>(bArr, str));
        if (zOffer) {
            logInfo(String.format(Locale.US, "%s - added message %s - %s to queue of size %d", this, ie0.q0.b(bArr), str, Integer.valueOf(this.mCommandQueue.size() - 1)));
        } else {
            logInfo(String.format(Locale.US, "%s - FAILED to add message %s - %s to queue of size %s", this, ie0.q0.b(bArr), str, Integer.valueOf(this.mCommandQueue.size())));
        }
        checkCommandQueue();
        return zOffer;
    }

    public Long getConnectedTimestamp() {
        return this.connectedTimestamp;
    }

    public Long getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    public Long getDisconnectedTimestamp() {
        return this.disconnectedTimestamp;
    }

    public String getHashedIdentifier() {
        if (this.hashedId == null) {
            this.hashedId = ie0.q0.d(this.originalAddress);
        }
        return this.hashedId;
    }

    public String getIdentifier() {
        return this.originalAddress;
    }

    public String getPosition() {
        return this.mPosition;
    }

    public int getRssi() {
        return this.rssi;
    }

    public boolean getServiceConnected() {
        return this.serviceConnected.get();
    }

    cf0.e getTimelineTracker() {
        return this.timelineTracker;
    }

    public ze0.a getgattProfileRetryManager() {
        return this.gattProfileRetryManager;
    }

    public boolean isCentralPeripheral() {
        return this.mPosition.equals("C");
    }

    public boolean isConnected() {
        return this.mIsConnected.get();
    }

    public boolean isFinished() {
        return this.mFinished.get();
    }

    public boolean isNotMtuEstablished() {
        return !this.mtuEstablished.get();
    }

    public void recreateGattIfNull() {
        if (this.mGatt == null) {
            createInitialConnection();
            logInfo(this + " - gatt object is null, recreating...");
        }
    }

    public boolean requestIndications() {
        BluetoothGatt gatt;
        bf0.e eVarA = this.gattProfileRetryManager.a("TAG_REQUEST_INDICATION");
        boolean characteristicNotification = false;
        if (!eVarA.b()) {
            logInfo(String.format(Locale.US, "%s - hit max indication requests - resetting", this));
            this.timelineTracker.f(this.vin, "max_indication_retries", null);
            scheduleReconnect(bf0.c.MAX_INDICATION_FAILURE);
            return false;
        }
        eVarA.a(null);
        Locale locale = Locale.US;
        logInfo(String.format(locale, "%s - requestIndications", this));
        try {
            BluetoothGattService gattService = getGattService();
            if (gattService == null) {
                logInfo(String.format(locale, "%s - Null mGatt service - cannot register for notifications", this));
                return false;
            }
            UUID uuid = com.teslamotors.plugins.ble.a.f56701e;
            BluetoothGattCharacteristic characteristic = gattService.getCharacteristic(uuid);
            if (characteristic == null) {
                logInfo(String.format(locale, "%s - Null FROM_VEHICLE characteristic - cannot register for notifications", this));
                return false;
            }
            if (uuid.equals(characteristic.getUuid()) && (gatt = getGatt()) != null) {
                BluetoothGattDescriptor descriptor = characteristic.getDescriptor(com.teslamotors.plugins.ble.a.f56703g);
                if (descriptor == null || !descriptor.setValue(BluetoothGattDescriptor.ENABLE_INDICATION_VALUE)) {
                    logInfo(String.format(locale, "%s - FAILED to get a descriptor or set indications from the characteristic", this));
                } else if (!ie0.c0.a(this.mContext)) {
                    logInfo("BLUETOOTH_CONNECT permission is not granted, can not requestIndications");
                } else if (gatt.writeDescriptor(descriptor)) {
                    characteristicNotification = gatt.setCharacteristicNotification(characteristic, true);
                    if (!characteristicNotification) {
                        logInfo(String.format(locale, "%s - FAILED to set characteristic indications", this));
                    }
                } else {
                    logInfo(String.format(locale, "%s - FAILED to write descriptor to enable indications", this));
                }
            }
            if (!characteristicNotification) {
                logInfo(String.format(locale, "%s - FAILED to register for indications on %s", this, uuid));
                return characteristicNotification;
            }
            this.mBusy.set(true);
            logInfo(String.format(locale, "%s - Registered for indications on %s, waiting for callback", this, uuid));
            return characteristicNotification;
        } catch (Exception e11) {
            logError(String.format(Locale.US, "%s - FAILED to register for indications on %s", this, com.teslamotors.plugins.ble.a.f56701e), e11);
            return false;
        }
    }

    public void requestMtu() {
        BluetoothGatt gatt = getGatt();
        if (gatt == null || !isConnected()) {
            logInfo(String.format(Locale.US, "%s - not connected; cancelling MTU set", this));
            return;
        }
        if (isNotMtuEstablished()) {
            if (!ie0.c0.a(this.mContext)) {
                logInfo("BLUETOOTH_CONNECT permission is not granted, cannot requestMtu");
                return;
            }
            this.mBusy.set(true);
            logInfo(String.format(Locale.US, "%s - requested MTU of size 250 with result %s", this, Boolean.valueOf(gatt.requestMtu(EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE))));
            this.mMtuWakeLock.b(4000L);
            getHandler().postAtTime(new e(), getIdentifier(), SystemClock.uptimeMillis() + 3000);
        }
    }

    public void requestMtuDebug() {
        BluetoothGatt gatt = getGatt();
        if (gatt == null || !isConnected()) {
            logInfo(String.format(Locale.US, "%s - not connected; cancelling MTU set", this));
            return;
        }
        if (isNotMtuEstablished()) {
            this.mBusy.set(true);
            logInfo(String.format(Locale.US, "%s - debug requested MTU of size 115 with result %s", this, Boolean.valueOf(gatt.requestMtu(115))));
            this.mMtuWakeLock.b(4000L);
            getHandler().postAtTime(new e(), getIdentifier(), SystemClock.uptimeMillis() + 3000);
        }
    }

    public long secondsSinceConnect() {
        return (SystemClock.elapsedRealtime() - this.backgroundConnectTime) / 1000;
    }

    public void setConnectedListener(b bVar) {
        if (bVar == null) {
            return;
        }
        this.connectedListener = new WeakReference<>(bVar);
        notifyConnectedListener(this.mIsConnected.get());
    }

    public void setServiceConnected(boolean z11) {
        this.serviceConnected.set(z11);
    }

    public boolean shouldTryBackgroundScanConnect() {
        return this.backgroundConnectTime + 10000 < SystemClock.elapsedRealtime();
    }

    @NonNull
    public String toString() {
        return String.format(Locale.US, "%s - %s (%s) (%s)", this.mPosition, getHashedIdentifier(), Integer.valueOf(hashCode()), this.mIsConnected.get() ? "connected" : "disconnected");
    }

    public void warnAboutBluetoothShouldCycle() {
        g0 g0Var = this.mController.get();
        if (g0Var != null) {
            g0Var.d();
        }
    }
}
