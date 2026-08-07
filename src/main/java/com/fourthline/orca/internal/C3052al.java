package com.fourthline.orca.internal;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.ProxyInfo;
import com.fourthline.core.internal.devicedata.AndroidDataCollectorHelper;
import com.fourthline.core.internal.devicedata.DeviceDataCollector;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.Map;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.al, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3052al implements DeviceDataCollector {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f30438d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f30439e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AndroidDataCollectorHelper f30440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f30441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f30442c;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.al$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3052al(AndroidDataCollectorHelper helper, Map destination, boolean z11) {
        p013kotlin.jvm.internal.s.k(helper, "helper");
        p013kotlin.jvm.internal.s.k(destination, "destination");
        this.f30440a = helper;
        this.f30441b = destination;
        this.f30442c = z11;
    }

    private final String a(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities.hasTransport(2)) {
            return "bluetooth";
        }
        if (networkCapabilities.hasTransport(0)) {
            return "cellular";
        }
        if (networkCapabilities.hasTransport(3)) {
            return "ethernet";
        }
        if (networkCapabilities.hasTransport(1)) {
            return "wifi";
        }
        if (networkCapabilities.hasTransport(8)) {
            return "usb";
        }
        if (networkCapabilities.hasTransport(6)) {
            return "lowpan";
        }
        if (networkCapabilities.hasTransport(9)) {
            return "thread";
        }
        return networkCapabilities.hasTransport(5) ? "wifi_aware" : "none";
    }

    @Override // com.fourthline.core.internal.devicedata.DeviceDataCollector
    public void startDataCollection() {
        AndroidDataCollectorHelper androidDataCollectorHelper;
        ConnectivityManager connectivityManager;
        NetworkCapabilities networkCapabilities;
        if (!this.f30442c || (connectivityManager = (androidDataCollectorHelper = this.f30440a).getConnectivityManager()) == null || !androidDataCollectorHelper.isPermissionAvailable("android.permission.ACCESS_NETWORK_STATE") || (networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())) == null) {
            return;
        }
        this.f30441b.put("networkConnectionType", a(networkCapabilities));
        this.f30441b.put("networkIsConnectedToWifi", Boolean.valueOf(networkCapabilities.hasTransport(1)));
        this.f30441b.put("networkIsUsingVpn", Boolean.valueOf(networkCapabilities.hasTransport(4)));
        this.f30441b.put("networkIsUsingDataSaver", Boolean.valueOf(connectivityManager.getRestrictBackgroundStatus() == 3));
        String strA = a();
        if (strA != null) {
            this.f30441b.put("networkIpAddressLocal", strA);
        }
        ProxyInfo defaultProxy = connectivityManager.getDefaultProxy();
        if (defaultProxy != null) {
            this.f30441b.put("networkHttpProxyName", defaultProxy.getHost());
            this.f30441b.put("networkHttpProxyPort", Integer.valueOf(defaultProxy.getPort()));
        }
        this.f30441b.put("networkUplink", Integer.valueOf(networkCapabilities.getLinkUpstreamBandwidthKbps()));
        this.f30441b.put("networkDownlink", Integer.valueOf(networkCapabilities.getLinkDownstreamBandwidthKbps()));
    }

    private final String a() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddressNextElement = inetAddresses.nextElement();
                    if (!inetAddressNextElement.isLoopbackAddress()) {
                        inetAddressNextElement.getHostAddress();
                    }
                }
            }
            return null;
        } catch (Exception e11) {
            e11.getMessage();
            return null;
        }
    }
}
