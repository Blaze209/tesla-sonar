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
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
class z0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f44380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PowerManager.WakeLock f44381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FirebaseMessaging f44382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SuppressLint({"ThreadPoolCreation"})
    ExecutorService f44383d = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));

    static class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private z0 f44384a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Context f44385b;

        public a(z0 z0Var) {
            this.f44384a = z0Var;
        }

        public void a() {
            if (z0.c()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
            z0 z0Var = this.f44384a;
            if (z0Var != null) {
                Context contextB = z0Var.b();
                this.f44385b = contextB;
                contextB.registerReceiver(this, intentFilter);
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            z0 z0Var = this.f44384a;
            if (z0Var != null && z0Var.d()) {
                if (z0.c()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.f44384a.f44382c.o(this.f44384a, 0L);
                Context context2 = this.f44385b;
                if (context2 != null) {
                    context2.unregisterReceiver(this);
                }
                this.f44384a = null;
            }
        }
    }

    @SuppressLint({"InvalidWakeLockTag"})
    public z0(FirebaseMessaging firebaseMessaging, long j11) {
        this.f44382c = firebaseMessaging;
        this.f44380a = j11;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f44381b = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    static boolean c() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    Context b() {
        return this.f44382c.p();
    }

    boolean d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) b().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    boolean e() throws IOException {
        try {
            if (this.f44382c.m() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e11) {
            if (!f0.i(e11.getMessage())) {
                if (e11.getMessage() != null) {
                    throw e11;
                }
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e11.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    @SuppressLint({"WakelockTimeout"})
    public void run() {
        if (v0.b().e(b())) {
            this.f44381b.acquire();
        }
        try {
            this.f44382c.B(true);
            if (!this.f44382c.A()) {
                this.f44382c.B(false);
            } else if (!v0.b().d(b()) || d()) {
                if (e()) {
                    this.f44382c.B(false);
                } else {
                    this.f44382c.F(this.f44380a);
                }
            } else {
                new a(this).a();
            }
        } catch (IOException e11) {
            Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e11.getMessage() + ". Won't retry the operation.");
            this.f44382c.B(false);
        } finally {
            if (v0.b().e(b())) {
                this.f44381b.release();
            }
        }
    }
}
