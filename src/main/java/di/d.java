package di;

import android.content.Context;
import android.net.NetworkInfo;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static d f60632a;

    public d(Context context) {
    }

    public static d a(Context context) {
        if (f60632a == null) {
            f60632a = new d(context);
        }
        return f60632a;
    }

    public static String d(Context context) {
        if (context == null) {
            return "";
        }
        try {
            return context.getResources().getConfiguration().locale.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static h e(Context context) {
        try {
            NetworkInfo networkInfoA = mg.b.a(null, context);
            if (networkInfoA == null || networkInfoA.getType() != 0) {
                return (networkInfoA == null || networkInfoA.getType() != 1) ? h.NONE : h.WIFI;
            }
            return h.a(networkInfoA.getSubtype());
        } catch (Exception unused) {
            return h.NONE;
        }
    }

    public String b() {
        return "000000000000000";
    }

    public String c() {
        return "000000000000000";
    }

    public String f() {
        return "00:00:00:00:00:00";
    }
}
