package di;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public class i {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static String f60652a = "0";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static String f60653b = "1";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static String f60654c = "2";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static String f60655d = "3";
    }

    public static String a(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        String str = a.f60652a;
        if (context != null && (activeNetworkInfo = (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) != null) {
            int type = activeNetworkInfo.getType();
            if (type == 0) {
                return a.f60653b;
            }
            if (type == 1) {
                str = a.f60654c;
                try {
                    boolean z11 = 1 != ((TelephonyManager) context.getSystemService("phone")).getSimState();
                    boolean z12 = androidx.core.content.b.checkSelfPermission(context, "android.permission.CHANGE_NETWORK_STATE") == 0;
                    Method declaredMethod = ConnectivityManager.class.getDeclaredMethod("getMobileDataEnabled", null);
                    declaredMethod.setAccessible(true);
                    Boolean bool = (Boolean) declaredMethod.invoke(connectivityManager, null);
                    if (z11 && z12 && bool.booleanValue()) {
                        return a.f60655d;
                    }
                } catch (Throwable th2) {
                    g.d(th2);
                }
            }
        }
        return str;
    }
}
