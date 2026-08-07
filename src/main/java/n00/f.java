package n00;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.facebook.react.bridge.ReactApplicationContext;
import com.plaid.internal.EnumC4419g;

/* JADX INFO: loaded from: classes6.dex */
@TargetApi(24)
public class f extends b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final a f92641j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Network f92642k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private NetworkCapabilities f92643l;

    private class a extends ConnectivityManager.NetworkCallback {
        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            f.this.f92642k = network;
            f.this.q(EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            f.this.f92642k = network;
            f.this.f92643l = networkCapabilities;
            f.this.s();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            if (f.this.f92642k != null) {
                f.this.f92642k = network;
            }
            f.this.q(EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLosing(Network network, int i11) {
            f.this.f92642k = network;
            f.this.s();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            f.this.f92642k = null;
            f.this.f92643l = null;
            f.this.s();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
            f.this.f92642k = null;
            f.this.f92643l = null;
            f.this.s();
        }

        private a() {
        }
    }

    public f(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.f92642k = null;
        this.f92643l = null;
        this.f92641j = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(int i11) {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: n00.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f92640a.r();
            }
        }, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r() {
        try {
            this.f92643l = c().getNetworkCapabilities(this.f92642k);
            s();
        } catch (SecurityException unused) {
        }
    }

    @Override // n00.b
    @SuppressLint({"MissingPermission"})
    public void g() {
        try {
            this.f92642k = c().getActiveNetwork();
            q(0);
            c();
            ta0.a.e(this.f92641j);
        } catch (SecurityException unused) {
        }
    }

    @Override // n00.b
    public void j() {
        try {
            c();
            ta0.a.f(this.f92641j);
        } catch (IllegalArgumentException | SecurityException unused) {
        }
    }

    @SuppressLint({"MissingPermission"})
    void s() {
        NetworkInfo networkInfo;
        boolean z11;
        o00.b bVar = o00.b.UNKNOWN;
        Network network = this.f92642k;
        NetworkCapabilities networkCapabilities = this.f92643l;
        o00.a aVarFromNetworkInfo = null;
        boolean z12 = false;
        if (networkCapabilities != null) {
            if (networkCapabilities.hasTransport(2)) {
                bVar = o00.b.BLUETOOTH;
            } else if (networkCapabilities.hasTransport(0)) {
                bVar = o00.b.CELLULAR;
            } else if (networkCapabilities.hasTransport(3)) {
                bVar = o00.b.ETHERNET;
            } else if (networkCapabilities.hasTransport(1)) {
                bVar = o00.b.WIFI;
            } else if (networkCapabilities.hasTransport(4)) {
                bVar = o00.b.VPN;
            }
            if (network != null) {
                try {
                    networkInfo = c().getNetworkInfo(network);
                } catch (SecurityException unused) {
                    networkInfo = null;
                }
            } else {
                networkInfo = null;
            }
            if (Build.VERSION.SDK_INT >= 28) {
                z11 = !networkCapabilities.hasCapability(21);
            } else {
                z11 = (network == null || networkInfo == null || networkInfo.getDetailedState().equals(NetworkInfo.DetailedState.CONNECTED)) ? false : true;
            }
            boolean z13 = networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16) && !z11;
            if (!networkCapabilities.hasTransport(4)) {
                z12 = z13;
            } else if (z13 && networkCapabilities.getLinkDownstreamBandwidthKbps() != 0) {
                z12 = true;
            }
            if (network != null && bVar == o00.b.CELLULAR && z12) {
                aVarFromNetworkInfo = o00.a.fromNetworkInfo(networkInfo);
            }
        } else {
            bVar = o00.b.NONE;
        }
        k(bVar, aVarFromNetworkInfo, z12);
    }
}
