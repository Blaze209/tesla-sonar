package di;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public class k {
    public static String a(ai.a aVar, Context context) {
        String strA = l.a(aVar, context, "pref_trade_token", "");
        g.f("mspl", "get trade token: " + strA);
        return strA;
    }

    public static String b(String str) {
        String strSubstring = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split(";");
        for (int i11 = 0; i11 < strArrSplit.length; i11++) {
            if (strArrSplit[i11].startsWith("result={") && strArrSplit[i11].endsWith("}")) {
                String str2 = strArrSplit[i11];
                String[] strArrSplit2 = str2.substring(8, str2.length() - 1).split("&");
                for (int i12 = 0; i12 < strArrSplit2.length; i12++) {
                    if (strArrSplit2[i12].startsWith("trade_token=\"") && strArrSplit2[i12].endsWith("\"")) {
                        String str3 = strArrSplit2[i12];
                        strSubstring = str3.substring(13, str3.length() - 1);
                        break;
                    }
                    if (strArrSplit2[i12].startsWith("trade_token=")) {
                        strSubstring = strArrSplit2[i12].substring(12);
                        break;
                    }
                }
            }
        }
        return strSubstring;
    }

    public static void c(ai.a aVar, Context context, String str) {
        try {
            String strB = b(str);
            g.f("mspl", "trade token: " + strB);
            if (TextUtils.isEmpty(strB)) {
                return;
            }
            l.c(aVar, context, "pref_trade_token", strB);
        } catch (Throwable th2) {
            hh.a.c(aVar, "biz", "SaveTradeTokenError", th2);
            g.d(th2);
        }
    }
}
