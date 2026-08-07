package ch.qos.logback.core.pattern.util;

/* JADX INFO: loaded from: classes3.dex */
public class RegularEscapeUtil implements IEscapeUtil {
    public static String basicEscape(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(length);
        int i11 = 0;
        while (i11 < length) {
            int i12 = i11 + 1;
            char cCharAt = str.charAt(i11);
            if (cCharAt == '\\') {
                i11 += 2;
                cCharAt = str.charAt(i12);
                if (cCharAt == 'n') {
                    cCharAt = '\n';
                } else if (cCharAt == 'r') {
                    cCharAt = '\r';
                } else if (cCharAt == 't') {
                    cCharAt = '\t';
                } else if (cCharAt == 'f') {
                    cCharAt = '\f';
                }
            } else {
                i11 = i12;
            }
            sb2.append(cCharAt);
        }
        return sb2.toString();
    }

    @Override // ch.qos.logback.core.pattern.util.IEscapeUtil
    public void escape(String str, StringBuffer stringBuffer, char c11, int i11) {
        char c12;
        if (str.indexOf(c11) >= 0) {
            stringBuffer.append(c11);
            return;
        }
        if (c11 == '\\') {
            stringBuffer.append(c11);
            return;
        }
        if (c11 != '_') {
            if (c11 == 'n') {
                c12 = '\n';
            } else if (c11 == 'r') {
                c12 = '\r';
            } else {
                if (c11 != 't') {
                    throw new IllegalArgumentException("Illegal char '" + c11 + " at column " + i11 + ". Only \\\\, \\_" + formatEscapeCharsForListing(str) + ", \\t, \\n, \\r combinations are allowed as escape characters.");
                }
                c12 = '\t';
            }
            stringBuffer.append(c12);
        }
    }

    String formatEscapeCharsForListing(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < str.length(); i11++) {
            sb2.append(", \\");
            sb2.append(str.charAt(i11));
        }
        return sb2.toString();
    }
}
