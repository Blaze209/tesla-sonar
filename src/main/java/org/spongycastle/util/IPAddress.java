package org.spongycastle.util;

/* JADX INFO: loaded from: classes10.dex */
public class IPAddress {
    private static boolean isMaskValue(String str, int i11) {
        try {
            int i12 = Integer.parseInt(str);
            return i12 >= 0 && i12 <= i11;
        } catch (NumberFormatException unused) {
        }
    }

    public static boolean isValid(String str) {
        return isValidIPv4(str) || isValidIPv6(str);
    }

    public static boolean isValidIPv4(String str) {
        int iIndexOf;
        if (str.length() == 0) {
            return false;
        }
        String str2 = str + ".";
        int i11 = 0;
        int i12 = 0;
        while (i11 < str2.length() && (iIndexOf = str2.indexOf(46, i11)) > i11) {
            if (i12 == 4) {
                return false;
            }
            try {
                int i13 = Integer.parseInt(str2.substring(i11, iIndexOf));
                if (i13 < 0 || i13 > 255) {
                    return false;
                }
                i11 = iIndexOf + 1;
                i12++;
            } catch (NumberFormatException unused) {
            }
        }
        return i12 == 4;
    }

    public static boolean isValidIPv4WithNetmask(String str) {
        int iIndexOf = str.indexOf("/");
        String strSubstring = str.substring(iIndexOf + 1);
        return iIndexOf > 0 && isValidIPv4(str.substring(0, iIndexOf)) && (isValidIPv4(strSubstring) || isMaskValue(strSubstring, 32));
    }

    public static boolean isValidIPv6(String str) {
        int iIndexOf;
        if (str.length() == 0) {
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
                if (iIndexOf != str2.length() - 1 || strSubstring.indexOf(46) <= 0) {
                    try {
                        int i13 = Integer.parseInt(str2.substring(i11, iIndexOf), 16);
                        if (i13 < 0 || i13 > 65535) {
                            return false;
                        }
                    } catch (NumberFormatException unused) {
                    }
                } else {
                    if (!isValidIPv4(strSubstring)) {
                        return false;
                    }
                    i12++;
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
        String strSubstring = str.substring(iIndexOf + 1);
        return iIndexOf > 0 && isValidIPv6(str.substring(0, iIndexOf)) && (isValidIPv6(strSubstring) || isMaskValue(strSubstring, 128));
    }

    public static boolean isValidWithNetMask(String str) {
        return isValidIPv4WithNetmask(str) || isValidIPv6WithNetmask(str);
    }
}
