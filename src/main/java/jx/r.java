package jx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
public class r {
    public static String a(String str, k kVar) {
        StringBuffer stringBuffer = new StringBuffer();
        Matcher matcher = Pattern.compile("\\$\\[(.+?)]").matcher(str);
        while (matcher.find()) {
            String strD = kVar.d(matcher.group(1));
            if (strD != null) {
                matcher.appendReplacement(stringBuffer, strD);
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }
}
