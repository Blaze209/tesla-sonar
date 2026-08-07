package ts;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class b0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static b0 f114968e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f114969a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList<WeakReference<c>> f114970b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f114971c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f114972d = 0;

    private static final class b {

        private static final class a extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final b0 f114973a;

            public a(b0 b0Var) {
                this.f114973a = b0Var;
            }

            public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
                int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                this.f114973a.j(overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
            }
        }

        public static void a(Context context, b0 b0Var) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) ts.a.e((TelephonyManager) context.getSystemService("phone"));
                a aVar = new a(b0Var);
                telephonyManager.registerTelephonyCallback(context.getMainExecutor(), aVar);
                telephonyManager.unregisterTelephonyCallback(aVar);
            } catch (RuntimeException unused) {
                b0Var.j(5);
            }
        }
    }

    public interface c {
        void a(int i11);
    }

    private final class d extends BroadcastReceiver {
        private d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int iG = b0.g(context);
            if (p0.f115040a < 31 || iG != 5) {
                b0.this.j(iG);
            } else {
                b.a(context, b0.this);
            }
        }
    }

    private b0(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new d(), intentFilter);
    }

    public static synchronized b0 d(Context context) {
        try {
            if (f114968e == null) {
                f114968e = new b0(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f114968e;
    }

    private static int e(NetworkInfo networkInfo) {
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
                return p0.f115040a >= 29 ? 9 : 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int g(Context context) {
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
                return e(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i11;
    }

    private void i() {
        for (WeakReference<c> weakReference : this.f114970b) {
            if (weakReference.get() == null) {
                this.f114970b.remove(weakReference);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(int i11) {
        synchronized (this.f114971c) {
            try {
                if (this.f114972d == i11) {
                    return;
                }
                this.f114972d = i11;
                for (WeakReference<c> weakReference : this.f114970b) {
                    c cVar = weakReference.get();
                    if (cVar != null) {
                        cVar.a(i11);
                    } else {
                        this.f114970b.remove(weakReference);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int f() {
        int i11;
        synchronized (this.f114971c) {
            i11 = this.f114972d;
        }
        return i11;
    }

    public void h(final c cVar) {
        i();
        this.f114970b.add(new WeakReference<>(cVar));
        this.f114969a.post(new Runnable() { // from class: ts.a0
            @Override // java.lang.Runnable
            public final void run() {
                cVar.a(this.f114964a.f());
            }
        });
    }
}
