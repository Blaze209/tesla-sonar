package com.tradle.react;

import android.net.wifi.WifiManager;
import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.io.IOException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes8.dex */
public final class UdpSockets extends ReactContextBaseJavaModule implements com.tradle.react.e.a, com.tradle.react.e.b {
    private static final int N_THREADS = 2;
    private static final String TAG = "UdpSockets";
    private final ExecutorService executorService;
    private final SparseArray<com.tradle.react.e> mClients;
    private WifiManager.MulticastLock mMulticastLock;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i11 = 0; i11 < UdpSockets.this.mClients.size(); i11++) {
                com.tradle.react.e eVar = (com.tradle.react.e) UdpSockets.this.mClients.valueAt(i11);
                eVar.i();
                if (UdpSockets.this.mMulticastLock != null && UdpSockets.this.mMulticastLock.isHeld() && eVar.k()) {
                    UdpSockets.this.mMulticastLock.release();
                }
            }
            UdpSockets.this.mClients.clear();
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Integer f57094a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Callback f57095b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Integer f57096c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f57097d;

        b(Integer num, Callback callback, Integer num2, String str) {
            this.f57094a = num;
            this.f57095b = callback;
            this.f57096c = num2;
            this.f57097d = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.tradle.react.e eVarFindClient = UdpSockets.this.findClient(this.f57094a, this.f57095b);
            if (eVarFindClient == null) {
                return;
            }
            try {
                eVarFindClient.h(this.f57096c, this.f57097d);
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString(PlaceTypes.ADDRESS, this.f57097d);
                writableMapCreateMap.putInt("port", this.f57096c.intValue());
                this.f57095b.invoke(null, writableMapCreateMap);
            } catch (Exception e11) {
                this.f57095b.invoke(com.tradle.react.b.a(com.tradle.react.a.socketAlreadyBoundError.name(), e11.getMessage()));
            }
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Integer f57099a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f57100b;

        c(Integer num, String str) {
            this.f57099a = num;
            this.f57100b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.tradle.react.e eVarFindClient = UdpSockets.this.findClient(this.f57099a, null);
            if (eVarFindClient == null) {
                return;
            }
            if (UdpSockets.this.mMulticastLock == null) {
                WifiManager wifiManager = (WifiManager) UdpSockets.this.getReactApplicationContext().getApplicationContext().getSystemService("wifi");
                UdpSockets.this.mMulticastLock = wifiManager.createMulticastLock("react-native-udp");
                UdpSockets.this.mMulticastLock.setReferenceCounted(true);
            }
            try {
                UdpSockets.this.mMulticastLock.acquire();
                eVarFindClient.g(this.f57100b);
            } catch (IOException e11) {
                if (UdpSockets.this.mMulticastLock != null && UdpSockets.this.mMulticastLock.isHeld()) {
                    UdpSockets.this.mMulticastLock.release();
                }
                qk.a.n(UdpSockets.TAG, "addMembership", e11);
            } catch (IllegalStateException e12) {
                if (UdpSockets.this.mMulticastLock != null && UdpSockets.this.mMulticastLock.isHeld()) {
                    UdpSockets.this.mMulticastLock.release();
                }
                qk.a.n(UdpSockets.TAG, "addMembership", e12);
            } catch (UnknownHostException e13) {
                if (UdpSockets.this.mMulticastLock != null && UdpSockets.this.mMulticastLock.isHeld()) {
                    UdpSockets.this.mMulticastLock.release();
                }
                qk.a.n(UdpSockets.TAG, "addMembership", e13);
            }
        }
    }

    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Integer f57102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f57103b;

        d(Integer num, String str) {
            this.f57102a = num;
            this.f57103b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.tradle.react.e eVarFindClient = UdpSockets.this.findClient(this.f57102a, null);
            if (eVarFindClient == null) {
                return;
            }
            try {
                eVarFindClient.j(this.f57103b);
            } catch (IOException e11) {
                qk.a.n(UdpSockets.TAG, "dropMembership", e11);
            } finally {
                if (UdpSockets.this.mMulticastLock != null && UdpSockets.this.mMulticastLock.isHeld()) {
                    UdpSockets.this.mMulticastLock.release();
                }
            }
        }
    }

    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Integer f57105a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Callback f57106b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f57107c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Integer f57108d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f57109e;

        e(Integer num, Callback callback, String str, Integer num2, String str2) {
            this.f57105a = num;
            this.f57106b = callback;
            this.f57107c = str;
            this.f57108d = num2;
            this.f57109e = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.tradle.react.e eVarFindClient = UdpSockets.this.findClient(this.f57105a, this.f57106b);
            if (eVarFindClient == null) {
                return;
            }
            try {
                eVarFindClient.l(this.f57107c, this.f57108d, this.f57109e, this.f57106b);
            } catch (Exception e11) {
                this.f57106b.invoke(com.tradle.react.b.a(com.tradle.react.a.sendError.name(), e11.getMessage()));
            }
        }
    }

    class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Integer f57111a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Callback f57112b;

        f(Integer num, Callback callback) {
            this.f57111a = num;
            this.f57112b = callback;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.tradle.react.e eVarFindClient = UdpSockets.this.findClient(this.f57111a, this.f57112b);
            if (eVarFindClient == null) {
                return;
            }
            if (UdpSockets.this.mMulticastLock != null && UdpSockets.this.mMulticastLock.isHeld() && eVarFindClient.k()) {
                UdpSockets.this.mMulticastLock.release();
            }
            eVarFindClient.i();
            this.f57112b.invoke(new Object[0]);
            UdpSockets.this.mClients.remove(this.f57111a.intValue());
        }
    }

    class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Integer f57114a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Callback f57115b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Boolean f57116c;

        g(Integer num, Callback callback, Boolean bool) {
            this.f57114a = num;
            this.f57115b = callback;
            this.f57116c = bool;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.tradle.react.e eVarFindClient = UdpSockets.this.findClient(this.f57114a, this.f57115b);
            if (eVarFindClient == null) {
                return;
            }
            try {
                eVarFindClient.m(this.f57116c.booleanValue());
                this.f57115b.invoke(new Object[0]);
            } catch (SocketException e11) {
                this.f57115b.invoke(com.tradle.react.b.a(com.tradle.react.a.setBroadcast.name(), e11.getMessage()));
            }
        }
    }

    class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.tradle.react.e f57118a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f57119b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f57120c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f57121d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f57122e;

        h(com.tradle.react.e eVar, String str, String str2, int i11, long j11) {
            this.f57118a = eVar;
            this.f57119b = str;
            this.f57120c = str2;
            this.f57121d = i11;
            this.f57122e = j11;
        }

        @Override // java.lang.Runnable
        public void run() {
            int iKeyAt = -1;
            for (int i11 = 0; i11 < UdpSockets.this.mClients.size(); i11++) {
                iKeyAt = UdpSockets.this.mClients.keyAt(i11);
                if (this.f57118a.equals(UdpSockets.this.mClients.get(iKeyAt))) {
                    break;
                }
            }
            if (iKeyAt == -1) {
                return;
            }
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("data", this.f57119b);
            writableMapCreateMap.putString(PlaceTypes.ADDRESS, this.f57120c);
            writableMapCreateMap.putInt("port", this.f57121d);
            writableMapCreateMap.putString("ts", Long.toString(this.f57122e));
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) UdpSockets.this.getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("udp-" + iKeyAt + "-data", writableMapCreateMap);
        }
    }

    public UdpSockets(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mClients = new SparseArray<>();
        this.executorService = Executors.newFixedThreadPool(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.tradle.react.e findClient(Integer num, Callback callback) {
        com.tradle.react.e eVar = this.mClients.get(num.intValue());
        if (eVar == null) {
            if (callback == null) {
                qk.a.m(TAG, "missing callback parameter.");
                return eVar;
            }
            callback.invoke(com.tradle.react.b.a(com.tradle.react.a.clientNotFound.name(), "no client found with id " + num), null);
        }
        return eVar;
    }

    @ReactMethod
    public void addMembership(Integer num, String str) {
        this.executorService.execute(new Thread(new c(num, str)));
    }

    @ReactMethod
    public void bind(Integer num, Integer num2, String str, ReadableMap readableMap, Callback callback) {
        this.executorService.execute(new Thread(new b(num, callback, num2, str)));
    }

    @ReactMethod
    public void close(Integer num, Callback callback) {
        this.executorService.execute(new Thread(new f(num, callback)));
    }

    @ReactMethod
    public void createSocket(Integer num, ReadableMap readableMap) {
        if (num == null) {
            qk.a.m(TAG, "createSocket called with nil id parameter.");
        } else if (this.mClients.get(num.intValue()) != null) {
            qk.a.m(TAG, "createSocket called twice with the same id.");
        } else {
            this.mClients.put(num.intValue(), new com.tradle.react.e(this, this));
        }
    }

    @Override // com.tradle.react.e.a
    public void didReceiveData(com.tradle.react.e eVar, String str, String str2, int i11) {
        this.executorService.execute(new Thread(new h(eVar, str, str2, i11, System.currentTimeMillis())));
    }

    @Override // com.tradle.react.e.a
    public void didReceiveError(com.tradle.react.e eVar, String str) {
        qk.a.m(TAG, str);
    }

    @Override // com.tradle.react.e.b
    public void didReceiveException(RuntimeException runtimeException) {
        getReactApplicationContext().handleException(runtimeException);
    }

    @ReactMethod
    public void dropMembership(Integer num, String str) {
        this.executorService.execute(new Thread(new d(num, str)));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return TAG;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.executorService.execute(new Thread(new a()));
    }

    @ReactMethod
    public void send(Integer num, String str, Integer num2, String str2, Callback callback) {
        this.executorService.execute(new Thread(new e(num, callback, str, num2, str2)));
    }

    @ReactMethod
    public void setBroadcast(Integer num, Boolean bool, Callback callback) {
        this.executorService.execute(new Thread(new g(num, callback, bool)));
    }
}
