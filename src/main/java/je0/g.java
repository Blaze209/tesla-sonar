package je0;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.ReactApplicationContext;
import expo.modules.interfaces.permissions.PermissionsResponse;
import ezvcard.property.Kind;
import ie0.c0;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.t0;
import wn0.q;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 C2\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ1\u0010\u0010\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0018\u0010\u000f\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00060\fj\u0002`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0015\u001a\u00020\u00062(\u0010\u0014\u001a$\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00060\u0012j\u0002`\u0013¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0019\u001a\u00020\u00062\u0018\u0010\u0018\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00060\fj\u0002`\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u00100\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00102\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010/R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R,\u00109\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u0006\u0018\u00010\fj\u0004\u0018\u0001`\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R<\u0010<\u001a(\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0012j\u0004\u0018\u0001`\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R,\u0010>\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u0006\u0018\u00010\fj\u0004\u0018\u0001`\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u00108R\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006D"}, d2 = {"Lje0/g;", "", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Ljn0/h0;", "E", "()V", "D", "Landroid/bluetooth/BluetoothDevice;", Kind.DEVICE, "Lkotlin/Function1;", "", "Lcom/tesla/utils/energy/OnConnectCallback;", "onResult", "u", "(Landroid/bluetooth/BluetoothDevice;Lwn0/l;)V", "Lkotlin/Function3;", "Lcom/tesla/utils/energy/OnReadCredentials;", "onRead", "A", "(Lwn0/q;)V", "Lcom/tesla/utils/energy/OnDisconnectCallback;", "onDisconnect", "x", "(Lwn0/l;)V", "Landroid/content/Context;", "a", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "b", "Landroid/bluetooth/BluetoothDevice;", "bluetoothDevice", "Landroid/bluetooth/BluetoothGatt;", "c", "Landroid/bluetooth/BluetoothGatt;", "bluetoothGatt", "Landroid/bluetooth/BluetoothGattService;", DateTokenConverter.CONVERTER_KEY, "Landroid/bluetooth/BluetoothGattService;", "bluetoothGattService", "", "e", "I", "bluetoothConnectionState", "f", "Ljava/lang/String;", "ssid", "g", "password", "", "h", "Z", "userInitiatedDisconnect", IntegerTokenConverter.CONVERTER_KEY, "Lwn0/l;", "onConnectCallback", "j", "Lwn0/q;", "onReadCallback", "k", "onDisconnectCallback", "Landroid/bluetooth/BluetoothGattCallback;", "l", "Landroid/bluetooth/BluetoothGattCallback;", "bluetoothDeviceCallback", "m", "utils_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private BluetoothDevice bluetoothDevice;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private BluetoothGatt bluetoothGatt;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private BluetoothGattService bluetoothGattService;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int bluetoothConnectionState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private String ssid;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private String password;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean userInitiatedDisconnect;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private wn0.l<? super String, h0> onConnectCallback;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private q<? super String, ? super String, ? super String, h0> onReadCallback;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private wn0.l<? super String, h0> onDisconnectCallback;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private BluetoothGattCallback bluetoothDeviceCallback;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J)\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ!\u0010\n\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"je0/g$b", "Landroid/bluetooth/BluetoothGattCallback;", "Landroid/bluetooth/BluetoothGatt;", "gatt", "", PermissionsResponse.STATUS_KEY, "newState", "Ljn0/h0;", "onConnectionStateChange", "(Landroid/bluetooth/BluetoothGatt;II)V", "onServicesDiscovered", "(Landroid/bluetooth/BluetoothGatt;I)V", "Landroid/bluetooth/BluetoothGattCharacteristic;", "characteristic", "", "value", "onCharacteristicRead", "(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;[BI)V", "utils_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends BluetoothGattCallback {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(g gVar) {
            gVar.D();
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicRead(BluetoothGatt gatt, BluetoothGattCharacteristic characteristic, byte[] value, int status) {
            q qVar;
            s.k(gatt, "gatt");
            s.k(characteristic, "characteristic");
            s.k(value, "value");
            if (status == 133) {
                l.b().j("Bluetooth Gatt status was 133 - skipping onCharacteristicRead");
                return;
            }
            if (status != 0) {
                wn0.l lVar = g.this.onConnectCallback;
                if (lVar != null) {
                    t0 t0Var = t0.f86535a;
                    String str = String.format("Read failed for characteristic: %s, status %d", Arrays.copyOf(new Object[]{characteristic.getUuid(), Integer.valueOf(status)}, 2));
                    s.j(str, "format(...)");
                    lVar.invoke(str);
                    return;
                }
                return;
            }
            String string = characteristic.getUuid().toString();
            s.j(string, "toString(...)");
            Locale locale = Locale.ROOT;
            String lowerCase = string.toLowerCase(locale);
            s.j(lowerCase, "toLowerCase(...)");
            if (!s.f(lowerCase, "11110002-877a-45e8-b807-29775c6a0bb3")) {
                String string2 = characteristic.getUuid().toString();
                s.j(string2, "toString(...)");
                String lowerCase2 = string2.toLowerCase(locale);
                s.j(lowerCase2, "toLowerCase(...)");
                if (s.f(lowerCase2, "11110003-877a-45e8-b807-29775c6a0bb3")) {
                    g.this.password = new String(value, p013kotlin.text.d.UTF_8);
                }
            } else {
                if (g.this.onConnectCallback == null) {
                    g.this.ssid = new String(value, p013kotlin.text.d.UTF_8);
                    Handler handler = new Handler(Looper.getMainLooper());
                    final g gVar = g.this;
                    handler.postDelayed(new Runnable() { // from class: je0.h
                        @Override // java.lang.Runnable
                        public final void run() {
                            g.b.b(gVar);
                        }
                    }, 100L);
                    return;
                }
                wn0.l lVar2 = g.this.onConnectCallback;
                if (lVar2 != null) {
                    lVar2.invoke(null);
                }
            }
            String str2 = g.this.ssid;
            if (str2 == null) {
                str2 = "";
            }
            if (str2.length() > 0) {
                String str3 = g.this.password;
                if ((str3 != null ? str3 : "").length() <= 0 || (qVar = g.this.onReadCallback) == null) {
                    return;
                }
                qVar.invoke(g.this.ssid, g.this.password, null);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(BluetoothGatt gatt, int status, int newState) {
            com.tesla.logging.g gVarB = l.b();
            t0 t0Var = t0.f86535a;
            String str = String.format("New connection state %d, status %d", Arrays.copyOf(new Object[]{Integer.valueOf(newState), Integer.valueOf(status)}, 2));
            s.j(str, "format(...)");
            gVarB.j(str);
            g.this.bluetoothConnectionState = newState;
            if (!c0.a(g.this.context)) {
                wn0.l lVar = g.this.onConnectCallback;
                if (lVar != null) {
                    lVar.invoke("ERROR_MISSING_PERMISSION");
                    return;
                }
                return;
            }
            if (gatt == null) {
                return;
            }
            BluetoothDevice bluetoothDevice = g.this.bluetoothDevice;
            String strA = bluetoothDevice != null ? l.a(bluetoothDevice) : null;
            if (status != 0) {
                if (status == 22 || status == 133) {
                    gatt.connect();
                    return;
                }
                return;
            }
            if (newState != 0) {
                if (newState != 2) {
                    return;
                }
                com.tesla.logging.g gVarB2 = l.b();
                String str2 = String.format("Successfully connected to ble device: %s, now discovering services", Arrays.copyOf(new Object[]{strA}, 1));
                s.j(str2, "format(...)");
                gVarB2.j(str2);
                gatt.discoverServices();
                return;
            }
            if (!g.this.userInitiatedDisconnect) {
                gatt.connect();
                return;
            }
            com.tesla.logging.g gVarB3 = l.b();
            String str3 = String.format("User disconnected from bluetooth device %s", Arrays.copyOf(new Object[]{strA}, 1));
            s.j(str3, "format(...)");
            gVarB3.j(str3);
            wn0.l lVar2 = g.this.onDisconnectCallback;
            if (lVar2 != null) {
                lVar2.invoke(null);
            }
            gatt.close();
            g.this.bluetoothGatt = null;
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(BluetoothGatt gatt, int status) {
            List<BluetoothGattService> services;
            if (gatt == null || (services = gatt.getServices()) == null) {
                return;
            }
            g gVar = g.this;
            for (BluetoothGattService bluetoothGattService : services) {
                String string = bluetoothGattService.getUuid().toString();
                s.j(string, "toString(...)");
                String lowerCase = string.toLowerCase(Locale.ROOT);
                s.j(lowerCase, "toLowerCase(...)");
                if (s.f(lowerCase, "11110001-877a-45e8-b807-29775c6a0bb3")) {
                    gVar.bluetoothGattService = bluetoothGattService;
                    gatt.readCharacteristic(bluetoothGattService.getCharacteristic(UUID.fromString("11110002-877a-45e8-b807-29775c6a0bb3")));
                }
            }
        }
    }

    public g(ReactApplicationContext reactContext) {
        s.k(reactContext, "reactContext");
        Context applicationContext = reactContext.getApplicationContext();
        s.j(applicationContext, "getApplicationContext(...)");
        this.context = applicationContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(g gVar) {
        q<? super String, ? super String, ? super String, h0> qVar = gVar.onReadCallback;
        if (qVar != null) {
            qVar.invoke(null, null, "ERROR_READ_CHAR_TIMEOUT");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 C(q qVar, g gVar, String str, String str2, String str3) {
        qVar.invoke(str, str2, str3);
        gVar.onReadCallback = null;
        gVar.bluetoothDeviceCallback = null;
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D() {
        if (!c0.a(this.context)) {
            q<? super String, ? super String, ? super String, h0> qVar = this.onReadCallback;
            if (qVar != null) {
                qVar.invoke(this.ssid, this.password, "ERROR_MISSING_PERMISSION");
                return;
            }
            return;
        }
        BluetoothGattService bluetoothGattService = this.bluetoothGattService;
        if (bluetoothGattService == null) {
            q<? super String, ? super String, ? super String, h0> qVar2 = this.onReadCallback;
            if (qVar2 != null) {
                qVar2.invoke(this.ssid, this.password, "ERROR_NO_SERVICE_TO_USE");
                return;
            }
            return;
        }
        BluetoothGatt bluetoothGatt = this.bluetoothGatt;
        if (bluetoothGatt != null) {
            bluetoothGatt.readCharacteristic(bluetoothGattService.getCharacteristic(UUID.fromString("11110003-877a-45e8-b807-29775c6a0bb3")));
            return;
        }
        q<? super String, ? super String, ? super String, h0> qVar3 = this.onReadCallback;
        if (qVar3 != null) {
            qVar3.invoke(this.ssid, this.password, "ERROR_NO_GATT");
        }
    }

    private final void E() {
        this.bluetoothDeviceCallback = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 v(wn0.l lVar, g gVar, String str) {
        lVar.invoke(str);
        gVar.onConnectCallback = null;
        gVar.bluetoothDeviceCallback = null;
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(g gVar) {
        wn0.l<? super String, h0> lVar = gVar.onConnectCallback;
        if (lVar != null) {
            lVar.invoke("ERROR_CONNECT_TIMEOUT");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 y(wn0.l lVar, g gVar, String str) {
        lVar.invoke(str);
        gVar.onDisconnectCallback = null;
        gVar.userInitiatedDisconnect = false;
        gVar.bluetoothDeviceCallback = null;
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(g gVar) {
        wn0.l<? super String, h0> lVar = gVar.onDisconnectCallback;
        if (lVar != null) {
            lVar.invoke("ERROR_DISCONNECT_TIMEOUT");
        }
    }

    public final void A(final q<? super String, ? super String, ? super String, h0> onRead) {
        s.k(onRead, "onRead");
        this.ssid = null;
        this.password = null;
        if (!c0.a(this.context)) {
            onRead.invoke(null, null, "ERROR_MISSING_PERMISSION");
            return;
        }
        BluetoothGattService bluetoothGattService = this.bluetoothGattService;
        if (bluetoothGattService == null) {
            onRead.invoke(null, null, "ERROR_NO_SERVICE_TO_USE");
            return;
        }
        BluetoothGatt bluetoothGatt = this.bluetoothGatt;
        if (bluetoothGatt == null) {
            onRead.invoke(null, null, "ERROR_NO_GATT");
            return;
        }
        E();
        q<? super String, ? super String, ? super String, h0> qVar = new q() { // from class: je0.a
            @Override // wn0.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return g.C(onRead, this, (String) obj, (String) obj2, (String) obj3);
            }
        };
        this.onReadCallback = qVar;
        if (this.bluetoothConnectionState == 0) {
            qVar.invoke(this.ssid, this.password, "ERROR_DISCONNECTED_FROM_PERIPHERAL");
        } else {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: je0.b
                @Override // java.lang.Runnable
                public final void run() {
                    g.B(this.f83614a);
                }
            }, 30000L);
            bluetoothGatt.readCharacteristic(bluetoothGattService.getCharacteristic(UUID.fromString("11110002-877a-45e8-b807-29775c6a0bb3")));
        }
    }

    public final void u(BluetoothDevice device, final wn0.l<? super String, h0> onResult) {
        s.k(onResult, "onResult");
        if (this.onConnectCallback != null) {
            l.b().n("ERROR_PREVIOUS_STILL_EXECUTING");
            return;
        }
        if (!c0.a(this.context)) {
            wn0.l<? super String, h0> lVar = this.onConnectCallback;
            if (lVar != null) {
                lVar.invoke("ERROR_MISSING_PERMISSION");
                return;
            }
            return;
        }
        if (device == null) {
            onResult.invoke("ERROR_CONNECT_NO_PERIPHERAL");
            return;
        }
        this.bluetoothDevice = device;
        E();
        this.onConnectCallback = new wn0.l() { // from class: je0.e
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return g.v(onResult, this, (String) obj);
            }
        };
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: je0.f
            @Override // java.lang.Runnable
            public final void run() {
                g.w(this.f83620a);
            }
        }, 30000L);
        BluetoothDevice bluetoothDevice = this.bluetoothDevice;
        this.bluetoothGatt = bluetoothDevice != null ? bluetoothDevice.connectGatt(this.context, false, this.bluetoothDeviceCallback, 2) : null;
    }

    public final void x(final wn0.l<? super String, h0> onDisconnect) {
        s.k(onDisconnect, "onDisconnect");
        if (!c0.a(this.context)) {
            onDisconnect.invoke("ERROR_MISSING_PERMISSION");
            return;
        }
        BluetoothGatt bluetoothGatt = this.bluetoothGatt;
        if (bluetoothGatt == null) {
            onDisconnect.invoke("ERROR_NO_GATT");
            return;
        }
        this.onDisconnectCallback = new wn0.l() { // from class: je0.c
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return g.y(onDisconnect, this, (String) obj);
            }
        };
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: je0.d
            @Override // java.lang.Runnable
            public final void run() {
                g.z(this.f83617a);
            }
        }, 30000L);
        this.userInitiatedDisconnect = true;
        bluetoothGatt.disconnect();
    }
}
