package di;

import android.text.TextUtils;
import ch.qos.logback.classic.spi.CallerData;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class n {
    public static String a(String str, String str2) {
        try {
            Matcher matcher = Pattern.compile("(^|;)" + str2 + "=\\{([^}]*?)\\}").matcher(str);
            return matcher.find() ? matcher.group(2) : CallerData.NA;
        } catch (Throwable th2) {
            g.d(th2);
            return CallerData.NA;
        }
    }

    public static Map<String, String> b() {
        fh.c cVarA = fh.c.a(fh.c.CANCELED.c());
        HashMap map = new HashMap();
        map.put("resultStatus", Integer.toString(cVarA.c()));
        map.put("memo", cVarA.b());
        map.put("result", "");
        return map;
    }

    public static Map<String, String> c(ai.a aVar, String str) {
        Map<String, String> mapB = b();
        try {
            return d(str);
        } catch (Throwable th2) {
            hh.a.c(aVar, "biz", "FormatResultEx", th2);
            return mapB;
        }
    }

    public static Map<String, String> d(String str) {
        String[] strArrSplit = str.split(";");
        HashMap map = new HashMap();
        for (String str2 : strArrSplit) {
            String strSubstring = str2.substring(0, str2.indexOf("={"));
            map.put(strSubstring, f(str2, strSubstring));
        }
        return map;
    }

    public static String e(String str, String str2) {
        String strSubstring = null;
        try {
            for (String str3 : str.split(";")) {
                String[] strArrSplit = str3.split("=", 2);
                if (strArrSplit.length == 2) {
                    String strTrim = strArrSplit[0].trim();
                    String strTrim2 = strArrSplit[1].trim();
                    if (TextUtils.equals(strTrim, str2)) {
                        strSubstring = strTrim2.substring(1, strTrim2.length() - 1);
                    } else {
                        continue;
                    }
                }
            }
            return strSubstring;
        } catch (Throwable th2) {
            g.d(th2);
            return null;
        }
    }

    public static String f(String str, String str2) {
        String str3 = str2 + "={";
        return str.substring(str.indexOf(str3) + str3.length(), str.lastIndexOf("}"));
    }
}
