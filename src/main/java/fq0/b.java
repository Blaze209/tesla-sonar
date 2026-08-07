package fq0;

/* JADX INFO: loaded from: classes9.dex */
public class b {
    public static boolean a(CharSequence charSequence) {
        if (charSequence == null || c(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (!Character.isLowerCase(charSequence.charAt(i11))) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(CharSequence charSequence) {
        if (charSequence == null || c(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (!Character.isUpperCase(charSequence.charAt(i11))) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static boolean d(CharSequence charSequence) {
        if (c(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (!Character.isDigit(charSequence.charAt(i11))) {
                return false;
            }
        }
        return true;
    }

    public static String e(String str, String str2) {
        int length;
        if (str == null || (length = str.length()) == 0) {
            return str;
        }
        if (str2 == null) {
            while (length != 0 && Character.isWhitespace(str.charAt(length - 1))) {
                length--;
            }
        } else {
            if (str2.isEmpty()) {
                return str;
            }
            while (length != 0 && str2.indexOf(str.charAt(length - 1)) != -1) {
                length--;
            }
        }
        return str.substring(0, length);
    }
}
