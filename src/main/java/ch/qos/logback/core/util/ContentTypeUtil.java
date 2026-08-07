package ch.qos.logback.core.util;

/* JADX INFO: loaded from: classes3.dex */
public class ContentTypeUtil {
    public static String getSubType(String str) {
        int iIndexOf;
        int i11;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1 || (i11 = iIndexOf + 1) >= str.length()) {
            return null;
        }
        return str.substring(i11);
    }

    public static boolean isTextual(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("text");
    }
}
