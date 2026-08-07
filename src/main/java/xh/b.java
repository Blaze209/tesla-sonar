package xh;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f123535a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f123536b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static c f123537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static c f123538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static c f123539e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Object f123540f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static HandlerThread f123541g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Handler f123542h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static String f123543i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static String f123544j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static String f123545k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static String f123546l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static String f123547m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static volatile b f123548n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static volatile xh.a f123549o;

    public static class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 11) {
                Log.e("VMS_IDLG_SDK_Client", "message type valid");
                return;
            }
            String unused = b.f123543i = b.f123549o.a(message.getData().getInt("type"), message.getData().getString("appid"));
            synchronized (b.f123540f) {
                b.f123540f.notify();
            }
        }
    }

    public static String b(String str, String str2) {
        try {
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, "unknown");
            } catch (Exception e11) {
                e11.printStackTrace();
                return str2;
            }
        } catch (Throwable unused) {
            return str2;
        }
    }

    public static b d(Context context) {
        if (f123548n == null) {
            synchronized (b.class) {
                f123535a = context.getApplicationContext();
                f123548n = new b();
            }
        }
        if (f123549o == null) {
            synchronized (b.class) {
                f123535a = context.getApplicationContext();
                k();
                f123549o = new xh.a(f123535a);
                i();
            }
        }
        return f123548n;
    }

    public static void f(Context context, int i11, String str) {
        if (i11 == 0) {
            f123537c = new c(f123548n, 0, null);
            context.getContentResolver().registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID"), true, f123537c);
            return;
        }
        if (i11 == 1) {
            f123538d = new c(f123548n, 1, str);
            context.getContentResolver().registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/VAID_" + str), false, f123538d);
            return;
        }
        if (i11 != 2) {
            return;
        }
        f123539e = new c(f123548n, 2, str);
        context.getContentResolver().registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/AAID_" + str), false, f123539e);
    }

    public static void i() {
        f123536b = "1".equals(b("persist.sys.identifierid.supported", WebrtcBuildVersion.maint_version));
    }

    public static void k() {
        HandlerThread handlerThread = new HandlerThread("SqlWorkThread");
        f123541g = handlerThread;
        handlerThread.start();
        f123542h = new a(f123541g.getLooper());
    }

    public void e(int i11, String str) {
        synchronized (f123540f) {
            h(i11, str);
            long jUptimeMillis = SystemClock.uptimeMillis();
            try {
                f123540f.wait(2000L);
            } catch (InterruptedException e11) {
                e11.printStackTrace();
            }
            if (SystemClock.uptimeMillis() - jUptimeMillis >= 2000) {
                Log.d("VMS_IDLG_SDK_Client", "query timeout");
            } else if (i11 == 0) {
                f123544j = f123543i;
                f123543i = null;
            } else if (i11 != 1) {
                if (i11 == 2) {
                    String str2 = f123543i;
                    if (str2 != null) {
                        f123546l = str2;
                        f123543i = null;
                    } else {
                        Log.e("VMS_IDLG_SDK_Client", "get aaid failed");
                    }
                } else if (i11 != 4) {
                }
                f123547m = f123543i;
                f123543i = null;
            } else {
                String str3 = f123543i;
                if (str3 != null) {
                    f123545k = str3;
                    f123543i = null;
                } else {
                    Log.e("VMS_IDLG_SDK_Client", "get vaid failed");
                }
            }
        }
    }

    public final void h(int i11, String str) {
        Message messageObtainMessage = f123542h.obtainMessage();
        messageObtainMessage.what = 11;
        Bundle bundle = new Bundle();
        bundle.putInt("type", i11);
        if (i11 == 1 || i11 == 2) {
            bundle.putString("appid", str);
        }
        messageObtainMessage.setData(bundle);
        f123542h.sendMessage(messageObtainMessage);
    }

    public String j() {
        if (!l()) {
            return null;
        }
        String str = f123544j;
        if (str != null) {
            return str;
        }
        e(0, null);
        if (f123537c == null) {
            f(f123535a, 0, null);
        }
        return f123544j;
    }

    public boolean l() {
        return f123536b;
    }
}
