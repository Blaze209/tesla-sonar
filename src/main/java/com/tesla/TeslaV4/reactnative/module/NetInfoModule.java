package com.tesla.TeslaV4.reactnative.module;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiNetworkSpecifier;
import android.net.wifi.WifiNetworkSuggestion;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000k\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0006*\u0001:\u0018\u0000 =2\u00020\u0001:\u0001>B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\n\u001a\u00020\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b!\u0010 J)\u0010%\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b)\u0010 J\u0017\u0010*\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b*\u0010 R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00101\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u00109\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010/R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006?"}, d2 = {"Lcom/tesla/TeslaV4/reactnative/module/NetInfoModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Lkotlin/Function1;", "", "Ljn0/h0;", "onComplete", "performNetworkEvaluation", "(Lwn0/l;)V", "bindProcessToWifi", "()Z", "", "Ljava/net/InterfaceAddress;", "getInetAddresses", "()Ljava/util/List;", "", "ip", "inDSLITERange", "(Ljava/lang/String;)Z", "getName", "()Ljava/lang/String;", "ssid", "password", "securityType", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "connectToWifi", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "bindDataToWifi", "(Lcom/facebook/react/bridge/Promise;)V", "didUserCancelWifiSuggestion", "mdnsName", "", "totalTimeoutMs", "resolveMDNSName", "(Ljava/lang/String;ILcom/facebook/react/bridge/Promise;)V", "disconnectFromWifi", "(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "getIPAddress", "ignoreIsConnectedCheckOnHarmonyOs", "Lcom/tesla/logging/g;", "logger", "Lcom/tesla/logging/g;", "userCancelled", "Z", "", "networkRequestStartTime", "J", "Landroid/net/wifi/WifiManager;", "wifiManager", "Landroid/net/wifi/WifiManager;", "Landroid/net/ConnectivityManager;", "connectivityManager", "Landroid/net/ConnectivityManager;", "isNetworkCallbackRegistered", "com/tesla/TeslaV4/reactnative/module/NetInfoModule$b", "networkCallback", "Lcom/tesla/TeslaV4/reactnative/module/NetInfoModule$b;", "Companion", "a", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NetInfoModule extends ReactContextBaseJavaModule {
    private static final Set<String> DSLITE_LIST = d1.i("192.0.0.0", "192.0.0.1", "192.0.0.2", "192.0.0.3", "192.0.0.4", "192.0.0.5", "192.0.0.6", "192.0.0.7");
    private static final int REQUEST_NETWORK_TIMEOUT_MS = 30000;
    private static final String TAG = "NetInfoModule";
    private static final int TRIGGER_NETWORK_EVALUATION_TIMEOUT_MS = 5000;
    private static final long USER_SYSTEM_DIALOG_INTERACTION_DELAY_MS = 8000;
    private static int numberOfSuggestionsMade;
    private final ConnectivityManager connectivityManager;
    private volatile boolean isNetworkCallbackRegistered;
    private final com.tesla.logging.g logger;
    private final b networkCallback;
    private long networkRequestStartTime;
    private boolean userCancelled;
    private final WifiManager wifiManager;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/tesla/TeslaV4/reactnative/module/NetInfoModule$b", "Landroid/net/ConnectivityManager$NetworkCallback;", "Landroid/net/Network;", "network", "Ljn0/h0;", "onAvailable", "(Landroid/net/Network;)V", "onLost", "onUnavailable", "()V", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends ConnectivityManager.NetworkCallback {
        b() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            p013kotlin.jvm.internal.s.k(network, "network");
            super.onAvailable(network);
            boolean zBindProcessToNetwork = NetInfoModule.this.connectivityManager.bindProcessToNetwork(network);
            NetInfoModule.this.logger.j("Network onAvailable: " + zBindProcessToNetwork);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            p013kotlin.jvm.internal.s.k(network, "network");
            super.onLost(network);
            boolean zBindProcessToNetwork = NetInfoModule.this.connectivityManager.bindProcessToNetwork(null);
            if (NetInfoModule.this.isNetworkCallbackRegistered) {
                ConnectivityManager unused = NetInfoModule.this.connectivityManager;
                ta0.a.f(this);
                NetInfoModule.this.isNetworkCallbackRegistered = false;
            }
            NetInfoModule.this.logger.j("Network onLost: " + zBindProcessToNetwork);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
            super.onUnavailable();
            NetInfoModule.this.logger.j("Network onUnavailable");
            if (System.currentTimeMillis() - NetInfoModule.this.networkRequestStartTime < 30000) {
                NetInfoModule.this.userCancelled = true;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/tesla/TeslaV4/reactnative/module/NetInfoModule$c", "Landroid/net/ConnectivityManager$NetworkCallback;", "Landroid/net/Network;", "network", "Ljn0/h0;", "onAvailable", "(Landroid/net/Network;)V", "onUnavailable", "()V", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends ConnectivityManager.NetworkCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ wn0.l<Boolean, jn0.h0> f55648b;

        /* JADX WARN: Multi-variable type inference failed */
        c(wn0.l<? super Boolean, jn0.h0> lVar) {
            this.f55648b = lVar;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            p013kotlin.jvm.internal.s.k(network, "network");
            NetInfoModule.this.logger.j("Network re-evaluation: network available");
            NetInfoModule.this.connectivityManager.bindProcessToNetwork(network);
            NetInfoModule.this.connectivityManager.bindProcessToNetwork(null);
            ConnectivityManager unused = NetInfoModule.this.connectivityManager;
            ta0.a.f(this);
            wn0.l<Boolean, jn0.h0> lVar = this.f55648b;
            if (lVar != null) {
                lVar.invoke(Boolean.TRUE);
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
            NetInfoModule.this.logger.j("Network re-evaluation: no network available");
            ConnectivityManager unused = NetInfoModule.this.connectivityManager;
            ta0.a.f(this);
            wn0.l<Boolean, jn0.h0> lVar = this.f55648b;
            if (lVar != null) {
                lVar.invoke(Boolean.FALSE);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetInfoModule(ReactApplicationContext context) {
        super(context);
        p013kotlin.jvm.internal.s.k(context, "context");
        this.logger = com.tesla.logging.g.INSTANCE.a(TAG);
        this.networkRequestStartTime = System.currentTimeMillis();
        Object systemService = getReactApplicationContext().getSystemService("wifi");
        p013kotlin.jvm.internal.s.i(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
        this.wifiManager = (WifiManager) systemService;
        Object systemService2 = getReactApplicationContext().getSystemService("connectivity");
        p013kotlin.jvm.internal.s.i(systemService2, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.connectivityManager = (ConnectivityManager) systemService2;
        this.networkCallback = new b();
    }

    private final boolean bindProcessToWifi() {
        if (Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        Network[] allNetworks = this.connectivityManager.getAllNetworks();
        p013kotlin.jvm.internal.s.j(allNetworks, "getAllNetworks(...)");
        if (allNetworks.length == 0) {
            this.logger.j("No networks found");
        }
        for (Network network : allNetworks) {
            if (Build.VERSION.SDK_INT < 28) {
                NetworkInfo networkInfo = this.connectivityManager.getNetworkInfo(network);
                if (networkInfo != null && networkInfo.getType() == 1) {
                    this.logger.j("Binding process to WiFi type");
                    this.connectivityManager.bindProcessToNetwork(network);
                    break;
                }
            } else {
                NetworkCapabilities networkCapabilities = this.connectivityManager.getNetworkCapabilities(network);
                if (networkCapabilities != null && networkCapabilities.hasTransport(1)) {
                    this.logger.j("Binding process to WiFi transport");
                    this.connectivityManager.bindProcessToNetwork(network);
                    break;
                }
            }
        }
        return true;
    }

    private final List<InterfaceAddress> getInetAddresses() throws SocketException {
        Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
        p013kotlin.jvm.internal.s.j(networkInterfaces, "getNetworkInterfaces(...)");
        ArrayList list = Collections.list(networkInterfaces);
        p013kotlin.jvm.internal.s.j(list, "list(...)");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            p013kotlin.collections.v.E(arrayList, ((NetworkInterface) it.next()).getInterfaceAddresses());
        }
        return arrayList;
    }

    private final boolean inDSLITERange(String ip2) {
        return DSLITE_LIST.contains(ip2);
    }

    private final void performNetworkEvaluation(wn0.l<? super Boolean, jn0.h0> onComplete) {
        this.logger.j("Performing network evaluation after disconnect");
        try {
            this.connectivityManager.bindProcessToNetwork(null);
            if (this.isNetworkCallbackRegistered) {
                ta0.a.f(this.networkCallback);
                this.isNetworkCallbackRegistered = false;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                this.connectivityManager.requestNetwork(new NetworkRequest.Builder().addCapability(12).build(), new c(onComplete), 5000);
            } else if (onComplete != null) {
                onComplete.invoke(Boolean.TRUE);
            }
        } catch (Exception e11) {
            com.tesla.logging.g gVar = this.logger;
            String str = "Network re-evaluation failed: " + e11.getLocalizedMessage();
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar.getTag();
            String strG = gVar.g(str);
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = v0.f(jn0.x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
            if (onComplete != null) {
                onComplete.invoke(Boolean.FALSE);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void performNetworkEvaluation$default(NetInfoModule netInfoModule, wn0.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            lVar = null;
        }
        netInfoModule.performNetworkEvaluation(lVar);
    }

    public static /* synthetic */ void resolveMDNSName$default(NetInfoModule netInfoModule, String str, int i11, Promise promise, int i12, Object obj) throws SocketException, UnknownHostException {
        if ((i12 & 2) != 0) {
            i11 = 10000;
        }
        netInfoModule.resolveMDNSName(str, i11, promise);
    }

    @ReactMethod
    public final void bindDataToWifi(Promise promise) {
        p013kotlin.jvm.internal.s.k(promise, "promise");
        promise.resolve(Boolean.valueOf(bindProcessToWifi()));
    }

    @ReactMethod
    public final void connectToWifi(String ssid, String password, String securityType, Promise promise) throws InterruptedException {
        p013kotlin.jvm.internal.s.k(ssid, "ssid");
        p013kotlin.jvm.internal.s.k(password, "password");
        p013kotlin.jvm.internal.s.k(securityType, "securityType");
        p013kotlin.jvm.internal.s.k(promise, "promise");
        boolean z11 = false;
        this.userCancelled = false;
        this.networkRequestStartTime = System.currentTimeMillis();
        if (Build.VERSION.SDK_INT < 29) {
            WifiConfiguration wifiConfiguration = new WifiConfiguration();
            t0 t0Var = t0.f86535a;
            String str = String.format("\"%s\"", Arrays.copyOf(new Object[]{ssid}, 1));
            p013kotlin.jvm.internal.s.j(str, "format(...)");
            wifiConfiguration.SSID = str;
            String str2 = String.format("\"%s\"", Arrays.copyOf(new Object[]{password}, 1));
            p013kotlin.jvm.internal.s.j(str2, "format(...)");
            wifiConfiguration.preSharedKey = str2;
            wifiConfiguration.priority = 999999;
            if (this.wifiManager.addNetwork(wifiConfiguration) == -1) {
                this.logger.j("WiFi Config has already been added before");
            }
            for (WifiConfiguration wifiConfiguration2 : this.wifiManager.getConfiguredNetworks()) {
                String str3 = wifiConfiguration2.SSID;
                if (str3 != null) {
                    if (str3.equals("\"" + ssid + "\"")) {
                        this.wifiManager.disconnect();
                        this.wifiManager.enableNetwork(wifiConfiguration2.networkId, true);
                        this.wifiManager.reconnect();
                        z11 = true;
                        break;
                    }
                }
            }
            promise.resolve(Boolean.valueOf(z11));
            return;
        }
        this.wifiManager.removeNetworkSuggestions(p013kotlin.collections.v.e(m.a().setSsid(ssid).build()));
        WifiNetworkSuggestion wifiNetworkSuggestionBuild = m.a().setSsid(ssid).setWpa2Passphrase(password).build();
        p013kotlin.jvm.internal.s.j(wifiNetworkSuggestionBuild, "build(...)");
        WifiNetworkSpecifier wifiNetworkSpecifierBuild = n.a().setSsid(ssid).setWpa2Passphrase(password).build();
        p013kotlin.jvm.internal.s.j(wifiNetworkSpecifierBuild, "build(...)");
        int iAddNetworkSuggestions = this.wifiManager.addNetworkSuggestions(p013kotlin.collections.v.e(wifiNetworkSuggestionBuild));
        if (numberOfSuggestionsMade == 0) {
            Thread.sleep(USER_SYSTEM_DIALOG_INTERACTION_DELAY_MS);
        }
        numberOfSuggestionsMade++;
        if (iAddNetworkSuggestions == 0 || iAddNetworkSuggestions == 3) {
            NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addTransportType(1).setNetworkSpecifier(wifiNetworkSpecifierBuild).build();
            p013kotlin.jvm.internal.s.j(networkRequestBuild, "build(...)");
            this.isNetworkCallbackRegistered = true;
            this.connectivityManager.requestNetwork(networkRequestBuild, this.networkCallback, 30000);
            promise.resolve(Boolean.TRUE);
            return;
        }
        com.tesla.logging.g gVar = this.logger;
        TeslaLog teslaLog = TeslaLog.INSTANCE;
        String tag = gVar.getTag();
        String strG = gVar.g("Error Wi-Fi Suggestions: Status " + iAddNetworkSuggestions);
        zb0.a aVar = zb0.a.f128044a;
        Map mapF = v0.f(jn0.x.a(tag, strG));
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        for (Map.Entry entry : mapF.entrySet()) {
            zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
        }
        firebaseCrashlytics.recordException(new Exception(strG));
        TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
        vr0.a.INSTANCE.a(strG, new Object[0]);
        promise.reject("E_ADD_WIFI_NETWORK", String.valueOf(iAddNetworkSuggestions));
    }

    @ReactMethod
    public final void didUserCancelWifiSuggestion(Promise promise) {
        p013kotlin.jvm.internal.s.k(promise, "promise");
        promise.resolve(Boolean.valueOf(this.userCancelled));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ReactMethod
    public final void disconnectFromWifi(String ssid, Promise promise) {
        String str;
        boolean z11;
        p013kotlin.jvm.internal.s.k(ssid, "ssid");
        p013kotlin.jvm.internal.s.k(promise, "promise");
        try {
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    WifiManager wifiManager = this.wifiManager;
                    o.a();
                    wifiManager.removeNetworkSuggestions(p013kotlin.collections.v.e(m.a().setSsid(ssid).build()));
                    boolean zBindProcessToNetwork = this.connectivityManager.bindProcessToNetwork(null);
                    if (this.isNetworkCallbackRegistered) {
                        ta0.a.f(this.networkCallback);
                        this.isNetworkCallbackRegistered = false;
                    }
                    this.wifiManager.disconnect();
                    z11 = zBindProcessToNetwork;
                } else {
                    for (WifiConfiguration wifiConfiguration : this.wifiManager.getConfiguredNetworks()) {
                        String str2 = wifiConfiguration.SSID;
                        if (str2 != null) {
                            if (str2.equals("\"" + ssid + "\"")) {
                                this.wifiManager.removeNetwork(wifiConfiguration.networkId);
                            }
                        }
                    }
                    boolean zDisconnect = this.wifiManager.disconnect();
                    this.connectivityManager.bindProcessToNetwork(null);
                    z11 = zDisconnect;
                }
            } catch (Exception e11) {
                e = e11;
                str = ssid;
                com.tesla.logging.g gVar = this.logger;
                String localizedMessage = e.getLocalizedMessage();
                p013kotlin.jvm.internal.s.j(localizedMessage, "getLocalizedMessage(...)");
                TeslaLog teslaLog = TeslaLog.INSTANCE;
                String tag = gVar.getTag();
                String strG = gVar.g(localizedMessage);
                zb0.a aVar = zb0.a.f128044a;
                Map mapF = v0.f(jn0.x.a(tag, strG));
                FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry : mapF.entrySet()) {
                    zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
                }
                firebaseCrashlytics.recordException(new Exception(strG));
                TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
                vr0.a.INSTANCE.a(strG, new Object[0]);
                z11 = str;
            }
        } catch (Exception e12) {
            e = e12;
            str = null;
        }
        performNetworkEvaluation$default(this, null, 1, null);
        promise.resolve(Boolean.valueOf(z11));
    }

    @ReactMethod
    public final void getIPAddress(Promise promise) {
        p013kotlin.jvm.internal.s.k(promise, "promise");
        try {
            Object obj = null;
            Object obj2 = null;
            Object obj3 = null;
            for (InterfaceAddress interfaceAddress : getInetAddresses()) {
                if (!interfaceAddress.getAddress().isLoopbackAddress()) {
                    String string = interfaceAddress.getAddress().getHostAddress().toString();
                    if (!inDSLITERange(string)) {
                        if (p013kotlin.text.t.h0(string, "wlan", false, 2, null)) {
                            obj2 = string;
                        }
                        if (interfaceAddress.getAddress() instanceof Inet4Address) {
                            obj = string;
                            obj3 = obj;
                        } else {
                            obj3 = string;
                        }
                    }
                }
            }
            if (obj == null) {
                obj = obj2 == null ? obj3 : obj2;
            }
            promise.resolve(obj);
        } catch (Exception e11) {
            com.tesla.logging.g gVar = this.logger;
            String localizedMessage = e11.getLocalizedMessage();
            p013kotlin.jvm.internal.s.j(localizedMessage, "getLocalizedMessage(...)");
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar.getTag();
            String strG = gVar.g(localizedMessage);
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = v0.f(jn0.x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
            promise.resolve(null);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return TAG;
    }

    @ReactMethod
    public final void ignoreIsConnectedCheckOnHarmonyOs(Promise promise) {
        p013kotlin.jvm.internal.s.k(promise, "promise");
        promise.resolve(Boolean.valueOf(ie0.y.f77624a.c()));
    }

    @ReactMethod
    public final void resolveMDNSName(String mdnsName, int totalTimeoutMs, Promise promise) throws SocketException, UnknownHostException {
        p013kotlin.jvm.internal.s.k(mdnsName, "mdnsName");
        p013kotlin.jvm.internal.s.k(promise, "promise");
        InetAddress byName = InetAddress.getByName("224.0.0.251");
        DatagramSocket datagramSocket = new DatagramSocket();
        datagramSocket.setSoTimeout(2000);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.putShort((short) 256);
        byteBufferAllocate.putShort((short) 1);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.putShort((short) 0);
        byte[] bArrArray = byteBufferAllocate.array();
        p013kotlin.jvm.internal.s.j(mdnsName.getBytes(p013kotlin.text.d.UTF_8), "getBytes(...)");
        List listE1 = p013kotlin.text.t.e1(mdnsName, new char[]{CoreConstants.DOT}, false, 0, 6, null);
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(512);
        Iterator it = listE1.iterator();
        while (it.hasNext()) {
            byte[] bytes = ((String) it.next()).getBytes(p013kotlin.text.d.UTF_8);
            p013kotlin.jvm.internal.s.j(bytes, "getBytes(...)");
            byteBufferAllocate2.put((byte) bytes.length);
            byteBufferAllocate2.put(bytes);
        }
        byteBufferAllocate2.put((byte) 0);
        byteBufferAllocate2.putShort((short) 1);
        byteBufferAllocate2.putShort((short) 1);
        byte[] bArr = new byte[byteBufferAllocate2.position()];
        System.arraycopy(byteBufferAllocate2.array(), 0, bArr, 0, byteBufferAllocate2.position());
        p013kotlin.jvm.internal.s.h(bArrArray);
        byte[] bArrG = p013kotlin.collections.n.G(bArrArray, bArr);
        DatagramPacket datagramPacket = new DatagramPacket(bArrG, bArrG.length, byName, 5353);
        long jCurrentTimeMillis = System.currentTimeMillis();
        do {
            try {
                this.logger.j("Sending mDNS Query for " + mdnsName + "...");
                datagramSocket.send(datagramPacket);
                this.logger.j("mDNS Query sent for " + mdnsName + ". Waiting for response...");
                DatagramPacket datagramPacket2 = new DatagramPacket(new byte[1024], 1024);
                datagramSocket.receive(datagramPacket2);
                this.logger.j("Response from: " + datagramPacket2.getAddress());
                promise.resolve(datagramPacket2.getAddress().getHostAddress());
                return;
            } catch (SocketException e11) {
                this.logger.j("Socket Exception: " + e11.getMessage());
                promise.reject("E_RESOLVE_MDNS_NAME", e11.getMessage());
                return;
            } catch (SocketTimeoutException unused) {
            } catch (Exception e12) {
                this.logger.j("Exception: " + e12.getMessage());
                promise.reject("E_RESOLVE_MDNS_NAME", e12.getMessage());
                return;
            }
        } while (System.currentTimeMillis() - jCurrentTimeMillis <= totalTimeoutMs);
        this.logger.j("Timed Out");
        promise.reject("E_RESOLVE_MDNS_NAME", "Timed Out");
    }
}
