package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
class e1 implements Runnable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f44270f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Boolean f44271g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static Boolean f44272h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f44273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k0 f44274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PowerManager.WakeLock f44275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d1 f44276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f44277e;

    class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private e1 f44278a;

        public a(e1 e1Var) {
            this.f44278a = e1Var;
        }

        public void a() {
            if (e1.j()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            e1.this.f44273a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            try {
                e1 e1Var = this.f44278a;
                if (e1Var == null) {
                    return;
                }
                if (e1Var.i()) {
                    if (e1.j()) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    this.f44278a.f44276d.k(this.f44278a, 0L);
                    context.unregisterReceiver(this);
                    this.f44278a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    e1(d1 d1Var, Context context, k0 k0Var, long j11) {
        this.f44276d = d1Var;
        this.f44273a = context;
        this.f44277e = j11;
        this.f44274b = k0Var;
        this.f44275c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    private static String e(String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    private static boolean f(Context context) {
        boolean zBooleanValue;
        synchronized (f44270f) {
            try {
                Boolean bool = f44272h;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                f44272h = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zBooleanValue;
    }

    private static boolean g(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z11 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z11 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", e(str));
        }
        return z11;
    }

    private static boolean h(Context context) {
        boolean zBooleanValue;
        synchronized (f44270f) {
            try {
                Boolean bool = f44271g;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                f44271g = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zBooleanValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean i() {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f44273a.getSystemService("connectivity");
            activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        } catch (Throwable th2) {
            throw th2;
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean j() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    @Override // java.lang.Runnable
    @SuppressLint({"Wakelock"})
    public void run() {
        if (h(this.f44273a)) {
            this.f44275c.acquire(e.f44268a);
        }
        try {
            try {
                try {
                    this.f44276d.l(true);
                    if (!this.f44274b.g()) {
                        this.f44276d.l(false);
                        if (h(this.f44273a)) {
                            try {
                                this.f44275c.release();
                                return;
                            } catch (RuntimeException unused) {
                                Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                                return;
                            }
                        }
                        return;
                    }
                    if (!f(this.f44273a) || i()) {
                        if (this.f44276d.o()) {
                            this.f44276d.l(false);
                        } else {
                            this.f44276d.p(this.f44277e);
                        }
                        if (h(this.f44273a)) {
                            this.f44275c.release();
                            return;
                        }
                        return;
                    }
                    new a(this).a();
                    if (h(this.f44273a)) {
                        try {
                            this.f44275c.release();
                        } catch (RuntimeException unused2) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                } catch (Throwable th2) {
                    if (h(this.f44273a)) {
                        try {
                            this.f44275c.release();
                        } catch (RuntimeException unused3) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                    throw th2;
                }
            } catch (IOException e11) {
                Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e11.getMessage());
                this.f44276d.l(false);
                if (h(this.f44273a)) {
                    this.f44275c.release();
                }
            }
        } catch (RuntimeException unused4) {
            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
        }
    }
}
