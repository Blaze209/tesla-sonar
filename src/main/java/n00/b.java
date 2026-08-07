package n00;

import android.net.ConnectivityManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.math.BigInteger;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConnectivityManager f92631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WifiManager f92632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TelephonyManager f92633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ReactApplicationContext f92634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f92635e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private o00.b f92636f = o00.b.UNKNOWN;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private o00.a f92637g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f92638h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Boolean f92639i;

    b(ReactApplicationContext reactApplicationContext) {
        this.f92634d = reactApplicationContext;
        this.f92631a = (ConnectivityManager) reactApplicationContext.getSystemService("connectivity");
        this.f92632b = (WifiManager) reactApplicationContext.getApplicationContext().getSystemService("wifi");
        this.f92633c = (TelephonyManager) reactApplicationContext.getSystemService("phone");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private WritableMap b(String str) {
        WifiManager wifiManager;
        WifiInfo connectionInfo;
        WritableMap writableMapCreateMap = Arguments.createMap();
        str.getClass();
        switch (str) {
            case "ethernet":
                try {
                    Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                    while (networkInterfaces.hasMoreElements()) {
                        Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                        while (inetAddresses.hasMoreElements()) {
                            InetAddress inetAddressNextElement = inetAddresses.nextElement();
                            if (!inetAddressNextElement.isLoopbackAddress() && (inetAddressNextElement instanceof Inet4Address)) {
                                writableMapCreateMap.putString("ipAddress", inetAddressNextElement.getHostAddress());
                                writableMapCreateMap.putString("subnet", f(inetAddressNextElement));
                                return writableMapCreateMap;
                            }
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                return writableMapCreateMap;
            case "cellular":
                o00.a aVar = this.f92637g;
                if (aVar != null) {
                    writableMapCreateMap.putString("cellularGeneration", aVar.label);
                }
                String networkOperatorName = this.f92633c.getNetworkOperatorName();
                if (networkOperatorName != null) {
                    writableMapCreateMap.putString("carrier", networkOperatorName);
                    return writableMapCreateMap;
                }
                return writableMapCreateMap;
            case "wifi":
                if (d.b(e()) && (wifiManager = this.f92632b) != null && (connectionInfo = wifiManager.getConnectionInfo()) != null) {
                    try {
                        String ssid = connectionInfo.getSSID();
                        if (ssid != null && !ssid.contains("<unknown ssid>")) {
                            writableMapCreateMap.putString("ssid", ssid.replace("\"", ""));
                        }
                        break;
                    } catch (Exception unused) {
                    }
                    try {
                        String bssid = connectionInfo.getBSSID();
                        if (bssid != null) {
                            writableMapCreateMap.putString("bssid", bssid);
                        }
                        break;
                    } catch (Exception unused2) {
                    }
                    try {
                        writableMapCreateMap.putInt("strength", WifiManager.calculateSignalLevel(connectionInfo.getRssi(), 100));
                        break;
                    } catch (Exception unused3) {
                    }
                    try {
                        writableMapCreateMap.putInt("frequency", connectionInfo.getFrequency());
                        break;
                    } catch (Exception unused4) {
                    }
                    try {
                        byte[] byteArray = BigInteger.valueOf(connectionInfo.getIpAddress()).toByteArray();
                        d.c(byteArray);
                        writableMapCreateMap.putString("ipAddress", InetAddress.getByAddress(byteArray).getHostAddress());
                        break;
                    } catch (Exception unused5) {
                    }
                    try {
                        byte[] byteArray2 = BigInteger.valueOf(connectionInfo.getIpAddress()).toByteArray();
                        d.c(byteArray2);
                        writableMapCreateMap.putString("subnet", f(InetAddress.getByAddress(byteArray2)));
                        break;
                    } catch (Exception unused6) {
                    }
                    try {
                        writableMapCreateMap.putInt("linkSpeed", connectionInfo.getLinkSpeed());
                        break;
                    } catch (Exception unused7) {
                    }
                    try {
                        if (Build.VERSION.SDK_INT >= 29) {
                            writableMapCreateMap.putInt("rxLinkSpeed", connectionInfo.getRxLinkSpeedMbps());
                        }
                        break;
                    } catch (Exception unused8) {
                    }
                    try {
                        if (Build.VERSION.SDK_INT >= 29) {
                            writableMapCreateMap.putInt("txLinkSpeed", connectionInfo.getTxLinkSpeedMbps());
                        }
                        break;
                    } catch (Exception unused9) {
                    }
                }
                return writableMapCreateMap;
            default:
                return writableMapCreateMap;
        }
    }

    private static String f(InetAddress inetAddress) {
        short networkPrefixLength;
        for (InterfaceAddress interfaceAddress : NetworkInterface.getByInetAddress(inetAddress).getInterfaceAddresses()) {
            if (interfaceAddress.getAddress().getAddress().length == 4) {
                networkPrefixLength = interfaceAddress.getNetworkPrefixLength();
                int i11 = (-1) << (32 - networkPrefixLength);
                return String.format(Locale.US, "%d.%d.%d.%d", Integer.valueOf((i11 >> 24) & 255), Integer.valueOf((i11 >> 16) & 255), Integer.valueOf((i11 >> 8) & 255), Integer.valueOf(i11 & 255));
            }
        }
        networkPrefixLength = 0;
        int i12 = (-1) << (32 - networkPrefixLength);
        return String.format(Locale.US, "%d.%d.%d.%d", Integer.valueOf((i12 >> 24) & 255), Integer.valueOf((i12 >> 16) & 255), Integer.valueOf((i12 >> 8) & 255), Integer.valueOf(i12 & 255));
    }

    protected WritableMap a(String str) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        boolean z11 = false;
        if (d.b(e())) {
            WifiManager wifiManager = this.f92632b;
            writableMapCreateMap.putBoolean("isWifiEnabled", wifiManager != null ? wifiManager.isWifiEnabled() : false);
        }
        writableMapCreateMap.putString("type", str != null ? str : this.f92636f.label);
        boolean z12 = (this.f92636f.equals(o00.b.NONE) || this.f92636f.equals(o00.b.UNKNOWN)) ? false : true;
        writableMapCreateMap.putBoolean("isConnected", z12);
        if (this.f92638h && (str == null || str.equals(this.f92636f.label))) {
            z11 = true;
        }
        writableMapCreateMap.putBoolean("isInternetReachable", z11);
        if (str == null) {
            str = this.f92636f.label;
        }
        WritableMap writableMapB = b(str);
        if (z12) {
            writableMapB.putBoolean("isConnectionExpensive", c() != null ? c().isActiveNetworkMetered() : true);
        }
        writableMapCreateMap.putMap("details", writableMapB);
        return writableMapCreateMap;
    }

    ConnectivityManager c() {
        return this.f92631a;
    }

    public void d(String str, Promise promise) {
        promise.resolve(a(str));
    }

    ReactApplicationContext e() {
        return this.f92634d;
    }

    public abstract void g();

    protected void h() {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) e().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("netInfo.networkStatusDidChange", a(null));
    }

    public void i(boolean z11) {
        this.f92639i = Boolean.valueOf(z11);
        k(this.f92636f, this.f92637g, this.f92638h);
    }

    public abstract void j();

    void k(o00.b bVar, o00.a aVar, boolean z11) {
        Boolean bool = this.f92639i;
        if (bool != null) {
            z11 = bool.booleanValue();
        }
        boolean z12 = bVar != this.f92636f;
        boolean z13 = aVar != this.f92637g;
        boolean z14 = z11 != this.f92638h;
        if (z12 || z13 || z14) {
            this.f92636f = bVar;
            this.f92637g = aVar;
            this.f92638h = z11;
            if (this.f92635e) {
                h();
            }
        }
    }
}
