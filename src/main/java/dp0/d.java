package dp0;

/* JADX INFO: loaded from: classes9.dex */
public class d {
    public static String a(String str) {
        int i11;
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        int i12 = 0;
        boolean z11 = false;
        while (i12 < length) {
            char cCharAt = str.charAt(i12);
            if (cCharAt == '\'') {
                int i13 = i12 + 1;
                if (i13 >= length || str.charAt(i13) != '\'') {
                    z11 = !z11;
                } else {
                    sb2.append(cCharAt);
                    i12 = i13;
                }
                sb2.append(cCharAt);
            } else if (z11) {
                sb2.append(cCharAt);
            } else if (cCharAt != 'z' && cCharAt != 'Z' && cCharAt != 'v' && cCharAt != 'V' && cCharAt != 'x' && cCharAt != 'X') {
                sb2.append(cCharAt);
            }
            i12++;
        }
        int i14 = 0;
        while (i14 < sb2.length()) {
            char cCharAt2 = sb2.charAt(i14);
            if ((cCharAt2 == ' ' && (i11 = i14 + 1) < sb2.length() && sb2.charAt(i11) == ' ') || cCharAt2 == '[' || cCharAt2 == ']' || cCharAt2 == '(' || cCharAt2 == ')') {
                sb2.deleteCharAt(i14);
                i14--;
            }
            i14++;
        }
        String strTrim = sb2.toString().trim();
        if (!strTrim.endsWith(" '")) {
            return strTrim.endsWith(",") ? strTrim.substring(0, strTrim.length() - 1) : strTrim;
        }
        return strTrim.substring(0, strTrim.length() - 2) + "'";
    }
}
