package com.alipay.apmobilesecuritysdk.e;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes3.dex */
public class g {
    public static synchronized String a(Context context, String str) {
        String strC = yg.e.c(context, "openapi_file_pri", "openApi" + str, "");
        if (sg.a.c(strC)) {
            return "";
        }
        String strG = ug.c.g(ug.c.a(), strC);
        return sg.a.c(strG) ? "" : strG;
    }

    public static synchronized void b(Context context, String str) {
    }

    public static synchronized void a(Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("openapi_file_pri", 0).edit();
        if (editorEdit != null) {
            editorEdit.clear();
            editorEdit.commit();
        }
    }

    public static synchronized void a(Context context, String str, String str2) {
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences("openapi_file_pri", 0).edit();
            if (editorEdit != null) {
                editorEdit.putString("openApi" + str, ug.c.b(ug.c.a(), str2));
                editorEdit.commit();
            }
        } catch (Throwable unused) {
        }
    }
}
