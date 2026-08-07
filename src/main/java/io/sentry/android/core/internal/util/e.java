package io.sentry.android.core.internal.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Handler;
import androidx.annotation.NonNull;
import io.sentry.ILogger;
import io.sentry.android.core.g1;
import io.sentry.android.core.y0;
import io.sentry.android.core.z0;
import io.sentry.b7;
import io.sentry.d1;
import io.sentry.m0;
import io.sentry.q7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements m0, y0.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static volatile ConnectivityManager f79505n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f79510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q7 f79511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z0 f79512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.sentry.transport.p f79513d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<m0.b> f79514e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Handler f79515f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final io.sentry.util.a f79516g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile ConnectivityManager.NetworkCallback f79517h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile NetworkCapabilities f79518i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile Network f79519j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile long f79520k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final AtomicBoolean f79521l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final io.sentry.util.a f79504m = new io.sentry.util.a();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final io.sentry.util.a f79506o = new io.sentry.util.a();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final List<ConnectivityManager.NetworkCallback> f79507p = new ArrayList();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int[] f79508q = {1, 0, 3, 2};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int[] f79509r = new int[2];

    class a extends ConnectivityManager.NetworkCallback {
        a() {
        }

        private void a() {
            e.this.f79521l.set(false);
            d1 d1VarA = e.this.f79516g.a();
            try {
                e.this.f79518i = null;
                e.this.f79519j = null;
                e eVar = e.this;
                eVar.f79520k = eVar.f79513d.a();
                e.this.f79511b.getLogger().c(b7.DEBUG, "Cache cleared - network lost/unavailable", new Object[0]);
                Iterator it = e.this.f79514e.iterator();
                while (it.hasNext()) {
                    ((m0.b) it.next()).B(m0.a.DISCONNECTED);
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

        private boolean b(NetworkCapabilities networkCapabilities, NetworkCapabilities networkCapabilities2) {
            for (int i11 : e.f79509r) {
                if (i11 != 0 && networkCapabilities.hasCapability(i11) != networkCapabilities2.hasCapability(i11)) {
                    return true;
                }
            }
            return false;
        }

        private boolean c(NetworkCapabilities networkCapabilities, NetworkCapabilities networkCapabilities2) {
            for (int i11 : e.f79508q) {
                if (networkCapabilities.hasTransport(i11) != networkCapabilities2.hasTransport(i11)) {
                    return true;
                }
            }
            return false;
        }

        private boolean d(NetworkCapabilities networkCapabilities) {
            NetworkCapabilities networkCapabilities2 = e.this.f79518i;
            if ((networkCapabilities2 == null) != (networkCapabilities == null)) {
                return true;
            }
            if (networkCapabilities2 == null && networkCapabilities == null) {
                return false;
            }
            return b(networkCapabilities2, networkCapabilities) || c(networkCapabilities2, networkCapabilities);
        }

        private void e(Network network, NetworkCapabilities networkCapabilities) {
            if (d(networkCapabilities)) {
                e.this.k1(networkCapabilities);
                m0.a aVarH0 = e.this.H0();
                d1 d1VarA = e.this.f79516g.a();
                try {
                    Iterator it = e.this.f79514e.iterator();
                    while (it.hasNext()) {
                        ((m0.b) it.next()).B(aVarH0);
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

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            e.this.f79519j = network;
            if (e.this.f79521l.getAndSet(true)) {
                return;
            }
            d1 d1VarA = e.f79506o.a();
            try {
                Iterator it = e.f79507p.iterator();
                while (it.hasNext()) {
                    ((ConnectivityManager.NetworkCallback) it.next()).onAvailable(network);
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

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(@NonNull Network network, @NonNull NetworkCapabilities networkCapabilities) {
            if (network.equals(e.this.f79519j)) {
                e(network, networkCapabilities);
                d1 d1VarA = e.f79506o.a();
                try {
                    Iterator it = e.f79507p.iterator();
                    while (it.hasNext()) {
                        ((ConnectivityManager.NetworkCallback) it.next()).onCapabilitiesChanged(network, networkCapabilities);
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

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            if (network.equals(e.this.f79519j)) {
                a();
                d1 d1VarA = e.f79506o.a();
                try {
                    Iterator it = e.f79507p.iterator();
                    while (it.hasNext()) {
                        ((ConnectivityManager.NetworkCallback) it.next()).onLost(network);
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

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
            a();
            d1 d1VarA = e.f79506o.a();
            try {
                Iterator it = e.f79507p.iterator();
                while (it.hasNext()) {
                    ((ConnectivityManager.NetworkCallback) it.next()).onUnavailable();
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

    public e(Context context, q7 q7Var, z0 z0Var, io.sentry.transport.p pVar) {
        this(context, q7Var, z0Var, pVar, null);
    }

    public static /* synthetic */ void B(e eVar) {
        eVar.k1(null);
        m0.a aVarH0 = eVar.H0();
        if (aVarH0 == m0.a.DISCONNECTED) {
            eVar.f79521l.set(false);
            d1 d1VarA = f79506o.a();
            try {
                Iterator<ConnectivityManager.NetworkCallback> it = f79507p.iterator();
                while (it.hasNext()) {
                    it.next().onLost(null);
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
        d1 d1VarA2 = eVar.f79516g.a();
        try {
            Iterator<m0.b> it2 = eVar.f79514e.iterator();
            while (it2.hasNext()) {
                it2.next().B(aVarH0);
            }
            if (d1VarA2 != null) {
                d1VarA2.close();
            }
            eVar.D0();
        } catch (Throwable th4) {
            if (d1VarA2 != null) {
                try {
                    d1VarA2.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
            }
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D0() {
        if (g1.s() && this.f79517h == null) {
            d1 d1VarA = this.f79516g.a();
            try {
                if (this.f79517h != null) {
                    if (d1VarA != null) {
                        d1VarA.close();
                        return;
                    }
                    return;
                }
                a aVar = new a();
                if (Y0(this.f79510a, this.f79511b.getLogger(), this.f79512c, this.f79515f, aVar)) {
                    this.f79517h = aVar;
                    this.f79511b.getLogger().c(b7.DEBUG, "Network callback registered successfully", new Object[0]);
                } else {
                    this.f79511b.getLogger().c(b7.WARNING, "Failed to register network callback", new Object[0]);
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

    private static m0.a G0(Context context, ConnectivityManager connectivityManager, ILogger iLogger) {
        if (!s.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            iLogger.c(b7.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return m0.a.NO_PERMISSION;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnected() ? m0.a.CONNECTED : m0.a.DISCONNECTED;
            }
            iLogger.c(b7.INFO, "NetworkInfo is null, there's no active network.", new Object[0]);
            return m0.a.DISCONNECTED;
        } catch (Throwable th2) {
            iLogger.a(b7.WARNING, "Could not retrieve Connection Status", th2);
            return m0.a.UNKNOWN;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public m0.a H0() {
        if (this.f79518i != null) {
            return U0(this.f79518i) ? m0.a.CONNECTED : m0.a.DISCONNECTED;
        }
        ConnectivityManager connectivityManagerP0 = P0(this.f79510a, this.f79511b.getLogger());
        return connectivityManagerP0 != null ? G0(this.f79510a, connectivityManagerP0, this.f79511b.getLogger()) : m0.a.UNKNOWN;
    }

    @SuppressLint({"ObsoleteSdkInt", "MissingPermission", "NewApi"})
    public static String J0(Context context, ILogger iLogger, z0 z0Var) {
        ConnectivityManager connectivityManagerP0 = P0(context, iLogger);
        if (connectivityManagerP0 == null) {
            return null;
        }
        boolean zHasTransport = false;
        if (!s.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            iLogger.c(b7.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return null;
        }
        try {
            boolean zHasTransport2 = true;
            if (z0Var.d() >= 23) {
                Network activeNetwork = connectivityManagerP0.getActiveNetwork();
                if (activeNetwork == null) {
                    iLogger.c(b7.INFO, "Network is null and cannot check network status", new Object[0]);
                    return null;
                }
                NetworkCapabilities networkCapabilities = connectivityManagerP0.getNetworkCapabilities(activeNetwork);
                if (networkCapabilities == null) {
                    iLogger.c(b7.INFO, "NetworkCapabilities is null and cannot check network type", new Object[0]);
                    return null;
                }
                boolean zHasTransport3 = networkCapabilities.hasTransport(3);
                zHasTransport = networkCapabilities.hasTransport(1);
                zHasTransport2 = networkCapabilities.hasTransport(0);
                zHasTransport = zHasTransport3;
            } else {
                NetworkInfo activeNetworkInfo = connectivityManagerP0.getActiveNetworkInfo();
                if (activeNetworkInfo == null) {
                    iLogger.c(b7.INFO, "NetworkInfo is null, there's no active network.", new Object[0]);
                    return null;
                }
                int type = activeNetworkInfo.getType();
                if (type == 0) {
                    zHasTransport = false;
                } else if (type != 1) {
                    if (type == 9) {
                        zHasTransport = true;
                    }
                    zHasTransport2 = zHasTransport;
                } else {
                    zHasTransport = true;
                    zHasTransport2 = false;
                }
            }
            if (zHasTransport) {
                return "ethernet";
            }
            if (zHasTransport) {
                return "wifi";
            }
            if (zHasTransport2) {
                return "cellular";
            }
            return null;
        } catch (Throwable th2) {
            iLogger.a(b7.ERROR, "Failed to retrieve network info", th2);
        }
    }

    public static String K0(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities.hasTransport(3)) {
            return "ethernet";
        }
        if (networkCapabilities.hasTransport(1)) {
            return "wifi";
        }
        if (networkCapabilities.hasTransport(0)) {
            return "cellular";
        }
        return null;
    }

    private String O0() {
        NetworkCapabilities networkCapabilities = this.f79518i;
        return networkCapabilities != null ? K0(networkCapabilities) : J0(this.f79510a, this.f79511b.getLogger(), this.f79512c);
    }

    private static ConnectivityManager P0(Context context, ILogger iLogger) {
        if (f79505n != null) {
            return f79505n;
        }
        d1 d1VarA = f79504m.a();
        try {
            if (f79505n != null) {
                ConnectivityManager connectivityManager = f79505n;
                if (d1VarA != null) {
                    d1VarA.close();
                }
                return connectivityManager;
            }
            f79505n = (ConnectivityManager) context.getSystemService("connectivity");
            if (f79505n == null) {
                iLogger.c(b7.INFO, "ConnectivityManager is null and cannot check network status", new Object[0]);
            }
            ConnectivityManager connectivityManager2 = f79505n;
            if (d1VarA != null) {
                d1VarA.close();
            }
            return connectivityManager2;
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

    private boolean T0() {
        return this.f79513d.a() - this.f79520k < 120000;
    }

    @SuppressLint({"InlinedApi"})
    private boolean U0(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities == null) {
            return false;
        }
        boolean zHasCapability = networkCapabilities.hasCapability(12);
        if (this.f79512c.d() >= 23) {
            zHasCapability = zHasCapability && networkCapabilities.hasCapability(16);
        }
        if (!zHasCapability) {
            return false;
        }
        for (int i11 : f79508q) {
            if (networkCapabilities.hasTransport(i11)) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"MissingPermission", "NewApi"})
    static boolean Y0(Context context, ILogger iLogger, z0 z0Var, Handler handler, ConnectivityManager.NetworkCallback networkCallback) {
        if (z0Var.d() < 24) {
            iLogger.c(b7.DEBUG, "NetworkCallbacks need Android N+.", new Object[0]);
            return false;
        }
        ConnectivityManager connectivityManagerP0 = P0(context, iLogger);
        if (connectivityManagerP0 == null) {
            return false;
        }
        if (!s.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            iLogger.c(b7.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return false;
        }
        try {
            if (handler != null) {
                connectivityManagerP0.registerDefaultNetworkCallback(networkCallback, handler);
                return true;
            }
            ta0.a.e(networkCallback);
            return true;
        } catch (Throwable th2) {
            iLogger.a(b7.WARNING, "registerDefaultNetworkCallback failed", th2);
            return false;
        }
    }

    public static void c1(ConnectivityManager.NetworkCallback networkCallback) {
        d1 d1VarA = f79506o.a();
        try {
            f79507p.remove(networkCallback);
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

    private void d1(Runnable runnable) {
        try {
            this.f79511b.getExecutorService().submit(runnable);
        } catch (Throwable th2) {
            this.f79511b.getLogger().a(b7.ERROR, "AndroidConnectionStatusProvider submit failed", th2);
        }
    }

    @SuppressLint({"NewApi"})
    static void e1(Context context, ILogger iLogger, ConnectivityManager.NetworkCallback networkCallback) {
        if (P0(context, iLogger) == null) {
            return;
        }
        try {
            ta0.a.f(networkCallback);
        } catch (Throwable th2) {
            iLogger.a(b7.WARNING, "unregisterNetworkCallback failed", th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h1(boolean z11) {
        d1 d1VarA = this.f79516g.a();
        if (z11) {
            try {
                this.f79514e.clear();
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
        ConnectivityManager.NetworkCallback networkCallback = this.f79517h;
        this.f79517h = null;
        if (networkCallback != null) {
            e1(this.f79510a, this.f79511b.getLogger(), networkCallback);
        }
        this.f79518i = null;
        this.f79519j = null;
        this.f79520k = 0L;
        if (d1VarA != null) {
            d1VarA.close();
        }
        this.f79511b.getLogger().c(b7.DEBUG, "Network callback unregistered", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"NewApi", "MissingPermission"})
    public void k1(NetworkCapabilities networkCapabilities) {
        d1 d1VarA = this.f79516g.a();
        try {
            if (networkCapabilities != null) {
                this.f79518i = networkCapabilities;
            } else {
                if (!s.a(this.f79510a, "android.permission.ACCESS_NETWORK_STATE")) {
                    this.f79511b.getLogger().c(b7.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
                    this.f79518i = null;
                    this.f79520k = this.f79513d.a();
                    if (d1VarA != null) {
                        d1VarA.close();
                        return;
                    }
                    return;
                }
                if (this.f79512c.d() < 23) {
                    this.f79518i = null;
                    this.f79520k = this.f79513d.a();
                    if (d1VarA != null) {
                        d1VarA.close();
                        return;
                    }
                    return;
                }
                ConnectivityManager connectivityManagerP0 = P0(this.f79510a, this.f79511b.getLogger());
                if (connectivityManagerP0 != null) {
                    Network activeNetwork = connectivityManagerP0.getActiveNetwork();
                    this.f79518i = activeNetwork != null ? connectivityManagerP0.getNetworkCapabilities(activeNetwork) : null;
                } else {
                    this.f79518i = null;
                }
            }
            this.f79520k = this.f79513d.a();
            this.f79511b.getLogger().c(b7.DEBUG, "Cache updated - Status: " + H0() + ", Type: " + O0(), new Object[0]);
        } catch (Throwable th2) {
            try {
                this.f79511b.getLogger().a(b7.WARNING, "Failed to update connection status cache", th2);
                this.f79518i = null;
                this.f79520k = this.f79513d.a();
            } catch (Throwable th3) {
                if (d1VarA != null) {
                    try {
                        d1VarA.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        }
        if (d1VarA != null) {
            d1VarA.close();
        }
    }

    public static /* synthetic */ void t(e eVar) {
        eVar.h1(true);
        d1 d1VarA = f79506o.a();
        try {
            f79507p.clear();
            if (d1VarA != null) {
                d1VarA.close();
            }
            d1 d1VarA2 = f79504m.a();
            try {
                f79505n = null;
                if (d1VarA2 != null) {
                    d1VarA2.close();
                }
                y0.C().J(eVar);
            } catch (Throwable th2) {
                if (d1VarA2 != null) {
                    try {
                        d1VarA2.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (Throwable th4) {
            if (d1VarA != null) {
                try {
                    d1VarA.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
            }
            throw th4;
        }
    }

    public static boolean z0(Context context, ILogger iLogger, z0 z0Var, ConnectivityManager.NetworkCallback networkCallback) {
        if (z0Var.d() < 24) {
            iLogger.c(b7.DEBUG, "NetworkCallbacks need Android N+.", new Object[0]);
            return false;
        }
        if (!s.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            iLogger.c(b7.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return false;
        }
        d1 d1VarA = f79506o.a();
        try {
            f79507p.add(networkCallback);
            if (d1VarA == null) {
                return true;
            }
            d1VarA.close();
            return true;
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

    @Override // io.sentry.m0
    public String X() {
        if (!T0()) {
            k1(null);
        }
        return O0();
    }

    @Override // io.sentry.android.core.y0.a
    public void c() {
        if (this.f79517h != null) {
            return;
        }
        d1(new Runnable() { // from class: io.sentry.android.core.internal.util.d
            @Override // java.lang.Runnable
            public final void run() {
                e.B(this.f79503a);
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        d1(new Runnable() { // from class: io.sentry.android.core.internal.util.a
            @Override // java.lang.Runnable
            public final void run() {
                e.t(this.f79481a);
            }
        });
    }

    @Override // io.sentry.android.core.y0.a
    public void o() {
        if (this.f79517h == null) {
            return;
        }
        d1(new Runnable() { // from class: io.sentry.android.core.internal.util.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f79487a.h1(false);
            }
        });
    }

    @Override // io.sentry.m0
    public m0.a q0() {
        if (!T0()) {
            k1(null);
        }
        return H0();
    }

    @Override // io.sentry.m0
    public boolean s3(m0.b bVar) {
        d1 d1VarA = this.f79516g.a();
        try {
            this.f79514e.add(bVar);
            if (d1VarA != null) {
                d1VarA.close();
            }
            D0();
            return this.f79517h != null;
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

    @Override // io.sentry.m0
    public void z1(m0.b bVar) {
        d1 d1VarA = this.f79516g.a();
        try {
            this.f79514e.remove(bVar);
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

    @SuppressLint({"InlinedApi"})
    public e(Context context, q7 q7Var, z0 z0Var, io.sentry.transport.p pVar, Handler handler) {
        this.f79516g = new io.sentry.util.a();
        this.f79520k = 0L;
        this.f79521l = new AtomicBoolean(false);
        this.f79510a = g1.g(context);
        this.f79511b = q7Var;
        this.f79512c = z0Var;
        this.f79513d = pVar;
        this.f79515f = handler;
        this.f79514e = new ArrayList();
        int[] iArr = f79509r;
        iArr[0] = 12;
        if (z0Var.d() >= 23) {
            iArr[1] = 16;
        }
        d1(new Runnable() { // from class: io.sentry.android.core.internal.util.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f79484a.D0();
            }
        });
        y0.C().p(this);
    }
}
