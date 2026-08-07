package org.bouncycastle.util;

/* JADX INFO: loaded from: classes10.dex */
public class IPAddress {
    private static boolean isParseable(String str, int i11, int i12, int i13, int i14, boolean z11, int i15, int i16) {
        int i17 = i12 - i11;
        if ((i17 > i14) || (i17 < 1)) {
            return false;
        }
        if (((i17 > 1) && (!z11)) && Character.digit(str.charAt(i11), i13) <= 0) {
            return false;
        }
        int i18 = 0;
        while (i11 < i12) {
            int i19 = i11 + 1;
            int iDigit = Character.digit(str.charAt(i11), i13);
            if (iDigit < 0) {
                return false;
            }
            i18 = (i18 * i13) + iDigit;
            i11 = i19;
        }
        return (i18 >= i15) & (i18 <= i16);
    }

    private static boolean isParseableIPv4Mask(String str) {
        return isParseable(str, 0, str.length(), 10, 2, false, 0, 32);
    }

    private static boolean isParseableIPv4Octet(String str, int i11, int i12) {
        return isParseable(str, i11, i12, 10, 3, true, 0, 255);
    }

    private static boolean isParseableIPv6Mask(String str) {
        return isParseable(str, 0, str.length(), 10, 3, false, 1, 128);
    }

    private static boolean isParseableIPv6Segment(String str, int i11, int i12) {
        return isParseable(str, i11, i12, 16, 4, true, 0, 65535);
    }

    public static boolean isValid(String str) {
        return isValidIPv4(str) || isValidIPv6(str);
    }

    public static boolean isValidIPv4(String str) {
        int length = str.length();
        if (length < 7 || length > 15) {
            return false;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < 3; i12++) {
            int iIndexOf = str.indexOf(46, i11);
            if (!isParseableIPv4Octet(str, i11, iIndexOf)) {
                return false;
            }
            i11 = iIndexOf + 1;
        }
        return isParseableIPv4Octet(str, i11, length);
    }

    public static boolean isValidIPv4WithNetmask(String str) {
        int iIndexOf = str.indexOf("/");
        if (iIndexOf < 1) {
            return false;
        }
        String strSubstring = str.substring(0, iIndexOf);
        String strSubstring2 = str.substring(iIndexOf + 1);
        return isValidIPv4(strSubstring) && (isValidIPv4(strSubstring2) || isParseableIPv4Mask(strSubstring2));
    }

    public static boolean isValidIPv6(String str) {
        int iIndexOf;
        if (str.length() == 0) {
            return false;
        }
        char cCharAt = str.charAt(0);
        if (cCharAt != ':' && Character.digit(cCharAt, 16) < 0) {
            return false;
        }
        String str2 = str + ":";
        int i11 = 0;
        int i12 = 0;
        boolean z11 = false;
        while (i11 < str2.length() && (iIndexOf = str2.indexOf(58, i11)) >= i11) {
            if (i12 == 8) {
                return false;
            }
            if (i11 != iIndexOf) {
                String strSubstring = str2.substring(i11, iIndexOf);
                if (iIndexOf == str2.length() - 1 && strSubstring.indexOf(46) > 0) {
                    i12++;
                    if (i12 == 8 || !isValidIPv4(strSubstring)) {
                        return false;
                    }
                } else if (!isParseableIPv6Segment(str2, i11, iIndexOf)) {
                    return false;
                }
            } else {
                if (iIndexOf != 1 && iIndexOf != str2.length() - 1 && z11) {
                    return false;
                }
                z11 = true;
            }
            i11 = iIndexOf + 1;
            i12++;
        }
        return i12 == 8 || z11;
    }

    public static boolean isValidIPv6WithNetmask(String str) {
        int iIndexOf = str.indexOf("/");
        if (iIndexOf < 1) {
            return false;
        }
        String strSubstring = str.substring(0, iIndexOf);
        String strSubstring2 = str.substring(iIndexOf + 1);
        return isValidIPv6(strSubstring) && (isValidIPv6(strSubstring2) || isParseableIPv6Mask(strSubstring2));
    }

    public static boolean isValidWithNetMask(String str) {
        return isValidIPv4WithNetmask(str) || isValidIPv6WithNetmask(str);
    }
}
