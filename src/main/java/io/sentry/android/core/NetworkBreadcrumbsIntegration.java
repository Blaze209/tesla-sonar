package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.annotation.NonNull;
import io.sentry.ILogger;
import io.sentry.b7;
import io.sentry.o5;
import io.sentry.q7;
import java.io.Closeable;

/* JADX INFO: loaded from: classes9.dex */
public final class NetworkBreadcrumbsIntegration implements io.sentry.o1, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f79290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z0 f79291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.sentry.util.a f79292c = new io.sentry.util.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private q7 f79293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    volatile b f79294e;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f79295a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f79296b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f79297c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f79298d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f79299e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final String f79300f;

        @SuppressLint({"NewApi"})
        a(NetworkCapabilities networkCapabilities, z0 z0Var, long j11) {
            io.sentry.util.y.c(networkCapabilities, "NetworkCapabilities is required");
            io.sentry.util.y.c(z0Var, "BuildInfoProvider is required");
            this.f79295a = networkCapabilities.getLinkDownstreamBandwidthKbps();
            this.f79296b = networkCapabilities.getLinkUpstreamBandwidthKbps();
            int signalStrength = z0Var.d() >= 29 ? networkCapabilities.getSignalStrength() : 0;
            this.f79297c = signalStrength > -100 ? signalStrength : 0;
            this.f79299e = networkCapabilities.hasTransport(4);
            String strK0 = io.sentry.android.core.internal.util.e.K0(networkCapabilities);
            this.f79300f = strK0 == null ? "" : strK0;
            this.f79298d = j11;
        }

        boolean a(a aVar) {
            int iAbs = Math.abs(this.f79297c - aVar.f79297c);
            int iAbs2 = Math.abs(this.f79295a - aVar.f79295a);
            int iAbs3 = Math.abs(this.f79296b - aVar.f79296b);
            boolean z11 = io.sentry.l.l((double) Math.abs(this.f79298d - aVar.f79298d)) < 5000.0d;
            return this.f79299e == aVar.f79299e && this.f79300f.equals(aVar.f79300f) && (z11 || iAbs <= 5) && (z11 || (((double) iAbs2) > Math.max(1000.0d, ((double) Math.abs(this.f79295a)) * 0.1d) ? 1 : (((double) iAbs2) == Math.max(1000.0d, ((double) Math.abs(this.f79295a)) * 0.1d) ? 0 : -1)) <= 0) && (z11 || (((double) iAbs3) > Math.max(1000.0d, ((double) Math.abs(this.f79296b)) * 0.1d) ? 1 : (((double) iAbs3) == Math.max(1000.0d, ((double) Math.abs(this.f79296b)) * 0.1d) ? 0 : -1)) <= 0);
        }
    }

    static final class b extends ConnectivityManager.NetworkCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.sentry.z0 f79301a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final z0 f79302b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        NetworkCapabilities f79303c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f79304d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final o5 f79305e;

        b(io.sentry.z0 z0Var, z0 z0Var2, o5 o5Var) {
            this.f79301a = (io.sentry.z0) io.sentry.util.y.c(z0Var, "Scopes are required");
            this.f79302b = (z0) io.sentry.util.y.c(z0Var2, "BuildInfoProvider is required");
            this.f79305e = (o5) io.sentry.util.y.c(o5Var, "SentryDateProvider is required");
        }

        private io.sentry.e a(String str) {
            io.sentry.e eVar = new io.sentry.e();
            eVar.z("system");
            eVar.u("network.event");
            eVar.v("action", str);
            eVar.w(b7.INFO);
            return eVar;
        }

        private a b(NetworkCapabilities networkCapabilities, NetworkCapabilities networkCapabilities2, long j11, long j12) {
            if (networkCapabilities == null) {
                return new a(networkCapabilities2, this.f79302b, j12);
            }
            a aVar = new a(networkCapabilities, this.f79302b, j11);
            a aVar2 = new a(networkCapabilities2, this.f79302b, j12);
            if (aVar.a(aVar2)) {
                return null;
            }
            return aVar2;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(@NonNull Network network) {
            this.f79301a.c(a("NETWORK_AVAILABLE"));
            this.f79303c = null;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(@NonNull Network network, @NonNull NetworkCapabilities networkCapabilities) {
            long jF = this.f79305e.now().f();
            a aVarB = b(this.f79303c, networkCapabilities, this.f79304d, jF);
            if (aVarB == null) {
                return;
            }
            this.f79303c = networkCapabilities;
            this.f79304d = jF;
            io.sentry.e eVarA = a("NETWORK_CAPABILITIES_CHANGED");
            eVarA.v("download_bandwidth", Integer.valueOf(aVarB.f79295a));
            eVarA.v("upload_bandwidth", Integer.valueOf(aVarB.f79296b));
            eVarA.v("vpn_active", Boolean.valueOf(aVarB.f79299e));
            eVarA.v("network_type", aVarB.f79300f);
            int i11 = aVarB.f79297c;
            if (i11 != 0) {
                eVarA.v("signal_strength", Integer.valueOf(i11));
            }
            io.sentry.h0 h0Var = new io.sentry.h0();
            h0Var.k("android:networkCapabilities", aVarB);
            this.f79301a.d(eVarA, h0Var);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(@NonNull Network network) {
            this.f79301a.c(a("NETWORK_LOST"));
            this.f79303c = null;
        }
    }

    public NetworkBreadcrumbsIntegration(Context context, z0 z0Var) {
        this.f79290a = (Context) io.sentry.util.y.c(g1.g(context), "Context is required");
        this.f79291b = (z0) io.sentry.util.y.c(z0Var, "BuildInfoProvider is required");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        io.sentry.d1 d1VarA = this.f79292c.a();
        try {
            b bVar = this.f79294e;
            this.f79294e = null;
            if (d1VarA != null) {
                d1VarA.close();
            }
            if (bVar != null) {
                io.sentry.android.core.internal.util.e.c1(bVar);
            }
        } catch (Throwable th2) {
            if (d1VarA != null) {
                try {
                    d1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.sentry.o1
    public void n(io.sentry.z0 z0Var, q7 q7Var) {
        io.sentry.util.y.c(z0Var, "Scopes are required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.y.c(q7Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) q7Var : null, "SentryAndroidOptions is required");
        this.f79293d = q7Var;
        ILogger logger = q7Var.getLogger();
        b7 b7Var = b7.DEBUG;
        logger.c(b7Var, "NetworkBreadcrumbsIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()));
        if (sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()) {
            if (this.f79291b.d() < 24) {
                q7Var.getLogger().c(b7Var, "NetworkCallbacks need Android N+.", new Object[0]);
                return;
            }
            io.sentry.d1 d1VarA = this.f79292c.a();
            try {
                this.f79294e = new b(z0Var, this.f79291b, q7Var.getDateProvider());
                if (io.sentry.android.core.internal.util.e.z0(this.f79290a, q7Var.getLogger(), this.f79291b, this.f79294e)) {
                    q7Var.getLogger().c(b7Var, "NetworkBreadcrumbsIntegration installed.", new Object[0]);
                    io.sentry.util.p.a("NetworkBreadcrumbs");
                } else {
                    q7Var.getLogger().c(b7Var, "NetworkBreadcrumbsIntegration not installed.", new Object[0]);
                }
                if (d1VarA != null) {
                    d1VarA.close();
                }
            } catch (Throwable th2) {
                if (d1VarA != null) {
                    try {
                        d1VarA.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }
}
