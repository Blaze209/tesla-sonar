package com.alipay.apmobilesecuritysdk.e;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.util.UUID;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes3.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f20076a = "";

    public static long a(Context context) {
        String strI = i(context, "update_time_interval");
        if (sg.a.f(strI)) {
            try {
                return Long.parseLong(strI);
            } catch (Exception unused) {
            }
        }
        return CoreConstants.MILLIS_IN_ONE_DAY;
    }

    public static String b(Context context) {
        return i(context, "last_apdid_env");
    }

    public static void c(Context context, String str) {
        a(context, "last_apdid_env", str);
    }

    public static String d(Context context) {
        return i(context, "dynamic_key");
    }

    public static String e(Context context) {
        return i(context, "apse_degrade");
    }

    public static String f(Context context) {
        String str;
        synchronized (h.class) {
            try {
                if (sg.a.c(f20076a)) {
                    String strC = yg.e.c(context, "alipay_vkey_random", "random", "");
                    f20076a = strC;
                    if (sg.a.c(strC)) {
                        String strA = ug.b.a(UUID.randomUUID().toString());
                        f20076a = strA;
                        yg.e.a(context, "alipay_vkey_random", "random", strA);
                    }
                }
                str = f20076a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    public static void g(Context context, String str) {
        a(context, "apse_degrade", str);
    }

    public static long h(Context context, String str) {
        try {
            String strA = yg.a.a(context, "vkeyid_settings", "vkey_valid" + str);
            if (sg.a.c(strA)) {
                return 0L;
            }
            return Long.parseLong(strA);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    private static String i(Context context, String str) {
        return yg.a.a(context, "vkeyid_settings", str);
    }

    public static void a(Context context, String str) {
        a(context, "update_time_interval", str);
    }

    public static void b(Context context, String str) {
        a(context, "last_machine_boot_time", str);
    }

    public static boolean c(Context context) {
        String strI = i(context, "log_switch");
        return strI != null && "1".equals(strI);
    }

    public static void d(Context context, String str) {
        a(context, "agent_switch", str);
    }

    public static void e(Context context, String str) {
        a(context, "dynamic_key", str);
    }

    public static void f(Context context, String str) {
        a(context, "webrtc_url", str);
    }

    public static void a(Context context, String str, long j11) {
        yg.a.b(context, "vkeyid_settings", "vkey_valid" + str, j11 + "");
    }

    private static void a(Context context, String str, String str2) {
        yg.a.b(context, "vkeyid_settings", str, str2);
    }

    public static void a(Context context, boolean z11) {
        a(context, "log_switch", z11 ? "1" : WebrtcBuildVersion.maint_version);
    }
}
