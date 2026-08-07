package ch.qos.logback.classic.util;

/* JADX INFO: loaded from: classes3.dex */
public class LoggerNameUtil {
    public static int getFirstSeparatorIndexOf(String str) {
        return getSeparatorIndexOf(str, 0);
    }

    public static int getSeparatorIndexOf(String str, int i11) {
        int iIndexOf = str.indexOf(46, i11);
        int iIndexOf2 = str.indexOf(36, i11);
        if (iIndexOf == -1 && iIndexOf2 == -1) {
            return -1;
        }
        return (iIndexOf != -1 && (iIndexOf2 == -1 || iIndexOf < iIndexOf2)) ? iIndexOf : iIndexOf2;
    }
}
