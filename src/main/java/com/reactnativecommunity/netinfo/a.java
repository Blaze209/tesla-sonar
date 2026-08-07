package com.reactnativecommunity.netinfo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import n00.d;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f48486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f48487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC0765a f48488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Runnable f48489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Handler f48490e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f48491f = false;

    /* JADX INFO: renamed from: com.reactnativecommunity.netinfo.a$a, reason: collision with other inner class name */
    public interface InterfaceC0765a {
        void onAmazonFireDeviceConnectivityChanged(boolean z11);
    }

    private class b implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f48491f) {
                a.this.f48487b.sendBroadcast(new Intent("com.amazon.tv.networkmonitor.CONNECTIVITY_CHECK"));
                a.this.f48490e.postDelayed(a.this.f48489d, 10000L);
            }
        }

        private b() {
        }
    }

    private class c extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f48493a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Boolean f48494b;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            boolean z11;
            String action = intent == null ? null : intent.getAction();
            if ("com.amazon.tv.networkmonitor.INTERNET_DOWN".equals(action)) {
                z11 = false;
            } else if (!"com.amazon.tv.networkmonitor.INTERNET_UP".equals(action)) {
                return;
            } else {
                z11 = true;
            }
            Boolean bool = this.f48494b;
            if (bool == null || bool.booleanValue() != z11) {
                this.f48494b = Boolean.valueOf(z11);
                a.this.f48488c.onAmazonFireDeviceConnectivityChanged(z11);
            }
        }

        private c() {
            this.f48493a = false;
        }
    }

    a(Context context, InterfaceC0765a interfaceC0765a) {
        this.f48486a = new c();
        this.f48489d = new b();
        this.f48487b = context;
        this.f48488c = interfaceC0765a;
    }

    private boolean f() {
        if (!Build.MANUFACTURER.equals("Amazon")) {
            return false;
        }
        String str = Build.MODEL;
        return str.startsWith("AF") || str.startsWith("KF");
    }

    private void h() {
        if (this.f48486a.f48493a) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.amazon.tv.networkmonitor.INTERNET_DOWN");
        intentFilter.addAction("com.amazon.tv.networkmonitor.INTERNET_UP");
        d.a(this.f48487b, this.f48486a, intentFilter, false);
        this.f48486a.f48493a = true;
    }

    private void i() {
        if (this.f48491f) {
            return;
        }
        Handler handler = new Handler();
        this.f48490e = handler;
        this.f48491f = true;
        handler.post(this.f48489d);
    }

    private void j() {
        if (this.f48491f) {
            this.f48491f = false;
            this.f48490e.removeCallbacksAndMessages(null);
            this.f48490e = null;
        }
    }

    private void l() {
        c cVar = this.f48486a;
        if (cVar.f48493a) {
            this.f48487b.unregisterReceiver(cVar);
            this.f48486a.f48493a = false;
        }
    }

    public void g() {
        if (f()) {
            h();
            i();
        }
    }

    public void k() {
        if (f()) {
            j();
            l();
        }
    }
}
