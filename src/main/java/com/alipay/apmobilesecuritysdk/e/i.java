package com.alipay.apmobilesecuritysdk.e;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f20077a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f20078b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f20079c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f20080d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f20081e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Map<String, String> f20082f = new HashMap();

    public static synchronized String a(String str) {
        String str2 = "apdidTokenCache" + str;
        if (f20082f.containsKey(str2)) {
            String str3 = f20082f.get(str2);
            if (sg.a.f(str3)) {
                return str3;
            }
        }
        return "";
    }

    public static synchronized String b() {
        return f20077a;
    }

    public static synchronized String c() {
        return f20078b;
    }

    public static synchronized String d() {
        return f20080d;
    }

    public static synchronized String e() {
        return f20081e;
    }

    public static synchronized String f() {
        return f20079c;
    }

    public static synchronized c g() {
        return new c(f20077a, f20078b, f20079c, f20080d, f20081e);
    }

    public static void h() {
        f20082f.clear();
        f20077a = "";
        f20078b = "";
        f20080d = "";
        f20081e = "";
        f20079c = "";
    }

    public static synchronized void a() {
    }

    public static void b(String str) {
        f20077a = str;
    }

    public static void c(String str) {
        f20078b = str;
    }

    public static void d(String str) {
        f20079c = str;
    }

    public static void e(String str) {
        f20080d = str;
    }

    public static void f(String str) {
        f20081e = str;
    }

    public static synchronized void a(b bVar) {
        if (bVar != null) {
            b(bVar.f20063a);
            c(bVar.f20064b);
            d(bVar.f20065c);
        }
    }

    public static synchronized void a(c cVar) {
        if (cVar != null) {
            b(cVar.f20066a);
            c(cVar.f20067b);
            e(cVar.f20069d);
            f(cVar.f20070e);
            d(cVar.f20068c);
        }
    }

    public static synchronized void a(String str, String str2) {
        try {
            String str3 = "apdidTokenCache" + str;
            if (f20082f.containsKey(str3)) {
                f20082f.remove(str3);
            }
            f20082f.put(str3, str2);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static synchronized boolean a(Context context, String str) {
        long jA;
        try {
            jA = h.a(context);
            if (jA < 0) {
                jA = CoreConstants.MILLIS_IN_ONE_DAY;
            }
        } catch (Throwable unused) {
        }
        try {
            if (Math.abs(System.currentTimeMillis() - h.h(context, str)) < jA) {
                return true;
            }
        } catch (Throwable th2) {
            com.alipay.apmobilesecuritysdk.c.a.a(th2);
        }
        return false;
    }
}
