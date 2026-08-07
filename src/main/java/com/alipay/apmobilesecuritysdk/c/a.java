package com.alipay.apmobilesecuritysdk.c;

import ah.d;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.alipay.apmobilesecuritysdk.e.h;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/* JADX INFO: loaded from: classes3.dex */
public class a {
    private static String a() {
        return new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime()) + ".log";
    }

    private static ah.a b(Context context, String str, String str2, String str3) {
        String packageName;
        try {
            packageName = context.getPackageName();
        } catch (Throwable unused) {
            packageName = "";
        }
        return new ah.a(Build.MODEL, packageName, "APPSecuritySDK-ALIPAYSDK", "3.4.0.202507280853", str, str2, str3);
    }

    public static void a(Context context, gh.a aVar) {
        if (a(context) && h.c(context)) {
            new ah.b(context.getFilesDir().getAbsolutePath() + "/log/ap", aVar).d(context);
        }
    }

    public static synchronized void a(Context context, String str, String str2, String str3) {
        d.b(context.getFilesDir().getAbsolutePath() + "/log/ap", a(), b(context, str, str2, str3).toString());
    }

    public static synchronized void a(String str) {
        d.a(str);
    }

    public static synchronized void a(Throwable th2) {
        d.c(th2);
    }

    private static boolean a(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getType() == 1;
    }
}
