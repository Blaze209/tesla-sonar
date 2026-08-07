package di;

import android.content.Context;
import android.preference.PreferenceManager;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f60673a;

    public static synchronized String a(ai.a aVar, Context context, String str, String str2) {
        String strA;
        strA = null;
        try {
            try {
                String string = PreferenceManager.getDefaultSharedPreferences(context).getString(str, str2);
                strA = TextUtils.isEmpty(string) ? null : nh.e.a(b(context), string, str);
                if (!TextUtils.isEmpty(string) && TextUtils.isEmpty(strA)) {
                    hh.a.g(aVar, "cp", "TriDesEncryptError", String.format("%s,%s", str, string));
                }
            } catch (Exception e11) {
                g.d(e11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return strA;
    }

    public static String b(Context context) {
        String packageName;
        if (TextUtils.isEmpty(f60673a)) {
            try {
                packageName = context.getApplicationContext().getPackageName();
            } catch (Throwable th2) {
                g.d(th2);
                packageName = "";
            }
            f60673a = (packageName + "0000000000000000000000000000").substring(0, 24);
        }
        return f60673a;
    }

    public static synchronized void c(ai.a aVar, Context context, String str, String str2) {
        try {
            String strC = nh.e.c(b(context), str2, str);
            if (!TextUtils.isEmpty(str2) && TextUtils.isEmpty(strC)) {
                hh.a.g(aVar, "cp", "TriDesDecryptError", String.format("%s,%s", str, str2));
            }
            PreferenceManager.getDefaultSharedPreferences(context).edit().putString(str, strC).apply();
        } catch (Throwable th2) {
            g.d(th2);
        }
    }
}
