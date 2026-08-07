package com.plaid.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.provider.Settings;
import androidx.annotation.NonNull;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.plaid.internal.l4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4469l4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f47835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4572x0 f47836b;

    /* JADX INFO: renamed from: com.plaid.internal.l4$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f47837a;

        static {
            int[] iArr = new int[EnumC4451j4.values().length];
            f47837a = iArr;
            try {
                iArr[EnumC4451j4.WIFI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47837a[EnumC4451j4.WIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: com.plaid.internal.l4$b */
    public static class b extends ConnectivityManager.NetworkCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C4572x0 f47838a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CountDownLatch f47839b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile C4424g4 f47840c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile RunnableC4460k4 f47841d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ConnectivityManager f47842e;

        public b(ConnectivityManager connectivityManager) {
            W3 w11 = Z3.f46846a;
            this.f47838a = new C4572x0("network-callback");
            this.f47839b = new CountDownLatch(1);
            this.f47842e = connectivityManager;
        }

        public final void a(@NonNull Network network, @NonNull NetworkCapabilities networkCapabilities) {
            if (this.f47841d == null) {
                this.f47838a.a(W3.ERROR, "network callback already unregistered", new Object[0]);
                return;
            }
            try {
                C4415f4 c4415f4 = new C4415f4(networkCapabilities);
                EnumC4589z enumC4589z = c4415f4.f47658c == EnumC4589z.YES ? c4415f4.f47659d : EnumC4589z.NO;
                if (this.f47840c != null && this.f47840c.f47680a.equals(network)) {
                    this.f47838a.a(W3.INFO, "update validated network %s %s", network, c4415f4);
                    this.f47840c.f47682c = enumC4589z;
                } else {
                    if (this.f47840c != null || enumC4589z == EnumC4589z.NO) {
                        this.f47838a.a(W3.INFO, "update network %s %s", network, c4415f4);
                        return;
                    }
                    this.f47838a.a(W3.INFO, "found validated network %s %s", network, c4415f4);
                    this.f47840c = new C4424g4(network, this.f47841d);
                    this.f47840c.f47682c = enumC4589z;
                    this.f47839b.countDown();
                }
            } catch (RuntimeException e11) {
                this.f47838a.a(e11, "fatal network callback error");
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(@NonNull Network network) {
            NetworkCapabilities networkCapabilities = this.f47842e.getNetworkCapabilities(network);
            if (networkCapabilities != null) {
                this.f47838a.a(W3.INFO, "available network %s", network);
                a(network, networkCapabilities);
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onCapabilitiesChanged(@NonNull Network network, @NonNull NetworkCapabilities networkCapabilities) {
            a(network, networkCapabilities);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(@NonNull Network network) {
            if (this.f47840c == null || !this.f47840c.f47680a.equals(network)) {
                return;
            }
            this.f47838a.a(W3.INFO, "lost network %s", network);
            C4424g4 c4424g4 = this.f47840c;
            if (c4424g4.f47683d) {
                return;
            }
            c4424g4.f47683d = true;
            c4424g4.f47681b.run();
        }
    }

    public C4469l4(Context context) {
        W3 w11 = Z3.f46846a;
        this.f47836b = new C4572x0("network-utils");
        this.f47835a = context;
    }

    public final boolean a() {
        W3 w11 = W3.DEBUG;
        this.f47836b.a(w11, "isAirplaneMode: Checking if device is in airplane mode.", new Object[0]);
        boolean z11 = Settings.Global.getInt(this.f47835a.getContentResolver(), "airplane_mode_on", 0) != 0;
        C4572x0 c4572x0 = this.f47836b;
        StringBuilder sb2 = new StringBuilder("isAirplaneMode: Airplane mode ");
        sb2.append(z11 ? "IS" : "IS NOT");
        sb2.append(" active.");
        c4572x0.a(w11, sb2.toString(), new Object[0]);
        return z11;
    }

    public final C4424g4 a(EnumC4451j4 enumC4451j4) {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f47835a.getSystemService("connectivity");
        int i11 = 0;
        if (connectivityManager != null) {
            NetworkRequest.Builder builderAddCapability = new NetworkRequest.Builder().addCapability(12);
            int i12 = a.f47837a[enumC4451j4.ordinal()];
            if (i12 == 1) {
                i11 = 1;
            } else if (i12 == 2) {
                i11 = 3;
            }
            NetworkRequest networkRequestBuild = builderAddCapability.addTransportType(i11).build();
            b bVar = new b(connectivityManager);
            this.f47836b.a(W3.DEBUG, "Network %s requested, waiting (%d)ms for result (%s)", enumC4451j4, 10000, Thread.currentThread());
            bVar.f47841d = new RunnableC4460k4(connectivityManager, bVar);
            connectivityManager.requestNetwork(networkRequestBuild, bVar);
            try {
                bVar.f47839b.await(10000, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            if (bVar.f47840c == null) {
                RunnableC4460k4 runnableC4460k4 = bVar.f47841d;
                ConnectivityManager connectivityManager2 = runnableC4460k4.f47798a;
                ta0.a.f(runnableC4460k4.f47799b);
            }
            return bVar.f47840c;
        }
        this.f47836b.a(W3.ERROR, "ConnectivityManager is null!", new Object[0]);
        throw new IllegalStateException("ConnectivityManager not available!");
    }
}
