package com.unionpay.utils;

import android.content.Context;
import android.content.SharedPreferences;
import java.security.MessageDigest;
import xf0.a;
import xf0.d;
import xf0.j;

/* JADX INFO: loaded from: classes8.dex */
public class UPUtils {
    public static String a(int i11) {
        try {
            return f(forUrl(i11, true));
        } catch (Throwable th2) {
            th2.printStackTrace();
            return null;
        }
    }

    public static String b(int i11, String str) {
        try {
            return f(forConfig(i11, str));
        } catch (Throwable th2) {
            th2.printStackTrace();
            return null;
        }
    }

    public static String c(Context context, String str) {
        if (context == null) {
            return null;
        }
        String strJ = j(context.getSharedPreferences("UnionPayPluginEx.pref", 0).getString(str, ""), ("0000000023456789abcdef12123456786789abcd").substring(0, 32));
        return (strJ != null && strJ.endsWith("00000000")) ? strJ.substring(0, strJ.length() - 8) : "";
    }

    public static String d(String str) {
        try {
            byte[] bytes = str.getBytes();
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.reset();
            messageDigest.update(bytes);
            return a.a(messageDigest.digest());
        } catch (Throwable unused) {
            return null;
        }
    }

    private static String e(String str, String str2) {
        try {
            return a.a(d.b(a.b(str2), str.getBytes("utf-8")));
        } catch (Throwable unused) {
            return "";
        }
    }

    private static String f(byte[] bArr) {
        if (bArr != null) {
            try {
                return new String(bArr, "utf-8");
            } catch (Throwable unused) {
                j.d("uppay", "convert byteMsg to utf-8 String error!!!!");
            }
        }
        return "";
    }

    public static native synchronized byte[] forCallingAppUrl(int i11, boolean z11);

    public static native synchronized byte[] forConfig(int i11, String str);

    public static native synchronized byte[] forDirectAppsUrl(int i11, boolean z11);

    public static native synchronized byte[] forScanUrl(int i11, boolean z11);

    public static native synchronized byte[] forUrl(int i11, boolean z11);

    public static native synchronized byte[] forWap(int i11, String str);

    public static void g(Context context, String str, String str2) {
        if (context != null) {
            String strE = e(str + "00000000", ("0000000023456789abcdef12123456786789abcd").substring(0, 32));
            if (strE == null) {
                strE = "";
            }
            SharedPreferences.Editor editorEdit = context.getSharedPreferences("UnionPayPluginEx.pref", 0).edit();
            editorEdit.putString(str2, strE);
            editorEdit.commit();
        }
    }

    public static native synchronized String getIssuer(int i11);

    public static native synchronized String getSubject(int i11);

    public static native synchronized String getTalkingDataIdForAssist(int i11);

    public static String h(int i11) {
        try {
            return f(forScanUrl(i11, true));
        } catch (Throwable th2) {
            th2.printStackTrace();
            return null;
        }
    }

    public static String i(int i11, String str) {
        try {
            return f(forWap(i11, str));
        } catch (Throwable th2) {
            th2.printStackTrace();
            return null;
        }
    }

    private static String j(String str, String str2) {
        try {
            return new String(d.c(a.b(str2), a.b(str)), "utf-8").trim();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static void k(Context context, String str) {
        if (context != null) {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences("UnionPayPluginEx.pref", 0).edit();
            editorEdit.remove(str);
            editorEdit.commit();
        }
    }

    public static String l(int i11) {
        try {
            return f(forCallingAppUrl(i11, true));
        } catch (Throwable th2) {
            th2.printStackTrace();
            return null;
        }
    }
}
