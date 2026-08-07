package s7;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static y f110501f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f110502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList<d> f110503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f110504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f110505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f110506e;

    private static final class b {

        private static final class a extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final y f110507a;

            public a(y yVar) {
                this.f110507a = yVar;
            }

            public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
                int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                this.f110507a.m(overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
            }
        }

        public static void a(Context context, y yVar) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) s7.a.f((TelephonyManager) context.getSystemService("phone"));
                a aVar = new a(yVar);
                telephonyManager.registerTelephonyCallback(yVar.f110502a, aVar);
                telephonyManager.unregisterTelephonyCallback(aVar);
            } catch (RuntimeException unused) {
                yVar.m(5);
            }
        }
    }

    public interface c {
        void a(int i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<c> f110508a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Executor f110509b;

        public d(c cVar, Executor executor) {
            this.f110508a = new WeakReference<>(cVar);
            this.f110509b = executor;
        }

        public static /* synthetic */ void a(d dVar) {
            c cVar = dVar.f110508a.get();
            if (cVar != null) {
                cVar.a(y.this.g());
            }
        }

        public void b() {
            this.f110509b.execute(new Runnable() { // from class: s7.z
                @Override // java.lang.Runnable
                public final void run() {
                    y.d.a(this.f110512a);
                }
            });
        }

        public boolean c() {
            return this.f110508a.get() == null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class e extends BroadcastReceiver {
        private e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(final Context context, Intent intent) {
            y.this.f110502a.execute(new Runnable() { // from class: s7.a0
                @Override // java.lang.Runnable
                public final void run() {
                    y.this.i(context);
                }
            });
        }
    }

    private y(final Context context) {
        Executor executorA = s7.c.a();
        this.f110502a = executorA;
        this.f110503b = new CopyOnWriteArrayList<>();
        this.f110504c = new Object();
        this.f110505d = 0;
        executorA.execute(new Runnable() { // from class: s7.x
            @Override // java.lang.Runnable
            public final void run() {
                this.f110499a.j(context);
            }
        });
    }

    public static synchronized y e(Context context) {
        try {
            if (f110501f == null) {
                f110501f = new y(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f110501f;
    }

    private static int f(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 16:
            case 19:
            default:
                return 6;
            case 18:
                return 2;
            case 20:
                return Build.VERSION.SDK_INT >= 29 ? 9 : 0;
        }
    }

    private static int h(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i11 = 0;
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i11 = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (type != 4 && type != 5) {
                        if (type != 6) {
                            return type != 9 ? 8 : 7;
                        }
                        return 5;
                    }
                }
                return f(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(Context context) {
        int iH = h(context);
        if (Build.VERSION.SDK_INT < 31 || iH != 5) {
            m(iH);
        } else {
            b.a(context, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"UnprotectedReceiver"})
    public void j(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new e(), intentFilter);
    }

    private void l() {
        for (d dVar : this.f110503b) {
            if (dVar.c()) {
                this.f110503b.remove(dVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(int i11) {
        l();
        synchronized (this.f110504c) {
            try {
                if (this.f110506e && this.f110505d == i11) {
                    return;
                }
                this.f110506e = true;
                this.f110505d = i11;
                Iterator<d> it = this.f110503b.iterator();
                while (it.hasNext()) {
                    it.next().b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int g() {
        int i11;
        synchronized (this.f110504c) {
            i11 = this.f110505d;
        }
        return i11;
    }

    public void k(c cVar, Executor executor) {
        boolean z11;
        l();
        d dVar = new d(cVar, executor);
        synchronized (this.f110504c) {
            this.f110503b.add(dVar);
            z11 = this.f110506e;
        }
        if (z11) {
            dVar.b();
        }
    }
}
